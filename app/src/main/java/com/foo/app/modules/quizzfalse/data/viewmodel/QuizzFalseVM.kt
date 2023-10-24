package com.foo.app.modules.quizzfalse.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.quizzfalse.`data`.model.QuizzFalseModel
import org.koin.core.KoinComponent

class QuizzFalseVM : ViewModel(), KoinComponent {
  val quizzFalseModel: MutableLiveData<QuizzFalseModel> = MutableLiveData(QuizzFalseModel())

  var navArguments: Bundle? = null
}
