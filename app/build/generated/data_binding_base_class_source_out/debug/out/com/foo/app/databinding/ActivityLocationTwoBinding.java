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
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.foo.app.R;
import com.foo.app.modules.locationtwo.data.viewmodel.LocationTwoVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLocationTwoBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnKhmPh;

  @NonNull
  public final EditText etTmkim;

  @NonNull
  public final FrameLayout frameBottombar;

  @NonNull
  public final FrameLayout frameLocationTwo;

  @NonNull
  public final FrameLayout frameStackicon;

  @NonNull
  public final FrameLayout frameStacklocation;

  @NonNull
  public final FrameLayout frameStackmusic;

  @NonNull
  public final ImageView imageBasemapimage;

  @NonNull
  public final ImageView imageIcon;

  @NonNull
  public final ImageView imageIconOne;

  @NonNull
  public final ImageView imageIconThree;

  @NonNull
  public final ImageView imageIconTwo;

  @NonNull
  public final ImageView imageLocation;

  @NonNull
  public final ImageView imageMail;

  @NonNull
  public final ImageView imageMenu;

  @NonNull
  public final ImageView imageMusic;

  @NonNull
  public final ImageView imageRightSide;

  @NonNull
  public final ImageView imageSearch;

  @NonNull
  public final ImageView imageStar;

  @NonNull
  public final ImageView imageUpload;

  @NonNull
  public final LinearLayout linearColumniconTwo;

  @NonNull
  public final LinearLayout linearColumnkhmPh;

  @NonNull
  public final LinearLayout linearColumnmusic;

  @NonNull
  public final LinearLayout linearColumnrectanglethree;

  @NonNull
  public final LinearLayout linearColumnupload;

  @NonNull
  public final LinearLayout linearIOSStatusBar;

  @NonNull
  public final LinearLayout linearN;

  @NonNull
  public final LinearLayout linearNhv;

  @NonNull
  public final LinearLayout linearRowbotnghni;

  @NonNull
  public final LinearLayout linearRowupload;

  @NonNull
  public final LinearLayout linearThm;

  @NonNull
  public final LinearLayout linearTmkim;

  @NonNull
  public final LinearLayout linearTrangch;

  @NonNull
  public final TextView txt0800113013;

  @NonNull
  public final TextView txtBotngHNi;

  @NonNull
  public final TextView txtDescription;

  @NonNull
  public final TextView txtFiveHundred;

  @NonNull
  public final TextView txtMrng;

  @NonNull
  public final TextView txtN;

  @NonNull
  public final TextView txtNhv;

  @NonNull
  public final TextView txtPhmHngMT;

  @NonNull
  public final TextView txtTmkimOne;

  @NonNull
  public final TextView txtTrangch;

  @NonNull
  public final View viewRectangle241;

  @NonNull
  public final View viewRectangleThree;

  @Bindable
  protected LocationTwoVM mLocationTwoVM;

  protected ActivityLocationTwoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnKhmPh, EditText etTmkim, FrameLayout frameBottombar,
      FrameLayout frameLocationTwo, FrameLayout frameStackicon, FrameLayout frameStacklocation,
      FrameLayout frameStackmusic, ImageView imageBasemapimage, ImageView imageIcon,
      ImageView imageIconOne, ImageView imageIconThree, ImageView imageIconTwo,
      ImageView imageLocation, ImageView imageMail, ImageView imageMenu, ImageView imageMusic,
      ImageView imageRightSide, ImageView imageSearch, ImageView imageStar, ImageView imageUpload,
      LinearLayout linearColumniconTwo, LinearLayout linearColumnkhmPh,
      LinearLayout linearColumnmusic, LinearLayout linearColumnrectanglethree,
      LinearLayout linearColumnupload, LinearLayout linearIOSStatusBar, LinearLayout linearN,
      LinearLayout linearNhv, LinearLayout linearRowbotnghni, LinearLayout linearRowupload,
      LinearLayout linearThm, LinearLayout linearTmkim, LinearLayout linearTrangch,
      TextView txt0800113013, TextView txtBotngHNi, TextView txtDescription,
      TextView txtFiveHundred, TextView txtMrng, TextView txtN, TextView txtNhv,
      TextView txtPhmHngMT, TextView txtTmkimOne, TextView txtTrangch, View viewRectangle241,
      View viewRectangleThree) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnKhmPh = btnKhmPh;
    this.etTmkim = etTmkim;
    this.frameBottombar = frameBottombar;
    this.frameLocationTwo = frameLocationTwo;
    this.frameStackicon = frameStackicon;
    this.frameStacklocation = frameStacklocation;
    this.frameStackmusic = frameStackmusic;
    this.imageBasemapimage = imageBasemapimage;
    this.imageIcon = imageIcon;
    this.imageIconOne = imageIconOne;
    this.imageIconThree = imageIconThree;
    this.imageIconTwo = imageIconTwo;
    this.imageLocation = imageLocation;
    this.imageMail = imageMail;
    this.imageMenu = imageMenu;
    this.imageMusic = imageMusic;
    this.imageRightSide = imageRightSide;
    this.imageSearch = imageSearch;
    this.imageStar = imageStar;
    this.imageUpload = imageUpload;
    this.linearColumniconTwo = linearColumniconTwo;
    this.linearColumnkhmPh = linearColumnkhmPh;
    this.linearColumnmusic = linearColumnmusic;
    this.linearColumnrectanglethree = linearColumnrectanglethree;
    this.linearColumnupload = linearColumnupload;
    this.linearIOSStatusBar = linearIOSStatusBar;
    this.linearN = linearN;
    this.linearNhv = linearNhv;
    this.linearRowbotnghni = linearRowbotnghni;
    this.linearRowupload = linearRowupload;
    this.linearThm = linearThm;
    this.linearTmkim = linearTmkim;
    this.linearTrangch = linearTrangch;
    this.txt0800113013 = txt0800113013;
    this.txtBotngHNi = txtBotngHNi;
    this.txtDescription = txtDescription;
    this.txtFiveHundred = txtFiveHundred;
    this.txtMrng = txtMrng;
    this.txtN = txtN;
    this.txtNhv = txtNhv;
    this.txtPhmHngMT = txtPhmHngMT;
    this.txtTmkimOne = txtTmkimOne;
    this.txtTrangch = txtTrangch;
    this.viewRectangle241 = viewRectangle241;
    this.viewRectangleThree = viewRectangleThree;
  }

  public abstract void setLocationTwoVM(@Nullable LocationTwoVM locationTwoVM);

  @Nullable
  public LocationTwoVM getLocationTwoVM() {
    return mLocationTwoVM;
  }

  @NonNull
  public static ActivityLocationTwoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_location_two, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLocationTwoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLocationTwoBinding>inflateInternal(inflater, R.layout.activity_location_two, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLocationTwoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_location_two, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLocationTwoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLocationTwoBinding>inflateInternal(inflater, R.layout.activity_location_two, null, false, component);
  }

  public static ActivityLocationTwoBinding bind(@NonNull View view) {
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
  public static ActivityLocationTwoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLocationTwoBinding)bind(component, view, R.layout.activity_location_two);
  }
}
