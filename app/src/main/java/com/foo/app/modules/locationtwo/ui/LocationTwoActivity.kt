package com.foo.app.modules.locationtwo.ui

import androidx.activity.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseActivity
import com.foo.app.databinding.ActivityLocationTwoBinding
import com.foo.app.modules.locationtwo.`data`.viewmodel.LocationTwoVM
import kotlin.String
import kotlin.Unit

class LocationTwoActivity : BaseActivity<ActivityLocationTwoBinding>(R.layout.activity_location_two)
    {
  private val viewModel: LocationTwoVM by viewModels<LocationTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.locationTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOCATION_TWO_ACTIVITY"

  }
}
