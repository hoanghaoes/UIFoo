package com.foo.app.modules.search.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class SearchRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHinvt: String? = MyApp.getInstance().resources.getString(R.string.lbl_hi_n_v_t)

)
