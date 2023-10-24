package com.foo.app.modules.quizztrue.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseDialogFragment
import com.foo.app.databinding.DialogQuizzTrueBinding
import com.foo.app.modules.quizztrue.`data`.viewmodel.QuizzTrueVM
import kotlin.String
import kotlin.Unit

class QuizzTrueDialog : BaseDialogFragment<DialogQuizzTrueBinding>(R.layout.dialog_quizz_true) {
  private val viewModel: QuizzTrueVM by viewModels<QuizzTrueVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.quizzTrueVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "QUIZZ_TRUE_DIALOG"

  }
}
