package com.toan.streammusic.Adapters.Music;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.toan.streammusic.ui.Fragments.Music.MusicsListFragment;

public class AllMusicPagerAdapter extends FragmentStateAdapter {

    public AllMusicPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        MusicsListFragment fragment = new MusicsListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
