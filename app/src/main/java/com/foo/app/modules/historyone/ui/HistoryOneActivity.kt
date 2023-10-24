package com.foo.app.modules.historyone.ui

import android.view.View
import androidx.activity.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseActivity
import com.foo.app.databinding.ActivityHistoryOneBinding
import com.foo.app.modules.historyone.`data`.model.HistoryOneRowModel
import com.foo.app.modules.historyone.`data`.viewmodel.HistoryOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HistoryOneActivity : BaseActivity<ActivityHistoryOneBinding>(R.layout.activity_history_one) {
  private val viewModel: HistoryOneVM by viewModels<HistoryOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val historyOneAdapter = HistoryOneAdapter(viewModel.historyOneList.value?:mutableListOf())
    binding.recyclerHistoryOne.adapter = historyOneAdapter
    historyOneAdapter.setOnItemClickListener(
    object : HistoryOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HistoryOneRowModel) {
        onClickRecyclerHistoryOne(view, position, item)
      }
    }
    )
    viewModel.historyOneList.observe(this) {
      historyOneAdapter.updateData(it)
    }
    binding.historyOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerHistoryOne(
    view: View,
    position: Int,
    item: HistoryOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HISTORY_ONE_ACTIVITY"

  }
}
