package com.foo.app.modules.doithuong.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.doithuong.`data`.model.DoiThuongModel
import org.koin.core.KoinComponent

class DoiThuongVM : ViewModel(), KoinComponent {
  val doiThuongModel: MutableLiveData<DoiThuongModel> = MutableLiveData(DoiThuongModel())

  var navArguments: Bundle? = null
}
