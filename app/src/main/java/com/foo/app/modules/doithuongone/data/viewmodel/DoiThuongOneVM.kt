package com.foo.app.modules.doithuongone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.doithuongone.`data`.model.DoiThuongOneModel
import com.foo.app.modules.doithuongone.`data`.model.GiftsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DoiThuongOneVM : ViewModel(), KoinComponent {
  val doiThuongOneModel: MutableLiveData<DoiThuongOneModel> = MutableLiveData(DoiThuongOneModel())

  var navArguments: Bundle? = null

  val giftsList: MutableLiveData<MutableList<GiftsRowModel>> = MutableLiveData(mutableListOf())
}
