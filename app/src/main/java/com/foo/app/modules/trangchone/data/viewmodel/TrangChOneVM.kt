package com.foo.app.modules.trangchone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.trangchone.`data`.model.TrangChOneModel
import org.koin.core.KoinComponent

class TrangChOneVM : ViewModel(), KoinComponent {
  val trangChOneModel: MutableLiveData<TrangChOneModel> = MutableLiveData(TrangChOneModel())

  var navArguments: Bundle? = null
}
