package com.foo.app.modules.artifactinformation.ui

import androidx.activity.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseActivity
import com.foo.app.databinding.ActivityArtifactInformationBinding
import com.foo.app.modules.artifactinformation.`data`.viewmodel.ArtifactInformationVM
import kotlin.String
import kotlin.Unit

class ArtifactInformationActivity :
    BaseActivity<ActivityArtifactInformationBinding>(R.layout.activity_artifact_information) {
  private val viewModel: ArtifactInformationVM by viewModels<ArtifactInformationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.artifactInformationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ARTIFACT_INFORMATION_ACTIVITY"

  }
}
