package com.foo.app.modules.quizzone.ui

import androidx.activity.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseActivity
import com.foo.app.databinding.ActivityQuizzOneBinding
import com.foo.app.modules.quizzone.`data`.viewmodel.QuizzOneVM
import kotlin.String
import kotlin.Unit

class QuizzOneActivity : BaseActivity<ActivityQuizzOneBinding>(R.layout.activity_quizz_one) {
  private val viewModel: QuizzOneVM by viewModels<QuizzOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.quizzOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "QUIZZ_ONE_ACTIVITY"

  }
}
