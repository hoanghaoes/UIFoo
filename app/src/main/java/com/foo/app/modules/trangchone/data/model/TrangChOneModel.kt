package com.foo.app.modules.trangchone.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class TrangChOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tri_n_l_m_thu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkin: String? = MyApp.getInstance().resources.getString(R.string.lbl_s_ki_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_h_i_ch_xinh_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTnhngTh: String? = MyApp.getInstance().resources.getString(R.string.msg_t_n_h_ng_th)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtXinchoHuyn: String? = MyApp.getInstance().resources.getString(R.string.msg_xin_ch_o_huy_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFoocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_foo_cation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrangch: String? = MyApp.getInstance().resources.getString(R.string.lbl_trang_ch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTmkimOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_m_ki_m)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTmkimValue: String? = null
)
