// Generated by data binding compiler. Do not edit!
package com.foo.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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
import com.foo.app.modules.doithuong.data.viewmodel.DoiThuongVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDoiThuongBinding extends ViewDataBinding {
  @NonNull
  public final EditText etFrameSeven;

  @NonNull
  public final FrameLayout frameStackarrowup;

  @NonNull
  public final FrameLayout frameStackarrowupOne;

  @NonNull
  public final ImageView imageArrowleft;

  @NonNull
  public final ImageView imageArrowright;

  @NonNull
  public final ImageView imageArrowup;

  @NonNull
  public final ImageView imageArrowupOne;

  @NonNull
  public final ImageView imageCalendar;

  @NonNull
  public final ImageView imageIcon;

  @NonNull
  public final ImageView imageIconOne;

  @NonNull
  public final ImageView imageMusic;

  @NonNull
  public final ImageView imageRightSide;

  @NonNull
  public final LinearLayout linearColumnlanguage;

  @NonNull
  public final LinearLayout linearDoithuong;

  @NonNull
  public final LinearLayout linearHead;

  @NonNull
  public final LinearLayout linearHeader;

  @NonNull
  public final LinearLayout linearIOSStatusBar;

  @NonNull
  public final LinearLayout linearRowframeseven;

  @NonNull
  public final LinearLayout linearRowiconOne;

  @NonNull
  public final LinearLayout linearRowlanguage;

  @NonNull
  public final LinearLayout linearRowmomo20000;

  @NonNull
  public final LinearLayout linearRowmth;

  @NonNull
  public final LinearLayout linearRowqui;

  @NonNull
  public final LinearLayout linearRowthvietteltwenty;

  @NonNull
  public final LinearLayout linearRowzipcode;

  @NonNull
  public final TextView txt4522330866328;

  @NonNull
  public final TextView txt53835832354;

  @NonNull
  public final TextView txtIthng;

  @NonNull
  public final TextView txtLanguage;

  @NonNull
  public final TextView txtMomo20000;

  @NonNull
  public final TextView txtMth;

  @NonNull
  public final TextView txtQui;

  @NonNull
  public final TextView txtThViettelTwenty;

  @NonNull
  public final TextView txtZipcode;

  @Bindable
  protected DoiThuongVM mDoiThuongVM;

  protected ActivityDoiThuongBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText etFrameSeven, FrameLayout frameStackarrowup, FrameLayout frameStackarrowupOne,
      ImageView imageArrowleft, ImageView imageArrowright, ImageView imageArrowup,
      ImageView imageArrowupOne, ImageView imageCalendar, ImageView imageIcon,
      ImageView imageIconOne, ImageView imageMusic, ImageView imageRightSide,
      LinearLayout linearColumnlanguage, LinearLayout linearDoithuong, LinearLayout linearHead,
      LinearLayout linearHeader, LinearLayout linearIOSStatusBar, LinearLayout linearRowframeseven,
      LinearLayout linearRowiconOne, LinearLayout linearRowlanguage,
      LinearLayout linearRowmomo20000, LinearLayout linearRowmth, LinearLayout linearRowqui,
      LinearLayout linearRowthvietteltwenty, LinearLayout linearRowzipcode,
      TextView txt4522330866328, TextView txt53835832354, TextView txtIthng, TextView txtLanguage,
      TextView txtMomo20000, TextView txtMth, TextView txtQui, TextView txtThViettelTwenty,
      TextView txtZipcode) {
    super(_bindingComponent, _root, _localFieldCount);
    this.etFrameSeven = etFrameSeven;
    this.frameStackarrowup = frameStackarrowup;
    this.frameStackarrowupOne = frameStackarrowupOne;
    this.imageArrowleft = imageArrowleft;
    this.imageArrowright = imageArrowright;
    this.imageArrowup = imageArrowup;
    this.imageArrowupOne = imageArrowupOne;
    this.imageCalendar = imageCalendar;
    this.imageIcon = imageIcon;
    this.imageIconOne = imageIconOne;
    this.imageMusic = imageMusic;
    this.imageRightSide = imageRightSide;
    this.linearColumnlanguage = linearColumnlanguage;
    this.linearDoithuong = linearDoithuong;
    this.linearHead = linearHead;
    this.linearHeader = linearHeader;
    this.linearIOSStatusBar = linearIOSStatusBar;
    this.linearRowframeseven = linearRowframeseven;
    this.linearRowiconOne = linearRowiconOne;
    this.linearRowlanguage = linearRowlanguage;
    this.linearRowmomo20000 = linearRowmomo20000;
    this.linearRowmth = linearRowmth;
    this.linearRowqui = linearRowqui;
    this.linearRowthvietteltwenty = linearRowthvietteltwenty;
    this.linearRowzipcode = linearRowzipcode;
    this.txt4522330866328 = txt4522330866328;
    this.txt53835832354 = txt53835832354;
    this.txtIthng = txtIthng;
    this.txtLanguage = txtLanguage;
    this.txtMomo20000 = txtMomo20000;
    this.txtMth = txtMth;
    this.txtQui = txtQui;
    this.txtThViettelTwenty = txtThViettelTwenty;
    this.txtZipcode = txtZipcode;
  }

  public abstract void setDoiThuongVM(@Nullable DoiThuongVM doiThuongVM);

  @Nullable
  public DoiThuongVM getDoiThuongVM() {
    return mDoiThuongVM;
  }

  @NonNull
  public static ActivityDoiThuongBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_doi_thuong, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDoiThuongBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDoiThuongBinding>inflateInternal(inflater, R.layout.activity_doi_thuong, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDoiThuongBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_doi_thuong, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDoiThuongBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDoiThuongBinding>inflateInternal(inflater, R.layout.activity_doi_thuong, null, false, component);
  }

  public static ActivityDoiThuongBinding bind(@NonNull View view) {
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
  public static ActivityDoiThuongBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDoiThuongBinding)bind(component, view, R.layout.activity_doi_thuong);
  }
}