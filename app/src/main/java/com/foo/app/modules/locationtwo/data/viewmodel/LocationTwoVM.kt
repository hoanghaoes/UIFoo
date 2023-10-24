package com.foo.app.modules.locationtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.locationtwo.`data`.model.LocationTwoModel
import org.koin.core.KoinComponent

class LocationTwoVM : ViewModel(), KoinComponent {
  val locationTwoModel: MutableLiveData<LocationTwoModel> = MutableLiveData(LocationTwoModel())

  var navArguments: Bundle? = null
}
