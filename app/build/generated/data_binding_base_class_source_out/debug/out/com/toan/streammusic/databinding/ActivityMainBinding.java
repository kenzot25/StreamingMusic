// Generated by data binding compiler. Do not edit!
package com.toan.streammusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.toan.streammusic.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final FragmentContainerView fragmentContainerView;

  @NonNull
  public final ImageView homeIcon;

  @NonNull
  public final TextView playBackArtistTextView;

  @NonNull
  public final CardView playBackCardView;

  @NonNull
  public final ImageView playBackImageView;

  @NonNull
  public final RelativeLayout playBackLayout;

  @NonNull
  public final TextView playBackNameTextView;

  @NonNull
  public final ImageView playBackNextImageView;

  @NonNull
  public final ImageView playBackPlayImageView;

  @NonNull
  public final ImageView playBackPrevImageView;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      BottomNavigationView bottomNavigationView, FragmentContainerView fragmentContainerView,
      ImageView homeIcon, TextView playBackArtistTextView, CardView playBackCardView,
      ImageView playBackImageView, RelativeLayout playBackLayout, TextView playBackNameTextView,
      ImageView playBackNextImageView, ImageView playBackPlayImageView,
      ImageView playBackPrevImageView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomNavigationView = bottomNavigationView;
    this.fragmentContainerView = fragmentContainerView;
    this.homeIcon = homeIcon;
    this.playBackArtistTextView = playBackArtistTextView;
    this.playBackCardView = playBackCardView;
    this.playBackImageView = playBackImageView;
    this.playBackLayout = playBackLayout;
    this.playBackNameTextView = playBackNameTextView;
    this.playBackNextImageView = playBackNextImageView;
    this.playBackPlayImageView = playBackPlayImageView;
    this.playBackPrevImageView = playBackPrevImageView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
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
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
