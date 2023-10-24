package com.foo.app.modules.ngnhpone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseActivity
import com.foo.app.databinding.ActivityNgNhPOneBinding
import com.foo.app.modules.ngkone.ui.NgKOneActivity
import com.foo.app.modules.ngnhpone.`data`.viewmodel.NgNhPOneVM
import kotlin.String
import kotlin.Unit

class NgNhPOneActivity : BaseActivity<ActivityNgNhPOneBinding>(R.layout.activity_ng_nh_p_one) {
  private val viewModel: NgNhPOneVM by viewModels<NgNhPOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ngNhPOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBnchacti.setOnClickListener {
      val destIntent = NgKOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NG_NH_P_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NgNhPOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
