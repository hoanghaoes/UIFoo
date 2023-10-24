package com.foo.app.modules.doithuongonecontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foo.app.modules.doithuongonecontainer.`data`.model.DoiThuongOneContainerModel
import org.koin.core.KoinComponent

class DoiThuongOneContainerVM : ViewModel(), KoinComponent {
  val doiThuongOneContainerModel: MutableLiveData<DoiThuongOneContainerModel> =
      MutableLiveData(DoiThuongOneContainerModel())

  var navArguments: Bundle? = null
}
