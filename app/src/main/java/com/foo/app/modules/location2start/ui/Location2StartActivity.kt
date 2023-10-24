package com.foo.app.modules.location2start.ui

import androidx.activity.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseActivity
import com.foo.app.databinding.ActivityLocation2StartBinding
import com.foo.app.modules.khmph.ui.KhMPhActivity
import com.foo.app.modules.location2start.`data`.viewmodel.Location2StartVM
import kotlin.String
import kotlin.Unit

class Location2StartActivity :
    BaseActivity<ActivityLocation2StartBinding>(R.layout.activity_location_2_start) {
  private val viewModel: Location2StartVM by viewModels<Location2StartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.location2StartVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBtu.setOnClickListener {
      val destIntent = KhMPhActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOCATION2START_ACTIVITY"

  }
}
