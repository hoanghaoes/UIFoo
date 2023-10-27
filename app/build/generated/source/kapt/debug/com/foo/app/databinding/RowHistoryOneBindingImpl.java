package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowHistoryOneBindingImpl extends RowHistoryOneBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnvnmiuquct, 4);
        sViewsWithIds.put(R.id.linearButton, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowHistoryOneBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private RowHistoryOneBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.frameAddrest.setTag(null);
        this.imageRectangle246.setTag(null);
        this.txtBtu.setTag(null);
        this.txtVnmiuQuct.setTag(null);
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
        if (BR.historyOneRowModel == variableId) {
            setHistoryOneRowModel((com.foo.app.modules.historyone.data.model.HistoryOneRowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHistoryOneRowModel(@Nullable com.foo.app.modules.historyone.data.model.HistoryOneRowModel HistoryOneRowModel) {
        this.mHistoryOneRowModel = HistoryOneRowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.historyOneRowModel);
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
        java.lang.String historyOneRowModelTxtVnmiuQuct = null;
        com.foo.app.modules.historyone.data.model.HistoryOneRowModel historyOneRowModel = mHistoryOneRowModel;
        java.lang.String historyOneRowModelTxtBtu = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (historyOneRowModel != null) {
                    // read historyOneRowModel.txtVnmiuQuct
                    historyOneRowModelTxtVnmiuQuct = historyOneRowModel.getTxtVnmiuQuct();
                    // read historyOneRowModel.txtBtu
                    historyOneRowModelTxtBtu = historyOneRowModel.getTxtBtu();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle246, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle246.getContext(), R.drawable.img_rectangle246), imageRectangle246.getResources().getDimension(R.dimen._10pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBtu, historyOneRowModelTxtBtu);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtVnmiuQuct, historyOneRowModelTxtVnmiuQuct);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): historyOneRowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}