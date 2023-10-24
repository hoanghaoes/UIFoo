package com.foo.app.modules.quizzone.`data`.model

import com.foo.app.R
import com.foo.app.appcomponents.di.MyApp
import kotlin.String

data class QuizzOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtQuiz: String? = MyApp.getInstance().resources.getString(R.string.lbl_quiz)

)
