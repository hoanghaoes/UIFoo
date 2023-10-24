package com.foo.app.modules.locationone.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseFragment
import com.foo.app.databinding.FragmentLocationOneBinding
import com.foo.app.modules.locationone.`data`.viewmodel.LocationOneVM
import kotlin.String
import kotlin.Unit

class LocationOneFragment : BaseFragment<FragmentLocationOneBinding>(R.layout.fragment_location_one)
    {
  private val viewModel: LocationOneVM by viewModels<LocationOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.locationOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOCATION_ONE_FRAGMENT"


    fun getInstance(bundle: Bundle?): LocationOneFragment {
      val fragment = LocationOneFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
