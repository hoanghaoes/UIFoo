package com.foo.app.modules.khmph.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.khmph.`data`.model.KhMPhModel
import org.koin.core.KoinComponent

class KhMPhVM : ViewModel(), KoinComponent {
  val khMPhModel: MutableLiveData<KhMPhModel> = MutableLiveData(KhMPhModel())

  var navArguments: Bundle? = null
}
