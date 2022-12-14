package com.toan.streammusic.ui.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.toan.streammusic.Adapters.Album.AlbumAdapter;
import com.toan.streammusic.Adapters.Artist.ArtistAdapter;
import com.toan.streammusic.Adapters.Music.MusicAdapter;
import com.toan.streammusic.Adapters.Music.SliderAdapter;
import com.toan.streammusic.Adapters.Video.VideoAdapter;
import com.toan.streammusic.MainViewModel;
import com.toan.streammusic.Models.Album;
import com.toan.streammusic.Models.Artist;
import com.toan.streammusic.Models.Music;
import com.toan.streammusic.Models.Video;
import com.toan.streammusic.R;
import com.toan.streammusic.databinding.FragmentBrowseBinding;
import com.toan.streammusic.utils.Constants;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class BrowseFragment extends Fragment {

    FragmentBrowseBinding browseBinding;
    MainViewModel mainViewModel;
    CompositeDisposable compositeDisposable;
    private static final String TAG = "browser";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        browseBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_browse, container, false);
        mainViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);
        compositeDisposable = new CompositeDisposable();
        browseBinding.searchButton.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_browseFragment_to_searchFragment)
        );
        return browseBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getLatestMusics();
        getPopularVideos();
        getLatestAlbums();
        getTopArtist();
        setupNavigation();
    }

    private void setupNavigation() {
        View.OnClickListener clickListener = v -> {
            if (v.getId() == R.id.seeMoreMusicsTextView || v.getId() == R.id.seeMoreAlbumsTextView) {
                Navigation.findNavController(v).navigate(R.id.action_browseFragment_to_allMusicsFragment);
            } else if (v.getId() == R.id.seeMorePopularVideosTextView) {
                Navigation.findNavController(v).navigate(R.id.action_browseFragment_to_allVideosFragment);
            }
        };
        browseBinding.seeMoreMusicsTextView.setOnClickListener(clickListener);
        browseBinding.seeMoreAlbumsTextView.setOnClickListener(clickListener);
        browseBinding.seeMorePopularVideosTextView.setOnClickListener(clickListener);
    }

    private void getTopArtist() {
        Disposable disposable = mainViewModel.getAllArtists()
                .map(this::sortByFollowers)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(artists -> {
                    if (!artists.isEmpty()) {
                        List<Artist> topArtists = artists.subList(0, 15);

                        if (browseBinding.mustFollowRecyclerView.getAdapter() == null) {
                            ArtistAdapter artistAdapter = new ArtistAdapter(topArtists, TAG);
                            browseBinding.mustFollowRecyclerView.setAdapter(artistAdapter);
                        } else {
                            ArtistAdapter adapter = (ArtistAdapter) browseBinding.mustFollowRecyclerView.getAdapter();
                            adapter.updateList(topArtists);
                        }
                    }

                    if (artists.isEmpty()) {
                        browseBinding.mustFollowSpinKit.setVisibility(View.VISIBLE);
                    } else {
                        browseBinding.mustFollowSpinKit.setVisibility(View.GONE);
                    }
                }, throwable -> {
                    Constants.raiseError(getActivity(), getString(R.string.something_went_wrong));
                });
        compositeDisposable.add(disposable);
    }

    private List<Artist> sortByFollowers(List<Artist> artists) {
        Collections.sort(artists, (o1, o2) -> Integer.compare(o2.getFollowersCount(), o1.getFollowersCount()));
        return artists;
    }

    private void getLatestAlbums() {
        Disposable disposable = mainViewModel.getAllAlbums()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(albums -> {
                    if (!albums.isEmpty()) {
                        List<Album> latestAlbums = albums.subList(0, 15);

                        if (browseBinding.latestAlbumsRecyclerView.getAdapter() == null) {
                            AlbumAdapter albumAdapter = new AlbumAdapter(latestAlbums);
                            browseBinding.latestAlbumsRecyclerView.setAdapter(albumAdapter);
                        } else {
                            AlbumAdapter adapter = (AlbumAdapter) browseBinding.latestAlbumsRecyclerView.getAdapter();
                            adapter.updateList(latestAlbums);
                        }
                    }

                    if (albums.isEmpty()) {
                        browseBinding.latestAlbumsSpinKit.setVisibility(View.VISIBLE);
                    } else {
                        browseBinding.latestAlbumsSpinKit.setVisibility(View.GONE);
                    }
                }, throwable -> {
                    Constants.raiseError(getActivity(), getString(R.string.something_went_wrong));
                });
        compositeDisposable.add(disposable);
    }

    private void getPopularVideos() {
        Disposable disposable = mainViewModel.getAllVideos()
                .map(this::sortByLikes)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(videos -> {
                    if (!videos.isEmpty()) {
                        List<Video> popularVideos = videos.subList(0, 10);

                        if (browseBinding.popularVideosRecyclerView.getAdapter() == null) {
                            VideoAdapter videoAdapter = new VideoAdapter(popularVideos, TAG);
                            browseBinding.popularVideosRecyclerView.setAdapter(videoAdapter);
                        } else {
                            VideoAdapter adapter = (VideoAdapter) browseBinding.popularVideosRecyclerView.getAdapter();
                            adapter.updateList(popularVideos);
                        }
                    }

                    if (videos.isEmpty()) {
                        browseBinding.popularVideosSpinKit.setVisibility(View.VISIBLE);
                    } else {
                        browseBinding.popularVideosSpinKit.setVisibility(View.GONE);
                    }
                }, throwable -> {
                    Constants.raiseError(getActivity(), getString(R.string.something_went_wrong));
                });
        compositeDisposable.add(disposable);
    }

    private List<Video> sortByLikes(List<Video> videos) {
        Collections.sort(videos, (o1, o2) -> Integer.compare(o2.getLikes(), o1.getLikes()));
        return videos;
    }

    private void getLatestMusics() {
        Disposable disposable = mainViewModel.getAllMusics()
                .map(this::getLatestMusics)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe((Consumer<List<Music>>) musics -> {
                    if (!musics.isEmpty()) {
                        List<Music> topThreeMusics = musics.subList(0, 5);
                        List<Music> latestMusics = musics.subList(5, 20);

                        if (browseBinding.latestMusicsSliderView.getSliderAdapter() == null) {
                            SliderAdapter sliderAdapter = new SliderAdapter(topThreeMusics);
                            browseBinding.latestMusicsSliderView.setSliderAdapter(sliderAdapter);
                        } else {
                            SliderAdapter sliderAdapter = (SliderAdapter) browseBinding.latestMusicsSliderView.getSliderAdapter();
                            sliderAdapter.updateList(topThreeMusics);
                        }
                        browseBinding.latestMusicsSliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
                        browseBinding.latestMusicsSliderView.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
                        browseBinding.latestMusicsSliderView.setScrollTimeInSec(5);
                        browseBinding.latestMusicsSliderView.startAutoCycle();

                        if (browseBinding.latestMusicsRecyclerView.getAdapter() == null) {
                            MusicAdapter musicAdapter = new MusicAdapter(latestMusics, TAG);
                            browseBinding.latestMusicsRecyclerView.setAdapter(musicAdapter);
                        } else {
                            MusicAdapter adapter = (MusicAdapter) browseBinding.latestMusicsRecyclerView.getAdapter();
                            adapter.updateList(latestMusics);
                        }
                    }

                    if (musics.isEmpty()) {
                        browseBinding.latestMusicSliderSpinKit.setVisibility(View.VISIBLE);
                        browseBinding.latestMusicSpinKit.setVisibility(View.VISIBLE);
                    } else {
                        browseBinding.latestMusicSliderSpinKit.setVisibility(View.GONE);
                        browseBinding.latestMusicSpinKit.setVisibility(View.GONE);
                    }
                }, throwable -> {
                    Constants.raiseError(getActivity(), getString(R.string.something_went_wrong));
                });
        compositeDisposable.add(disposable);
    }

    private ArrayList<Music> getLatestMusics(List<Music> musicList) {
        ArrayList<Music> latest = new ArrayList<>();
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getAlbum() == null) {
                latest.add(musicList.get(i));
            }
        }
        return latest;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        compositeDisposable.clear();
    }
}