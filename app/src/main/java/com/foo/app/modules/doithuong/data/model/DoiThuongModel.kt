package com.foo.app.modules.doithuong.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class DoiThuongModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIthng: String? = MyApp.getInstance().resources.getString(R.string.lbl_i_th_ng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQui: String? = MyApp.getInstance().resources.getString(R.string.lbl_qu_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_3600)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThViettelTwenty: String? =
      MyApp.getInstance().resources.getString(R.string.msg_th_viettel_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_s_seri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt53835832354: String? = MyApp.getInstance().resources.getString(R.string.lbl_53835832354)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMth: String? = MyApp.getInstance().resources.getString(R.string.lbl_m_th)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt4522330866328: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_4522330866328)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMomo20000: String? = MyApp.getInstance().resources.getString(R.string.lbl_momo_20_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameSevenValue: String? = null
)
