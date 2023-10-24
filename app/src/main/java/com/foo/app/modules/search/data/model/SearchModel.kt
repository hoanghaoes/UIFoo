package com.foo.app.modules.search.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBotngHNi: String? = MyApp.getInstance().resources.getString(R.string.lbl_b_o_t_ng_h_n_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVnmiu: String? = MyApp.getInstance().resources.getString(R.string.lbl_v_n_mi_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGi: String? = MyApp.getInstance().resources.getString(R.string.lbl_g_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGiOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_g_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBotngHNiOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_b_o_t_ng_h_n_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVnmiuOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_v_n_mi_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLchs: String? = MyApp.getInstance().resources.getString(R.string.lbl_l_ch_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameSevenValue: String? = null
)
