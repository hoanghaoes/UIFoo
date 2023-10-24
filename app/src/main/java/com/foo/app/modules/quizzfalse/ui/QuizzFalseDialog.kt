package com.foo.app.modules.quizzfalse.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseDialogFragment
import com.foo.app.databinding.DialogQuizzFalseBinding
import com.foo.app.modules.quizzfalse.`data`.viewmodel.QuizzFalseVM
import kotlin.String
import kotlin.Unit

class QuizzFalseDialog : BaseDialogFragment<DialogQuizzFalseBinding>(R.layout.dialog_quizz_false) {
  private val viewModel: QuizzFalseVM by viewModels<QuizzFalseVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.quizzFalseVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "QUIZZ_FALSE_DIALOG"

  }
}
