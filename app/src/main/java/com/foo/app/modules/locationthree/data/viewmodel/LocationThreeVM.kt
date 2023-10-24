package com.foo.app.modules.locationthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.locationthree.`data`.model.LocationThreeModel
import org.koin.core.KoinComponent

class LocationThreeVM : ViewModel(), KoinComponent {
  val locationThreeModel: MutableLiveData<LocationThreeModel> =
      MutableLiveData(LocationThreeModel())

  var navArguments: Bundle? = null
}
