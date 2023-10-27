package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityArtifactInformationBindingImpl extends ActivityArtifactInformationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearIOSStatusBar, 5);
        sViewsWithIds.put(R.id.imageMusic, 6);
        sViewsWithIds.put(R.id.imageRightSide, 7);
        sViewsWithIds.put(R.id.linearHeader, 8);
        sViewsWithIds.put(R.id.btnVector, 9);
        sViewsWithIds.put(R.id.imageHome, 10);
        sViewsWithIds.put(R.id.frameImg, 11);
        sViewsWithIds.put(R.id.linearName, 12);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityArtifactInformationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityArtifactInformationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[9]
            , (android.widget.FrameLayout) bindings[11]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.imageImageTwo.setTag(null);
        this.linearArtifactinform.setTag(null);
        this.txtDescription.setTag(null);
        this.txtKhuVnCc.setTag(null);
        this.txtThngtin.setTag(null);
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
        if (BR.artifactInformationVM == variableId) {
            setArtifactInformationVM((com.foo.app.modules.artifactinformation.data.viewmodel.ArtifactInformationVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setArtifactInformationVM(@Nullable com.foo.app.modules.artifactinformation.data.viewmodel.ArtifactInformationVM ArtifactInformationVM) {
        this.mArtifactInformationVM = ArtifactInformationVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.artifactInformationVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeArtifactInformationVMArtifactInformationModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.artifactinformation.data.model.ArtifactInformationModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeArtifactInformationVMArtifactInformationModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.artifactinformation.data.model.ArtifactInformationModel> ArtifactInformationVMArtifactInformationModel, int fieldId) {
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
        java.lang.String artifactInformationVMArtifactInformationModelTxtThngtin = null;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.artifactinformation.data.model.ArtifactInformationModel> artifactInformationVMArtifactInformationModel = null;
        com.foo.app.modules.artifactinformation.data.model.ArtifactInformationModel artifactInformationVMArtifactInformationModelGetValue = null;
        java.lang.String artifactInformationVMArtifactInformationModelTxtKhuVnCc = null;
        com.foo.app.modules.artifactinformation.data.viewmodel.ArtifactInformationVM artifactInformationVM = mArtifactInformationVM;
        java.lang.String artifactInformationVMArtifactInformationModelTxtDescription = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (artifactInformationVM != null) {
                    // read artifactInformationVM.artifactInformationModel
                    artifactInformationVMArtifactInformationModel = artifactInformationVM.getArtifactInformationModel();
                }
                updateLiveDataRegistration(0, artifactInformationVMArtifactInformationModel);


                if (artifactInformationVMArtifactInformationModel != null) {
                    // read artifactInformationVM.artifactInformationModel.getValue()
                    artifactInformationVMArtifactInformationModelGetValue = artifactInformationVMArtifactInformationModel.getValue();
                }


                if (artifactInformationVMArtifactInformationModelGetValue != null) {
                    // read artifactInformationVM.artifactInformationModel.getValue().txtThngtin
                    artifactInformationVMArtifactInformationModelTxtThngtin = artifactInformationVMArtifactInformationModelGetValue.getTxtThngtin();
                    // read artifactInformationVM.artifactInformationModel.getValue().txtKhuVnCc
                    artifactInformationVMArtifactInformationModelTxtKhuVnCc = artifactInformationVMArtifactInformationModelGetValue.getTxtKhuVnCc();
                    // read artifactInformationVM.artifactInformationModel.getValue().txtDescription
                    artifactInformationVMArtifactInformationModelTxtDescription = artifactInformationVMArtifactInformationModelGetValue.getTxtDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImageTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageTwo.getContext(), R.drawable.img_image2), imageImageTwo.getResources().getDimension(R.dimen._10pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescription, artifactInformationVMArtifactInformationModelTxtDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKhuVnCc, artifactInformationVMArtifactInformationModelTxtKhuVnCc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtThngtin, artifactInformationVMArtifactInformationModelTxtThngtin);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): artifactInformationVM.artifactInformationModel
        flag 1 (0x2L): artifactInformationVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}