package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNgNhPOneBindingImpl extends ActivityNgNhPOneBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearNgnhpOne, 12);
        sViewsWithIds.put(R.id.frameStackellipseone, 13);
        sViewsWithIds.put(R.id.frameStackellipsethree, 14);
        sViewsWithIds.put(R.id.linearColumnngnhp, 15);
        sViewsWithIds.put(R.id.btnngNhp, 16);
        sViewsWithIds.put(R.id.linearIOSStatusBar, 17);
        sViewsWithIds.put(R.id.imageMusic, 18);
        sViewsWithIds.put(R.id.imageRightSide, 19);
        sViewsWithIds.put(R.id.frameStackellipsefour, 20);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etInputTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ngNhPOneVM.ngNhPOneModel.getValue().etInputTextValue
            //         is ngNhPOneVM.ngNhPOneModel.getValue().setEtInputTextValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etInputText);
            // localize variables for thread safety
            // ngNhPOneVM.ngNhPOneModel.getValue()
            com.foo.app.modules.ngnhpone.data.model.NgNhPOneModel ngNhPOneVMNgNhPOneModelGetValue = null;
            // ngNhPOneVM.ngNhPOneModel.getValue() != null
            boolean ngNhPOneVMNgNhPOneModelGetValueJavaLangObjectNull = false;
            // ngNhPOneVM.ngNhPOneModel.getValue().etInputTextValue
            java.lang.String ngNhPOneVMNgNhPOneModelEtInputTextValue = null;
            // ngNhPOneVM != null
            boolean ngNhPOneVMJavaLangObjectNull = false;
            // ngNhPOneVM.ngNhPOneModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.ngnhpone.data.model.NgNhPOneModel> ngNhPOneVMNgNhPOneModel = null;
            // ngNhPOneVM
            com.foo.app.modules.ngnhpone.data.viewmodel.NgNhPOneVM ngNhPOneVM = mNgNhPOneVM;
            // ngNhPOneVM.ngNhPOneModel != null
            boolean ngNhPOneVMNgNhPOneModelJavaLangObjectNull = false;



            ngNhPOneVMJavaLangObjectNull = (ngNhPOneVM) != (null);
            if (ngNhPOneVMJavaLangObjectNull) {


                ngNhPOneVMNgNhPOneModel = ngNhPOneVM.getNgNhPOneModel();

                ngNhPOneVMNgNhPOneModelJavaLangObjectNull = (ngNhPOneVMNgNhPOneModel) != (null);
                if (ngNhPOneVMNgNhPOneModelJavaLangObjectNull) {


                    ngNhPOneVMNgNhPOneModelGetValue = ngNhPOneVMNgNhPOneModel.getValue();

                    ngNhPOneVMNgNhPOneModelGetValueJavaLangObjectNull = (ngNhPOneVMNgNhPOneModelGetValue) != (null);
                    if (ngNhPOneVMNgNhPOneModelGetValueJavaLangObjectNull) {




                        ngNhPOneVMNgNhPOneModelGetValue.setEtInputTextValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etInputTextOneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ngNhPOneVM.ngNhPOneModel.getValue().etInputTextOneValue
            //         is ngNhPOneVM.ngNhPOneModel.getValue().setEtInputTextOneValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etInputTextOne);
            // localize variables for thread safety
            // ngNhPOneVM.ngNhPOneModel.getValue()
            com.foo.app.modules.ngnhpone.data.model.NgNhPOneModel ngNhPOneVMNgNhPOneModelGetValue = null;
            // ngNhPOneVM.ngNhPOneModel.getValue().etInputTextOneValue
            java.lang.String ngNhPOneVMNgNhPOneModelEtInputTextOneValue = null;
            // ngNhPOneVM.ngNhPOneModel.getValue() != null
            boolean ngNhPOneVMNgNhPOneModelGetValueJavaLangObjectNull = false;
            // ngNhPOneVM != null
            boolean ngNhPOneVMJavaLangObjectNull = false;
            // ngNhPOneVM.ngNhPOneModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.ngnhpone.data.model.NgNhPOneModel> ngNhPOneVMNgNhPOneModel = null;
            // ngNhPOneVM
            com.foo.app.modules.ngnhpone.data.viewmodel.NgNhPOneVM ngNhPOneVM = mNgNhPOneVM;
            // ngNhPOneVM.ngNhPOneModel != null
            boolean ngNhPOneVMNgNhPOneModelJavaLangObjectNull = false;



            ngNhPOneVMJavaLangObjectNull = (ngNhPOneVM) != (null);
            if (ngNhPOneVMJavaLangObjectNull) {


                ngNhPOneVMNgNhPOneModel = ngNhPOneVM.getNgNhPOneModel();

                ngNhPOneVMNgNhPOneModelJavaLangObjectNull = (ngNhPOneVMNgNhPOneModel) != (null);
                if (ngNhPOneVMNgNhPOneModelJavaLangObjectNull) {


                    ngNhPOneVMNgNhPOneModelGetValue = ngNhPOneVMNgNhPOneModel.getValue();

                    ngNhPOneVMNgNhPOneModelGetValueJavaLangObjectNull = (ngNhPOneVMNgNhPOneModelGetValue) != (null);
                    if (ngNhPOneVMNgNhPOneModelGetValueJavaLangObjectNull) {




                        ngNhPOneVMNgNhPOneModelGetValue.setEtInputTextOneValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityNgNhPOneBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ActivityNgNhPOneBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[16]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[6]
            , (android.widget.FrameLayout) bindings[20]
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            );
        this.etInputText.setTag(null);
        this.etInputTextOne.setTag(null);
        this.imageEllipseFour.setTag(null);
        this.imageEllipseOne.setTag(null);
        this.imageEllipseSeven.setTag(null);
        this.imageEllipseSix.setTag(null);
        this.imageEllipseThree.setTag(null);
        this.imageEllipseTwo.setTag(null);
        this.linearColumnellipseone.setTag(null);
        this.txtBnchacti.setTag(null);
        this.txtNgnhp.setTag(null);
        this.txtQunmtkhu.setTag(null);
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
        if (BR.ngNhPOneVM == variableId) {
            setNgNhPOneVM((com.foo.app.modules.ngnhpone.data.viewmodel.NgNhPOneVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNgNhPOneVM(@Nullable com.foo.app.modules.ngnhpone.data.viewmodel.NgNhPOneVM NgNhPOneVM) {
        this.mNgNhPOneVM = NgNhPOneVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ngNhPOneVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeNgNhPOneVMNgNhPOneModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.ngnhpone.data.model.NgNhPOneModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeNgNhPOneVMNgNhPOneModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.ngnhpone.data.model.NgNhPOneModel> NgNhPOneVMNgNhPOneModel, int fieldId) {
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
        java.lang.String ngNhPOneVMNgNhPOneModelTxtNgnhp = null;
        java.lang.String ngNhPOneVMNgNhPOneModelEtInputTextOneValue = null;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.ngnhpone.data.model.NgNhPOneModel> ngNhPOneVMNgNhPOneModel = null;
        java.lang.String ngNhPOneVMNgNhPOneModelTxtBnchacti = null;
        java.lang.String ngNhPOneVMNgNhPOneModelTxtQunmtkhu = null;
        java.lang.String ngNhPOneVMNgNhPOneModelEtInputTextValue = null;
        com.foo.app.modules.ngnhpone.data.viewmodel.NgNhPOneVM ngNhPOneVM = mNgNhPOneVM;
        com.foo.app.modules.ngnhpone.data.model.NgNhPOneModel ngNhPOneVMNgNhPOneModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (ngNhPOneVM != null) {
                    // read ngNhPOneVM.ngNhPOneModel
                    ngNhPOneVMNgNhPOneModel = ngNhPOneVM.getNgNhPOneModel();
                }
                updateLiveDataRegistration(0, ngNhPOneVMNgNhPOneModel);


                if (ngNhPOneVMNgNhPOneModel != null) {
                    // read ngNhPOneVM.ngNhPOneModel.getValue()
                    ngNhPOneVMNgNhPOneModelGetValue = ngNhPOneVMNgNhPOneModel.getValue();
                }


                if (ngNhPOneVMNgNhPOneModelGetValue != null) {
                    // read ngNhPOneVM.ngNhPOneModel.getValue().txtNgnhp
                    ngNhPOneVMNgNhPOneModelTxtNgnhp = ngNhPOneVMNgNhPOneModelGetValue.getTxtNgnhp();
                    // read ngNhPOneVM.ngNhPOneModel.getValue().etInputTextOneValue
                    ngNhPOneVMNgNhPOneModelEtInputTextOneValue = ngNhPOneVMNgNhPOneModelGetValue.getEtInputTextOneValue();
                    // read ngNhPOneVM.ngNhPOneModel.getValue().txtBnchacti
                    ngNhPOneVMNgNhPOneModelTxtBnchacti = ngNhPOneVMNgNhPOneModelGetValue.getTxtBnchacti();
                    // read ngNhPOneVM.ngNhPOneModel.getValue().txtQunmtkhu
                    ngNhPOneVMNgNhPOneModelTxtQunmtkhu = ngNhPOneVMNgNhPOneModelGetValue.getTxtQunmtkhu();
                    // read ngNhPOneVM.ngNhPOneModel.getValue().etInputTextValue
                    ngNhPOneVMNgNhPOneModelEtInputTextValue = ngNhPOneVMNgNhPOneModelGetValue.getEtInputTextValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etInputText, ngNhPOneVMNgNhPOneModelEtInputTextValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etInputTextOne, ngNhPOneVMNgNhPOneModelEtInputTextOneValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBnchacti, ngNhPOneVMNgNhPOneModelTxtBnchacti);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNgnhp, ngNhPOneVMNgNhPOneModelTxtNgnhp);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtQunmtkhu, ngNhPOneVMNgNhPOneModelTxtQunmtkhu);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etInputText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etInputTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etInputTextOne, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etInputTextOneandroidTextAttrChanged);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseFour, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseFour.getContext(), R.drawable.img_ellipse4), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseOne.getContext(), R.drawable.img_ellipse1), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseSeven, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseSeven.getContext(), R.drawable.img_ellipse7), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseSix, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseSix.getContext(), R.drawable.img_ellipse6), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseThree, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseThree.getContext(), R.drawable.img_ellipse3), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseTwo.getContext(), R.drawable.img_ellipse2), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ngNhPOneVM.ngNhPOneModel
        flag 1 (0x2L): ngNhPOneVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}