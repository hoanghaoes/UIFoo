package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLocationTwoBindingImpl extends ActivityLocationTwoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frameLocationTwo, 13);
        sViewsWithIds.put(R.id.frameStackmusic, 14);
        sViewsWithIds.put(R.id.linearColumnmusic, 15);
        sViewsWithIds.put(R.id.linearIOSStatusBar, 16);
        sViewsWithIds.put(R.id.imageMusic, 17);
        sViewsWithIds.put(R.id.imageRightSide, 18);
        sViewsWithIds.put(R.id.frameStackicon, 19);
        sViewsWithIds.put(R.id.imageIcon, 20);
        sViewsWithIds.put(R.id.imageIconOne, 21);
        sViewsWithIds.put(R.id.imageStar, 22);
        sViewsWithIds.put(R.id.linearColumnrectanglethree, 23);
        sViewsWithIds.put(R.id.viewRectangleThree, 24);
        sViewsWithIds.put(R.id.linearRowbotnghni, 25);
        sViewsWithIds.put(R.id.linearColumniconTwo, 26);
        sViewsWithIds.put(R.id.imageIconTwo, 27);
        sViewsWithIds.put(R.id.imageIconThree, 28);
        sViewsWithIds.put(R.id.linearColumnkhmPh, 29);
        sViewsWithIds.put(R.id.btnKhmPh, 30);
        sViewsWithIds.put(R.id.frameBottombar, 31);
        sViewsWithIds.put(R.id.linearRowupload, 32);
        sViewsWithIds.put(R.id.linearTrangch, 33);
        sViewsWithIds.put(R.id.imageUpload, 34);
        sViewsWithIds.put(R.id.linearTmkim, 35);
        sViewsWithIds.put(R.id.imageSearch, 36);
        sViewsWithIds.put(R.id.frameStacklocation, 37);
        sViewsWithIds.put(R.id.linearNhv, 38);
        sViewsWithIds.put(R.id.imageLocation, 39);
        sViewsWithIds.put(R.id.viewRectangle241, 40);
        sViewsWithIds.put(R.id.linearN, 41);
        sViewsWithIds.put(R.id.imageMail, 42);
        sViewsWithIds.put(R.id.linearThm, 43);
        sViewsWithIds.put(R.id.imageMenu, 44);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etTmkimandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of locationTwoVM.locationTwoModel.getValue().etTmkimValue
            //         is locationTwoVM.locationTwoModel.getValue().setEtTmkimValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etTmkim);
            // localize variables for thread safety
            // locationTwoVM.locationTwoModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.locationtwo.data.model.LocationTwoModel> locationTwoVMLocationTwoModel = null;
            // locationTwoVM
            com.foo.app.modules.locationtwo.data.viewmodel.LocationTwoVM locationTwoVM = mLocationTwoVM;
            // locationTwoVM != null
            boolean locationTwoVMJavaLangObjectNull = false;
            // locationTwoVM.locationTwoModel.getValue()
            com.foo.app.modules.locationtwo.data.model.LocationTwoModel locationTwoVMLocationTwoModelGetValue = null;
            // locationTwoVM.locationTwoModel.getValue().etTmkimValue
            java.lang.String locationTwoVMLocationTwoModelEtTmkimValue = null;
            // locationTwoVM.locationTwoModel.getValue() != null
            boolean locationTwoVMLocationTwoModelGetValueJavaLangObjectNull = false;
            // locationTwoVM.locationTwoModel != null
            boolean locationTwoVMLocationTwoModelJavaLangObjectNull = false;



            locationTwoVMJavaLangObjectNull = (locationTwoVM) != (null);
            if (locationTwoVMJavaLangObjectNull) {


                locationTwoVMLocationTwoModel = locationTwoVM.getLocationTwoModel();

                locationTwoVMLocationTwoModelJavaLangObjectNull = (locationTwoVMLocationTwoModel) != (null);
                if (locationTwoVMLocationTwoModelJavaLangObjectNull) {


                    locationTwoVMLocationTwoModelGetValue = locationTwoVMLocationTwoModel.getValue();

                    locationTwoVMLocationTwoModelGetValueJavaLangObjectNull = (locationTwoVMLocationTwoModelGetValue) != (null);
                    if (locationTwoVMLocationTwoModelGetValueJavaLangObjectNull) {




                        locationTwoVMLocationTwoModelGetValue.setEtTmkimValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityLocationTwoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 45, sIncludes, sViewsWithIds));
    }
    private ActivityLocationTwoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[30]
            , (android.widget.EditText) bindings[2]
            , (android.widget.FrameLayout) bindings[31]
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.FrameLayout) bindings[19]
            , (android.widget.FrameLayout) bindings[37]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[39]
            , (android.widget.ImageView) bindings[42]
            , (android.widget.ImageView) bindings[44]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[36]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[34]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[41]
            , (android.widget.LinearLayout) bindings[38]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.LinearLayout) bindings[43]
            , (android.widget.LinearLayout) bindings[35]
            , (android.widget.LinearLayout) bindings[33]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.view.View) bindings[40]
            , (android.view.View) bindings[24]
            );
        this.etTmkim.setTag(null);
        this.imageBasemapimage.setTag(null);
        this.linearColumnupload.setTag(null);
        this.txt0800113013.setTag(null);
        this.txtBotngHNi.setTag(null);
        this.txtDescription.setTag(null);
        this.txtFiveHundred.setTag(null);
        this.txtMrng.setTag(null);
        this.txtN.setTag(null);
        this.txtNhv.setTag(null);
        this.txtPhmHngMT.setTag(null);
        this.txtTmkimOne.setTag(null);
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
        if (BR.locationTwoVM == variableId) {
            setLocationTwoVM((com.foo.app.modules.locationtwo.data.viewmodel.LocationTwoVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLocationTwoVM(@Nullable com.foo.app.modules.locationtwo.data.viewmodel.LocationTwoVM LocationTwoVM) {
        this.mLocationTwoVM = LocationTwoVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.locationTwoVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLocationTwoVMLocationTwoModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.locationtwo.data.model.LocationTwoModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLocationTwoVMLocationTwoModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.locationtwo.data.model.LocationTwoModel> LocationTwoVMLocationTwoModel, int fieldId) {
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
        java.lang.String locationTwoVMLocationTwoModelTxtDescription = null;
        com.foo.app.modules.locationtwo.data.model.LocationTwoModel locationTwoVMLocationTwoModelGetValue = null;
        java.lang.String locationTwoVMLocationTwoModelTxtNhv = null;
        java.lang.String locationTwoVMLocationTwoModelTxt0800113013 = null;
        java.lang.String locationTwoVMLocationTwoModelTxtBotngHNi = null;
        java.lang.String locationTwoVMLocationTwoModelEtTmkimValue = null;
        com.foo.app.modules.locationtwo.data.viewmodel.LocationTwoVM locationTwoVM = mLocationTwoVM;
        java.lang.String locationTwoVMLocationTwoModelTxtMrng = null;
        java.lang.String locationTwoVMLocationTwoModelTxtTmkimOne = null;
        java.lang.String locationTwoVMLocationTwoModelTxtTrangch = null;
        java.lang.String locationTwoVMLocationTwoModelTxtN = null;
        java.lang.String locationTwoVMLocationTwoModelTxtPhmHngMT = null;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.locationtwo.data.model.LocationTwoModel> locationTwoVMLocationTwoModel = null;
        java.lang.String locationTwoVMLocationTwoModelTxtFiveHundred = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (locationTwoVM != null) {
                    // read locationTwoVM.locationTwoModel
                    locationTwoVMLocationTwoModel = locationTwoVM.getLocationTwoModel();
                }
                updateLiveDataRegistration(0, locationTwoVMLocationTwoModel);


                if (locationTwoVMLocationTwoModel != null) {
                    // read locationTwoVM.locationTwoModel.getValue()
                    locationTwoVMLocationTwoModelGetValue = locationTwoVMLocationTwoModel.getValue();
                }


                if (locationTwoVMLocationTwoModelGetValue != null) {
                    // read locationTwoVM.locationTwoModel.getValue().txtDescription
                    locationTwoVMLocationTwoModelTxtDescription = locationTwoVMLocationTwoModelGetValue.getTxtDescription();
                    // read locationTwoVM.locationTwoModel.getValue().txtNhv
                    locationTwoVMLocationTwoModelTxtNhv = locationTwoVMLocationTwoModelGetValue.getTxtNhv();
                    // read locationTwoVM.locationTwoModel.getValue().txt0800113013
                    locationTwoVMLocationTwoModelTxt0800113013 = locationTwoVMLocationTwoModelGetValue.getTxt0800113013();
                    // read locationTwoVM.locationTwoModel.getValue().txtBotngHNi
                    locationTwoVMLocationTwoModelTxtBotngHNi = locationTwoVMLocationTwoModelGetValue.getTxtBotngHNi();
                    // read locationTwoVM.locationTwoModel.getValue().etTmkimValue
                    locationTwoVMLocationTwoModelEtTmkimValue = locationTwoVMLocationTwoModelGetValue.getEtTmkimValue();
                    // read locationTwoVM.locationTwoModel.getValue().txtMrng
                    locationTwoVMLocationTwoModelTxtMrng = locationTwoVMLocationTwoModelGetValue.getTxtMrng();
                    // read locationTwoVM.locationTwoModel.getValue().txtTmkimOne
                    locationTwoVMLocationTwoModelTxtTmkimOne = locationTwoVMLocationTwoModelGetValue.getTxtTmkimOne();
                    // read locationTwoVM.locationTwoModel.getValue().txtTrangch
                    locationTwoVMLocationTwoModelTxtTrangch = locationTwoVMLocationTwoModelGetValue.getTxtTrangch();
                    // read locationTwoVM.locationTwoModel.getValue().txtN
                    locationTwoVMLocationTwoModelTxtN = locationTwoVMLocationTwoModelGetValue.getTxtN();
                    // read locationTwoVM.locationTwoModel.getValue().txtPhmHngMT
                    locationTwoVMLocationTwoModelTxtPhmHngMT = locationTwoVMLocationTwoModelGetValue.getTxtPhmHngMT();
                    // read locationTwoVM.locationTwoModel.getValue().txtFiveHundred
                    locationTwoVMLocationTwoModelTxtFiveHundred = locationTwoVMLocationTwoModelGetValue.getTxtFiveHundred();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etTmkim, locationTwoVMLocationTwoModelEtTmkimValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt0800113013, locationTwoVMLocationTwoModelTxt0800113013);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBotngHNi, locationTwoVMLocationTwoModelTxtBotngHNi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescription, locationTwoVMLocationTwoModelTxtDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFiveHundred, locationTwoVMLocationTwoModelTxtFiveHundred);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMrng, locationTwoVMLocationTwoModelTxtMrng);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtN, locationTwoVMLocationTwoModelTxtN);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNhv, locationTwoVMLocationTwoModelTxtNhv);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPhmHngMT, locationTwoVMLocationTwoModelTxtPhmHngMT);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTmkimOne, locationTwoVMLocationTwoModelTxtTmkimOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTrangch, locationTwoVMLocationTwoModelTxtTrangch);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etTmkim, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etTmkimandroidTextAttrChanged);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBasemapimage, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBasemapimage.getContext(), R.drawable.img_basemapimage_489x360), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): locationTwoVM.locationTwoModel
        flag 1 (0x2L): locationTwoVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}