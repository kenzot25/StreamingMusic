package com.toan.streammusic.ui.Fragments.Artist;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.toan.streammusic.Adapters.Artist.VerticalArtistAdapter;
import com.toan.streammusic.MainActivity;
import com.toan.streammusic.MainViewModel;
import com.toan.streammusic.Models.Artist;
import com.toan.streammusic.R;
import com.toan.streammusic.SharedPreference.SharedPreferenceManager;
import com.toan.streammusic.databinding.FragmentFollowedArtistsBinding;
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
public class FollowedArtistsFragment extends Fragment {

    FragmentFollowedArtistsBinding artistBinding;
    MainViewModel mainViewModel;
    CompositeDisposable compositeDisposable;
    MainActivity mainActivity;
    @Inject
    SharedPreferenceManager sharedPreferenceManager;
    ArrayList<String> followedArtist;
    ArrayList<Artist> followedArtistList = new ArrayList<>();
    private static final String TAG = "followed_artists";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        artistBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_followed_artists, container, false);
        mainViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);
        compositeDisposable = new CompositeDisposable();
        mainActivity.bottomNavigationView.setVisibility(View.GONE);
        mainActivity.homeImageView.setVisibility(View.GONE);
        artistBinding.backStackButton.setOnClickListener(v -> requireActivity().onBackPressed());
        followedArtist = sharedPreferenceManager.readFollowedArtistData();
        getFollowedArtists();

        return artistBinding.getRoot();
    }

    private void getFollowedArtists() {
        Disposable disposable = mainViewModel.getAllArtists()
                .map(artists -> {
                    followedArtistList.clear();
                    for (int i = 0; i < followedArtist.size(); i++) {
                        for (int j = 0; j < artists.size(); j++) {
                            if (followedArtist.get(i).equals(artists.get(j).getId() + artists.get(j).getName())) {
                                followedArtistList.add(artists.get(j));
                            }
                        }
                    }
                    return followedArtistList;
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe((Consumer<List<Artist>>) artists -> {
                    Collections.reverse(artists);

                    if (artistBinding.artistsRecyclerView.getAdapter() == null) {
                        VerticalArtistAdapter adapter = new VerticalArtistAdapter(artists, TAG);
                        artistBinding.artistsRecyclerView.setAdapter(adapter);
                    } else {
                        VerticalArtistAdapter adapter = (VerticalArtistAdapter) artistBinding.artistsRecyclerView.getAdapter();
                        adapter.updateList(artists);
                    }

                    if (artists.isEmpty()) {
                        artistBinding.notFoundArtistTextView.setVisibility(View.VISIBLE);
                    } else {
                        artistBinding.notFoundArtistTextView.setVisibility(View.GONE);
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