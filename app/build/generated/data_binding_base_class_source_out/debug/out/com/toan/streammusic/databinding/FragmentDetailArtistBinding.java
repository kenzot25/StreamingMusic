// Generated by data binding compiler. Do not edit!
package com.toan.streammusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;
import com.toan.streammusic.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDetailArtistBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton backStackButton;

  @NonNull
  public final TextView detailArtistFollowersTextView;

  @NonNull
  public final ImageView detailArtistImageView;

  @NonNull
  public final TextView detailArtistMusicCountTextView;

  @NonNull
  public final TextView detailArtistNameTextView;

  @NonNull
  public final TextView detailArtistPlaysTextView;

  @NonNull
  public final TabLayout detailArtistTabLayout;

  @NonNull
  public final ViewPager2 detailArtistViewPager;

  @NonNull
  public final Button followButton;

  @NonNull
  public final CoordinatorLayout frameLayout6;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final MaterialCardView materialCardView;

  @NonNull
  public final TextView textView38;

  @NonNull
  public final TextView textView39;

  @NonNull
  public final TextView textView40;

  protected FragmentDetailArtistBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton backStackButton, TextView detailArtistFollowersTextView,
      ImageView detailArtistImageView, TextView detailArtistMusicCountTextView,
      TextView detailArtistNameTextView, TextView detailArtistPlaysTextView,
      TabLayout detailArtistTabLayout, ViewPager2 detailArtistViewPager, Button followButton,
      CoordinatorLayout frameLayout6, LinearLayout linearLayout2, MaterialCardView materialCardView,
      TextView textView38, TextView textView39, TextView textView40) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backStackButton = backStackButton;
    this.detailArtistFollowersTextView = detailArtistFollowersTextView;
    this.detailArtistImageView = detailArtistImageView;
    this.detailArtistMusicCountTextView = detailArtistMusicCountTextView;
    this.detailArtistNameTextView = detailArtistNameTextView;
    this.detailArtistPlaysTextView = detailArtistPlaysTextView;
    this.detailArtistTabLayout = detailArtistTabLayout;
    this.detailArtistViewPager = detailArtistViewPager;
    this.followButton = followButton;
    this.frameLayout6 = frameLayout6;
    this.linearLayout2 = linearLayout2;
    this.materialCardView = materialCardView;
    this.textView38 = textView38;
    this.textView39 = textView39;
    this.textView40 = textView40;
  }

  @NonNull
  public static FragmentDetailArtistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_detail_artist, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDetailArtistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDetailArtistBinding>inflateInternal(inflater, R.layout.fragment_detail_artist, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDetailArtistBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_detail_artist, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDetailArtistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDetailArtistBinding>inflateInternal(inflater, R.layout.fragment_detail_artist, null, false, component);
  }

  public static FragmentDetailArtistBinding bind(@NonNull View view) {
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
  public static FragmentDetailArtistBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDetailArtistBinding)bind(component, view, R.layout.fragment_detail_artist);
  }
}
