// Generated by data binding compiler. Do not edit!
package com.foo.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.foo.app.R;
import com.foo.app.modules.trangchone.data.model.ImageSliderSlidercthbnstModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SlideritemTrangChOne1Binding extends ViewDataBinding {
  @NonNull
  public final FrameLayout frameContent;

  @NonNull
  public final ImageView imageImageOne;

  @NonNull
  public final LinearLayout linearColumndescription;

  @NonNull
  public final LinearLayout linearGi;

  @NonNull
  public final TextView txtCthbnst;

  @NonNull
  public final TextView txtDescription;

  @Bindable
  protected ImageSliderSlidercthbnstModel mImageSliderSlidercthbnstModel;

  protected SlideritemTrangChOne1Binding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout frameContent, ImageView imageImageOne, LinearLayout linearColumndescription,
      LinearLayout linearGi, TextView txtCthbnst, TextView txtDescription) {
    super(_bindingComponent, _root, _localFieldCount);
    this.frameContent = frameContent;
    this.imageImageOne = imageImageOne;
    this.linearColumndescription = linearColumndescription;
    this.linearGi = linearGi;
    this.txtCthbnst = txtCthbnst;
    this.txtDescription = txtDescription;
  }

  public abstract void setImageSliderSlidercthbnstModel(
      @Nullable ImageSliderSlidercthbnstModel imageSliderSlidercthbnstModel);

  @Nullable
  public ImageSliderSlidercthbnstModel getImageSliderSlidercthbnstModel() {
    return mImageSliderSlidercthbnstModel;
  }

  @NonNull
  public static SlideritemTrangChOne1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.slideritem_trang_ch_one1, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SlideritemTrangChOne1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SlideritemTrangChOne1Binding>inflateInternal(inflater, R.layout.slideritem_trang_ch_one1, root, attachToRoot, component);
  }

  @NonNull
  public static SlideritemTrangChOne1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.slideritem_trang_ch_one1, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SlideritemTrangChOne1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SlideritemTrangChOne1Binding>inflateInternal(inflater, R.layout.slideritem_trang_ch_one1, null, false, component);
  }

  public static SlideritemTrangChOne1Binding bind(@NonNull View view) {
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
  public static SlideritemTrangChOne1Binding bind(@NonNull View view, @Nullable Object component) {
    return (SlideritemTrangChOne1Binding)bind(component, view, R.layout.slideritem_trang_ch_one1);
  }
}
