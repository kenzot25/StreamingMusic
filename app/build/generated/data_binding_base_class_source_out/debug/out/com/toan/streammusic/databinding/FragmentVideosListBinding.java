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
import com.github.ybq.android.spinkit.SpinKitView;
import com.toan.streammusic.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentVideosListBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton backStackButton;

  @NonNull
  public final ConstraintLayout frameLayout11;

  @NonNull
  public final RelativeLayout headerLayout;

  @NonNull
  public final TextView notFoundVideoTextView;

  @NonNull
  public final TextView pageTitleTextView;

  @NonNull
  public final RecyclerView videosRecyclerView;

  @NonNull
  public final SpinKitView videosSpinKit;

  protected FragmentVideosListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton backStackButton, ConstraintLayout frameLayout11, RelativeLayout headerLayout,
      TextView notFoundVideoTextView, TextView pageTitleTextView, RecyclerView videosRecyclerView,
      SpinKitView videosSpinKit) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backStackButton = backStackButton;
    this.frameLayout11 = frameLayout11;
    this.headerLayout = headerLayout;
    this.notFoundVideoTextView = notFoundVideoTextView;
    this.pageTitleTextView = pageTitleTextView;
    this.videosRecyclerView = videosRecyclerView;
    this.videosSpinKit = videosSpinKit;
  }

  @NonNull
  public static FragmentVideosListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_videos_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentVideosListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentVideosListBinding>inflateInternal(inflater, R.layout.fragment_videos_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentVideosListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_videos_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentVideosListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentVideosListBinding>inflateInternal(inflater, R.layout.fragment_videos_list, null, false, component);
  }

  public static FragmentVideosListBinding bind(@NonNull View view) {
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
  public static FragmentVideosListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentVideosListBinding)bind(component, view, R.layout.fragment_videos_list);
  }
}