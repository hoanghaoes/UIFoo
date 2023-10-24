package com.foo.app.modules.artifactinformation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.artifactinformation.`data`.model.ArtifactInformationModel
import org.koin.core.KoinComponent

class ArtifactInformationVM : ViewModel(), KoinComponent {
  val artifactInformationModel: MutableLiveData<ArtifactInformationModel> =
      MutableLiveData(ArtifactInformationModel())

  var navArguments: Bundle? = null
}
