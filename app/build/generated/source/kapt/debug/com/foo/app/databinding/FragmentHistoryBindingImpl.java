package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHistoryBindingImpl extends FragmentHistoryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnmusic, 5);
        sViewsWithIds.put(R.id.linearIOSStatusBar, 6);
        sViewsWithIds.put(R.id.imageMusic, 7);
        sViewsWithIds.put(R.id.imageRightSide, 8);
        sViewsWithIds.put(R.id.linearHeader, 9);
        sViewsWithIds.put(R.id.btnVector, 10);
        sViewsWithIds.put(R.id.linearRowrectangle250, 11);
        sViewsWithIds.put(R.id.linearRowzipcode, 12);
        sViewsWithIds.put(R.id.imageIcon, 13);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHistoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentHistoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[10]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.imageRectangle250.setTag(null);
        this.linearHistory.setTag(null);
        this.recyclerHistory.setTag(null);
        this.txtN.setTag(null);
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
        if (BR.historyVM == variableId) {
            setHistoryVM((com.foo.app.modules.history.data.viewmodel.HistoryVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHistoryVM(@Nullable com.foo.app.modules.history.data.viewmodel.HistoryVM HistoryVM) {
        this.mHistoryVM = HistoryVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.historyVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHistoryVMHistoryModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.history.data.model.HistoryModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHistoryVMHistoryModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.history.data.model.HistoryModel> HistoryVMHistoryModel, int fieldId) {
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
        com.foo.app.modules.history.data.viewmodel.HistoryVM historyVM = mHistoryVM;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.history.data.model.HistoryModel> historyVMHistoryModel = null;
        com.foo.app.modules.history.data.model.HistoryModel historyVMHistoryModelGetValue = null;
        java.lang.String historyVMHistoryModelTxtZipcode = null;
        java.lang.String historyVMHistoryModelTxtN = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (historyVM != null) {
                    // read historyVM.historyModel
                    historyVMHistoryModel = historyVM.getHistoryModel();
                }
                updateLiveDataRegistration(0, historyVMHistoryModel);


                if (historyVMHistoryModel != null) {
                    // read historyVM.historyModel.getValue()
                    historyVMHistoryModelGetValue = historyVMHistoryModel.getValue();
                }


                if (historyVMHistoryModelGetValue != null) {
                    // read historyVM.historyModel.getValue().txtZipcode
                    historyVMHistoryModelTxtZipcode = historyVMHistoryModelGetValue.getTxtZipcode();
                    // read historyVM.historyModel.getValue().txtN
                    historyVMHistoryModelTxtN = historyVMHistoryModelGetValue.getTxtN();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle250, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle250.getContext(), R.drawable.img_rectangle250), (float)0f, (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerHistory, recyclerHistory.getResources().getDimension(R.dimen._19pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtN, historyVMHistoryModelTxtN);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtZipcode, historyVMHistoryModelTxtZipcode);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): historyVM.historyModel
        flag 1 (0x2L): historyVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}