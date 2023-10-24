package com.foo.app.modules.historyone.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class HistoryOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtN: String? = MyApp.getInstance().resources.getString(R.string.lbl_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_3600)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAimThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_a_i_m_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBnmunthamg: String? = MyApp.getInstance().resources.getString(R.string.msg_b_n_mu_n_tham_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTiptcthamq: String? = MyApp.getInstance().resources.getString(R.string.msg_ti_p_t_c_tham)
  ,
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
  var txtNOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMrng: String? = MyApp.getInstance().resources.getString(R.string.lbl_m_r_ng)

)
