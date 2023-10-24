package com.foo.app.modules.ngkone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseActivity
import com.foo.app.databinding.ActivityNgKOneBinding
import com.foo.app.modules.ngkone.`data`.viewmodel.NgKOneVM
import com.foo.app.modules.ngnhpone.ui.NgNhPOneActivity
import kotlin.String
import kotlin.Unit

class NgKOneActivity : BaseActivity<ActivityNgKOneBinding>(R.layout.activity_ng_k_one) {
  private val viewModel: NgKOneVM by viewModels<NgKOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ngKOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBnctik.setOnClickListener {
      val destIntent = NgNhPOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NG_K_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NgKOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
