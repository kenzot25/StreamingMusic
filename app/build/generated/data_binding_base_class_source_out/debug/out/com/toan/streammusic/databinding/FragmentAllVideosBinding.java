// Generated by data binding compiler. Do not edit!
package com.toan.streammusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.toan.streammusic.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentAllVideosBinding extends ViewDataBinding {
  @NonNull
  public final TabLayout allVideosTabLayout;

  @NonNull
  public final ViewPager2 allVideosViewPager;

  @NonNull
  public final ImageButton backStackButton;

  @NonNull
  public final CoordinatorLayout frameLayout12;

  @NonNull
  public final ImageButton searchButton;

  @NonNull
  public final TextView textView17;

  protected FragmentAllVideosBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TabLayout allVideosTabLayout, ViewPager2 allVideosViewPager, ImageButton backStackButton,
      CoordinatorLayout frameLayout12, ImageButton searchButton, TextView textView17) {
    super(_bindingComponent, _root, _localFieldCount);
    this.allVideosTabLayout = allVideosTabLayout;
    this.allVideosViewPager = allVideosViewPager;
    this.backStackButton = backStackButton;
    this.frameLayout12 = frameLayout12;
    this.searchButton = searchButton;
    this.textView17 = textView17;
  }

  @NonNull
  public static FragmentAllVideosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_all_videos, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAllVideosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAllVideosBinding>inflateInternal(inflater, R.layout.fragment_all_videos, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAllVideosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_all_videos, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAllVideosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAllVideosBinding>inflateInternal(inflater, R.layout.fragment_all_videos, null, false, component);
  }

  public static FragmentAllVideosBinding bind(@NonNull View view) {
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
  public static FragmentAllVideosBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAllVideosBinding)bind(component, view, R.layout.fragment_all_videos);
  }
}
