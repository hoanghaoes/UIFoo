// Generated by data binding compiler. Do not edit!
package com.foo.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.foo.app.R;
import com.foo.app.modules.doithuongone.data.model.GiftsRowModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowGiftsBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageIconOne;

  @NonNull
  public final LinearLayout linearGift;

  @NonNull
  public final LinearLayout linearRowzipcode;

  @NonNull
  public final TextView txtThViettelTwenty;

  @NonNull
  public final TextView txtZipcodeOne;

  @Bindable
  protected GiftsRowModel mGiftsRowModel;

  protected RowGiftsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageIconOne, LinearLayout linearGift, LinearLayout linearRowzipcode,
      TextView txtThViettelTwenty, TextView txtZipcodeOne) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageIconOne = imageIconOne;
    this.linearGift = linearGift;
    this.linearRowzipcode = linearRowzipcode;
    this.txtThViettelTwenty = txtThViettelTwenty;
    this.txtZipcodeOne = txtZipcodeOne;
  }

  public abstract void setGiftsRowModel(@Nullable GiftsRowModel giftsRowModel);

  @Nullable
  public GiftsRowModel getGiftsRowModel() {
    return mGiftsRowModel;
  }

  @NonNull
  public static RowGiftsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_gifts, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowGiftsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowGiftsBinding>inflateInternal(inflater, R.layout.row_gifts, root, attachToRoot, component);
  }

  @NonNull
  public static RowGiftsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_gifts, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowGiftsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowGiftsBinding>inflateInternal(inflater, R.layout.row_gifts, null, false, component);
  }

  public static RowGiftsBinding bind(@NonNull View view) {
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
  public static RowGiftsBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowGiftsBinding)bind(component, view, R.layout.row_gifts);
  }
}
