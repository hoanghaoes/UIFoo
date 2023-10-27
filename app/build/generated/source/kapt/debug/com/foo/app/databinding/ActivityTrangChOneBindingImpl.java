package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTrangChOneBindingImpl extends ActivityTrangChOneBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnmusic, 18);
        sViewsWithIds.put(R.id.linearTrangchOne, 19);
        sViewsWithIds.put(R.id.linearIOSStatusBar, 20);
        sViewsWithIds.put(R.id.imageMusic, 21);
        sViewsWithIds.put(R.id.imageRightSide, 22);
        sViewsWithIds.put(R.id.frameStacktmkim, 23);
        sViewsWithIds.put(R.id.linearMainbody, 24);
        sViewsWithIds.put(R.id.imageSliderSlidercthbnst, 25);
        sViewsWithIds.put(R.id.indicatorGroupEighteen, 26);
        sViewsWithIds.put(R.id.linearSkin, 27);
        sViewsWithIds.put(R.id.frameStackrectangle249, 28);
        sViewsWithIds.put(R.id.linearEven, 29);
        sViewsWithIds.put(R.id.linearEven1, 30);
        sViewsWithIds.put(R.id.linearEven2, 31);
        sViewsWithIds.put(R.id.linearXincho, 32);
        sViewsWithIds.put(R.id.imageAddressbroOne, 33);
        sViewsWithIds.put(R.id.linearHeader, 34);
        sViewsWithIds.put(R.id.frameStacknotification, 35);
        sViewsWithIds.put(R.id.imageNotification, 36);
        sViewsWithIds.put(R.id.viewEllipseSeven, 37);
        sViewsWithIds.put(R.id.frameBottombar, 38);
        sViewsWithIds.put(R.id.linearRowupload, 39);
        sViewsWithIds.put(R.id.frameTrangch, 40);
        sViewsWithIds.put(R.id.linearColumnupload, 41);
        sViewsWithIds.put(R.id.imageUpload, 42);
        sViewsWithIds.put(R.id.viewRectangle242, 43);
        sViewsWithIds.put(R.id.linearTmkim, 44);
        sViewsWithIds.put(R.id.imageSearch, 45);
        sViewsWithIds.put(R.id.linearNhv, 46);
        sViewsWithIds.put(R.id.imageLocation, 47);
        sViewsWithIds.put(R.id.linearN, 48);
        sViewsWithIds.put(R.id.imageMail, 49);
        sViewsWithIds.put(R.id.linearThm, 50);
        sViewsWithIds.put(R.id.imageMenu, 51);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etTmkimandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of trangChOneVM.trangChOneModel.getValue().etTmkimValue
            //         is trangChOneVM.trangChOneModel.getValue().setEtTmkimValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etTmkim);
            // localize variables for thread safety
            // trangChOneVM.trangChOneModel != null
            boolean trangChOneVMTrangChOneModelJavaLangObjectNull = false;
            // trangChOneVM != null
            boolean trangChOneVMJavaLangObjectNull = false;
            // trangChOneVM.trangChOneModel.getValue() != null
            boolean trangChOneVMTrangChOneModelGetValueJavaLangObjectNull = false;
            // trangChOneVM
            com.foo.app.modules.trangchone.data.viewmodel.TrangChOneVM trangChOneVM = mTrangChOneVM;
            // trangChOneVM.trangChOneModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.trangchone.data.model.TrangChOneModel> trangChOneVMTrangChOneModel = null;
            // trangChOneVM.trangChOneModel.getValue().etTmkimValue
            java.lang.String trangChOneVMTrangChOneModelEtTmkimValue = null;
            // trangChOneVM.trangChOneModel.getValue()
            com.foo.app.modules.trangchone.data.model.TrangChOneModel trangChOneVMTrangChOneModelGetValue = null;



            trangChOneVMJavaLangObjectNull = (trangChOneVM) != (null);
            if (trangChOneVMJavaLangObjectNull) {


                trangChOneVMTrangChOneModel = trangChOneVM.getTrangChOneModel();

                trangChOneVMTrangChOneModelJavaLangObjectNull = (trangChOneVMTrangChOneModel) != (null);
                if (trangChOneVMTrangChOneModelJavaLangObjectNull) {


                    trangChOneVMTrangChOneModelGetValue = trangChOneVMTrangChOneModel.getValue();

                    trangChOneVMTrangChOneModelGetValueJavaLangObjectNull = (trangChOneVMTrangChOneModelGetValue) != (null);
                    if (trangChOneVMTrangChOneModelGetValueJavaLangObjectNull) {




                        trangChOneVMTrangChOneModelGetValue.setEtTmkimValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityTrangChOneBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 52, sIncludes, sViewsWithIds));
    }
    private ActivityTrangChOneBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[2]
            , (android.widget.FrameLayout) bindings[38]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.FrameLayout) bindings[35]
            , (android.widget.FrameLayout) bindings[28]
            , (android.widget.FrameLayout) bindings[23]
            , (android.widget.FrameLayout) bindings[40]
            , (android.widget.ImageView) bindings[33]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[47]
            , (android.widget.ImageView) bindings[49]
            , (android.widget.ImageView) bindings[51]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[36]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[45]
            , (com.asksira.loopingviewpager.LoopingViewPager) bindings[25]
            , (android.widget.ImageView) bindings[42]
            , (com.asksira.loopingviewpager.indicator.CustomShapePagerIndicator) bindings[26]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[41]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[34]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[48]
            , (android.widget.LinearLayout) bindings[46]
            , (android.widget.LinearLayout) bindings[39]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[50]
            , (android.widget.LinearLayout) bindings[44]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.view.View) bindings[37]
            , (android.view.View) bindings[43]
            );
        this.etTmkim.setTag(null);
        this.frameStackgroupnineteen.setTag(null);
        this.imageGroupNineteen.setTag(null);
        this.imageRectangle249.setTag(null);
        this.imageRectangle249One.setTag(null);
        this.imageRectangle249Two.setTag(null);
        this.txtDescriptionOne.setTag(null);
        this.txtDescriptionTwo.setTag(null);
        this.txtFive.setTag(null);
        this.txtFoocation.setTag(null);
        this.txtMrng.setTag(null);
        this.txtN.setTag(null);
        this.txtNhv.setTag(null);
        this.txtSkin.setTag(null);
        this.txtTmkimOne.setTag(null);
        this.txtTnhngTh.setTag(null);
        this.txtTrangch.setTag(null);
        this.txtXinchoHuyn.setTag(null);
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
        if (BR.trangChOneVM == variableId) {
            setTrangChOneVM((com.foo.app.modules.trangchone.data.viewmodel.TrangChOneVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTrangChOneVM(@Nullable com.foo.app.modules.trangchone.data.viewmodel.TrangChOneVM TrangChOneVM) {
        this.mTrangChOneVM = TrangChOneVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.trangChOneVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTrangChOneVMTrangChOneModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.trangchone.data.model.TrangChOneModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTrangChOneVMTrangChOneModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.trangchone.data.model.TrangChOneModel> TrangChOneVMTrangChOneModel, int fieldId) {
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
        java.lang.String trangChOneVMTrangChOneModelTxtFive = null;
        java.lang.String trangChOneVMTrangChOneModelTxtTnhngTh = null;
        java.lang.String trangChOneVMTrangChOneModelTxtMrng = null;
        java.lang.String trangChOneVMTrangChOneModelTxtN = null;
        java.lang.String trangChOneVMTrangChOneModelTxtFoocation = null;
        java.lang.String trangChOneVMTrangChOneModelTxtTrangch = null;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.trangchone.data.model.TrangChOneModel> trangChOneVMTrangChOneModel = null;
        com.foo.app.modules.trangchone.data.model.TrangChOneModel trangChOneVMTrangChOneModelGetValue = null;
        java.lang.String trangChOneVMTrangChOneModelTxtXinchoHuyn = null;
        java.lang.String trangChOneVMTrangChOneModelTxtDescriptionOne = null;
        java.lang.String trangChOneVMTrangChOneModelTxtSkin = null;
        com.foo.app.modules.trangchone.data.viewmodel.TrangChOneVM trangChOneVM = mTrangChOneVM;
        java.lang.String trangChOneVMTrangChOneModelTxtNhv = null;
        java.lang.String trangChOneVMTrangChOneModelEtTmkimValue = null;
        java.lang.String trangChOneVMTrangChOneModelTxtTmkimOne = null;
        java.lang.String trangChOneVMTrangChOneModelTxtDescriptionTwo = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (trangChOneVM != null) {
                    // read trangChOneVM.trangChOneModel
                    trangChOneVMTrangChOneModel = trangChOneVM.getTrangChOneModel();
                }
                updateLiveDataRegistration(0, trangChOneVMTrangChOneModel);


                if (trangChOneVMTrangChOneModel != null) {
                    // read trangChOneVM.trangChOneModel.getValue()
                    trangChOneVMTrangChOneModelGetValue = trangChOneVMTrangChOneModel.getValue();
                }


                if (trangChOneVMTrangChOneModelGetValue != null) {
                    // read trangChOneVM.trangChOneModel.getValue().txtFive
                    trangChOneVMTrangChOneModelTxtFive = trangChOneVMTrangChOneModelGetValue.getTxtFive();
                    // read trangChOneVM.trangChOneModel.getValue().txtTnhngTh
                    trangChOneVMTrangChOneModelTxtTnhngTh = trangChOneVMTrangChOneModelGetValue.getTxtTnhngTh();
                    // read trangChOneVM.trangChOneModel.getValue().txtMrng
                    trangChOneVMTrangChOneModelTxtMrng = trangChOneVMTrangChOneModelGetValue.getTxtMrng();
                    // read trangChOneVM.trangChOneModel.getValue().txtN
                    trangChOneVMTrangChOneModelTxtN = trangChOneVMTrangChOneModelGetValue.getTxtN();
                    // read trangChOneVM.trangChOneModel.getValue().txtFoocation
                    trangChOneVMTrangChOneModelTxtFoocation = trangChOneVMTrangChOneModelGetValue.getTxtFoocation();
                    // read trangChOneVM.trangChOneModel.getValue().txtTrangch
                    trangChOneVMTrangChOneModelTxtTrangch = trangChOneVMTrangChOneModelGetValue.getTxtTrangch();
                    // read trangChOneVM.trangChOneModel.getValue().txtXinchoHuyn
                    trangChOneVMTrangChOneModelTxtXinchoHuyn = trangChOneVMTrangChOneModelGetValue.getTxtXinchoHuyn();
                    // read trangChOneVM.trangChOneModel.getValue().txtDescriptionOne
                    trangChOneVMTrangChOneModelTxtDescriptionOne = trangChOneVMTrangChOneModelGetValue.getTxtDescriptionOne();
                    // read trangChOneVM.trangChOneModel.getValue().txtSkin
                    trangChOneVMTrangChOneModelTxtSkin = trangChOneVMTrangChOneModelGetValue.getTxtSkin();
                    // read trangChOneVM.trangChOneModel.getValue().txtNhv
                    trangChOneVMTrangChOneModelTxtNhv = trangChOneVMTrangChOneModelGetValue.getTxtNhv();
                    // read trangChOneVM.trangChOneModel.getValue().etTmkimValue
                    trangChOneVMTrangChOneModelEtTmkimValue = trangChOneVMTrangChOneModelGetValue.getEtTmkimValue();
                    // read trangChOneVM.trangChOneModel.getValue().txtTmkimOne
                    trangChOneVMTrangChOneModelTxtTmkimOne = trangChOneVMTrangChOneModelGetValue.getTxtTmkimOne();
                    // read trangChOneVM.trangChOneModel.getValue().txtDescriptionTwo
                    trangChOneVMTrangChOneModelTxtDescriptionTwo = trangChOneVMTrangChOneModelGetValue.getTxtDescriptionTwo();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etTmkim, trangChOneVMTrangChOneModelEtTmkimValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescriptionOne, trangChOneVMTrangChOneModelTxtDescriptionOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescriptionTwo, trangChOneVMTrangChOneModelTxtDescriptionTwo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFive, trangChOneVMTrangChOneModelTxtFive);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFoocation, trangChOneVMTrangChOneModelTxtFoocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMrng, trangChOneVMTrangChOneModelTxtMrng);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtN, trangChOneVMTrangChOneModelTxtN);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNhv, trangChOneVMTrangChOneModelTxtNhv);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSkin, trangChOneVMTrangChOneModelTxtSkin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTmkimOne, trangChOneVMTrangChOneModelTxtTmkimOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTnhngTh, trangChOneVMTrangChOneModelTxtTnhngTh);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTrangch, trangChOneVMTrangChOneModelTxtTrangch);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtXinchoHuyn, trangChOneVMTrangChOneModelTxtXinchoHuyn);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etTmkim, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etTmkimandroidTextAttrChanged);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageGroupNineteen, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageGroupNineteen.getContext(), R.drawable.img_group19), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle249, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle249.getContext(), R.drawable.img_rectangle249), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle249One, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle249One.getContext(), R.drawable.img_rectangle249_86x90), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle249Two, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle249Two.getContext(), R.drawable.img_rectangle249_1), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): trangChOneVM.trangChOneModel
        flag 1 (0x2L): trangChOneVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}