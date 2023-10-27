package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNgKOneBindingImpl extends ActivityNgKOneBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearNgkOne, 13);
        sViewsWithIds.put(R.id.frameStackellipseone, 14);
        sViewsWithIds.put(R.id.frameStackellipsethree, 15);
        sViewsWithIds.put(R.id.linearColumnngk, 16);
        sViewsWithIds.put(R.id.btnngK, 17);
        sViewsWithIds.put(R.id.linearIOSStatusBar, 18);
        sViewsWithIds.put(R.id.imageMusic, 19);
        sViewsWithIds.put(R.id.imageRightSide, 20);
        sViewsWithIds.put(R.id.frameStackellipsefour, 21);
        sViewsWithIds.put(R.id.frameStackellipsesix, 22);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etInputTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ngKOneVM.ngKOneModel.getValue().etInputTextValue
            //         is ngKOneVM.ngKOneModel.getValue().setEtInputTextValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etInputText);
            // localize variables for thread safety
            // ngKOneVM.ngKOneModel.getValue().etInputTextValue
            java.lang.String ngKOneVMNgKOneModelEtInputTextValue = null;
            // ngKOneVM.ngKOneModel != null
            boolean ngKOneVMNgKOneModelJavaLangObjectNull = false;
            // ngKOneVM
            com.foo.app.modules.ngkone.data.viewmodel.NgKOneVM ngKOneVM = mNgKOneVM;
            // ngKOneVM.ngKOneModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.ngkone.data.model.NgKOneModel> ngKOneVMNgKOneModel = null;
            // ngKOneVM.ngKOneModel.getValue() != null
            boolean ngKOneVMNgKOneModelGetValueJavaLangObjectNull = false;
            // ngKOneVM != null
            boolean ngKOneVMJavaLangObjectNull = false;
            // ngKOneVM.ngKOneModel.getValue()
            com.foo.app.modules.ngkone.data.model.NgKOneModel ngKOneVMNgKOneModelGetValue = null;



            ngKOneVMJavaLangObjectNull = (ngKOneVM) != (null);
            if (ngKOneVMJavaLangObjectNull) {


                ngKOneVMNgKOneModel = ngKOneVM.getNgKOneModel();

                ngKOneVMNgKOneModelJavaLangObjectNull = (ngKOneVMNgKOneModel) != (null);
                if (ngKOneVMNgKOneModelJavaLangObjectNull) {


                    ngKOneVMNgKOneModelGetValue = ngKOneVMNgKOneModel.getValue();

                    ngKOneVMNgKOneModelGetValueJavaLangObjectNull = (ngKOneVMNgKOneModelGetValue) != (null);
                    if (ngKOneVMNgKOneModelGetValueJavaLangObjectNull) {




                        ngKOneVMNgKOneModelGetValue.setEtInputTextValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etInputTextOneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ngKOneVM.ngKOneModel.getValue().etInputTextOneValue
            //         is ngKOneVM.ngKOneModel.getValue().setEtInputTextOneValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etInputTextOne);
            // localize variables for thread safety
            // ngKOneVM.ngKOneModel != null
            boolean ngKOneVMNgKOneModelJavaLangObjectNull = false;
            // ngKOneVM
            com.foo.app.modules.ngkone.data.viewmodel.NgKOneVM ngKOneVM = mNgKOneVM;
            // ngKOneVM.ngKOneModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.ngkone.data.model.NgKOneModel> ngKOneVMNgKOneModel = null;
            // ngKOneVM.ngKOneModel.getValue() != null
            boolean ngKOneVMNgKOneModelGetValueJavaLangObjectNull = false;
            // ngKOneVM.ngKOneModel.getValue().etInputTextOneValue
            java.lang.String ngKOneVMNgKOneModelEtInputTextOneValue = null;
            // ngKOneVM != null
            boolean ngKOneVMJavaLangObjectNull = false;
            // ngKOneVM.ngKOneModel.getValue()
            com.foo.app.modules.ngkone.data.model.NgKOneModel ngKOneVMNgKOneModelGetValue = null;



            ngKOneVMJavaLangObjectNull = (ngKOneVM) != (null);
            if (ngKOneVMJavaLangObjectNull) {


                ngKOneVMNgKOneModel = ngKOneVM.getNgKOneModel();

                ngKOneVMNgKOneModelJavaLangObjectNull = (ngKOneVMNgKOneModel) != (null);
                if (ngKOneVMNgKOneModelJavaLangObjectNull) {


                    ngKOneVMNgKOneModelGetValue = ngKOneVMNgKOneModel.getValue();

                    ngKOneVMNgKOneModelGetValueJavaLangObjectNull = (ngKOneVMNgKOneModelGetValue) != (null);
                    if (ngKOneVMNgKOneModelGetValueJavaLangObjectNull) {




                        ngKOneVMNgKOneModelGetValue.setEtInputTextOneValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etInputTextTwoandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ngKOneVM.ngKOneModel.getValue().etInputTextTwoValue
            //         is ngKOneVM.ngKOneModel.getValue().setEtInputTextTwoValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etInputTextTwo);
            // localize variables for thread safety
            // ngKOneVM.ngKOneModel != null
            boolean ngKOneVMNgKOneModelJavaLangObjectNull = false;
            // ngKOneVM
            com.foo.app.modules.ngkone.data.viewmodel.NgKOneVM ngKOneVM = mNgKOneVM;
            // ngKOneVM.ngKOneModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.ngkone.data.model.NgKOneModel> ngKOneVMNgKOneModel = null;
            // ngKOneVM.ngKOneModel.getValue().etInputTextTwoValue
            java.lang.String ngKOneVMNgKOneModelEtInputTextTwoValue = null;
            // ngKOneVM.ngKOneModel.getValue() != null
            boolean ngKOneVMNgKOneModelGetValueJavaLangObjectNull = false;
            // ngKOneVM != null
            boolean ngKOneVMJavaLangObjectNull = false;
            // ngKOneVM.ngKOneModel.getValue()
            com.foo.app.modules.ngkone.data.model.NgKOneModel ngKOneVMNgKOneModelGetValue = null;



            ngKOneVMJavaLangObjectNull = (ngKOneVM) != (null);
            if (ngKOneVMJavaLangObjectNull) {


                ngKOneVMNgKOneModel = ngKOneVM.getNgKOneModel();

                ngKOneVMNgKOneModelJavaLangObjectNull = (ngKOneVMNgKOneModel) != (null);
                if (ngKOneVMNgKOneModelJavaLangObjectNull) {


                    ngKOneVMNgKOneModelGetValue = ngKOneVMNgKOneModel.getValue();

                    ngKOneVMNgKOneModelGetValueJavaLangObjectNull = (ngKOneVMNgKOneModelGetValue) != (null);
                    if (ngKOneVMNgKOneModelGetValueJavaLangObjectNull) {




                        ngKOneVMNgKOneModelGetValue.setEtInputTextTwoValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etLanguageandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ngKOneVM.ngKOneModel.getValue().etLanguageValue
            //         is ngKOneVM.ngKOneModel.getValue().setEtLanguageValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etLanguage);
            // localize variables for thread safety
            // ngKOneVM.ngKOneModel != null
            boolean ngKOneVMNgKOneModelJavaLangObjectNull = false;
            // ngKOneVM
            com.foo.app.modules.ngkone.data.viewmodel.NgKOneVM ngKOneVM = mNgKOneVM;
            // ngKOneVM.ngKOneModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.ngkone.data.model.NgKOneModel> ngKOneVMNgKOneModel = null;
            // ngKOneVM.ngKOneModel.getValue() != null
            boolean ngKOneVMNgKOneModelGetValueJavaLangObjectNull = false;
            // ngKOneVM.ngKOneModel.getValue().etLanguageValue
            java.lang.String ngKOneVMNgKOneModelEtLanguageValue = null;
            // ngKOneVM != null
            boolean ngKOneVMJavaLangObjectNull = false;
            // ngKOneVM.ngKOneModel.getValue()
            com.foo.app.modules.ngkone.data.model.NgKOneModel ngKOneVMNgKOneModelGetValue = null;



            ngKOneVMJavaLangObjectNull = (ngKOneVM) != (null);
            if (ngKOneVMJavaLangObjectNull) {


                ngKOneVMNgKOneModel = ngKOneVM.getNgKOneModel();

                ngKOneVMNgKOneModelJavaLangObjectNull = (ngKOneVMNgKOneModel) != (null);
                if (ngKOneVMNgKOneModelJavaLangObjectNull) {


                    ngKOneVMNgKOneModelGetValue = ngKOneVMNgKOneModel.getValue();

                    ngKOneVMNgKOneModelGetValueJavaLangObjectNull = (ngKOneVMNgKOneModelGetValue) != (null);
                    if (ngKOneVMNgKOneModelGetValueJavaLangObjectNull) {




                        ngKOneVMNgKOneModelGetValue.setEtLanguageValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityNgKOneBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private ActivityNgKOneBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[17]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[6]
            , (android.widget.FrameLayout) bindings[21]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.FrameLayout) bindings[22]
            , (android.widget.FrameLayout) bindings[15]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            );
        this.etInputText.setTag(null);
        this.etInputTextOne.setTag(null);
        this.etInputTextTwo.setTag(null);
        this.etLanguage.setTag(null);
        this.imageEllipseFive.setTag(null);
        this.imageEllipseFour.setTag(null);
        this.imageEllipseOne.setTag(null);
        this.imageEllipseSix.setTag(null);
        this.imageEllipseThree.setTag(null);
        this.imageEllipseTwo.setTag(null);
        this.linearColumnellipseone.setTag(null);
        this.txtBnctik.setTag(null);
        this.txtNgk.setTag(null);
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
        if (BR.ngKOneVM == variableId) {
            setNgKOneVM((com.foo.app.modules.ngkone.data.viewmodel.NgKOneVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNgKOneVM(@Nullable com.foo.app.modules.ngkone.data.viewmodel.NgKOneVM NgKOneVM) {
        this.mNgKOneVM = NgKOneVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ngKOneVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeNgKOneVMNgKOneModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.ngkone.data.model.NgKOneModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeNgKOneVMNgKOneModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.ngkone.data.model.NgKOneModel> NgKOneVMNgKOneModel, int fieldId) {
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
        java.lang.String ngKOneVMNgKOneModelEtInputTextOneValue = null;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.ngkone.data.model.NgKOneModel> ngKOneVMNgKOneModel = null;
        java.lang.String ngKOneVMNgKOneModelEtLanguageValue = null;
        java.lang.String ngKOneVMNgKOneModelEtInputTextTwoValue = null;
        com.foo.app.modules.ngkone.data.model.NgKOneModel ngKOneVMNgKOneModelGetValue = null;
        java.lang.String ngKOneVMNgKOneModelEtInputTextValue = null;
        com.foo.app.modules.ngkone.data.viewmodel.NgKOneVM ngKOneVM = mNgKOneVM;
        java.lang.String ngKOneVMNgKOneModelTxtBnctik = null;
        java.lang.String ngKOneVMNgKOneModelTxtNgk = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (ngKOneVM != null) {
                    // read ngKOneVM.ngKOneModel
                    ngKOneVMNgKOneModel = ngKOneVM.getNgKOneModel();
                }
                updateLiveDataRegistration(0, ngKOneVMNgKOneModel);


                if (ngKOneVMNgKOneModel != null) {
                    // read ngKOneVM.ngKOneModel.getValue()
                    ngKOneVMNgKOneModelGetValue = ngKOneVMNgKOneModel.getValue();
                }


                if (ngKOneVMNgKOneModelGetValue != null) {
                    // read ngKOneVM.ngKOneModel.getValue().etInputTextOneValue
                    ngKOneVMNgKOneModelEtInputTextOneValue = ngKOneVMNgKOneModelGetValue.getEtInputTextOneValue();
                    // read ngKOneVM.ngKOneModel.getValue().etLanguageValue
                    ngKOneVMNgKOneModelEtLanguageValue = ngKOneVMNgKOneModelGetValue.getEtLanguageValue();
                    // read ngKOneVM.ngKOneModel.getValue().etInputTextTwoValue
                    ngKOneVMNgKOneModelEtInputTextTwoValue = ngKOneVMNgKOneModelGetValue.getEtInputTextTwoValue();
                    // read ngKOneVM.ngKOneModel.getValue().etInputTextValue
                    ngKOneVMNgKOneModelEtInputTextValue = ngKOneVMNgKOneModelGetValue.getEtInputTextValue();
                    // read ngKOneVM.ngKOneModel.getValue().txtBnctik
                    ngKOneVMNgKOneModelTxtBnctik = ngKOneVMNgKOneModelGetValue.getTxtBnctik();
                    // read ngKOneVM.ngKOneModel.getValue().txtNgk
                    ngKOneVMNgKOneModelTxtNgk = ngKOneVMNgKOneModelGetValue.getTxtNgk();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etInputText, ngKOneVMNgKOneModelEtInputTextValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etInputTextOne, ngKOneVMNgKOneModelEtInputTextOneValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etInputTextTwo, ngKOneVMNgKOneModelEtInputTextTwoValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etLanguage, ngKOneVMNgKOneModelEtLanguageValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBnctik, ngKOneVMNgKOneModelTxtBnctik);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNgk, ngKOneVMNgKOneModelTxtNgk);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etInputText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etInputTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etInputTextOne, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etInputTextOneandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etInputTextTwo, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etInputTextTwoandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etLanguage, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etLanguageandroidTextAttrChanged);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseFive, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseFive.getContext(), R.drawable.img_ellipse5), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseFour, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseFour.getContext(), R.drawable.img_ellipse4_282x194), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseOne.getContext(), R.drawable.img_ellipse1_224x167), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseSix, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseSix.getContext(), R.drawable.img_ellipse6_361x279), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseThree, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseThree.getContext(), R.drawable.img_ellipse3_281x276), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseTwo.getContext(), R.drawable.img_ellipse2_79x60), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ngKOneVM.ngKOneModel
        flag 1 (0x2L): ngKOneVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}