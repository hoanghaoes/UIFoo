package com.foo.app.modules.listartifactstart.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class ListArtifactStartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThngtin: String? = MyApp.getInstance().resources.getString(R.string.lbl_th_ng_tin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVnmiuQucT: String? = MyApp.getInstance().resources.getString(R.string.msg_v_n_mi_u_qu_c_t2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_v_n_mi_u_qu_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBiatinsVn: String? = MyApp.getInstance().resources.getString(R.string.msg_bia_ti_n_s_v_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKhuVnCc: String? = MyApp.getInstance().resources.getString(R.string.lbl_khu_v_n_c_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVnMiuMn: String? = MyApp.getInstance().resources.getString(R.string.lbl_v_n_mi_u_m_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHhhbnn: String? = MyApp.getInstance().resources.getString(R.string.msg_hhh_b_n_n)

)
