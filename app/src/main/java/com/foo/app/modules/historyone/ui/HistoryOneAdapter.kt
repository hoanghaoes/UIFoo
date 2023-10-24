package com.foo.app.modules.historyone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foo.app.R
import com.foo.app.databinding.RowHistoryOneBinding
import com.foo.app.modules.historyone.`data`.model.HistoryOneRowModel
import kotlin.Int
import kotlin.collections.List

class HistoryOneAdapter(
  var list: List<HistoryOneRowModel>
) : RecyclerView.Adapter<HistoryOneAdapter.RowHistoryOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHistoryOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_history_one,parent,false)
    return RowHistoryOneVH(view)
  }

  override fun onBindViewHolder(holder: RowHistoryOneVH, position: Int) {
    val historyOneRowModel = HistoryOneRowModel()
    // TODO uncomment following line after integration with data source
    // val historyOneRowModel = list[position]
    holder.binding.historyOneRowModel = historyOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HistoryOneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: HistoryOneRowModel
    ) {
    }
  }

  inner class RowHistoryOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHistoryOneBinding = RowHistoryOneBinding.bind(itemView)
  }
}
