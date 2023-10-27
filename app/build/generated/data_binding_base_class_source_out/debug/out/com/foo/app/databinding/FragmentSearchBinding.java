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
import androidx.recyclerview.widget.RecyclerView;
import com.foo.app.R;
import com.foo.app.modules.search.data.viewmodel.SearchVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSearchBinding extends ViewDataBinding {
  @NonNull
  public final EditText etFrameSeven;

  @NonNull
  public final FrameLayout frameStackiconOne;

  @NonNull
  public final ImageView imageIconEight;

  @NonNull
  public final ImageView imageIconFour;

  @NonNull
  public final ImageView imageIconOne;

  @NonNull
  public final ImageView imageIconThree;

  @NonNull
  public final ImageView imageIconTwo;

  @NonNull
  public final ImageView imageMusic;

  @NonNull
  public final ImageView imageRightSide;

  @NonNull
  public final LinearLayout linearColumngiOne;

  @NonNull
  public final LinearLayout linearColumniconFive;

  @NonNull
  public final LinearLayout linearColumnmusic;

  @NonNull
  public final LinearLayout linearIOSStatusBar;

  @NonNull
  public final LinearLayout linearRowiconEight;

  @NonNull
  public final LinearLayout linearRowiconFour;

  @NonNull
  public final LinearLayout linearRowiconOne;

  @NonNull
  public final LinearLayout linearRowiconThree;

  @NonNull
  public final LinearLayout linearRowiconTwo;

  @NonNull
  public final LinearLayout linearSearch;

  @NonNull
  public final RecyclerView recyclerSearch;

  @NonNull
  public final TextView txtBotngHNi;

  @NonNull
  public final TextView txtBotngHNiOne;

  @NonNull
  public final TextView txtGi;

  @NonNull
  public final TextView txtGiOne;

  @NonNull
  public final TextView txtLchs;

  @NonNull
  public final TextView txtVnmiu;

  @NonNull
  public final TextView txtVnmiuOne;

  @Bindable
  protected SearchVM mSearchVM;

  protected FragmentSearchBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText etFrameSeven, FrameLayout frameStackiconOne, ImageView imageIconEight,
      ImageView imageIconFour, ImageView imageIconOne, ImageView imageIconThree,
      ImageView imageIconTwo, ImageView imageMusic, ImageView imageRightSide,
      LinearLayout linearColumngiOne, LinearLayout linearColumniconFive,
      LinearLayout linearColumnmusic, LinearLayout linearIOSStatusBar,
      LinearLayout linearRowiconEight, LinearLayout linearRowiconFour,
      LinearLayout linearRowiconOne, LinearLayout linearRowiconThree, LinearLayout linearRowiconTwo,
      LinearLayout linearSearch, RecyclerView recyclerSearch, TextView txtBotngHNi,
      TextView txtBotngHNiOne, TextView txtGi, TextView txtGiOne, TextView txtLchs,
      TextView txtVnmiu, TextView txtVnmiuOne) {
    super(_bindingComponent, _root, _localFieldCount);
    this.etFrameSeven = etFrameSeven;
    this.frameStackiconOne = frameStackiconOne;
    this.imageIconEight = imageIconEight;
    this.imageIconFour = imageIconFour;
    this.imageIconOne = imageIconOne;
    this.imageIconThree = imageIconThree;
    this.imageIconTwo = imageIconTwo;
    this.imageMusic = imageMusic;
    this.imageRightSide = imageRightSide;
    this.linearColumngiOne = linearColumngiOne;
    this.linearColumniconFive = linearColumniconFive;
    this.linearColumnmusic = linearColumnmusic;
    this.linearIOSStatusBar = linearIOSStatusBar;
    this.linearRowiconEight = linearRowiconEight;
    this.linearRowiconFour = linearRowiconFour;
    this.linearRowiconOne = linearRowiconOne;
    this.linearRowiconThree = linearRowiconThree;
    this.linearRowiconTwo = linearRowiconTwo;
    this.linearSearch = linearSearch;
    this.recyclerSearch = recyclerSearch;
    this.txtBotngHNi = txtBotngHNi;
    this.txtBotngHNiOne = txtBotngHNiOne;
    this.txtGi = txtGi;
    this.txtGiOne = txtGiOne;
    this.txtLchs = txtLchs;
    this.txtVnmiu = txtVnmiu;
    this.txtVnmiuOne = txtVnmiuOne;
  }

  public abstract void setSearchVM(@Nullable SearchVM searchVM);

  @Nullable
  public SearchVM getSearchVM() {
    return mSearchVM;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_search, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSearchBinding>inflateInternal(inflater, R.layout.fragment_search, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_search, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSearchBinding>inflateInternal(inflater, R.layout.fragment_search, null, false, component);
  }

  public static FragmentSearchBinding bind(@NonNull View view) {
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
  public static FragmentSearchBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSearchBinding)bind(component, view, R.layout.fragment_search);
  }
}