package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityQuizzOneBindingImpl extends ActivityQuizzOneBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearIOSStatusBar, 3);
        sViewsWithIds.put(R.id.imageMusic, 4);
        sViewsWithIds.put(R.id.imageRightSide, 5);
        sViewsWithIds.put(R.id.linearHeader, 6);
        sViewsWithIds.put(R.id.imageArrowleft, 7);
        sViewsWithIds.put(R.id.btnTnaimNyLG, 8);
        sViewsWithIds.put(R.id.linearColumniTrungMn, 9);
        sViewsWithIds.put(R.id.btniTrungMn, 10);
        sViewsWithIds.put(R.id.btnVnHiuMn, 11);
        sViewsWithIds.put(R.id.btnKhuVnCc, 12);
        sViewsWithIds.put(R.id.btnnKhiThnh, 13);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityQuizzOneBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityQuizzOneBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[12]
            , (androidx.appcompat.widget.AppCompatButton) bindings[8]
            , (androidx.appcompat.widget.AppCompatButton) bindings[11]
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            , (androidx.appcompat.widget.AppCompatButton) bindings[13]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[1]
            );
        this.imageImageTwo.setTag(null);
        this.linearQuizzOne.setTag(null);
        this.txtQuiz.setTag(null);
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
        if (BR.quizzOneVM == variableId) {
            setQuizzOneVM((com.foo.app.modules.quizzone.data.viewmodel.QuizzOneVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuizzOneVM(@Nullable com.foo.app.modules.quizzone.data.viewmodel.QuizzOneVM QuizzOneVM) {
        this.mQuizzOneVM = QuizzOneVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.quizzOneVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeQuizzOneVMQuizzOneModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.quizzone.data.model.QuizzOneModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeQuizzOneVMQuizzOneModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.quizzone.data.model.QuizzOneModel> QuizzOneVMQuizzOneModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.quizzone.data.model.QuizzOneModel> quizzOneVMQuizzOneModel = null;
        com.foo.app.modules.quizzone.data.model.QuizzOneModel quizzOneVMQuizzOneModelGetValue = null;
        java.lang.String quizzOneVMQuizzOneModelTxtQuiz = null;
        com.foo.app.modules.quizzone.data.viewmodel.QuizzOneVM quizzOneVM = mQuizzOneVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (quizzOneVM != null) {
                    // read quizzOneVM.quizzOneModel
                    quizzOneVMQuizzOneModel = quizzOneVM.getQuizzOneModel();
                }
                updateLiveDataRegistration(0, quizzOneVMQuizzOneModel);


                if (quizzOneVMQuizzOneModel != null) {
                    // read quizzOneVM.quizzOneModel.getValue()
                    quizzOneVMQuizzOneModelGetValue = quizzOneVMQuizzOneModel.getValue();
                }


                if (quizzOneVMQuizzOneModelGetValue != null) {
                    // read quizzOneVM.quizzOneModel.getValue().txtQuiz
                    quizzOneVMQuizzOneModelTxtQuiz = quizzOneVMQuizzOneModelGetValue.getTxtQuiz();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImageTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageTwo.getContext(), R.drawable.img_image2), imageImageTwo.getResources().getDimension(R.dimen._10pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtQuiz, quizzOneVMQuizzOneModelTxtQuiz);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): quizzOneVM.quizzOneModel
        flag 1 (0x2L): quizzOneVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}