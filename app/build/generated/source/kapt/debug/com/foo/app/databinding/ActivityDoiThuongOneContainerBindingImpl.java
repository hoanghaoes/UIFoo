package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDoiThuongOneContainerBindingImpl extends ActivityDoiThuongOneContainerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fragmentContainer, 6);
        sViewsWithIds.put(R.id.frameBottombar, 7);
        sViewsWithIds.put(R.id.linearRowupload, 8);
        sViewsWithIds.put(R.id.linearTrangch, 9);
        sViewsWithIds.put(R.id.imageUpload, 10);
        sViewsWithIds.put(R.id.linearTmkim, 11);
        sViewsWithIds.put(R.id.imageSearchOne, 12);
        sViewsWithIds.put(R.id.linearNhv, 13);
        sViewsWithIds.put(R.id.imageLocation, 14);
        sViewsWithIds.put(R.id.linearN, 15);
        sViewsWithIds.put(R.id.imageMail, 16);
        sViewsWithIds.put(R.id.linearThm, 17);
        sViewsWithIds.put(R.id.imageMenu, 18);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDoiThuongOneContainerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityDoiThuongOneContainerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.FrameLayout) bindings[6]
            , (android.widget.FrameLayout) bindings[7]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.linearColumnmusic.setTag(null);
        this.txtMrng.setTag(null);
        this.txtN.setTag(null);
        this.txtNhv.setTag(null);
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
        if (BR.doiThuongOneContainerVM == variableId) {
            setDoiThuongOneContainerVM((com.foo.app.modules.doithuongonecontainer.data.viewmodel.DoiThuongOneContainerVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDoiThuongOneContainerVM(@Nullable com.foo.app.modules.doithuongonecontainer.data.viewmodel.DoiThuongOneContainerVM DoiThuongOneContainerVM) {
        this.mDoiThuongOneContainerVM = DoiThuongOneContainerVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.doiThuongOneContainerVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDoiThuongOneContainerVMDoiThuongOneContainerModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.doithuongonecontainer.data.model.DoiThuongOneContainerModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDoiThuongOneContainerVMDoiThuongOneContainerModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.doithuongonecontainer.data.model.DoiThuongOneContainerModel> DoiThuongOneContainerVMDoiThuongOneContainerModel, int fieldId) {
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
        java.lang.String doiThuongOneContainerVMDoiThuongOneContainerModelTxtTmkim = null;
        java.lang.String doiThuongOneContainerVMDoiThuongOneContainerModelTxtMrng = null;
        java.lang.String doiThuongOneContainerVMDoiThuongOneContainerModelTxtNhv = null;
        com.foo.app.modules.doithuongonecontainer.data.model.DoiThuongOneContainerModel doiThuongOneContainerVMDoiThuongOneContainerModelGetValue = null;
        com.foo.app.modules.doithuongonecontainer.data.viewmodel.DoiThuongOneContainerVM doiThuongOneContainerVM = mDoiThuongOneContainerVM;
        java.lang.String doiThuongOneContainerVMDoiThuongOneContainerModelTxtTrangch = null;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.doithuongonecontainer.data.model.DoiThuongOneContainerModel> doiThuongOneContainerVMDoiThuongOneContainerModel = null;
        java.lang.String doiThuongOneContainerVMDoiThuongOneContainerModelTxtN = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (doiThuongOneContainerVM != null) {
                    // read doiThuongOneContainerVM.doiThuongOneContainerModel
                    doiThuongOneContainerVMDoiThuongOneContainerModel = doiThuongOneContainerVM.getDoiThuongOneContainerModel();
                }
                updateLiveDataRegistration(0, doiThuongOneContainerVMDoiThuongOneContainerModel);


                if (doiThuongOneContainerVMDoiThuongOneContainerModel != null) {
                    // read doiThuongOneContainerVM.doiThuongOneContainerModel.getValue()
                    doiThuongOneContainerVMDoiThuongOneContainerModelGetValue = doiThuongOneContainerVMDoiThuongOneContainerModel.getValue();
                }


                if (doiThuongOneContainerVMDoiThuongOneContainerModelGetValue != null) {
                    // read doiThuongOneContainerVM.doiThuongOneContainerModel.getValue().txtTmkim
                    doiThuongOneContainerVMDoiThuongOneContainerModelTxtTmkim = doiThuongOneContainerVMDoiThuongOneContainerModelGetValue.getTxtTmkim();
                    // read doiThuongOneContainerVM.doiThuongOneContainerModel.getValue().txtMrng
                    doiThuongOneContainerVMDoiThuongOneContainerModelTxtMrng = doiThuongOneContainerVMDoiThuongOneContainerModelGetValue.getTxtMrng();
                    // read doiThuongOneContainerVM.doiThuongOneContainerModel.getValue().txtNhv
                    doiThuongOneContainerVMDoiThuongOneContainerModelTxtNhv = doiThuongOneContainerVMDoiThuongOneContainerModelGetValue.getTxtNhv();
                    // read doiThuongOneContainerVM.doiThuongOneContainerModel.getValue().txtTrangch
                    doiThuongOneContainerVMDoiThuongOneContainerModelTxtTrangch = doiThuongOneContainerVMDoiThuongOneContainerModelGetValue.getTxtTrangch();
                    // read doiThuongOneContainerVM.doiThuongOneContainerModel.getValue().txtN
                    doiThuongOneContainerVMDoiThuongOneContainerModelTxtN = doiThuongOneContainerVMDoiThuongOneContainerModelGetValue.getTxtN();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMrng, doiThuongOneContainerVMDoiThuongOneContainerModelTxtMrng);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtN, doiThuongOneContainerVMDoiThuongOneContainerModelTxtN);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNhv, doiThuongOneContainerVMDoiThuongOneContainerModelTxtNhv);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTmkim, doiThuongOneContainerVMDoiThuongOneContainerModelTxtTmkim);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTrangch, doiThuongOneContainerVMDoiThuongOneContainerModelTxtTrangch);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): doiThuongOneContainerVM.doiThuongOneContainerModel
        flag 1 (0x2L): doiThuongOneContainerVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}