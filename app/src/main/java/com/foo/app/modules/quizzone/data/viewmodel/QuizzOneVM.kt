package com.foo.app.modules.quizzone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.quizzone.`data`.model.QuizzOneModel
import org.koin.core.KoinComponent

class QuizzOneVM : ViewModel(), KoinComponent {
  val quizzOneModel: MutableLiveData<QuizzOneModel> = MutableLiveData(QuizzOneModel())

  var navArguments: Bundle? = null
}
