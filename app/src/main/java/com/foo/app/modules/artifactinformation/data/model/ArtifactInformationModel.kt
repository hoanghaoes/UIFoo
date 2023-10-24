package com.foo.app.modules.artifactinformation.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class ArtifactInformationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThngtin: String? = MyApp.getInstance().resources.getString(R.string.lbl_th_ng_tin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKhuVnCc: String? = MyApp.getInstance().resources.getString(R.string.lbl_khu_v_n_c_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_khu_v_n_c_c_tr)

)
