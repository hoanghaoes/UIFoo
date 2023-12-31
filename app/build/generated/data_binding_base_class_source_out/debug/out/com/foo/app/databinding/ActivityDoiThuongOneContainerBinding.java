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
import com.foo.app.modules.doithuongonecontainer.data.viewmodel.DoiThuongOneContainerVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDoiThuongOneContainerBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final FrameLayout frameBottombar;

  @NonNull
  public final ImageView imageLocation;

  @NonNull
  public final ImageView imageMail;

  @NonNull
  public final ImageView imageMenu;

  @NonNull
  public final ImageView imageSearchOne;

  @NonNull
  public final ImageView imageUpload;

  @NonNull
  public final LinearLayout linearColumnmusic;

  @NonNull
  public final LinearLayout linearN;

  @NonNull
  public final LinearLayout linearNhv;

  @NonNull
  public final LinearLayout linearRowupload;

  @NonNull
  public final LinearLayout linearThm;

  @NonNull
  public final LinearLayout linearTmkim;

  @NonNull
  public final LinearLayout linearTrangch;

  @NonNull
  public final TextView txtMrng;

  @NonNull
  public final TextView txtN;

  @NonNull
  public final TextView txtNhv;

  @NonNull
  public final TextView txtTmkim;

  @NonNull
  public final TextView txtTrangch;

  @Bindable
  protected DoiThuongOneContainerVM mDoiThuongOneContainerVM;

  protected ActivityDoiThuongOneContainerBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FrameLayout fragmentContainer, FrameLayout frameBottombar,
      ImageView imageLocation, ImageView imageMail, ImageView imageMenu, ImageView imageSearchOne,
      ImageView imageUpload, LinearLayout linearColumnmusic, LinearLayout linearN,
      LinearLayout linearNhv, LinearLayout linearRowupload, LinearLayout linearThm,
      LinearLayout linearTmkim, LinearLayout linearTrangch, TextView txtMrng, TextView txtN,
      TextView txtNhv, TextView txtTmkim, TextView txtTrangch) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fragmentContainer = fragmentContainer;
    this.frameBottombar = frameBottombar;
    this.imageLocation = imageLocation;
    this.imageMail = imageMail;
    this.imageMenu = imageMenu;
    this.imageSearchOne = imageSearchOne;
    this.imageUpload = imageUpload;
    this.linearColumnmusic = linearColumnmusic;
    this.linearN = linearN;
    this.linearNhv = linearNhv;
    this.linearRowupload = linearRowupload;
    this.linearThm = linearThm;
    this.linearTmkim = linearTmkim;
    this.linearTrangch = linearTrangch;
    this.txtMrng = txtMrng;
    this.txtN = txtN;
    this.txtNhv = txtNhv;
    this.txtTmkim = txtTmkim;
    this.txtTrangch = txtTrangch;
  }

  public abstract void setDoiThuongOneContainerVM(
      @Nullable DoiThuongOneContainerVM doiThuongOneContainerVM);

  @Nullable
  public DoiThuongOneContainerVM getDoiThuongOneContainerVM() {
    return mDoiThuongOneContainerVM;
  }

  @NonNull
  public static ActivityDoiThuongOneContainerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_doi_thuong_one_container, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDoiThuongOneContainerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDoiThuongOneContainerBinding>inflateInternal(inflater, R.layout.activity_doi_thuong_one_container, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDoiThuongOneContainerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_doi_thuong_one_container, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDoiThuongOneContainerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDoiThuongOneContainerBinding>inflateInternal(inflater, R.layout.activity_doi_thuong_one_container, null, false, component);
  }

  public static ActivityDoiThuongOneContainerBinding bind(@NonNull View view) {
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
  public static ActivityDoiThuongOneContainerBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityDoiThuongOneContainerBinding)bind(component, view, R.layout.activity_doi_thuong_one_container);
  }
}
