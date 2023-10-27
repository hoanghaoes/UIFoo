package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowSearchBindingImpl extends RowSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageIconFive, 2);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private RowSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[1]
            );
        this.linearRowicon.setTag(null);
        this.txtHinvt.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.searchRowModel == variableId) {
            setSearchRowModel((com.foo.app.modules.search.data.model.SearchRowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearchRowModel(@Nullable com.foo.app.modules.search.data.model.SearchRowModel SearchRowModel) {
        this.mSearchRowModel = SearchRowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.searchRowModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.foo.app.modules.search.data.model.SearchRowModel searchRowModel = mSearchRowModel;
        java.lang.String searchRowModelTxtHinvt = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (searchRowModel != null) {
                    // read searchRowModel.txtHinvt
                    searchRowModelTxtHinvt = searchRowModel.getTxtHinvt();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtHinvt, searchRowModelTxtHinvt);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): searchRowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}