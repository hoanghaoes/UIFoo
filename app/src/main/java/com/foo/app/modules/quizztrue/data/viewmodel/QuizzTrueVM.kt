package com.foo.app.modules.quizztrue.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.quizztrue.`data`.model.QuizzTrueModel
import org.koin.core.KoinComponent

class QuizzTrueVM : ViewModel(), KoinComponent {
  val quizzTrueModel: MutableLiveData<QuizzTrueModel> = MutableLiveData(QuizzTrueModel())

  var navArguments: Bundle? = null
}
