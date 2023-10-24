package com.foo.app.modules.khmph.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class KhMPhModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHGm: String? = MyApp.getInstance().resources.getString(R.string.lbl_h_g_m2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVtphmbn: String? = MyApp.getInstance().resources.getString(R.string.lbl_v_t_ph_m_b_n)

)
