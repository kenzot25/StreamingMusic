package com.toan.streammusic.Adapters.Album;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.toan.streammusic.Models.Album;
import com.toan.streammusic.R;
import com.toan.streammusic.databinding.HorizontalItemLayoutBinding;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

import java.util.List;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {

    List<Album> albumList;

    public AlbumAdapter(List<Album> albumList) {
        this.albumList = albumList;
    }

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        HorizontalItemLayoutBinding itemLayoutBinding = DataBindingUtil.inflate(inflater, R.layout.horizontal_item_layout, parent, false);
        return new AlbumViewHolder(itemLayoutBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {
        holder.bindData(albumList.get(position));
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }

    public void updateList(List<Album> albums) {
        albumList = albums;
        notifyDataSetChanged();
    }

    static class AlbumViewHolder extends RecyclerView.ViewHolder {

        HorizontalItemLayoutBinding itemLayoutBinding;

        public AlbumViewHolder(@NonNull HorizontalItemLayoutBinding itemLayoutBinding) {
            super(itemLayoutBinding.getRoot());
            this.itemLayoutBinding = itemLayoutBinding;
        }

        private void bindData(Album album) {
            Glide.with(itemLayoutBinding.getRoot().getContext())
                    .load(album.getCover())
                    .thumbnail(
                            Glide.with(itemLayoutBinding.getRoot().getContext())
                                    .load(R.drawable.loading)
                    )
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                    .override(300, 300)
                    .into(itemLayoutBinding.itemImageView);
            itemLayoutBinding.itemNameTextView.setText(songNameCutter(album.getName()));
            itemLayoutBinding.itemArtistTextView.setText(artistNameCutter(album.getArtist()));
            itemLayoutBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("Album", album);
                    Navigation.findNavController(v).navigate(R.id.action_browseFragment_to_albumFragment, bundle);
                }
            });
            itemLayoutBinding.executePendingBindings();
        }

        private String songNameCutter(String name) {
            int length = name.length();
            if (length > 16) {
                String subString = name.substring(0, 16);
                return subString + "...";
            }
            return name;
        }

        private String artistNameCutter(String name) {
            int length = name.length();
            if (length > 22) {
                String subString = name.substring(0, 22);
                return subString + "...";
            }
            return name;
        }
    }
}
