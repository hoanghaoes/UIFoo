// Generated by data binding compiler. Do not edit!
package com.foo.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
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
import com.foo.app.modules.listartifactstart.data.viewmodel.ListArtifactStartVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityListArtifactStartBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnBtu;

  @NonNull
  public final ImageButton btnVector;

  @NonNull
  public final FrameLayout frameStackdescription;

  @NonNull
  public final FrameLayout frameStackrectangle243;

  @NonNull
  public final FrameLayout frameUp;

  @NonNull
  public final ImageView imageHome;

  @NonNull
  public final ImageView imageImageFour;

  @NonNull
  public final ImageView imageMusic;

  @NonNull
  public final ImageView imageRectangle243;

  @NonNull
  public final ImageView imageRectangle246;

  @NonNull
  public final ImageView imageRectangle246One;

  @NonNull
  public final ImageView imageRectangle246Two;

  @NonNull
  public final ImageView imageRightSide;

  @NonNull
  public final ImageView imageRunOne;

  @NonNull
  public final LinearLayout linearBlack;

  @NonNull
  public final LinearLayout linearColumnhhhbnn;

  @NonNull
  public final LinearLayout linearColumnmusic;

  @NonNull
  public final LinearLayout linearColumnrectangle243;

  @NonNull
  public final LinearLayout linearHeader;

  @NonNull
  public final LinearLayout linearIOSStatusBar;

  @NonNull
  public final LinearLayout linearPopup;

  @NonNull
  public final LinearLayout linearRowrectangle246;

  @NonNull
  public final LinearLayout linearRowrectangle246One;

  @NonNull
  public final LinearLayout linearRowrectangle246Two;

  @NonNull
  public final TextView txtBiatinsVn;

  @NonNull
  public final TextView txtDescription;

  @NonNull
  public final TextView txtHhhbnn;

  @NonNull
  public final TextView txtKhuVnCc;

  @NonNull
  public final TextView txtThngtin;

  @NonNull
  public final TextView txtVnMiuMn;

  @NonNull
  public final TextView txtVnmiuQucT;

  @Bindable
  protected ListArtifactStartVM mListArtifactStartVM;

  protected ActivityListArtifactStartBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton btnBtu, ImageButton btnVector,
      FrameLayout frameStackdescription, FrameLayout frameStackrectangle243, FrameLayout frameUp,
      ImageView imageHome, ImageView imageImageFour, ImageView imageMusic,
      ImageView imageRectangle243, ImageView imageRectangle246, ImageView imageRectangle246One,
      ImageView imageRectangle246Two, ImageView imageRightSide, ImageView imageRunOne,
      LinearLayout linearBlack, LinearLayout linearColumnhhhbnn, LinearLayout linearColumnmusic,
      LinearLayout linearColumnrectangle243, LinearLayout linearHeader,
      LinearLayout linearIOSStatusBar, LinearLayout linearPopup, LinearLayout linearRowrectangle246,
      LinearLayout linearRowrectangle246One, LinearLayout linearRowrectangle246Two,
      TextView txtBiatinsVn, TextView txtDescription, TextView txtHhhbnn, TextView txtKhuVnCc,
      TextView txtThngtin, TextView txtVnMiuMn, TextView txtVnmiuQucT) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnBtu = btnBtu;
    this.btnVector = btnVector;
    this.frameStackdescription = frameStackdescription;
    this.frameStackrectangle243 = frameStackrectangle243;
    this.frameUp = frameUp;
    this.imageHome = imageHome;
    this.imageImageFour = imageImageFour;
    this.imageMusic = imageMusic;
    this.imageRectangle243 = imageRectangle243;
    this.imageRectangle246 = imageRectangle246;
    this.imageRectangle246One = imageRectangle246One;
    this.imageRectangle246Two = imageRectangle246Two;
    this.imageRightSide = imageRightSide;
    this.imageRunOne = imageRunOne;
    this.linearBlack = linearBlack;
    this.linearColumnhhhbnn = linearColumnhhhbnn;
    this.linearColumnmusic = linearColumnmusic;
    this.linearColumnrectangle243 = linearColumnrectangle243;
    this.linearHeader = linearHeader;
    this.linearIOSStatusBar = linearIOSStatusBar;
    this.linearPopup = linearPopup;
    this.linearRowrectangle246 = linearRowrectangle246;
    this.linearRowrectangle246One = linearRowrectangle246One;
    this.linearRowrectangle246Two = linearRowrectangle246Two;
    this.txtBiatinsVn = txtBiatinsVn;
    this.txtDescription = txtDescription;
    this.txtHhhbnn = txtHhhbnn;
    this.txtKhuVnCc = txtKhuVnCc;
    this.txtThngtin = txtThngtin;
    this.txtVnMiuMn = txtVnMiuMn;
    this.txtVnmiuQucT = txtVnmiuQucT;
  }

  public abstract void setListArtifactStartVM(@Nullable ListArtifactStartVM listArtifactStartVM);

  @Nullable
  public ListArtifactStartVM getListArtifactStartVM() {
    return mListArtifactStartVM;
  }

  @NonNull
  public static ActivityListArtifactStartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_list_artifact_start, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityListArtifactStartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityListArtifactStartBinding>inflateInternal(inflater, R.layout.activity_list_artifact_start, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityListArtifactStartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_list_artifact_start, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityListArtifactStartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityListArtifactStartBinding>inflateInternal(inflater, R.layout.activity_list_artifact_start, null, false, component);
  }

  public static ActivityListArtifactStartBinding bind(@NonNull View view) {
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
  public static ActivityListArtifactStartBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityListArtifactStartBinding)bind(component, view, R.layout.activity_list_artifact_start);
  }
}