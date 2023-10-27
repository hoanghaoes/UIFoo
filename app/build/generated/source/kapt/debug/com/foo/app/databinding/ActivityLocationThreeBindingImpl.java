package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLocationThreeBindingImpl extends ActivityLocationThreeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frameLocationThree, 14);
        sViewsWithIds.put(R.id.frameStackiosstatusbar, 15);
        sViewsWithIds.put(R.id.linearColumniosstatusbar, 16);
        sViewsWithIds.put(R.id.imageIOSStatusBar, 17);
        sViewsWithIds.put(R.id.linearTmkim, 18);
        sViewsWithIds.put(R.id.imageIcon, 19);
        sViewsWithIds.put(R.id.frameStackiconOne, 20);
        sViewsWithIds.put(R.id.imageIconOne, 21);
        sViewsWithIds.put(R.id.imageIconTwo, 22);
        sViewsWithIds.put(R.id.imageStar, 23);
        sViewsWithIds.put(R.id.linearColumnrectanglethree, 24);
        sViewsWithIds.put(R.id.viewRectangleThree, 25);
        sViewsWithIds.put(R.id.linearRowbotnghni, 26);
        sViewsWithIds.put(R.id.linearColumniconThree, 27);
        sViewsWithIds.put(R.id.imageIconThree, 28);
        sViewsWithIds.put(R.id.imageIconFour, 29);
        sViewsWithIds.put(R.id.linearColumnkhmPh, 30);
        sViewsWithIds.put(R.id.btnKhmPh, 31);
        sViewsWithIds.put(R.id.frameBottombar, 32);
        sViewsWithIds.put(R.id.linearRowupload, 33);
        sViewsWithIds.put(R.id.linearTrangch, 34);
        sViewsWithIds.put(R.id.imageUpload, 35);
        sViewsWithIds.put(R.id.linearTmkim1, 36);
        sViewsWithIds.put(R.id.imageSearch, 37);
        sViewsWithIds.put(R.id.frameStacklocation, 38);
        sViewsWithIds.put(R.id.linearNhv, 39);
        sViewsWithIds.put(R.id.imageLocation, 40);
        sViewsWithIds.put(R.id.viewRectangle241, 41);
        sViewsWithIds.put(R.id.linearN, 42);
        sViewsWithIds.put(R.id.imageMail, 43);
        sViewsWithIds.put(R.id.linearThm, 44);
        sViewsWithIds.put(R.id.imageMenu, 45);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLocationThreeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 46, sIncludes, sViewsWithIds));
    }
    private ActivityLocationThreeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[31]
            , (android.widget.FrameLayout) bindings[32]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.FrameLayout) bindings[20]
            , (android.widget.FrameLayout) bindings[15]
            , (android.widget.FrameLayout) bindings[38]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[40]
            , (android.widget.ImageView) bindings[43]
            , (android.widget.ImageView) bindings[45]
            , (android.widget.ImageView) bindings[37]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[35]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[42]
            , (android.widget.LinearLayout) bindings[39]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[33]
            , (android.widget.LinearLayout) bindings[44]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[36]
            , (android.widget.LinearLayout) bindings[34]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.view.View) bindings[41]
            , (android.view.View) bindings[25]
            );
        this.imageBasemapimage.setTag(null);
        this.imageUnsplashfAPeU.setTag(null);
        this.linearColumnunsplashfapeu.setTag(null);
        this.txt0800113013.setTag(null);
        this.txtBotngHNi.setTag(null);
        this.txtDescription.setTag(null);
        this.txtFiveHundred.setTag(null);
        this.txtMrng.setTag(null);
        this.txtN.setTag(null);
        this.txtNhpvtr.setTag(null);
        this.txtNhv.setTag(null);
        this.txtPhmHngMT.setTag(null);
        this.txtTmkim.setTag(null);
        this.txtTrangch.setTag(null);
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
        if (BR.locationThreeVM == variableId) {
            setLocationThreeVM((com.foo.app.modules.locationthree.data.viewmodel.LocationThreeVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLocationThreeVM(@Nullable com.foo.app.modules.locationthree.data.viewmodel.LocationThreeVM LocationThreeVM) {
        this.mLocationThreeVM = LocationThreeVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.locationThreeVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLocationThreeVMLocationThreeModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.locationthree.data.model.LocationThreeModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLocationThreeVMLocationThreeModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.locationthree.data.model.LocationThreeModel> LocationThreeVMLocationThreeModel, int fieldId) {
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
        java.lang.String locationThreeVMLocationThreeModelTxtNhpvtr = null;
        java.lang.String locationThreeVMLocationThreeModelTxtTrangch = null;
        java.lang.String locationThreeVMLocationThreeModelTxtFiveHundred = null;
        java.lang.String locationThreeVMLocationThreeModelTxtNhv = null;
        java.lang.String locationThreeVMLocationThreeModelTxtPhmHngMT = null;
        com.foo.app.modules.locationthree.data.model.LocationThreeModel locationThreeVMLocationThreeModelGetValue = null;
        java.lang.String locationThreeVMLocationThreeModelTxtMrng = null;
        java.lang.String locationThreeVMLocationThreeModelTxtDescription = null;
        com.foo.app.modules.locationthree.data.viewmodel.LocationThreeVM locationThreeVM = mLocationThreeVM;
        java.lang.String locationThreeVMLocationThreeModelTxt0800113013 = null;
        java.lang.String locationThreeVMLocationThreeModelTxtTmkim = null;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.locationthree.data.model.LocationThreeModel> locationThreeVMLocationThreeModel = null;
        java.lang.String locationThreeVMLocationThreeModelTxtBotngHNi = null;
        java.lang.String locationThreeVMLocationThreeModelTxtN = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (locationThreeVM != null) {
                    // read locationThreeVM.locationThreeModel
                    locationThreeVMLocationThreeModel = locationThreeVM.getLocationThreeModel();
                }
                updateLiveDataRegistration(0, locationThreeVMLocationThreeModel);


                if (locationThreeVMLocationThreeModel != null) {
                    // read locationThreeVM.locationThreeModel.getValue()
                    locationThreeVMLocationThreeModelGetValue = locationThreeVMLocationThreeModel.getValue();
                }


                if (locationThreeVMLocationThreeModelGetValue != null) {
                    // read locationThreeVM.locationThreeModel.getValue().txtNhpvtr
                    locationThreeVMLocationThreeModelTxtNhpvtr = locationThreeVMLocationThreeModelGetValue.getTxtNhpvtr();
                    // read locationThreeVM.locationThreeModel.getValue().txtTrangch
                    locationThreeVMLocationThreeModelTxtTrangch = locationThreeVMLocationThreeModelGetValue.getTxtTrangch();
                    // read locationThreeVM.locationThreeModel.getValue().txtFiveHundred
                    locationThreeVMLocationThreeModelTxtFiveHundred = locationThreeVMLocationThreeModelGetValue.getTxtFiveHundred();
                    // read locationThreeVM.locationThreeModel.getValue().txtNhv
                    locationThreeVMLocationThreeModelTxtNhv = locationThreeVMLocationThreeModelGetValue.getTxtNhv();
                    // read locationThreeVM.locationThreeModel.getValue().txtPhmHngMT
                    locationThreeVMLocationThreeModelTxtPhmHngMT = locationThreeVMLocationThreeModelGetValue.getTxtPhmHngMT();
                    // read locationThreeVM.locationThreeModel.getValue().txtMrng
                    locationThreeVMLocationThreeModelTxtMrng = locationThreeVMLocationThreeModelGetValue.getTxtMrng();
                    // read locationThreeVM.locationThreeModel.getValue().txtDescription
                    locationThreeVMLocationThreeModelTxtDescription = locationThreeVMLocationThreeModelGetValue.getTxtDescription();
                    // read locationThreeVM.locationThreeModel.getValue().txt0800113013
                    locationThreeVMLocationThreeModelTxt0800113013 = locationThreeVMLocationThreeModelGetValue.getTxt0800113013();
                    // read locationThreeVM.locationThreeModel.getValue().txtTmkim
                    locationThreeVMLocationThreeModelTxtTmkim = locationThreeVMLocationThreeModelGetValue.getTxtTmkim();
                    // read locationThreeVM.locationThreeModel.getValue().txtBotngHNi
                    locationThreeVMLocationThreeModelTxtBotngHNi = locationThreeVMLocationThreeModelGetValue.getTxtBotngHNi();
                    // read locationThreeVM.locationThreeModel.getValue().txtN
                    locationThreeVMLocationThreeModelTxtN = locationThreeVMLocationThreeModelGetValue.getTxtN();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBasemapimage, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBasemapimage.getContext(), R.drawable.img_basemapimage_1), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageUnsplashfAPeU, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageUnsplashfAPeU.getContext(), R.drawable.img_unsplashfapeu), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt0800113013, locationThreeVMLocationThreeModelTxt0800113013);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBotngHNi, locationThreeVMLocationThreeModelTxtBotngHNi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescription, locationThreeVMLocationThreeModelTxtDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFiveHundred, locationThreeVMLocationThreeModelTxtFiveHundred);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMrng, locationThreeVMLocationThreeModelTxtMrng);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtN, locationThreeVMLocationThreeModelTxtN);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNhpvtr, locationThreeVMLocationThreeModelTxtNhpvtr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNhv, locationThreeVMLocationThreeModelTxtNhv);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPhmHngMT, locationThreeVMLocationThreeModelTxtPhmHngMT);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTmkim, locationThreeVMLocationThreeModelTxtTmkim);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTrangch, locationThreeVMLocationThreeModelTxtTrangch);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): locationThreeVM.locationThreeModel
        flag 1 (0x2L): locationThreeVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}