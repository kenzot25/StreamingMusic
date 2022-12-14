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

import com.toan.streammusic.Adapters.Music.VerticalMusicAdapter;
import com.toan.streammusic.MainActivity;
import com.toan.streammusic.MainViewModel;
import com.toan.streammusic.Models.Album;
import com.toan.streammusic.Models.Music;
import com.toan.streammusic.Players.MusicPlayer;
import com.toan.streammusic.R;
import com.toan.streammusic.SharedPreference.SharedPreferenceManager;
import com.toan.streammusic.databinding.FragmentAlbumBinding;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

import java.util.ArrayList;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

@AndroidEntryPoint
public class AlbumFragment extends Fragment {

    FragmentAlbumBinding albumBinding;
    MainViewModel mainViewModel;
    CompositeDisposable compositeDisposable;
    MainActivity mainActivity;
    Album album;
    @Inject
    MusicPlayer musicPlayer;
    @Inject
    SharedPreferenceManager sharedPreferenceManager;
    ArrayList<String> likedAlbums;
    boolean albumLiked = false;
    ArrayList<String> downloads;
    boolean downloaded = false;
    private static final String TAG = "album";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        albumBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_album, container, false);
        mainViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);
        compositeDisposable = new CompositeDisposable();
        Bundle args = getArguments();
        if (args != null) {
            album = args.getParcelable("Album");
        } else {
            onDestroy();
            Toast.makeText(mainActivity, "Something went wrong!", Toast.LENGTH_SHORT).show();
        }
        mainActivity.bottomNavigationView.setVisibility(View.GONE);
        mainActivity.homeImageView.setVisibility(View.GONE);
        albumBinding.backStackButton.setOnClickListener(v -> requireActivity().onBackPressed());
        downloads = sharedPreferenceManager.readDownloadedData();

        setupDetail();
        playAlbum();
        likeAlbum();
        downloadAlbum();
        return albumBinding.getRoot();
    }

    private void setupDetail() {
        Glide.with(albumBinding.getRoot().getContext())
                .load(album.getCover())
                .thumbnail(
                        Glide.with(albumBinding.getRoot().getContext())
                                .load(R.drawable.loading)
                )
                .transition(DrawableTransitionOptions.withCrossFade())
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(albumBinding.albumImageView);
        albumBinding.albumNameTextView.setText(album.getName());
        albumBinding.albumArtistTextView.setText(album.getArtist());
        albumBinding.albumMusicsCountTextView.setText(album.getTotalMusic() + " Musics");
        VerticalMusicAdapter adapter = new VerticalMusicAdapter(album.getMusics(), TAG);
        albumBinding.albumMusicsRecyclerView.setAdapter(adapter);
    }

    private void playAlbum() {
        albumBinding.albumPlayButton.setOnClickListener(v -> {
            musicPlayer.setNewPlaylist(album.getMusics());
            musicPlayer.play();
            mainActivity.playBackLayout.setVisibility(View.VISIBLE);
        });
    }

    private void downloadAlbum() {
        albumBinding.albumDownloadButton.setOnClickListener(v -> {
            DownloadManager downloadManager = (DownloadManager) requireContext().getSystemService(Context.DOWNLOAD_SERVICE);
            for (int i = 0; i < album.getMusics().size(); i++) {
                Music music = album.getMusics().get(i);
                String title = music.getName();
                Uri uri = Uri.parse(music.getSource());
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE)
                        .setAllowedOverRoaming(true)
                        .setTitle(title)
                        .setDescription("Downloading...")
                        .setMimeType("audio/*")
                        .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                        .setDestinationInExternalPublicDir(Environment.DIRECTORY_MUSIC, title + ".m4a");
                downloadManager.enqueue(request);
            }
            addToDownloads();
        });
    }

    private void addToDownloads() {
        downloads = sharedPreferenceManager.readDownloadedData();
        if (!downloaded) {
            if (!downloads.contains(album.getId() + album.getName())) {
                downloads.add(album.getId() + album.getName());
            }
            sharedPreferenceManager.storeDownloadedData(downloads);
            downloaded = true;
        } else {
            downloads.remove(album.getId() + album.getName());
            sharedPreferenceManager.storeDownloadedData(downloads);
            downloaded = false;
        }
    }

    private void likeAlbum() {
        checkMusicLiked();
        albumBinding.albumLikeButton.setOnClickListener(v ->
                albumBinding.albumLikeButton.setOnClickListener(v1 -> {
                    if (!albumLiked) {
                        if (!likedAlbums.contains(album.getId() + album.getName())) {
                            likedAlbums.add(album.getId() + album.getName());
                        }
                        sharedPreferenceManager.storeLikedData(likedAlbums);
                        albumBinding.albumLikeButton.setImageResource(R.drawable.ic_heart_fill);
                        albumLiked = true;
                    } else {
                        likedAlbums.remove(album.getId() + album.getName());
                        sharedPreferenceManager.storeLikedData(likedAlbums);
                        albumBinding.albumLikeButton.setImageResource(R.drawable.ic_heart);
                        albumLiked = false;
                    }
                })
        );
    }

    private void checkMusicLiked() {
        likedAlbums = sharedPreferenceManager.readLikedData();
        if (likedAlbums.contains(album.getId() + album.getName())) {
            albumBinding.albumLikeButton.setImageResource(R.drawable.ic_heart_fill);
            albumLiked = true;
        } else {
            albumBinding.albumLikeButton.setImageResource(R.drawable.ic_heart);
            albumLiked = false;
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mainActivity.bottomNavigationView.setVisibility(View.VISIBLE);
        mainActivity.homeImageView.setVisibility(View.VISIBLE);
    }
}