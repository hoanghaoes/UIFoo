package com.foo.app.modules.ngkone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.ngkone.`data`.model.NgKOneModel
import org.koin.core.KoinComponent

class NgKOneVM : ViewModel(), KoinComponent {
  val ngKOneModel: MutableLiveData<NgKOneModel> = MutableLiveData(NgKOneModel())

  var navArguments: Bundle? = null
}
