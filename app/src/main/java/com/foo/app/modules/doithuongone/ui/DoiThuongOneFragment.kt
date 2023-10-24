package com.foo.app.modules.doithuongone.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseFragment
import com.foo.app.databinding.FragmentDoiThuongOneBinding
import com.foo.app.modules.doithuongone.`data`.model.GiftsRowModel
import com.foo.app.modules.doithuongone.`data`.viewmodel.DoiThuongOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DoiThuongOneFragment :
    BaseFragment<FragmentDoiThuongOneBinding>(R.layout.fragment_doi_thuong_one) {
  private val viewModel: DoiThuongOneVM by viewModels<DoiThuongOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val giftsAdapter = GiftsAdapter(viewModel.giftsList.value?:mutableListOf())
    binding.recyclerGifts.adapter = giftsAdapter
    giftsAdapter.setOnItemClickListener(
    object : GiftsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GiftsRowModel) {
        onClickRecyclerGifts(view, position, item)
      }
    }
    )
    viewModel.giftsList.observe(requireActivity()) {
      giftsAdapter.updateData(it)
    }
    binding.doiThuongOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerGifts(
    view: View,
    position: Int,
    item: GiftsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DOI_THUONG_ONE_FRAGMENT"


    fun getInstance(bundle: Bundle?): DoiThuongOneFragment {
      val fragment = DoiThuongOneFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
