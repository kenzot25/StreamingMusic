// Generated by data binding compiler. Do not edit!
package com.toan.streammusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.toan.streammusic.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentVideoPlayerBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton backStackButton;

  @NonNull
  public final CoordinatorLayout frameLayout15;

  @NonNull
  public final RelativeLayout relativeLayout;

  @NonNull
  public final TextView videoPlayerArtistTextView;

  @NonNull
  public final ImageButton videoPlayerDownloadButton;

  @NonNull
  public final FrameLayout videoPlayerFrame;

  @NonNull
  public final ImageButton videoPlayerLikeButton;

  @NonNull
  public final TextView videoPlayerNameTextView;

  @NonNull
  public final RecyclerView videoPlayerRecyclerView;

  @NonNull
  public final PlayerView videoPlayerView;

  protected FragmentVideoPlayerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton backStackButton, CoordinatorLayout frameLayout15, RelativeLayout relativeLayout,
      TextView videoPlayerArtistTextView, ImageButton videoPlayerDownloadButton,
      FrameLayout videoPlayerFrame, ImageButton videoPlayerLikeButton,
      TextView videoPlayerNameTextView, RecyclerView videoPlayerRecyclerView,
      PlayerView videoPlayerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backStackButton = backStackButton;
    this.frameLayout15 = frameLayout15;
    this.relativeLayout = relativeLayout;
    this.videoPlayerArtistTextView = videoPlayerArtistTextView;
    this.videoPlayerDownloadButton = videoPlayerDownloadButton;
    this.videoPlayerFrame = videoPlayerFrame;
    this.videoPlayerLikeButton = videoPlayerLikeButton;
    this.videoPlayerNameTextView = videoPlayerNameTextView;
    this.videoPlayerRecyclerView = videoPlayerRecyclerView;
    this.videoPlayerView = videoPlayerView;
  }

  @NonNull
  public static FragmentVideoPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_video_player, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentVideoPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentVideoPlayerBinding>inflateInternal(inflater, R.layout.fragment_video_player, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentVideoPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_video_player, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentVideoPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentVideoPlayerBinding>inflateInternal(inflater, R.layout.fragment_video_player, null, false, component);
  }

  public static FragmentVideoPlayerBinding bind(@NonNull View view) {
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
  public static FragmentVideoPlayerBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentVideoPlayerBinding)bind(component, view, R.layout.fragment_video_player);
  }
}
