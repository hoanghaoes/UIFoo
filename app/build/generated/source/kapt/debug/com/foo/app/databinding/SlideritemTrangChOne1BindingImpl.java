package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SlideritemTrangChOne1BindingImpl extends SlideritemTrangChOne1Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frameContent, 4);
        sViewsWithIds.put(R.id.linearColumndescription, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SlideritemTrangChOne1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private SlideritemTrangChOne1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.imageImageOne.setTag(null);
        this.linearGi.setTag(null);
        this.txtCthbnst.setTag(null);
        this.txtDescription.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.imageSliderSlidercthbnstModel == variableId) {
            setImageSliderSlidercthbnstModel((com.foo.app.modules.trangchone.data.model.ImageSliderSlidercthbnstModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setImageSliderSlidercthbnstModel(@Nullable com.foo.app.modules.trangchone.data.model.ImageSliderSlidercthbnstModel ImageSliderSlidercthbnstModel) {
        this.mImageSliderSlidercthbnstModel = ImageSliderSlidercthbnstModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.imageSliderSlidercthbnstModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String imageSliderSlidercthbnstModelTxtCthbnst = null;
        java.lang.String imageSliderSlidercthbnstModelImageImageOne = null;
        com.foo.app.modules.trangchone.data.model.ImageSliderSlidercthbnstModel imageSliderSlidercthbnstModel = mImageSliderSlidercthbnstModel;
        java.lang.String imageSliderSlidercthbnstModelTxtDescription = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (imageSliderSlidercthbnstModel != null) {
                    // read imageSliderSlidercthbnstModel.txtCthbnst
                    imageSliderSlidercthbnstModelTxtCthbnst = imageSliderSlidercthbnstModel.getTxtCthbnst();
                    // read imageSliderSlidercthbnstModel.imageImageOne
                    imageSliderSlidercthbnstModelImageImageOne = imageSliderSlidercthbnstModel.getImageImageOne();
                    // read imageSliderSlidercthbnstModel.txtDescription
                    imageSliderSlidercthbnstModelTxtDescription = imageSliderSlidercthbnstModel.getTxtDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromNetwork(this.imageImageOne, imageSliderSlidercthbnstModelImageImageOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageOne.getContext(), R.drawable.image_not_found), (android.graphics.drawable.Drawable)null, imageImageOne.getResources().getDimension(R.dimen._10pxh), (boolean)false);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCthbnst, imageSliderSlidercthbnstModelTxtCthbnst);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescription, imageSliderSlidercthbnstModelTxtDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): imageSliderSlidercthbnstModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}