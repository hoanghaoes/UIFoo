package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowGiftsBindingImpl extends RowGiftsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearRowzipcode, 3);
        sViewsWithIds.put(R.id.imageIconOne, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowGiftsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RowGiftsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.linearGift.setTag(null);
        this.txtThViettelTwenty.setTag(null);
        this.txtZipcodeOne.setTag(null);
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
        if (BR.giftsRowModel == variableId) {
            setGiftsRowModel((com.foo.app.modules.doithuongone.data.model.GiftsRowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGiftsRowModel(@Nullable com.foo.app.modules.doithuongone.data.model.GiftsRowModel GiftsRowModel) {
        this.mGiftsRowModel = GiftsRowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.giftsRowModel);
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
        java.lang.String giftsRowModelTxtZipcodeOne = null;
        java.lang.String giftsRowModelTxtThViettelTwenty = null;
        com.foo.app.modules.doithuongone.data.model.GiftsRowModel giftsRowModel = mGiftsRowModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (giftsRowModel != null) {
                    // read giftsRowModel.txtZipcodeOne
                    giftsRowModelTxtZipcodeOne = giftsRowModel.getTxtZipcodeOne();
                    // read giftsRowModel.txtThViettelTwenty
                    giftsRowModelTxtThViettelTwenty = giftsRowModel.getTxtThViettelTwenty();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtThViettelTwenty, giftsRowModelTxtThViettelTwenty);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtZipcodeOne, giftsRowModelTxtZipcodeOne);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): giftsRowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}