// Generated by data binding compiler. Do not edit!
package com.toan.streammusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.toan.streammusic.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLikedBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout albumsLayout;

  @NonNull
  public final ImageButton backStackButton;

  @NonNull
  public final ConstraintLayout frameLayout16;

  @NonNull
  public final RelativeLayout headerLayout;

  @NonNull
  public final RecyclerView likedAlbumsRecyclerView;

  @NonNull
  public final RecyclerView likedMusicsRecyclerView;

  @NonNull
  public final RecyclerView likedVideosRecyclerView;

  @NonNull
  public final ConstraintLayout musicsLayout;

  @NonNull
  public final TextView notFoundTextView;

  @NonNull
  public final TextView pageTitleTextView;

  @NonNull
  public final TextView textView36;

  @NonNull
  public final TextView textView37;

  @NonNull
  public final TextView textView41;

  @NonNull
  public final ConstraintLayout videosLayout;

  protected FragmentLikedBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout albumsLayout, ImageButton backStackButton, ConstraintLayout frameLayout16,
      RelativeLayout headerLayout, RecyclerView likedAlbumsRecyclerView,
      RecyclerView likedMusicsRecyclerView, RecyclerView likedVideosRecyclerView,
      ConstraintLayout musicsLayout, TextView notFoundTextView, TextView pageTitleTextView,
      TextView textView36, TextView textView37, TextView textView41,
      ConstraintLayout videosLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.albumsLayout = albumsLayout;
    this.backStackButton = backStackButton;
    this.frameLayout16 = frameLayout16;
    this.headerLayout = headerLayout;
    this.likedAlbumsRecyclerView = likedAlbumsRecyclerView;
    this.likedMusicsRecyclerView = likedMusicsRecyclerView;
    this.likedVideosRecyclerView = likedVideosRecyclerView;
    this.musicsLayout = musicsLayout;
    this.notFoundTextView = notFoundTextView;
    this.pageTitleTextView = pageTitleTextView;
    this.textView36 = textView36;
    this.textView37 = textView37;
    this.textView41 = textView41;
    this.videosLayout = videosLayout;
  }

  @NonNull
  public static FragmentLikedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_liked, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLikedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLikedBinding>inflateInternal(inflater, R.layout.fragment_liked, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLikedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_liked, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLikedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLikedBinding>inflateInternal(inflater, R.layout.fragment_liked, null, false, component);
  }

  public static FragmentLikedBinding bind(@NonNull View view) {
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
  public static FragmentLikedBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLikedBinding)bind(component, view, R.layout.fragment_liked);
  }
}
