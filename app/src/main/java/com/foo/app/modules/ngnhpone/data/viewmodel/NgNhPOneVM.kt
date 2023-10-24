package com.foo.app.modules.ngnhpone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.ngnhpone.`data`.model.NgNhPOneModel
import org.koin.core.KoinComponent

class NgNhPOneVM : ViewModel(), KoinComponent {
  val ngNhPOneModel: MutableLiveData<NgNhPOneModel> = MutableLiveData(NgNhPOneModel())

  var navArguments: Bundle? = null
}
