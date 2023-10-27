package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogQuizzFalseBindingImpl extends DialogQuizzFalseBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnsaii, 3);
        sViewsWithIds.put(R.id.btnSaii, 4);
        sViewsWithIds.put(R.id.btnHiuTiCuTip, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogQuizzFalseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private DialogQuizzFalseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            );
        this.imageImageTwo.setTag(null);
        this.linearQuizzfalse.setTag(null);
        this.txtDescription.setTag(null);
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
        if (BR.quizzFalseVM == variableId) {
            setQuizzFalseVM((com.foo.app.modules.quizzfalse.data.viewmodel.QuizzFalseVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuizzFalseVM(@Nullable com.foo.app.modules.quizzfalse.data.viewmodel.QuizzFalseVM QuizzFalseVM) {
        this.mQuizzFalseVM = QuizzFalseVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.quizzFalseVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeQuizzFalseVMQuizzFalseModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.quizzfalse.data.model.QuizzFalseModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeQuizzFalseVMQuizzFalseModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.quizzfalse.data.model.QuizzFalseModel> QuizzFalseVMQuizzFalseModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.quizzfalse.data.model.QuizzFalseModel> quizzFalseVMQuizzFalseModel = null;
        java.lang.String quizzFalseVMQuizzFalseModelTxtDescription = null;
        com.foo.app.modules.quizzfalse.data.viewmodel.QuizzFalseVM quizzFalseVM = mQuizzFalseVM;
        com.foo.app.modules.quizzfalse.data.model.QuizzFalseModel quizzFalseVMQuizzFalseModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (quizzFalseVM != null) {
                    // read quizzFalseVM.quizzFalseModel
                    quizzFalseVMQuizzFalseModel = quizzFalseVM.getQuizzFalseModel();
                }
                updateLiveDataRegistration(0, quizzFalseVMQuizzFalseModel);


                if (quizzFalseVMQuizzFalseModel != null) {
                    // read quizzFalseVM.quizzFalseModel.getValue()
                    quizzFalseVMQuizzFalseModelGetValue = quizzFalseVMQuizzFalseModel.getValue();
                }


                if (quizzFalseVMQuizzFalseModelGetValue != null) {
                    // read quizzFalseVM.quizzFalseModel.getValue().txtDescription
                    quizzFalseVMQuizzFalseModelTxtDescription = quizzFalseVMQuizzFalseModelGetValue.getTxtDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImageTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageTwo.getContext(), R.drawable.img_image2), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescription, quizzFalseVMQuizzFalseModelTxtDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): quizzFalseVM.quizzFalseModel
        flag 1 (0x2L): quizzFalseVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}