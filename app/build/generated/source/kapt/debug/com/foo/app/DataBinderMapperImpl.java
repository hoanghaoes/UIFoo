package com.foo.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.foo.app.databinding.ActivityArtifactInformationBindingImpl;
import com.foo.app.databinding.ActivityDoiThuongBindingImpl;
import com.foo.app.databinding.ActivityDoiThuongOneContainerBindingImpl;
import com.foo.app.databinding.ActivityHistoryOneBindingImpl;
import com.foo.app.databinding.ActivityKhMPhBindingImpl;
import com.foo.app.databinding.ActivityListArtifactStartBindingImpl;
import com.foo.app.databinding.ActivityLocation2StartBindingImpl;
import com.foo.app.databinding.ActivityLocationThreeBindingImpl;
import com.foo.app.databinding.ActivityLocationTwoBindingImpl;
import com.foo.app.databinding.ActivityNgKOneBindingImpl;
import com.foo.app.databinding.ActivityNgNhPOneBindingImpl;
import com.foo.app.databinding.ActivityProfileBindingImpl;
import com.foo.app.databinding.ActivityQuizzOneBindingImpl;
import com.foo.app.databinding.ActivityTrangChOneBindingImpl;
import com.foo.app.databinding.DialogQuizzFalseBindingImpl;
import com.foo.app.databinding.DialogQuizzTrueBindingImpl;
import com.foo.app.databinding.FragmentDoiThuongOneBindingImpl;
import com.foo.app.databinding.FragmentHistoryBindingImpl;
import com.foo.app.databinding.FragmentLocationOneBindingImpl;
import com.foo.app.databinding.FragmentSearchBindingImpl;
import com.foo.app.databinding.LayoutProgressDialogBindingImpl;
import com.foo.app.databinding.RowGiftsBindingImpl;
import com.foo.app.databinding.RowHistoryBindingImpl;
import com.foo.app.databinding.RowHistoryOneBindingImpl;
import com.foo.app.databinding.RowSearchBindingImpl;
import com.foo.app.databinding.SlideritemTrangChOne1BindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYARTIFACTINFORMATION = 1;

  private static final int LAYOUT_ACTIVITYDOITHUONG = 2;

  private static final int LAYOUT_ACTIVITYDOITHUONGONECONTAINER = 3;

  private static final int LAYOUT_ACTIVITYHISTORYONE = 4;

  private static final int LAYOUT_ACTIVITYKHMPH = 5;

  private static final int LAYOUT_ACTIVITYLISTARTIFACTSTART = 6;

  private static final int LAYOUT_ACTIVITYLOCATION2START = 7;

  private static final int LAYOUT_ACTIVITYLOCATIONTHREE = 8;

  private static final int LAYOUT_ACTIVITYLOCATIONTWO = 9;

  private static final int LAYOUT_ACTIVITYNGKONE = 10;

  private static final int LAYOUT_ACTIVITYNGNHPONE = 11;

  private static final int LAYOUT_ACTIVITYPROFILE = 12;

  private static final int LAYOUT_ACTIVITYQUIZZONE = 13;

  private static final int LAYOUT_ACTIVITYTRANGCHONE = 14;

  private static final int LAYOUT_DIALOGQUIZZFALSE = 15;

  private static final int LAYOUT_DIALOGQUIZZTRUE = 16;

  private static final int LAYOUT_FRAGMENTDOITHUONGONE = 17;

  private static final int LAYOUT_FRAGMENTHISTORY = 18;

  private static final int LAYOUT_FRAGMENTLOCATIONONE = 19;

  private static final int LAYOUT_FRAGMENTSEARCH = 20;

  private static final int LAYOUT_LAYOUTPROGRESSDIALOG = 21;

  private static final int LAYOUT_ROWGIFTS = 22;

  private static final int LAYOUT_ROWHISTORY = 23;

  private static final int LAYOUT_ROWHISTORYONE = 24;

  private static final int LAYOUT_ROWSEARCH = 25;

  private static final int LAYOUT_SLIDERITEMTRANGCHONE1 = 26;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(26);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.activity_artifact_information, LAYOUT_ACTIVITYARTIFACTINFORMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.activity_doi_thuong, LAYOUT_ACTIVITYDOITHUONG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.activity_doi_thuong_one_container, LAYOUT_ACTIVITYDOITHUONGONECONTAINER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.activity_history_one, LAYOUT_ACTIVITYHISTORYONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.activity_kh_m_ph, LAYOUT_ACTIVITYKHMPH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.activity_list_artifact_start, LAYOUT_ACTIVITYLISTARTIFACTSTART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.activity_location_2_start, LAYOUT_ACTIVITYLOCATION2START);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.activity_location_three, LAYOUT_ACTIVITYLOCATIONTHREE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.activity_location_two, LAYOUT_ACTIVITYLOCATIONTWO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.activity_ng_k_one, LAYOUT_ACTIVITYNGKONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.activity_ng_nh_p_one, LAYOUT_ACTIVITYNGNHPONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.activity_profile, LAYOUT_ACTIVITYPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.activity_quizz_one, LAYOUT_ACTIVITYQUIZZONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.activity_trang_ch_one, LAYOUT_ACTIVITYTRANGCHONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.dialog_quizz_false, LAYOUT_DIALOGQUIZZFALSE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.dialog_quizz_true, LAYOUT_DIALOGQUIZZTRUE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.fragment_doi_thuong_one, LAYOUT_FRAGMENTDOITHUONGONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.fragment_history, LAYOUT_FRAGMENTHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.fragment_location_one, LAYOUT_FRAGMENTLOCATIONONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.layout_progress_dialog, LAYOUT_LAYOUTPROGRESSDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.row_gifts, LAYOUT_ROWGIFTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.row_history, LAYOUT_ROWHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.row_history_one, LAYOUT_ROWHISTORYONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.row_search, LAYOUT_ROWSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.foo.app.R.layout.slideritem_trang_ch_one1, LAYOUT_SLIDERITEMTRANGCHONE1);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYARTIFACTINFORMATION: {
          if ("layout/activity_artifact_information_0".equals(tag)) {
            return new ActivityArtifactInformationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_artifact_information is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDOITHUONG: {
          if ("layout/activity_doi_thuong_0".equals(tag)) {
            return new ActivityDoiThuongBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_doi_thuong is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDOITHUONGONECONTAINER: {
          if ("layout/activity_doi_thuong_one_container_0".equals(tag)) {
            return new ActivityDoiThuongOneContainerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_doi_thuong_one_container is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHISTORYONE: {
          if ("layout/activity_history_one_0".equals(tag)) {
            return new ActivityHistoryOneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_history_one is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYKHMPH: {
          if ("layout/activity_kh_m_ph_0".equals(tag)) {
            return new ActivityKhMPhBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_kh_m_ph is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLISTARTIFACTSTART: {
          if ("layout/activity_list_artifact_start_0".equals(tag)) {
            return new ActivityListArtifactStartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_list_artifact_start is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOCATION2START: {
          if ("layout/activity_location_2_start_0".equals(tag)) {
            return new ActivityLocation2StartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_location_2_start is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOCATIONTHREE: {
          if ("layout/activity_location_three_0".equals(tag)) {
            return new ActivityLocationThreeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_location_three is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOCATIONTWO: {
          if ("layout/activity_location_two_0".equals(tag)) {
            return new ActivityLocationTwoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_location_two is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNGKONE: {
          if ("layout/activity_ng_k_one_0".equals(tag)) {
            return new ActivityNgKOneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_ng_k_one is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNGNHPONE: {
          if ("layout/activity_ng_nh_p_one_0".equals(tag)) {
            return new ActivityNgNhPOneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_ng_nh_p_one is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPROFILE: {
          if ("layout/activity_profile_0".equals(tag)) {
            return new ActivityProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYQUIZZONE: {
          if ("layout/activity_quizz_one_0".equals(tag)) {
            return new ActivityQuizzOneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_quizz_one is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTRANGCHONE: {
          if ("layout/activity_trang_ch_one_0".equals(tag)) {
            return new ActivityTrangChOneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_trang_ch_one is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGQUIZZFALSE: {
          if ("layout/dialog_quizz_false_0".equals(tag)) {
            return new DialogQuizzFalseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_quizz_false is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGQUIZZTRUE: {
          if ("layout/dialog_quizz_true_0".equals(tag)) {
            return new DialogQuizzTrueBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_quizz_true is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDOITHUONGONE: {
          if ("layout/fragment_doi_thuong_one_0".equals(tag)) {
            return new FragmentDoiThuongOneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_doi_thuong_one is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHISTORY: {
          if ("layout/fragment_history_0".equals(tag)) {
            return new FragmentHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_history is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOCATIONONE: {
          if ("layout/fragment_location_one_0".equals(tag)) {
            return new FragmentLocationOneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_location_one is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPROGRESSDIALOG: {
          if ("layout/layout_progress_dialog_0".equals(tag)) {
            return new LayoutProgressDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_progress_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWGIFTS: {
          if ("layout/row_gifts_0".equals(tag)) {
            return new RowGiftsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_gifts is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWHISTORY: {
          if ("layout/row_history_0".equals(tag)) {
            return new RowHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_history is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWHISTORYONE: {
          if ("layout/row_history_one_0".equals(tag)) {
            return new RowHistoryOneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_history_one is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWSEARCH: {
          if ("layout/row_search_0".equals(tag)) {
            return new RowSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_search is invalid. Received: " + tag);
        }
        case  LAYOUT_SLIDERITEMTRANGCHONE1: {
          if ("layout/slideritem_trang_ch_one1_0".equals(tag)) {
            return new SlideritemTrangChOne1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for slideritem_trang_ch_one1 is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.asksira.loopingviewpager.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(27);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "artifactInformationVM");
      sKeys.put(2, "doiThuongOneContainerVM");
      sKeys.put(3, "doiThuongOneVM");
      sKeys.put(4, "doiThuongVM");
      sKeys.put(5, "giftsRowModel");
      sKeys.put(6, "historyOneRowModel");
      sKeys.put(7, "historyOneVM");
      sKeys.put(8, "historyRowModel");
      sKeys.put(9, "historyVM");
      sKeys.put(10, "imageSliderSlidercthbnstModel");
      sKeys.put(11, "khMPhVM");
      sKeys.put(12, "listArtifactStartVM");
      sKeys.put(13, "location2StartVM");
      sKeys.put(14, "locationOneVM");
      sKeys.put(15, "locationThreeVM");
      sKeys.put(16, "locationTwoVM");
      sKeys.put(17, "message");
      sKeys.put(18, "ngKOneVM");
      sKeys.put(19, "ngNhPOneVM");
      sKeys.put(20, "profileVM");
      sKeys.put(21, "quizzFalseVM");
      sKeys.put(22, "quizzOneVM");
      sKeys.put(23, "quizzTrueVM");
      sKeys.put(24, "searchRowModel");
      sKeys.put(25, "searchVM");
      sKeys.put(26, "trangChOneVM");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(26);

    static {
      sKeys.put("layout/activity_artifact_information_0", com.foo.app.R.layout.activity_artifact_information);
      sKeys.put("layout/activity_doi_thuong_0", com.foo.app.R.layout.activity_doi_thuong);
      sKeys.put("layout/activity_doi_thuong_one_container_0", com.foo.app.R.layout.activity_doi_thuong_one_container);
      sKeys.put("layout/activity_history_one_0", com.foo.app.R.layout.activity_history_one);
      sKeys.put("layout/activity_kh_m_ph_0", com.foo.app.R.layout.activity_kh_m_ph);
      sKeys.put("layout/activity_list_artifact_start_0", com.foo.app.R.layout.activity_list_artifact_start);
      sKeys.put("layout/activity_location_2_start_0", com.foo.app.R.layout.activity_location_2_start);
      sKeys.put("layout/activity_location_three_0", com.foo.app.R.layout.activity_location_three);
      sKeys.put("layout/activity_location_two_0", com.foo.app.R.layout.activity_location_two);
      sKeys.put("layout/activity_ng_k_one_0", com.foo.app.R.layout.activity_ng_k_one);
      sKeys.put("layout/activity_ng_nh_p_one_0", com.foo.app.R.layout.activity_ng_nh_p_one);
      sKeys.put("layout/activity_profile_0", com.foo.app.R.layout.activity_profile);
      sKeys.put("layout/activity_quizz_one_0", com.foo.app.R.layout.activity_quizz_one);
      sKeys.put("layout/activity_trang_ch_one_0", com.foo.app.R.layout.activity_trang_ch_one);
      sKeys.put("layout/dialog_quizz_false_0", com.foo.app.R.layout.dialog_quizz_false);
      sKeys.put("layout/dialog_quizz_true_0", com.foo.app.R.layout.dialog_quizz_true);
      sKeys.put("layout/fragment_doi_thuong_one_0", com.foo.app.R.layout.fragment_doi_thuong_one);
      sKeys.put("layout/fragment_history_0", com.foo.app.R.layout.fragment_history);
      sKeys.put("layout/fragment_location_one_0", com.foo.app.R.layout.fragment_location_one);
      sKeys.put("layout/fragment_search_0", com.foo.app.R.layout.fragment_search);
      sKeys.put("layout/layout_progress_dialog_0", com.foo.app.R.layout.layout_progress_dialog);
      sKeys.put("layout/row_gifts_0", com.foo.app.R.layout.row_gifts);
      sKeys.put("layout/row_history_0", com.foo.app.R.layout.row_history);
      sKeys.put("layout/row_history_one_0", com.foo.app.R.layout.row_history_one);
      sKeys.put("layout/row_search_0", com.foo.app.R.layout.row_search);
      sKeys.put("layout/slideritem_trang_ch_one1_0", com.foo.app.R.layout.slideritem_trang_ch_one1);
    }
  }
}
