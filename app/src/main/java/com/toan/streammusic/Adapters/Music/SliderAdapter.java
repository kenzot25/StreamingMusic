package com.toan.streammusic.Adapters.Music;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.toan.streammusic.Models.Music;
import com.toan.streammusic.R;
import com.toan.streammusic.databinding.SliderItemLayoutBinding;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderViewHolder> {

    SliderItemLayoutBinding sliderItemLayoutBinding;
    List<Music> musicList;

    public SliderAdapter(List<Music> musicList) {
        this.musicList = musicList;
    }

    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        sliderItemLayoutBinding = DataBindingUtil.inflate(inflater, R.layout.slider_item_layout, parent, false);
        return new SliderViewHolder(sliderItemLayoutBinding);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, int position) {
        viewHolder.bindData(musicList.get(position));
    }

    @Override
    public int getCount() {
        return musicList.size();
    }

    public void updateList(List<Music> musics) {
        musicList = musics;
        notifyDataSetChanged();
    }

    static class SliderViewHolder extends SliderViewAdapter.ViewHolder {

        SliderItemLayoutBinding sliderItemLayoutBinding;

        public SliderViewHolder(SliderItemLayoutBinding sliderItemLayoutBinding) {
            super(sliderItemLayoutBinding.getRoot());
            this.sliderItemLayoutBinding = sliderItemLayoutBinding;
        }

        private void bindData(Music music) {
            Glide.with(sliderItemLayoutBinding.getRoot().getContext())
                    .load(music.getCover())
                    .thumbnail(
                            Glide.with(sliderItemLayoutBinding.getRoot().getContext())
                                    .load(R.drawable.loading)
                    )
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                    .into(sliderItemLayoutBinding.sliderImageView);
        }
    }
}
