package com.foo.app.modules.trangchone.ui

import android.net.Uri
import androidx.activity.viewModels
import com.foo.app.R
import com.foo.app.appcomponents.base.BaseActivity
import com.foo.app.databinding.ActivityTrangChOneBinding
import com.foo.app.modules.trangchone.`data`.model.ImageSliderSlidercthbnstModel
import com.foo.app.modules.trangchone.`data`.viewmodel.TrangChOneVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class TrangChOneActivity : BaseActivity<ActivityTrangChOneBinding>(R.layout.activity_trang_ch_one) {
  private val imageUri: Uri = Uri.parse("android.resource://com.foo.app/drawable/img_image1")


  private val imageSliderSlidercthbnstItems: ArrayList<ImageSliderSlidercthbnstModel> =
      arrayListOf(ImageSliderSlidercthbnstModel(imageImageOne =
  imageUri.toString()),ImageSliderSlidercthbnstModel(imageImageOne = imageUri.toString()))


  private val viewModel: TrangChOneVM by viewModels<TrangChOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slidercthbnstAdapter = SlidercthbnstAdapter(imageSliderSlidercthbnstItems,true)
    binding.imageSliderSlidercthbnst.adapter = slidercthbnstAdapter
    binding.imageSliderSlidercthbnst.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroupEighteen.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroupEighteen.updateIndicatorCounts(binding.imageSliderSlidercthbnst.indicatorCount)
    binding.trangChOneVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlidercthbnst.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlidercthbnst.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TRANG_CH_ONE_ACTIVITY"

  }
}
