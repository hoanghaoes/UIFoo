package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowHistoryBindingImpl extends RowHistoryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnvnmiuquct, 3);
        sViewsWithIds.put(R.id.btnBtu, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowHistoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RowHistoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.frameAddrest.setTag(null);
        this.imageRectangle246.setTag(null);
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
        if (BR.historyRowModel == variableId) {
            setHistoryRowModel((com.foo.app.modules.history.data.model.HistoryRowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHistoryRowModel(@Nullable com.foo.app.modules.history.data.model.HistoryRowModel HistoryRowModel) {
        this.mHistoryRowModel = HistoryRowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.historyRowModel);
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
        com.foo.app.modules.history.data.model.HistoryRowModel historyRowModel = mHistoryRowModel;
        java.lang.String historyRowModelTxtVnmiuQuct = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (historyRowModel != null) {
                    // read historyRowModel.txtVnmiuQuct
                    historyRowModelTxtVnmiuQuct = historyRowModel.getTxtVnmiuQuct();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle246, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle246.getContext(), R.drawable.img_rectangle246), imageRectangle246.getResources().getDimension(R.dimen._10pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtVnmiuQuct, historyRowModelTxtVnmiuQuct);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): historyRowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}