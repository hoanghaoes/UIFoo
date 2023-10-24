package com.foo.app.modules.history.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class HistoryRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVnmiuQuct: String? = MyApp.getInstance().resources.getString(R.string.msg_v_n_mi_u_qu_c_t)

)
