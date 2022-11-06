// Generated by data binding compiler. Do not edit!
package com.toan.streammusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.toan.streammusic.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LyricBottomSheetBinding extends ViewDataBinding {
  @NonNull
  public final TextView lyricTextView;

  protected LyricBottomSheetBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView lyricTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.lyricTextView = lyricTextView;
  }

  @NonNull
  public static LyricBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.lyric_bottom_sheet, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LyricBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LyricBottomSheetBinding>inflateInternal(inflater, R.layout.lyric_bottom_sheet, root, attachToRoot, component);
  }

  @NonNull
  public static LyricBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.lyric_bottom_sheet, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LyricBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LyricBottomSheetBinding>inflateInternal(inflater, R.layout.lyric_bottom_sheet, null, false, component);
  }

  public static LyricBottomSheetBinding bind(@NonNull View view) {
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
  public static LyricBottomSheetBinding bind(@NonNull View view, @Nullable Object component) {
    return (LyricBottomSheetBinding)bind(component, view, R.layout.lyric_bottom_sheet);
  }
}