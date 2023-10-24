package com.foo.app.modules.doithuongonecontainer.ui

import androidx.activity.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseActivity
import com.foo.app.databinding.ActivityDoiThuongOneContainerBinding
import com.foo.app.extensions.loadFragment
import com.foo.app.modules.doithuongone.ui.DoiThuongOneFragment
import com.foo.app.modules.doithuongonecontainer.`data`.viewmodel.DoiThuongOneContainerVM
import com.foo.app.modules.history.ui.HistoryFragment
import com.foo.app.modules.locationone.ui.LocationOneFragment
import com.foo.app.modules.search.ui.SearchFragment
import kotlin.String
import kotlin.Unit

class DoiThuongOneContainerActivity :
    BaseActivity<ActivityDoiThuongOneContainerBinding>(R.layout.activity_doi_thuong_one_container) {
  private val viewModel: DoiThuongOneContainerVM by viewModels<DoiThuongOneContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.doiThuongOneContainerVM = viewModel
    val destFragment = DoiThuongOneFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = DoiThuongOneFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.linearTrangch.setOnClickListener {
      val destFragment = DoiThuongOneFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = DoiThuongOneFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearN.setOnClickListener {
      val destFragment = HistoryFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = HistoryFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearTmkim.setOnClickListener {
      val destFragment = SearchFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = SearchFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearNhv.setOnClickListener {
      val destFragment = LocationOneFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = LocationOneFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "DOI_THUONG_ONE_CONTAINER_ACTIVITY"

  }
}
