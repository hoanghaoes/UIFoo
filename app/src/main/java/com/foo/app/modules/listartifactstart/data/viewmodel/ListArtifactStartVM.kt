package com.foo.app.modules.listartifactstart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.listartifactstart.`data`.model.ListArtifactStartModel
import org.koin.core.KoinComponent

class ListArtifactStartVM : ViewModel(), KoinComponent {
  val listArtifactStartModel: MutableLiveData<ListArtifactStartModel> =
      MutableLiveData(ListArtifactStartModel())

  var navArguments: Bundle? = null
}
