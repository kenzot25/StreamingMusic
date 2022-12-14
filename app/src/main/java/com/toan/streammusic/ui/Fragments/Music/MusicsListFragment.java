package com.toan.streammusic.ui.Fragments.Music;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.toan.streammusic.Adapters.Album.VerticalAlbumAdapter;
import com.toan.streammusic.Adapters.Music.VerticalMusicAdapter;
import com.toan.streammusic.MainActivity;
import com.toan.streammusic.MainViewModel;
import com.toan.streammusic.Models.Album;
import com.toan.streammusic.Models.Music;
import com.toan.streammusic.R;
import com.toan.streammusic.SharedPreference.SharedPreferenceManager;
import com.toan.streammusic.databinding.FragmentMusicsListBinding;
import com.toan.streammusic.utils.Constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;

@AndroidEntryPoint
public class MusicsListFragment extends Fragment {

    FragmentMusicsListBinding musicsBinding;
    MainViewModel mainViewModel;
    CompositeDisposable compositeDisposable;
    MainActivity mainActivity;
    @Inject
    SharedPreferenceManager sharedPreferenceManager;
    ArrayList<String> downloaded;
    ArrayList<Music> downloadedMusicList = new ArrayList<>();
    ArrayList<Album> downloadedAlbumList = new ArrayList<>();
    private static final String TAG = "music_list";
    private static final String TAG2 = "downloaded";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        musicsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_musics_list, container, false);
        mainViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);
        compositeDisposable = new CompositeDisposable();
        mainActivity.bottomNavigationView.setVisibility(View.GONE);
        mainActivity.homeImageView.setVisibility(View.GONE);
        downloaded = sharedPreferenceManager.readDownloadedData();

        Bundle args = getArguments();
        if (args != null) {
            int position = args.getInt("position");
            switch (position) {
                case 0:
                    getTrendingMusics();
                    break;
                case 1:
                    getPopularMusics();
                    break;
                case 2:
                    getLatestAlbums();
                    break;
                case 3:
                    musicsBinding.headerLayout.setVisibility(View.VISIBLE);
                    musicsBinding.backStackButton.setOnClickListener(v -> requireActivity().onBackPressed());
                    getDownloadedMusics();
                    break;
                case 4:
                    musicsBinding.pageTitleTextView.setText(requireActivity().getResources().getString(R.string.downloaded_albums));
                    musicsBinding.headerLayout.setVisibility(View.VISIBLE);
                    musicsBinding.backStackButton.setOnClickListener(v -> requireActivity().onBackPressed());
                    getDownloadedAlbums();
                    break;
            }
        }

        return musicsBinding.getRoot();
    }

    private void getDownloadedMusics() {
        Disposable disposable = mainViewModel.getAllMusics()
                .map(musics -> {
                    downloadedMusicList.clear();
                    for (int i = 0; i < downloaded.size(); i++) {
                        for (int j = 0; j < musics.size(); j++) {
                            if (downloaded.get(i).equals(musics.get(j).getId() + musics.get(j).getName())) {
                                downloadedMusicList.add(musics.get(j));
                            }
                        }
                    }
                    return downloadedMusicList;
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe((Consumer<List<Music>>) musics -> {
                    Collections.reverse(musics);

                    if (musicsBinding.musicsRecyclerView.getAdapter() == null) {
                        VerticalMusicAdapter adapter = new VerticalMusicAdapter(musics, TAG2);
                        musicsBinding.musicsRecyclerView.setAdapter(adapter);
                    } else {
                        VerticalMusicAdapter adapter = (VerticalMusicAdapter) musicsBinding.musicsRecyclerView.getAdapter();
                        adapter.updateList(musics);
                    }

                    if (musics.isEmpty()) {
                        musicsBinding.notFoundMusicTextView.setVisibility(View.VISIBLE);
                    } else {
                        musicsBinding.notFoundMusicTextView.setVisibility(View.GONE);
                    }
                }, throwable -> {
                    Constants.raiseError(getActivity(), getString(R.string.something_went_wrong));
                });
        compositeDisposable.add(disposable);
    }

    private void getDownloadedAlbums() {
        Disposable disposable = mainViewModel.getAllAlbums()
                .map(albums -> {
                    downloadedAlbumList.clear();
                    for (int i = 0; i < downloaded.size(); i++) {
                        for (int j = 0; j < albums.size(); j++) {
                            if (downloaded.get(i).equals(albums.get(j).getId() + albums.get(j).getName())) {
                                downloadedAlbumList.add(albums.get(j));
                            }
                        }
                    }
                    return downloadedAlbumList;
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe((Consumer<List<Album>>) albums -> {
                    Collections.reverse(albums);

                    if (musicsBinding.musicsRecyclerView.getAdapter() == null) {
                        VerticalAlbumAdapter adapter = new VerticalAlbumAdapter(albums, TAG2);
                        musicsBinding.musicsRecyclerView.setAdapter(adapter);
                    } else {
                        VerticalAlbumAdapter adapter = (VerticalAlbumAdapter) musicsBinding.musicsRecyclerView.getAdapter();
                        adapter.updateList(albums);
                    }

                    if (albums.isEmpty()) {
                        musicsBinding.notFoundMusicTextView.setVisibility(View.VISIBLE);
                    } else {
                        musicsBinding.notFoundMusicTextView.setVisibility(View.GONE);
                    }
                }, throwable -> {
                    Constants.raiseError(getActivity(), getString(R.string.something_went_wrong));
                });
        compositeDisposable.add(disposable);
    }

    private void getTrendingMusics() {
        Disposable disposable = mainViewModel.getTrendingMusics()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(musics -> {
                    if (musicsBinding.musicsRecyclerView.getAdapter() == null) {
                        VerticalMusicAdapter musicAdapter = new VerticalMusicAdapter(musics, TAG);
                        musicsBinding.musicsRecyclerView.setAdapter(musicAdapter);
                    } else {
                        VerticalMusicAdapter adapter = (VerticalMusicAdapter) musicsBinding.musicsRecyclerView.getAdapter();
                        adapter.updateList(musics);
                    }

                    if (musics.isEmpty()) {
                        musicsBinding.musicsSpinKit.setVisibility(View.VISIBLE);
                    } else {
                        musicsBinding.musicsSpinKit.setVisibility(View.GONE);
                    }
                }, throwable -> {
                    Constants.raiseError(getActivity(), getString(R.string.something_went_wrong));
                });
        compositeDisposable.add(disposable);
    }

    private void getPopularMusics() {
        Disposable disposable = mainViewModel.getPopularMusics()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(musics -> {
                    if (musicsBinding.musicsRecyclerView.getAdapter() == null) {
                        VerticalMusicAdapter musicAdapter = new VerticalMusicAdapter(musics, TAG);
                        musicsBinding.musicsRecyclerView.setAdapter(musicAdapter);
                    } else {
                        VerticalMusicAdapter adapter = (VerticalMusicAdapter) musicsBinding.musicsRecyclerView.getAdapter();
                        adapter.updateList(musics);
                    }

                    if (musics.isEmpty()) {
                        musicsBinding.musicsSpinKit.setVisibility(View.VISIBLE);
                    } else {
                        musicsBinding.musicsSpinKit.setVisibility(View.GONE);
                    }
                }, throwable -> {
                    Constants.raiseError(getActivity(), getString(R.string.something_went_wrong));
                });
        compositeDisposable.add(disposable);
    }

    private void getLatestAlbums() {
        Disposable disposable = mainViewModel.getAllAlbums()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(albums -> {
                    List<Album> albumList = albums.subList(0, 30);

                    if (musicsBinding.musicsRecyclerView.getAdapter() == null) {
                        VerticalAlbumAdapter albumAdapter = new VerticalAlbumAdapter(albumList, TAG);
                        musicsBinding.musicsRecyclerView.setAdapter(albumAdapter);
                    } else {
                        VerticalAlbumAdapter adapter = (VerticalAlbumAdapter) musicsBinding.musicsRecyclerView.getAdapter();
                        adapter.updateList(albumList);
                    }

                    if (albums.isEmpty()) {
                        musicsBinding.musicsSpinKit.setVisibility(View.VISIBLE);
                    } else {
                        musicsBinding.musicsSpinKit.setVisibility(View.GONE);
                    }
                }, throwable -> {
                    Constants.raiseError(getActivity(), getString(R.string.something_went_wrong));
                });
        compositeDisposable.add(disposable);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mainActivity.bottomNavigationView.setVisibility(View.VISIBLE);
        mainActivity.homeImageView.setVisibility(View.VISIBLE);
        compositeDisposable.clear();
    }
}