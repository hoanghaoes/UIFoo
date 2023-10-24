package com.foo.app.modules.doithuong.ui

import androidx.activity.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseActivity
import com.foo.app.databinding.ActivityDoiThuongBinding
import com.foo.app.modules.doithuong.`data`.viewmodel.DoiThuongVM
import kotlin.String
import kotlin.Unit

class DoiThuongActivity : BaseActivity<ActivityDoiThuongBinding>(R.layout.activity_doi_thuong) {
  private val viewModel: DoiThuongVM by viewModels<DoiThuongVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.doiThuongVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DOI_THUONG_ACTIVITY"

  }
}
