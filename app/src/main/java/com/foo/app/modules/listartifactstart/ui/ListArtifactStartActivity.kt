package com.foo.app.modules.listartifactstart.ui

import androidx.activity.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseActivity
import com.foo.app.databinding.ActivityListArtifactStartBinding
import com.foo.app.modules.khmph.ui.KhMPhActivity
import com.foo.app.modules.listartifactstart.`data`.viewmodel.ListArtifactStartVM
import kotlin.String
import kotlin.Unit

class ListArtifactStartActivity :
    BaseActivity<ActivityListArtifactStartBinding>(R.layout.activity_list_artifact_start) {
  private val viewModel: ListArtifactStartVM by viewModels<ListArtifactStartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.listArtifactStartVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBtu.setOnClickListener {
      val destIntent = KhMPhActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LIST_ARTIFACT_START_ACTIVITY"

  }
}
