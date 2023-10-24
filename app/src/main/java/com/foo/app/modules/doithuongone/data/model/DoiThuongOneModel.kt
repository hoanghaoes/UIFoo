package com.foo.app.modules.doithuongone.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class DoiThuongOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIthng: String? = MyApp.getInstance().resources.getString(R.string.lbl_i_th_ng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_3600)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQui: String? = MyApp.getInstance().resources.getString(R.string.lbl_qu_i)

)
