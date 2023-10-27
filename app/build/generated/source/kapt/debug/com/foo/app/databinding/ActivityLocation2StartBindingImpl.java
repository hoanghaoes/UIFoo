package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLocation2StartBindingImpl extends ActivityLocation2StartBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frameStackrectanglethree, 15);
        sViewsWithIds.put(R.id.frameStackmusic, 16);
        sViewsWithIds.put(R.id.linearColumnmusic, 17);
        sViewsWithIds.put(R.id.linearIOSStatusBar, 18);
        sViewsWithIds.put(R.id.imageMusic, 19);
        sViewsWithIds.put(R.id.imageRightSide, 20);
        sViewsWithIds.put(R.id.frameStackicon, 21);
        sViewsWithIds.put(R.id.imageIcon, 22);
        sViewsWithIds.put(R.id.imageIconOne, 23);
        sViewsWithIds.put(R.id.imageStar, 24);
        sViewsWithIds.put(R.id.linearColumnrectanglethree, 25);
        sViewsWithIds.put(R.id.viewRectangleThree, 26);
        sViewsWithIds.put(R.id.linearRowbotnghni, 27);
        sViewsWithIds.put(R.id.linearColumniconTwo, 28);
        sViewsWithIds.put(R.id.imageIconTwo, 29);
        sViewsWithIds.put(R.id.imageIconThree, 30);
        sViewsWithIds.put(R.id.linearColumnkhmPh, 31);
        sViewsWithIds.put(R.id.btnKhmPh, 32);
        sViewsWithIds.put(R.id.frameUp, 33);
        sViewsWithIds.put(R.id.linearColumnhhhbnn, 34);
        sViewsWithIds.put(R.id.btnBtu, 35);
        sViewsWithIds.put(R.id.frameBottombar, 36);
        sViewsWithIds.put(R.id.linearRowupload, 37);
        sViewsWithIds.put(R.id.linearTrangch, 38);
        sViewsWithIds.put(R.id.imageUpload, 39);
        sViewsWithIds.put(R.id.linearTmkim, 40);
        sViewsWithIds.put(R.id.imageSearch, 41);
        sViewsWithIds.put(R.id.frameStacklocation, 42);
        sViewsWithIds.put(R.id.linearNhv, 43);
        sViewsWithIds.put(R.id.imageLocation, 44);
        sViewsWithIds.put(R.id.viewRectangle241, 45);
        sViewsWithIds.put(R.id.linearN, 46);
        sViewsWithIds.put(R.id.imageMail, 47);
        sViewsWithIds.put(R.id.linearThm, 48);
        sViewsWithIds.put(R.id.imageMenu, 49);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etTmkimandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of location2StartVM.location2StartModel.getValue().etTmkimValue
            //         is location2StartVM.location2StartModel.getValue().setEtTmkimValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etTmkim);
            // localize variables for thread safety
            // location2StartVM.location2StartModel.getValue()
            com.foo.app.modules.location2start.data.model.Location2StartModel location2StartVMLocation2StartModelGetValue = null;
            // location2StartVM.location2StartModel.getValue().etTmkimValue
            java.lang.String location2StartVMLocation2StartModelEtTmkimValue = null;
            // location2StartVM != null
            boolean location2StartVMJavaLangObjectNull = false;
            // location2StartVM
            com.foo.app.modules.location2start.data.viewmodel.Location2StartVM location2StartVM = mLocation2StartVM;
            // location2StartVM.location2StartModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.location2start.data.model.Location2StartModel> location2StartVMLocation2StartModel = null;
            // location2StartVM.location2StartModel != null
            boolean location2StartVMLocation2StartModelJavaLangObjectNull = false;
            // location2StartVM.location2StartModel.getValue() != null
            boolean location2StartVMLocation2StartModelGetValueJavaLangObjectNull = false;



            location2StartVMJavaLangObjectNull = (location2StartVM) != (null);
            if (location2StartVMJavaLangObjectNull) {


                location2StartVMLocation2StartModel = location2StartVM.getLocation2StartModel();

                location2StartVMLocation2StartModelJavaLangObjectNull = (location2StartVMLocation2StartModel) != (null);
                if (location2StartVMLocation2StartModelJavaLangObjectNull) {


                    location2StartVMLocation2StartModelGetValue = location2StartVMLocation2StartModel.getValue();

                    location2StartVMLocation2StartModelGetValueJavaLangObjectNull = (location2StartVMLocation2StartModelGetValue) != (null);
                    if (location2StartVMLocation2StartModelGetValueJavaLangObjectNull) {




                        location2StartVMLocation2StartModelGetValue.setEtTmkimValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityLocation2StartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 50, sIncludes, sViewsWithIds));
    }
    private ActivityLocation2StartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[35]
            , (androidx.appcompat.widget.AppCompatButton) bindings[32]
            , (android.widget.EditText) bindings[2]
            , (android.widget.FrameLayout) bindings[36]
            , (android.widget.FrameLayout) bindings[21]
            , (android.widget.FrameLayout) bindings[42]
            , (android.widget.FrameLayout) bindings[16]
            , (android.widget.FrameLayout) bindings[15]
            , (android.widget.FrameLayout) bindings[33]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[44]
            , (android.widget.ImageView) bindings[47]
            , (android.widget.ImageView) bindings[49]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[41]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[39]
            , (android.widget.LinearLayout) bindings[34]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[46]
            , (android.widget.LinearLayout) bindings[43]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[37]
            , (android.widget.LinearLayout) bindings[48]
            , (android.widget.LinearLayout) bindings[40]
            , (android.widget.LinearLayout) bindings[38]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.view.View) bindings[45]
            , (android.view.View) bindings[26]
            );
        this.etTmkim.setTag(null);
        this.imageBasemapimage.setTag(null);
        this.imageRunOne.setTag(null);
        this.linearColumnrunone.setTag(null);
        this.txt0800113013.setTag(null);
        this.txtBotngHNi.setTag(null);
        this.txtDescription.setTag(null);
        this.txtFiveHundred.setTag(null);
        this.txtHhhbnn.setTag(null);
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
        if (BR.location2StartVM == variableId) {
            setLocation2StartVM((com.foo.app.modules.location2start.data.viewmodel.Location2StartVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLocation2StartVM(@Nullable com.foo.app.modules.location2start.data.viewmodel.Location2StartVM Location2StartVM) {
        this.mLocation2StartVM = Location2StartVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.location2StartVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLocation2StartVMLocation2StartModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.location2start.data.model.Location2StartModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLocation2StartVMLocation2StartModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.location2start.data.model.Location2StartModel> Location2StartVMLocation2StartModel, int fieldId) {
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
        java.lang.String location2StartVMLocation2StartModelTxtHhhbnn = null;
        java.lang.String location2StartVMLocation2StartModelEtTmkimValue = null;
        java.lang.String location2StartVMLocation2StartModelTxtDescription = null;
        java.lang.String location2StartVMLocation2StartModelTxtTmkimOne = null;
        java.lang.String location2StartVMLocation2StartModelTxtMrng = null;
        java.lang.String location2StartVMLocation2StartModelTxtTrangch = null;
        java.lang.String location2StartVMLocation2StartModelTxtNhv = null;
        java.lang.String location2StartVMLocation2StartModelTxtBotngHNi = null;
        java.lang.String location2StartVMLocation2StartModelTxtN = null;
        com.foo.app.modules.location2start.data.viewmodel.Location2StartVM location2StartVM = mLocation2StartVM;
        com.foo.app.modules.location2start.data.model.Location2StartModel location2StartVMLocation2StartModelGetValue = null;
        java.lang.String location2StartVMLocation2StartModelTxtPhmHngMT = null;
        java.lang.String location2StartVMLocation2StartModelTxt0800113013 = null;
        java.lang.String location2StartVMLocation2StartModelTxtFiveHundred = null;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.location2start.data.model.Location2StartModel> location2StartVMLocation2StartModel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (location2StartVM != null) {
                    // read location2StartVM.location2StartModel
                    location2StartVMLocation2StartModel = location2StartVM.getLocation2StartModel();
                }
                updateLiveDataRegistration(0, location2StartVMLocation2StartModel);


                if (location2StartVMLocation2StartModel != null) {
                    // read location2StartVM.location2StartModel.getValue()
                    location2StartVMLocation2StartModelGetValue = location2StartVMLocation2StartModel.getValue();
                }


                if (location2StartVMLocation2StartModelGetValue != null) {
                    // read location2StartVM.location2StartModel.getValue().txtHhhbnn
                    location2StartVMLocation2StartModelTxtHhhbnn = location2StartVMLocation2StartModelGetValue.getTxtHhhbnn();
                    // read location2StartVM.location2StartModel.getValue().etTmkimValue
                    location2StartVMLocation2StartModelEtTmkimValue = location2StartVMLocation2StartModelGetValue.getEtTmkimValue();
                    // read location2StartVM.location2StartModel.getValue().txtDescription
                    location2StartVMLocation2StartModelTxtDescription = location2StartVMLocation2StartModelGetValue.getTxtDescription();
                    // read location2StartVM.location2StartModel.getValue().txtTmkimOne
                    location2StartVMLocation2StartModelTxtTmkimOne = location2StartVMLocation2StartModelGetValue.getTxtTmkimOne();
                    // read location2StartVM.location2StartModel.getValue().txtMrng
                    location2StartVMLocation2StartModelTxtMrng = location2StartVMLocation2StartModelGetValue.getTxtMrng();
                    // read location2StartVM.location2StartModel.getValue().txtTrangch
                    location2StartVMLocation2StartModelTxtTrangch = location2StartVMLocation2StartModelGetValue.getTxtTrangch();
                    // read location2StartVM.location2StartModel.getValue().txtNhv
                    location2StartVMLocation2StartModelTxtNhv = location2StartVMLocation2StartModelGetValue.getTxtNhv();
                    // read location2StartVM.location2StartModel.getValue().txtBotngHNi
                    location2StartVMLocation2StartModelTxtBotngHNi = location2StartVMLocation2StartModelGetValue.getTxtBotngHNi();
                    // read location2StartVM.location2StartModel.getValue().txtN
                    location2StartVMLocation2StartModelTxtN = location2StartVMLocation2StartModelGetValue.getTxtN();
                    // read location2StartVM.location2StartModel.getValue().txtPhmHngMT
                    location2StartVMLocation2StartModelTxtPhmHngMT = location2StartVMLocation2StartModelGetValue.getTxtPhmHngMT();
                    // read location2StartVM.location2StartModel.getValue().txt0800113013
                    location2StartVMLocation2StartModelTxt0800113013 = location2StartVMLocation2StartModelGetValue.getTxt0800113013();
                    // read location2StartVM.location2StartModel.getValue().txtFiveHundred
                    location2StartVMLocation2StartModelTxtFiveHundred = location2StartVMLocation2StartModelGetValue.getTxtFiveHundred();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etTmkim, location2StartVMLocation2StartModelEtTmkimValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt0800113013, location2StartVMLocation2StartModelTxt0800113013);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBotngHNi, location2StartVMLocation2StartModelTxtBotngHNi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescription, location2StartVMLocation2StartModelTxtDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFiveHundred, location2StartVMLocation2StartModelTxtFiveHundred);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtHhhbnn, location2StartVMLocation2StartModelTxtHhhbnn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMrng, location2StartVMLocation2StartModelTxtMrng);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtN, location2StartVMLocation2StartModelTxtN);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNhv, location2StartVMLocation2StartModelTxtNhv);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPhmHngMT, location2StartVMLocation2StartModelTxtPhmHngMT);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTmkimOne, location2StartVMLocation2StartModelTxtTmkimOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTrangch, location2StartVMLocation2StartModelTxtTrangch);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etTmkim, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etTmkimandroidTextAttrChanged);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBasemapimage, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBasemapimage.getContext(), R.drawable.img_basemapimage_2), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRunOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRunOne.getContext(), R.drawable.img_run1), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): location2StartVM.location2StartModel
        flag 1 (0x2L): location2StartVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}