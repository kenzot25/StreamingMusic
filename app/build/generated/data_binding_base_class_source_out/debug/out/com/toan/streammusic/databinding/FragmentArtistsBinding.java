// Generated by data binding compiler. Do not edit!
package com.toan.streammusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.card.MaterialCardView;
import com.smarteist.autoimageslider.SliderView;
import com.toan.streammusic.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentArtistsBinding extends ViewDataBinding {
  @NonNull
  public final SpinKitView artistSliderSpinKit;

  @NonNull
  public final SliderView artistSliderView;

  @NonNull
  public final ConstraintLayout constraintLayout17;

  @NonNull
  public final ConstraintLayout constraintLayout6;

  @NonNull
  public final MaterialCardView firstArtistCardView;

  @NonNull
  public final ImageView firstArtistImageView;

  @NonNull
  public final MaterialCardView fourthArtistCardView;

  @NonNull
  public final ImageView fourthArtistImageView;

  @NonNull
  public final CoordinatorLayout frameLayout2;

  @NonNull
  public final ImageButton imageButton2;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final ImageButton searchButton;

  @NonNull
  public final MaterialCardView secondArtistCardView;

  @NonNull
  public final ImageView secondArtistImageView;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final MaterialCardView thirdArtistCardView;

  @NonNull
  public final ImageView thirdArtistImageView;

  @NonNull
  public final SpinKitView topArtistSpinKit;

  @NonNull
  public final RecyclerView topArtistsRecyclerView;

  protected FragmentArtistsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      SpinKitView artistSliderSpinKit, SliderView artistSliderView,
      ConstraintLayout constraintLayout17, ConstraintLayout constraintLayout6,
      MaterialCardView firstArtistCardView, ImageView firstArtistImageView,
      MaterialCardView fourthArtistCardView, ImageView fourthArtistImageView,
      CoordinatorLayout frameLayout2, ImageButton imageButton2, LinearLayout linearLayout,
      ImageButton searchButton, MaterialCardView secondArtistCardView,
      ImageView secondArtistImageView, TextView textView10, TextView textView11, TextView textView8,
      MaterialCardView thirdArtistCardView, ImageView thirdArtistImageView,
      SpinKitView topArtistSpinKit, RecyclerView topArtistsRecyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.artistSliderSpinKit = artistSliderSpinKit;
    this.artistSliderView = artistSliderView;
    this.constraintLayout17 = constraintLayout17;
    this.constraintLayout6 = constraintLayout6;
    this.firstArtistCardView = firstArtistCardView;
    this.firstArtistImageView = firstArtistImageView;
    this.fourthArtistCardView = fourthArtistCardView;
    this.fourthArtistImageView = fourthArtistImageView;
    this.frameLayout2 = frameLayout2;
    this.imageButton2 = imageButton2;
    this.linearLayout = linearLayout;
    this.searchButton = searchButton;
    this.secondArtistCardView = secondArtistCardView;
    this.secondArtistImageView = secondArtistImageView;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView8 = textView8;
    this.thirdArtistCardView = thirdArtistCardView;
    this.thirdArtistImageView = thirdArtistImageView;
    this.topArtistSpinKit = topArtistSpinKit;
    this.topArtistsRecyclerView = topArtistsRecyclerView;
  }

  @NonNull
  public static FragmentArtistsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_artists, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentArtistsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentArtistsBinding>inflateInternal(inflater, R.layout.fragment_artists, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentArtistsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_artists, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentArtistsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentArtistsBinding>inflateInternal(inflater, R.layout.fragment_artists, null, false, component);
  }

  public static FragmentArtistsBinding bind(@NonNull View view) {
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
  public static FragmentArtistsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentArtistsBinding)bind(component, view, R.layout.fragment_artists);
  }
}
