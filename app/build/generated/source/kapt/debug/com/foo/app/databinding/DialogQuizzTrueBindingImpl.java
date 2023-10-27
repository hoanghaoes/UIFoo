package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogQuizzTrueBindingImpl extends DialogQuizzTrueBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnchnhXc, 3);
        sViewsWithIds.put(R.id.btnChnhXc, 4);
        sViewsWithIds.put(R.id.btnHiuTiCuTip, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogQuizzTrueBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private DialogQuizzTrueBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            );
        this.imageImageTwo.setTag(null);
        this.linearQuizztrue.setTag(null);
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
        if (BR.quizzTrueVM == variableId) {
            setQuizzTrueVM((com.foo.app.modules.quizztrue.data.viewmodel.QuizzTrueVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuizzTrueVM(@Nullable com.foo.app.modules.quizztrue.data.viewmodel.QuizzTrueVM QuizzTrueVM) {
        this.mQuizzTrueVM = QuizzTrueVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.quizzTrueVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeQuizzTrueVMQuizzTrueModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.quizztrue.data.model.QuizzTrueModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeQuizzTrueVMQuizzTrueModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.quizztrue.data.model.QuizzTrueModel> QuizzTrueVMQuizzTrueModel, int fieldId) {
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
        com.foo.app.modules.quizztrue.data.model.QuizzTrueModel quizzTrueVMQuizzTrueModelGetValue = null;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.quizztrue.data.model.QuizzTrueModel> quizzTrueVMQuizzTrueModel = null;
        com.foo.app.modules.quizztrue.data.viewmodel.QuizzTrueVM quizzTrueVM = mQuizzTrueVM;
        java.lang.String quizzTrueVMQuizzTrueModelTxtDescription = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (quizzTrueVM != null) {
                    // read quizzTrueVM.quizzTrueModel
                    quizzTrueVMQuizzTrueModel = quizzTrueVM.getQuizzTrueModel();
                }
                updateLiveDataRegistration(0, quizzTrueVMQuizzTrueModel);


                if (quizzTrueVMQuizzTrueModel != null) {
                    // read quizzTrueVM.quizzTrueModel.getValue()
                    quizzTrueVMQuizzTrueModelGetValue = quizzTrueVMQuizzTrueModel.getValue();
                }


                if (quizzTrueVMQuizzTrueModelGetValue != null) {
                    // read quizzTrueVM.quizzTrueModel.getValue().txtDescription
                    quizzTrueVMQuizzTrueModelTxtDescription = quizzTrueVMQuizzTrueModelGetValue.getTxtDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImageTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageTwo.getContext(), R.drawable.img_image2), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescription, quizzTrueVMQuizzTrueModelTxtDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): quizzTrueVM.quizzTrueModel
        flag 1 (0x2L): quizzTrueVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}