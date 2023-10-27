package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDoiThuongBindingImpl extends ActivityDoiThuongBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearIOSStatusBar, 11);
        sViewsWithIds.put(R.id.imageMusic, 12);
        sViewsWithIds.put(R.id.imageRightSide, 13);
        sViewsWithIds.put(R.id.linearHeader, 14);
        sViewsWithIds.put(R.id.imageArrowleft, 15);
        sViewsWithIds.put(R.id.linearHead, 16);
        sViewsWithIds.put(R.id.linearRowqui, 17);
        sViewsWithIds.put(R.id.imageCalendar, 18);
        sViewsWithIds.put(R.id.linearRowzipcode, 19);
        sViewsWithIds.put(R.id.imageIcon, 20);
        sViewsWithIds.put(R.id.linearRowthvietteltwenty, 21);
        sViewsWithIds.put(R.id.frameStackarrowup, 22);
        sViewsWithIds.put(R.id.imageArrowup, 23);
        sViewsWithIds.put(R.id.linearRowiconOne, 24);
        sViewsWithIds.put(R.id.linearColumnlanguage, 25);
        sViewsWithIds.put(R.id.linearRowlanguage, 26);
        sViewsWithIds.put(R.id.linearRowmth, 27);
        sViewsWithIds.put(R.id.imageIconOne, 28);
        sViewsWithIds.put(R.id.linearRowmomo20000, 29);
        sViewsWithIds.put(R.id.frameStackarrowupOne, 30);
        sViewsWithIds.put(R.id.imageArrowupOne, 31);
        sViewsWithIds.put(R.id.linearRowframeseven, 32);
        sViewsWithIds.put(R.id.imageArrowright, 33);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etFrameSevenandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of doiThuongVM.doiThuongModel.getValue().etFrameSevenValue
            //         is doiThuongVM.doiThuongModel.getValue().setEtFrameSevenValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etFrameSeven);
            // localize variables for thread safety
            // doiThuongVM.doiThuongModel.getValue().etFrameSevenValue
            java.lang.String doiThuongVMDoiThuongModelEtFrameSevenValue = null;
            // doiThuongVM != null
            boolean doiThuongVMJavaLangObjectNull = false;
            // doiThuongVM
            com.foo.app.modules.doithuong.data.viewmodel.DoiThuongVM doiThuongVM = mDoiThuongVM;
            // doiThuongVM.doiThuongModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.doithuong.data.model.DoiThuongModel> doiThuongVMDoiThuongModel = null;
            // doiThuongVM.doiThuongModel.getValue()
            com.foo.app.modules.doithuong.data.model.DoiThuongModel doiThuongVMDoiThuongModelGetValue = null;
            // doiThuongVM.doiThuongModel != null
            boolean doiThuongVMDoiThuongModelJavaLangObjectNull = false;
            // doiThuongVM.doiThuongModel.getValue() != null
            boolean doiThuongVMDoiThuongModelGetValueJavaLangObjectNull = false;



            doiThuongVMJavaLangObjectNull = (doiThuongVM) != (null);
            if (doiThuongVMJavaLangObjectNull) {


                doiThuongVMDoiThuongModel = doiThuongVM.getDoiThuongModel();

                doiThuongVMDoiThuongModelJavaLangObjectNull = (doiThuongVMDoiThuongModel) != (null);
                if (doiThuongVMDoiThuongModelJavaLangObjectNull) {


                    doiThuongVMDoiThuongModelGetValue = doiThuongVMDoiThuongModel.getValue();

                    doiThuongVMDoiThuongModelGetValueJavaLangObjectNull = (doiThuongVMDoiThuongModelGetValue) != (null);
                    if (doiThuongVMDoiThuongModelGetValueJavaLangObjectNull) {




                        doiThuongVMDoiThuongModelGetValue.setEtFrameSevenValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityDoiThuongBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 34, sIncludes, sViewsWithIds));
    }
    private ActivityDoiThuongBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[10]
            , (android.widget.FrameLayout) bindings[22]
            , (android.widget.FrameLayout) bindings[30]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[33]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[31]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.etFrameSeven.setTag(null);
        this.linearDoithuong.setTag(null);
        this.txt4522330866328.setTag(null);
        this.txt53835832354.setTag(null);
        this.txtIthng.setTag(null);
        this.txtLanguage.setTag(null);
        this.txtMomo20000.setTag(null);
        this.txtMth.setTag(null);
        this.txtQui.setTag(null);
        this.txtThViettelTwenty.setTag(null);
        this.txtZipcode.setTag(null);
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
        if (BR.doiThuongVM == variableId) {
            setDoiThuongVM((com.foo.app.modules.doithuong.data.viewmodel.DoiThuongVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDoiThuongVM(@Nullable com.foo.app.modules.doithuong.data.viewmodel.DoiThuongVM DoiThuongVM) {
        this.mDoiThuongVM = DoiThuongVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.doiThuongVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDoiThuongVMDoiThuongModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.doithuong.data.model.DoiThuongModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDoiThuongVMDoiThuongModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.doithuong.data.model.DoiThuongModel> DoiThuongVMDoiThuongModel, int fieldId) {
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
        java.lang.String doiThuongVMDoiThuongModelTxtMth = null;
        java.lang.String doiThuongVMDoiThuongModelTxtZipcode = null;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.doithuong.data.model.DoiThuongModel> doiThuongVMDoiThuongModel = null;
        java.lang.String doiThuongVMDoiThuongModelTxtQui = null;
        java.lang.String doiThuongVMDoiThuongModelTxt4522330866328 = null;
        java.lang.String doiThuongVMDoiThuongModelTxtIthng = null;
        java.lang.String doiThuongVMDoiThuongModelEtFrameSevenValue = null;
        com.foo.app.modules.doithuong.data.model.DoiThuongModel doiThuongVMDoiThuongModelGetValue = null;
        java.lang.String doiThuongVMDoiThuongModelTxtLanguage = null;
        java.lang.String doiThuongVMDoiThuongModelTxt53835832354 = null;
        java.lang.String doiThuongVMDoiThuongModelTxtMomo20000 = null;
        java.lang.String doiThuongVMDoiThuongModelTxtThViettelTwenty = null;
        com.foo.app.modules.doithuong.data.viewmodel.DoiThuongVM doiThuongVM = mDoiThuongVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (doiThuongVM != null) {
                    // read doiThuongVM.doiThuongModel
                    doiThuongVMDoiThuongModel = doiThuongVM.getDoiThuongModel();
                }
                updateLiveDataRegistration(0, doiThuongVMDoiThuongModel);


                if (doiThuongVMDoiThuongModel != null) {
                    // read doiThuongVM.doiThuongModel.getValue()
                    doiThuongVMDoiThuongModelGetValue = doiThuongVMDoiThuongModel.getValue();
                }


                if (doiThuongVMDoiThuongModelGetValue != null) {
                    // read doiThuongVM.doiThuongModel.getValue().txtMth
                    doiThuongVMDoiThuongModelTxtMth = doiThuongVMDoiThuongModelGetValue.getTxtMth();
                    // read doiThuongVM.doiThuongModel.getValue().txtZipcode
                    doiThuongVMDoiThuongModelTxtZipcode = doiThuongVMDoiThuongModelGetValue.getTxtZipcode();
                    // read doiThuongVM.doiThuongModel.getValue().txtQui
                    doiThuongVMDoiThuongModelTxtQui = doiThuongVMDoiThuongModelGetValue.getTxtQui();
                    // read doiThuongVM.doiThuongModel.getValue().txt4522330866328
                    doiThuongVMDoiThuongModelTxt4522330866328 = doiThuongVMDoiThuongModelGetValue.getTxt4522330866328();
                    // read doiThuongVM.doiThuongModel.getValue().txtIthng
                    doiThuongVMDoiThuongModelTxtIthng = doiThuongVMDoiThuongModelGetValue.getTxtIthng();
                    // read doiThuongVM.doiThuongModel.getValue().etFrameSevenValue
                    doiThuongVMDoiThuongModelEtFrameSevenValue = doiThuongVMDoiThuongModelGetValue.getEtFrameSevenValue();
                    // read doiThuongVM.doiThuongModel.getValue().txtLanguage
                    doiThuongVMDoiThuongModelTxtLanguage = doiThuongVMDoiThuongModelGetValue.getTxtLanguage();
                    // read doiThuongVM.doiThuongModel.getValue().txt53835832354
                    doiThuongVMDoiThuongModelTxt53835832354 = doiThuongVMDoiThuongModelGetValue.getTxt53835832354();
                    // read doiThuongVM.doiThuongModel.getValue().txtMomo20000
                    doiThuongVMDoiThuongModelTxtMomo20000 = doiThuongVMDoiThuongModelGetValue.getTxtMomo20000();
                    // read doiThuongVM.doiThuongModel.getValue().txtThViettelTwenty
                    doiThuongVMDoiThuongModelTxtThViettelTwenty = doiThuongVMDoiThuongModelGetValue.getTxtThViettelTwenty();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etFrameSeven, doiThuongVMDoiThuongModelEtFrameSevenValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt4522330866328, doiThuongVMDoiThuongModelTxt4522330866328);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt53835832354, doiThuongVMDoiThuongModelTxt53835832354);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtIthng, doiThuongVMDoiThuongModelTxtIthng);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLanguage, doiThuongVMDoiThuongModelTxtLanguage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMomo20000, doiThuongVMDoiThuongModelTxtMomo20000);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMth, doiThuongVMDoiThuongModelTxtMth);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtQui, doiThuongVMDoiThuongModelTxtQui);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtThViettelTwenty, doiThuongVMDoiThuongModelTxtThViettelTwenty);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtZipcode, doiThuongVMDoiThuongModelTxtZipcode);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etFrameSeven, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etFrameSevenandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): doiThuongVM.doiThuongModel
        flag 1 (0x2L): doiThuongVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}