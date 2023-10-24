package com.foo.app.modules.locationthree.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class LocationThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNhpvtr: String? = MyApp.getInstance().resources.getString(R.string.lbl_nh_p_v_tr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBotngHNi: String? = MyApp.getInstance().resources.getString(R.string.lbl_b_o_t_ng_h_n_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiveHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_500)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_b_o_t_ng_h_nh_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhmHngMT: String? = MyApp.getInstance().resources.getString(R.string.msg_ph_m_h_ng_m_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0800113013: String? = MyApp.getInstance().resources.getString(R.string.msg_08_00_11_30_13)
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
  var txtN: String? = MyApp.getInstance().resources.getString(R.string.lbl_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMrng: String? = MyApp.getInstance().resources.getString(R.string.lbl_m_r_ng)

)
