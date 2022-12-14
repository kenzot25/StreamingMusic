package com.toan.streammusic.ui.Fragments.Music;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.toan.streammusic.MainActivity;
import com.toan.streammusic.MainViewModel;
import com.toan.streammusic.Models.Music;
import com.toan.streammusic.Players.MusicPlayer;
import com.toan.streammusic.R;
import com.toan.streammusic.SharedPreference.SharedPreferenceManager;
import com.toan.streammusic.databinding.FragmentPlayerBinding;
import com.toan.streammusic.utils.Constants;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;


import java.util.ArrayList;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import me.tankery.lib.circularseekbar.CircularSeekBar;

@AndroidEntryPoint
public class PlayerFragment extends Fragment {

    FragmentPlayerBinding playerBinding;
    MainViewModel mainViewModel;
    CompositeDisposable compositeDisposable;
    MainActivity mainActivity;
    @Inject
    MusicPlayer musicPlayer;
    Music music;
    @Inject
    SharedPreferenceManager sharedPreferenceManager;
    ArrayList<String> likedMusics;
    boolean musicLiked = false;
    ArrayList<String> recentlyPlayed;
    ArrayList<String> downloads;
    boolean downloaded = false;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        playerBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_player, container, false);
        mainViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);
        compositeDisposable = new CompositeDisposable();
        mainActivity.homeImageView.setVisibility(View.GONE);
        mainActivity.bottomNavigationView.setVisibility(View.GONE);
        mainActivity.playBackLayout.setVisibility(View.GONE);
        playerBinding.backStackButton.setOnClickListener(v -> requireActivity().onBackPressed());
        Bundle args = getArguments();
        if (args != null) {
            music = args.getParcelable("Music");
        } else {
            onDestroy();
            Toast.makeText(mainActivity, "Something went wrong!", Toast.LENGTH_SHORT).show();
        }

        if (music != null && musicPlayer.playingMusic.getValue() != null) {
            if (!music.getName().equals(musicPlayer.playingMusic.getValue().getName())) {
                playerBinding.playerDurationTextView.setText("0:00");
                playerBinding.playerSeekBar.setProgress(0);
                setupMusicDetail();
                playMusic();
            } else {
                setupMusicDetail();
                setDuration();
                seekBarProgress();
                updateSeekBar();
            }
        } else {
            playerBinding.playerDurationTextView.setText("0:00");
            playerBinding.playerSeekBar.setProgress(0);
            setupMusicDetail();
            playMusic();
        }
        setupButtons();
        likeMusic();
        downloadMusic();
        addToRecentlyPlayed();

        return playerBinding.getRoot();
    }

    public void addToRecentlyPlayed() {
        recentlyPlayed = sharedPreferenceManager.readRecentlyPlayedData();
        musicPlayer.playingMusic.observe(requireActivity(), playingMusic -> {
            if (recentlyPlayed.size() >= 1) {
                if (!recentlyPlayed.get(recentlyPlayed.size() - 1).equals(playingMusic.getId() + playingMusic.getName())) {
                    recentlyPlayed.add(playingMusic.getId() + playingMusic.getName());
                    sharedPreferenceManager.storeRecentlyPlayedData(recentlyPlayed);
                }
            } else {
                recentlyPlayed.add(playingMusic.getId() + playingMusic.getName());
                sharedPreferenceManager.storeRecentlyPlayedData(recentlyPlayed);
            }
        });
    }

    private void downloadMusic() {
        musicPlayer.playingMusic.observe(requireActivity(), playingMusic ->
                playerBinding.playerDownloadButton.setOnClickListener(v -> {
                    DownloadManager downloadManager = (DownloadManager) requireContext().getSystemService(Context.DOWNLOAD_SERVICE);
                    String title = playingMusic.getName();
                    Uri uri = Uri.parse(playingMusic.getSource());
                    DownloadManager.Request request = new DownloadManager.Request(uri);
                    request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE)
                            .setAllowedOverRoaming(true)
                            .setTitle(title)
                            .setDescription("Downloading...")
                            .setMimeType("audio/*")
                            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                            .setDestinationInExternalPublicDir(Environment.DIRECTORY_MUSIC, title + ".m4a");
                    downloadManager.enqueue(request);
                    addToDownloads(playingMusic);
                })
        );
    }

    private void addToDownloads(Music playingMusic) {
        downloads = sharedPreferenceManager.readDownloadedData();
        if (!downloaded) {
            if (!downloads.contains(playingMusic.getId() + playingMusic.getName())) {
                downloads.add(playingMusic.getId() + playingMusic.getName());
            }
            sharedPreferenceManager.storeDownloadedData(downloads);
            downloaded = true;
        } else {
            downloads.remove(playingMusic.getId() + playingMusic.getName());
            sharedPreferenceManager.storeDownloadedData(downloads);
            downloaded = false;
        }
    }

    private void likeMusic() {
        musicPlayer.playingMusic.observe(requireActivity(), playingMusic -> {
            checkMusicLiked(playingMusic);
            playerBinding.playerLikeButton.setOnClickListener(v -> {
                if (!musicLiked) {
                    if (!likedMusics.contains(playingMusic.getId() + playingMusic.getName())) {
                        likedMusics.add(playingMusic.getId() + playingMusic.getName());
                    }
                    sharedPreferenceManager.storeLikedData(likedMusics);
                    playerBinding.playerLikeButton.setImageResource(R.drawable.ic_heart_fill);
                    musicLiked = true;
                } else {
                    likedMusics.remove(playingMusic.getId() + playingMusic.getName());
                    sharedPreferenceManager.storeLikedData(likedMusics);
                    playerBinding.playerLikeButton.setImageResource(R.drawable.ic_heart);
                    musicLiked = false;
                }
            });
        });
    }

    private void checkMusicLiked(Music playingMusic) {
        likedMusics = sharedPreferenceManager.readLikedData();
        if (likedMusics.contains(playingMusic.getId() + playingMusic.getName())) {
            playerBinding.playerLikeButton.setImageResource(R.drawable.ic_heart_fill);
            musicLiked = true;
        } else {
            playerBinding.playerLikeButton.setImageResource(R.drawable.ic_heart);
            musicLiked = false;
        }
    }

    private void setupButtons() {
        // Play Button
        musicPlayer.isPlaying.observe(requireActivity(), aBoolean ->
                playerBinding.playButton.setImageResource(aBoolean ? R.drawable.ic_pause : R.drawable.ic_play));
                playerBinding.playButton.setOnClickListener(v -> musicPlayer.togglePlayBack()
        );

        // Next Button
        playerBinding.nextImageButton.setOnClickListener(v -> musicPlayer.next());

        // Previous Button
        playerBinding.previousImageButton.setOnClickListener(v -> musicPlayer.previous());

        // Shuffle Button
        musicPlayer.isShuffleModeEnabled.observe(requireActivity(), aBoolean -> {
            int primaryColor = requireContext().getResources().getColor(R.color.primaryColor);
            int white = requireContext().getResources().getColor(R.color.white);
            playerBinding.shuffleImageButton.setColorFilter(aBoolean ? primaryColor : white);
        });
        playerBinding.shuffleImageButton.setOnClickListener(v -> musicPlayer.toggleShuffleMode());

        // Repeat Button
        musicPlayer.isRepeatModeEnabled.observe(requireActivity(), aBoolean -> {
            int primaryColor = requireContext().getResources().getColor(R.color.primaryColor);
            int white = requireContext().getResources().getColor(R.color.white);
            playerBinding.repeatModeImageButton.setColorFilter(aBoolean ? primaryColor : white);
        });

        playerBinding.repeatModeImageButton.setOnClickListener(v -> musicPlayer.toggleRepeatMode());
    }

    private void setupMusicDetail() {
        musicPlayer.playingMusic.observe(requireActivity(), playingMusic -> {
            Glide.with(playerBinding.getRoot().getContext())
                    .load(playingMusic.getCover())
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                    .into(playerBinding.backgroundImageView);
            Glide.with(playerBinding.getRoot().getContext())
                    .load(playingMusic.getCover())
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                    .into(playerBinding.playerImageView);
            playerBinding.playerNameTextView.setText(playingMusic.getName());
            playerBinding.playerArtistTextView.setText(playingMusic.getArtist());
            if (playingMusic.getLyric() != null && !playingMusic.getLyric().equals("")) {
                playerBinding.playerLyricButton.setVisibility(View.VISIBLE);
                setupLyric(playingMusic.getLyric());
            } else {
                playerBinding.playerLyricButton.setVisibility(View.GONE);
            }
        });
    }

    private void setupLyric(String lyric) {
        playerBinding.playerLyricButton.setOnClickListener(v -> {
            LyricBottomSheet lyricBottomSheet = new LyricBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putString("Lyric", lyric);
            lyricBottomSheet.setArguments(bundle);
            lyricBottomSheet.show(requireActivity().getSupportFragmentManager(), lyricBottomSheet.getTag());
        });
    }

    private void playMusic() {
        play();
        setDuration();
        seekBarProgress();
        updateSeekBar();
    }

    private void play() {
        musicPlayer.addMusicToPlaylist(music);

        // add related musics and play
        Disposable disposable = mainViewModel.getArtistMusics(music.getArtist())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(musics -> {
                    for (int i = 0; i < musics.size(); i++) {
                        if (musics.get(i).getId() == music.getId()) {
                            musics.remove(musics.get(i));
                        }
                    }
                    musicPlayer.addPlaylist(musics);
                    if (!musicPlayer.isPlaying()) {
                        musicPlayer.play();
                    }
                }, throwable -> {
                    Constants.raiseError(getActivity(), getString(R.string.something_went_wrong));
                });
        compositeDisposable.add(disposable);
    }

    private void setDuration() {
        musicPlayer.duration.observe(requireActivity(), aLong -> {
            long duration = (aLong / 1000);
            playerBinding.playerSeekBar.setMax(duration);
            playerBinding.playerDurationTextView.setText(timeToString(aLong));
        });
    }

    private void seekBarProgress() {
        musicPlayer.currentPosition.observe(requireActivity(), aLong -> {
            long currentPos = (aLong / 1000);
            playerBinding.playerSeekBar.setProgress(currentPos);
            playerBinding.playerCurrentDurationTextView.setText(timeToString(aLong));
        });
    }

    private String timeToString(long pos) {
        long min = (pos / 1000) / 60;
        long sec = (pos / 1000) % 60;
        if (sec < 10) {
            return min + ":0" + sec;
        }
        return min + ":" + sec;
    }

    private void updateSeekBar() {
        playerBinding.playerSeekBar.setOnSeekBarChangeListener(new CircularSeekBar.OnCircularSeekBarChangeListener() {
            @Override
            public void onProgressChanged(CircularSeekBar circularSeekBar, float progress, boolean fromUser) {
                if (fromUser) {
                    musicPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStopTrackingTouch(CircularSeekBar seekBar) {

            }

            @Override
            public void onStartTrackingTouch(CircularSeekBar seekBar) {

            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mainActivity.homeImageView.setVisibility(View.VISIBLE);
        mainActivity.bottomNavigationView.setVisibility(View.VISIBLE);
        mainActivity.playBackLayout.setVisibility(View.VISIBLE);
        compositeDisposable.clear();
    }
}