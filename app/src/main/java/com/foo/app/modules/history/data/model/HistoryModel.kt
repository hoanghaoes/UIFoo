package com.foo.app.modules.history.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class HistoryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtN: String? = MyApp.getInstance().resources.getString(R.string.lbl_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_3600)

)
