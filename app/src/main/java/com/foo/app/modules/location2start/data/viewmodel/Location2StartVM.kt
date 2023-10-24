package com.foo.app.modules.location2start.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.location2start.`data`.model.Location2StartModel
import org.koin.core.KoinComponent

class Location2StartVM : ViewModel(), KoinComponent {
  val location2StartModel: MutableLiveData<Location2StartModel> =
      MutableLiveData(Location2StartModel())

  var navArguments: Bundle? = null
}
