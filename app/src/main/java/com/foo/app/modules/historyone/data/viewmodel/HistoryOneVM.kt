package com.foo.app.modules.historyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.historyone.`data`.model.HistoryOneModel
import com.foo.app.modules.historyone.`data`.model.HistoryOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HistoryOneVM : ViewModel(), KoinComponent {
  val historyOneModel: MutableLiveData<HistoryOneModel> = MutableLiveData(HistoryOneModel())

  var navArguments: Bundle? = null

  val historyOneList: MutableLiveData<MutableList<HistoryOneRowModel>> =
      MutableLiveData(mutableListOf())
}
