// Generated by data binding compiler. Do not edit!
package com.foo.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.foo.app.R;
import com.foo.app.modules.profile.data.viewmodel.ProfileVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityProfileBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton btnVector;

  @NonNull
  public final EditText etControlsText;

  @NonNull
  public final EditText etControlsTextOne;

  @NonNull
  public final EditText etControlsTextTwo;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final EditText etZipcode;

  @NonNull
  public final FrameLayout frameStackmusic;

  @NonNull
  public final ImageView imageEllipseSeven;

  @NonNull
  public final ImageView imageImageThree;

  @NonNull
  public final ImageView imageMusic;

  @NonNull
  public final ImageView imageRightSide;

  @NonNull
  public final LinearLayout linearColumnmusic;

  @NonNull
  public final LinearLayout linearHeader;

  @NonNull
  public final LinearLayout linearIOSStatusBar;

  @NonNull
  public final LinearLayout linearProfile;

  @NonNull
  public final LinearLayout linearRowemail;

  @NonNull
  public final LinearLayout linearRowhng;

  @NonNull
  public final LinearLayout linearRowimthng;

  @NonNull
  public final LinearLayout linearRowmtkhu;

  @NonNull
  public final LinearLayout linearRowtext;

  @NonNull
  public final LinearLayout linearRowtn;

  @NonNull
  public final LinearLayout linearRowtnngnhp;

  @NonNull
  public final TextView txtCnhn;

  @NonNull
  public final TextView txtEmail;

  @NonNull
  public final TextView txtHng;

  @NonNull
  public final TextView txtImthng;

  @NonNull
  public final TextView txtMtkhu;

  @NonNull
  public final TextView txtText;

  @NonNull
  public final TextView txtTn;

  @NonNull
  public final TextView txtTnngnhp;

  @NonNull
  public final TextView txtVKhnhHuyn;

  @Bindable
  protected ProfileVM mProfileVM;

  protected ActivityProfileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton btnVector, EditText etControlsText, EditText etControlsTextOne,
      EditText etControlsTextTwo, EditText etPassword, EditText etZipcode,
      FrameLayout frameStackmusic, ImageView imageEllipseSeven, ImageView imageImageThree,
      ImageView imageMusic, ImageView imageRightSide, LinearLayout linearColumnmusic,
      LinearLayout linearHeader, LinearLayout linearIOSStatusBar, LinearLayout linearProfile,
      LinearLayout linearRowemail, LinearLayout linearRowhng, LinearLayout linearRowimthng,
      LinearLayout linearRowmtkhu, LinearLayout linearRowtext, LinearLayout linearRowtn,
      LinearLayout linearRowtnngnhp, TextView txtCnhn, TextView txtEmail, TextView txtHng,
      TextView txtImthng, TextView txtMtkhu, TextView txtText, TextView txtTn, TextView txtTnngnhp,
      TextView txtVKhnhHuyn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnVector = btnVector;
    this.etControlsText = etControlsText;
    this.etControlsTextOne = etControlsTextOne;
    this.etControlsTextTwo = etControlsTextTwo;
    this.etPassword = etPassword;
    this.etZipcode = etZipcode;
    this.frameStackmusic = frameStackmusic;
    this.imageEllipseSeven = imageEllipseSeven;
    this.imageImageThree = imageImageThree;
    this.imageMusic = imageMusic;
    this.imageRightSide = imageRightSide;
    this.linearColumnmusic = linearColumnmusic;
    this.linearHeader = linearHeader;
    this.linearIOSStatusBar = linearIOSStatusBar;
    this.linearProfile = linearProfile;
    this.linearRowemail = linearRowemail;
    this.linearRowhng = linearRowhng;
    this.linearRowimthng = linearRowimthng;
    this.linearRowmtkhu = linearRowmtkhu;
    this.linearRowtext = linearRowtext;
    this.linearRowtn = linearRowtn;
    this.linearRowtnngnhp = linearRowtnngnhp;
    this.txtCnhn = txtCnhn;
    this.txtEmail = txtEmail;
    this.txtHng = txtHng;
    this.txtImthng = txtImthng;
    this.txtMtkhu = txtMtkhu;
    this.txtText = txtText;
    this.txtTn = txtTn;
    this.txtTnngnhp = txtTnngnhp;
    this.txtVKhnhHuyn = txtVKhnhHuyn;
  }

  public abstract void setProfileVM(@Nullable ProfileVM profileVM);

  @Nullable
  public ProfileVM getProfileVM() {
    return mProfileVM;
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityProfileBinding>inflateInternal(inflater, R.layout.activity_profile, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityProfileBinding>inflateInternal(inflater, R.layout.activity_profile, null, false, component);
  }

  public static ActivityProfileBinding bind(@NonNull View view) {
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
  public static ActivityProfileBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityProfileBinding)bind(component, view, R.layout.activity_profile);
  }
}
