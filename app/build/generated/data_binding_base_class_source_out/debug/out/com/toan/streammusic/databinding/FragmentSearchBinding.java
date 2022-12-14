// Generated by data binding compiler. Do not edit!
package com.toan.streammusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.toan.streammusic.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSearchBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout albumsLayout;

  @NonNull
  public final ConstraintLayout artistsLayout;

  @NonNull
  public final ImageButton backStackButton;

  @NonNull
  public final NestedScrollView frameLayout8;

  @NonNull
  public final ConstraintLayout musicsLayout;

  @NonNull
  public final TextView notFoundTextView;

  @NonNull
  public final EditText searchEditText;

  @NonNull
  public final RecyclerView searchedAlbumsRecyclerView;

  @NonNull
  public final RecyclerView searchedArtistsRecyclerView;

  @NonNull
  public final RecyclerView searchedMusicsRecyclerView;

  @NonNull
  public final RecyclerView searchedVideosRecyclerView;

  @NonNull
  public final TextView textView36;

  @NonNull
  public final TextView textView37;

  @NonNull
  public final TextView textView41;

  @NonNull
  public final TextView textView46;

  @NonNull
  public final ConstraintLayout videosLayout;

  protected FragmentSearchBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout albumsLayout, ConstraintLayout artistsLayout, ImageButton backStackButton,
      NestedScrollView frameLayout8, ConstraintLayout musicsLayout, TextView notFoundTextView,
      EditText searchEditText, RecyclerView searchedAlbumsRecyclerView,
      RecyclerView searchedArtistsRecyclerView, RecyclerView searchedMusicsRecyclerView,
      RecyclerView searchedVideosRecyclerView, TextView textView36, TextView textView37,
      TextView textView41, TextView textView46, ConstraintLayout videosLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.albumsLayout = albumsLayout;
    this.artistsLayout = artistsLayout;
    this.backStackButton = backStackButton;
    this.frameLayout8 = frameLayout8;
    this.musicsLayout = musicsLayout;
    this.notFoundTextView = notFoundTextView;
    this.searchEditText = searchEditText;
    this.searchedAlbumsRecyclerView = searchedAlbumsRecyclerView;
    this.searchedArtistsRecyclerView = searchedArtistsRecyclerView;
    this.searchedMusicsRecyclerView = searchedMusicsRecyclerView;
    this.searchedVideosRecyclerView = searchedVideosRecyclerView;
    this.textView36 = textView36;
    this.textView37 = textView37;
    this.textView41 = textView41;
    this.textView46 = textView46;
    this.videosLayout = videosLayout;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_search, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSearchBinding>inflateInternal(inflater, R.layout.fragment_search, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_search, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSearchBinding>inflateInternal(inflater, R.layout.fragment_search, null, false, component);
  }

  public static FragmentSearchBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentSearchBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSearchBinding)bind(component, view, R.layout.fragment_search);
  }
}
