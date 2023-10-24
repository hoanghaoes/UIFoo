package com.foo.app.modules.profile.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCnhn: String? = MyApp.getInstance().resources.getString(R.string.lbl_c_nh_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVKhnhHuyn: String? = MyApp.getInstance().resources.getString(R.string.lbl_v_kh_nh_huy_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTn: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_n2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTnngnhp: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_n_ng_nh_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMtkhu: String? = MyApp.getInstance().resources.getString(R.string.lbl_m_t_kh_u2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImthng: String? = MyApp.getInstance().resources.getString(R.string.lbl_i_m_th_ng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHng: String? = MyApp.getInstance().resources.getString(R.string.lbl_h_ng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_b_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etControlsTextValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etControlsTextOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etControlsTextTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etZipcodeValue: String? = null
)
