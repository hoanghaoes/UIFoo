package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDoiThuongOneBindingImpl extends FragmentDoiThuongOneBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearDoithuongOne, 5);
        sViewsWithIds.put(R.id.linearIOSStatusBar, 6);
        sViewsWithIds.put(R.id.imageMusic, 7);
        sViewsWithIds.put(R.id.imageRightSide, 8);
        sViewsWithIds.put(R.id.linearHeader, 9);
        sViewsWithIds.put(R.id.imageArrowleft, 10);
        sViewsWithIds.put(R.id.linearContainer, 11);
        sViewsWithIds.put(R.id.frameHeader, 12);
        sViewsWithIds.put(R.id.viewRectangle247, 13);
        sViewsWithIds.put(R.id.imageSearch, 14);
        sViewsWithIds.put(R.id.linearRow, 15);
        sViewsWithIds.put(R.id.linearRowzipcode, 16);
        sViewsWithIds.put(R.id.imageIcon, 17);
        sViewsWithIds.put(R.id.linearRowqui, 18);
        sViewsWithIds.put(R.id.imageComputer, 19);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDoiThuongOneBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentDoiThuongOneBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.FrameLayout) bindings[12]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[13]
            );
        this.linearColumnmusic.setTag(null);
        this.recyclerGifts.setTag(null);
        this.txtIthng.setTag(null);
        this.txtQui.setTag(null);
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
        if (BR.doiThuongOneVM == variableId) {
            setDoiThuongOneVM((com.foo.app.modules.doithuongone.data.viewmodel.DoiThuongOneVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDoiThuongOneVM(@Nullable com.foo.app.modules.doithuongone.data.viewmodel.DoiThuongOneVM DoiThuongOneVM) {
        this.mDoiThuongOneVM = DoiThuongOneVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.doiThuongOneVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDoiThuongOneVMDoiThuongOneModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.doithuongone.data.model.DoiThuongOneModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDoiThuongOneVMDoiThuongOneModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.doithuongone.data.model.DoiThuongOneModel> DoiThuongOneVMDoiThuongOneModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.doithuongone.data.model.DoiThuongOneModel> doiThuongOneVMDoiThuongOneModel = null;
        java.lang.String doiThuongOneVMDoiThuongOneModelTxtIthng = null;
        com.foo.app.modules.doithuongone.data.viewmodel.DoiThuongOneVM doiThuongOneVM = mDoiThuongOneVM;
        java.lang.String doiThuongOneVMDoiThuongOneModelTxtZipcode = null;
        com.foo.app.modules.doithuongone.data.model.DoiThuongOneModel doiThuongOneVMDoiThuongOneModelGetValue = null;
        java.lang.String doiThuongOneVMDoiThuongOneModelTxtQui = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (doiThuongOneVM != null) {
                    // read doiThuongOneVM.doiThuongOneModel
                    doiThuongOneVMDoiThuongOneModel = doiThuongOneVM.getDoiThuongOneModel();
                }
                updateLiveDataRegistration(0, doiThuongOneVMDoiThuongOneModel);


                if (doiThuongOneVMDoiThuongOneModel != null) {
                    // read doiThuongOneVM.doiThuongOneModel.getValue()
                    doiThuongOneVMDoiThuongOneModelGetValue = doiThuongOneVMDoiThuongOneModel.getValue();
                }


                if (doiThuongOneVMDoiThuongOneModelGetValue != null) {
                    // read doiThuongOneVM.doiThuongOneModel.getValue().txtIthng
                    doiThuongOneVMDoiThuongOneModelTxtIthng = doiThuongOneVMDoiThuongOneModelGetValue.getTxtIthng();
                    // read doiThuongOneVM.doiThuongOneModel.getValue().txtZipcode
                    doiThuongOneVMDoiThuongOneModelTxtZipcode = doiThuongOneVMDoiThuongOneModelGetValue.getTxtZipcode();
                    // read doiThuongOneVM.doiThuongOneModel.getValue().txtQui
                    doiThuongOneVMDoiThuongOneModelTxtQui = doiThuongOneVMDoiThuongOneModelGetValue.getTxtQui();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerGifts, recyclerGifts.getResources().getDimension(R.dimen._11pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtIthng, doiThuongOneVMDoiThuongOneModelTxtIthng);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtQui, doiThuongOneVMDoiThuongOneModelTxtQui);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtZipcode, doiThuongOneVMDoiThuongOneModelTxtZipcode);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): doiThuongOneVM.doiThuongOneModel
        flag 1 (0x2L): doiThuongOneVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}