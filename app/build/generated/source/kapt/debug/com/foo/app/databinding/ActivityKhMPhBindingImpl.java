package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityKhMPhBindingImpl extends ActivityKhMPhBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearIOSStatusBar, 8);
        sViewsWithIds.put(R.id.imageMusic, 9);
        sViewsWithIds.put(R.id.imageRightSide, 10);
        sViewsWithIds.put(R.id.linearHeader, 11);
        sViewsWithIds.put(R.id.btnVector, 12);
        sViewsWithIds.put(R.id.imageHome, 13);
        sViewsWithIds.put(R.id.linearContainer, 14);
        sViewsWithIds.put(R.id.frameStackvtphmbn, 15);
        sViewsWithIds.put(R.id.linearColumnvtphmbn, 16);
        sViewsWithIds.put(R.id.linearItems, 17);
        sViewsWithIds.put(R.id.linearRowthpone, 18);
        sViewsWithIds.put(R.id.imageKimOne, 19);
        sViewsWithIds.put(R.id.imageGipOne, 20);
        sViewsWithIds.put(R.id.btnKtThcKhmPhOne, 21);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityKhMPhBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ActivityKhMPhBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[21]
            , (android.widget.ImageButton) bindings[12]
            , (android.widget.FrameLayout) bindings[15]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        this.imageAc478a74b213f6e.setTag(null);
        this.imageCu1.setTag(null);
        this.imageImageFive.setTag(null);
        this.imageRa1.setTag(null);
        this.imageThpOne.setTag(null);
        this.linearKhmph.setTag(null);
        this.txtHGm.setTag(null);
        this.txtVtphmbn.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.khMPhVM == variableId) {
            setKhMPhVM((com.foo.app.modules.khmph.data.viewmodel.KhMPhVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setKhMPhVM(@Nullable com.foo.app.modules.khmph.data.viewmodel.KhMPhVM KhMPhVM) {
        this.mKhMPhVM = KhMPhVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.khMPhVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeKhMPhVMKhMPhModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.khmph.data.model.KhMPhModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeKhMPhVMKhMPhModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.khmph.data.model.KhMPhModel> KhMPhVMKhMPhModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String khMPhVMKhMPhModelTxtVtphmbn = null;
        java.lang.String khMPhVMKhMPhModelTxtHGm = null;
        com.foo.app.modules.khmph.data.viewmodel.KhMPhVM khMPhVM = mKhMPhVM;
        com.foo.app.modules.khmph.data.model.KhMPhModel khMPhVMKhMPhModelGetValue = null;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.khmph.data.model.KhMPhModel> khMPhVMKhMPhModel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (khMPhVM != null) {
                    // read khMPhVM.khMPhModel
                    khMPhVMKhMPhModel = khMPhVM.getKhMPhModel();
                }
                updateLiveDataRegistration(0, khMPhVMKhMPhModel);


                if (khMPhVMKhMPhModel != null) {
                    // read khMPhVM.khMPhModel.getValue()
                    khMPhVMKhMPhModelGetValue = khMPhVMKhMPhModel.getValue();
                }


                if (khMPhVMKhMPhModelGetValue != null) {
                    // read khMPhVM.khMPhModel.getValue().txtVtphmbn
                    khMPhVMKhMPhModelTxtVtphmbn = khMPhVMKhMPhModelGetValue.getTxtVtphmbn();
                    // read khMPhVM.khMPhModel.getValue().txtHGm
                    khMPhVMKhMPhModelTxtHGm = khMPhVMKhMPhModelGetValue.getTxtHGm();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageAc478a74b213f6e, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageAc478a74b213f6e.getContext(), R.drawable.img_ac478a74b213f6e), imageAc478a74b213f6e.getResources().getDimension(R.dimen._60pxh), (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageCu1, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageCu1.getContext(), R.drawable.img_cu1), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImageFive, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageFive.getContext(), R.drawable.img_image5), imageImageFive.getResources().getDimension(R.dimen._60pxh), (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRa1, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRa1.getContext(), R.drawable.img_ra1), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageThpOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageThpOne.getContext(), R.drawable.img_thp1), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtHGm, khMPhVMKhMPhModelTxtHGm);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtVtphmbn, khMPhVMKhMPhModelTxtVtphmbn);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): khMPhVM.khMPhModel
        flag 1 (0x2L): khMPhVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}