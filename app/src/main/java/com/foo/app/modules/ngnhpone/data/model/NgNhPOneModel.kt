package com.foo.app.modules.ngnhpone.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class NgNhPOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNgnhp: String? = MyApp.getInstance().resources.getString(R.string.lbl_ng_nh_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQunmtkhu: String? = MyApp.getInstance().resources.getString(R.string.lbl_qu_n_m_t_kh_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBnchacti: String? = MyApp.getInstance().resources.getString(R.string.msg_b_n_ch_a_c_t_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputTextValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputTextOneValue: String? = null
)
