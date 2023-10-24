package com.foo.app.modules.doithuongone.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class GiftsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThViettelTwenty: String? =
      MyApp.getInstance().resources.getString(R.string.msg_th_viettel_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1000)

)
