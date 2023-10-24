package com.foo.app.modules.doithuongonecontainer.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class DoiThuongOneContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTrangch: String? = MyApp.getInstance().resources.getString(R.string.lbl_trang_ch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTmkim: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_m_ki_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNhv: String? = MyApp.getInstance().resources.getString(R.string.lbl_nh_v)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtN: String? = MyApp.getInstance().resources.getString(R.string.lbl_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMrng: String? = MyApp.getInstance().resources.getString(R.string.lbl_m_r_ng)

)
