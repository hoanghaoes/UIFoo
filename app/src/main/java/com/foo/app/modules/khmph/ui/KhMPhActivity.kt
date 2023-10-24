package com.foo.app.modules.khmph.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseActivity
import com.foo.app.databinding.ActivityKhMPhBinding
import com.foo.app.modules.khmph.`data`.viewmodel.KhMPhVM
import kotlin.String
import kotlin.Unit

class KhMPhActivity : BaseActivity<ActivityKhMPhBinding>(R.layout.activity_kh_m_ph) {
  private val viewModel: KhMPhVM by viewModels<KhMPhVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.khMPhVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "KH_M_PH_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KhMPhActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
