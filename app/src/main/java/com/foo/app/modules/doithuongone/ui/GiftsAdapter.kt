package com.foo.app.modules.doithuongone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foo.app.R
import com.foo.app.databinding.RowGiftsBinding
import com.foo.app.modules.doithuongone.`data`.model.GiftsRowModel
import kotlin.Int
import kotlin.collections.List

class GiftsAdapter(
  var list: List<GiftsRowModel>
) : RecyclerView.Adapter<GiftsAdapter.RowGiftsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGiftsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gifts,parent,false)
    return RowGiftsVH(view)
  }

  override fun onBindViewHolder(holder: RowGiftsVH, position: Int) {
    val giftsRowModel = GiftsRowModel()
    // TODO uncomment following line after integration with data source
    // val giftsRowModel = list[position]
    holder.binding.giftsRowModel = giftsRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GiftsRowModel>) {
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
      item: GiftsRowModel
    ) {
    }
  }

  inner class RowGiftsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGiftsBinding = RowGiftsBinding.bind(itemView)
  }
}
