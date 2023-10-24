package com.foo.app.modules.locationthree.ui

import androidx.activity.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseActivity
import com.foo.app.databinding.ActivityLocationThreeBinding
import com.foo.app.modules.locationthree.`data`.viewmodel.LocationThreeVM
import kotlin.String
import kotlin.Unit

class LocationThreeActivity :
    BaseActivity<ActivityLocationThreeBinding>(R.layout.activity_location_three) {
  private val viewModel: LocationThreeVM by viewModels<LocationThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.locationThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOCATION_THREE_ACTIVITY"

  }
}
