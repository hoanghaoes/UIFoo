package com.foo.app.modules.locationone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.locationone.`data`.model.LocationOneModel
import org.koin.core.KoinComponent

class LocationOneVM : ViewModel(), KoinComponent {
  val locationOneModel: MutableLiveData<LocationOneModel> = MutableLiveData(LocationOneModel())

  var navArguments: Bundle? = null
}
