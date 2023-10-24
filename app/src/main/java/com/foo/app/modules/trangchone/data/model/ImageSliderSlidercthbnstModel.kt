package com.foo.app.modules.trangchone.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSlidercthbnstModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCthbnst: String? = MyApp.getInstance().resources.getString(R.string.msg_c_th_b_n_s_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_h_g_m_theo_tr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageImageOne: String? = ""

)
