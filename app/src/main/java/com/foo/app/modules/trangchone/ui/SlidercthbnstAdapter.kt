package com.foo.app.modules.trangchone.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.foo.app.databinding.SlideritemTrangChOne1Binding
import com.foo.app.modules.trangchone.`data`.model.ImageSliderSlidercthbnstModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SlidercthbnstAdapter(
  val dataList: ArrayList<ImageSliderSlidercthbnstModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSlidercthbnstModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemTrangChOne1Binding) {
      binding.imageSliderSlidercthbnstModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemTrangChOne1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
