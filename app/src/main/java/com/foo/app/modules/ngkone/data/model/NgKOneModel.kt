package com.foo.app.modules.ngkone.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class NgKOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNgk: String? = MyApp.getInstance().resources.getString(R.string.lbl_ng_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBnctik: String? = MyApp.getInstance().resources.getString(R.string.msg_b_n_c_t_i_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputTextValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputTextOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputTextTwoValue: String? = null
)
