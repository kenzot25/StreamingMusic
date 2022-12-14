// Generated by data binding compiler. Do not edit!
package com.toan.streammusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.toan.streammusic.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class VerticalArtistItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintLayout8;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final CardView verticalArtistCardView;

  @NonNull
  public final ImageView verticalArtistImageView;

  @NonNull
  public final TextView verticalArtistNameTextView;

  @NonNull
  public final TextView verticalFollowersTextView;

  @NonNull
  public final TextView verticalPlayTextView;

  @NonNull
  public final View view2;

  protected VerticalArtistItemLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout constraintLayout8, ImageView imageView5,
      ImageView imageView6, CardView verticalArtistCardView, ImageView verticalArtistImageView,
      TextView verticalArtistNameTextView, TextView verticalFollowersTextView,
      TextView verticalPlayTextView, View view2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintLayout8 = constraintLayout8;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.verticalArtistCardView = verticalArtistCardView;
    this.verticalArtistImageView = verticalArtistImageView;
    this.verticalArtistNameTextView = verticalArtistNameTextView;
    this.verticalFollowersTextView = verticalFollowersTextView;
    this.verticalPlayTextView = verticalPlayTextView;
    this.view2 = view2;
  }

  @NonNull
  public static VerticalArtistItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.vertical_artist_item_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VerticalArtistItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VerticalArtistItemLayoutBinding>inflateInternal(inflater, R.layout.vertical_artist_item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static VerticalArtistItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.vertical_artist_item_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VerticalArtistItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VerticalArtistItemLayoutBinding>inflateInternal(inflater, R.layout.vertical_artist_item_layout, null, false, component);
  }

  public static VerticalArtistItemLayoutBinding bind(@NonNull View view) {
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
  public static VerticalArtistItemLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (VerticalArtistItemLayoutBinding)bind(component, view, R.layout.vertical_artist_item_layout);
  }
}
