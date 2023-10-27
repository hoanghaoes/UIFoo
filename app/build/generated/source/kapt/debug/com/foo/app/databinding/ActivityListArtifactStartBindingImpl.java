package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityListArtifactStartBindingImpl extends ActivityListArtifactStartBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearIOSStatusBar, 13);
        sViewsWithIds.put(R.id.imageMusic, 14);
        sViewsWithIds.put(R.id.imageRightSide, 15);
        sViewsWithIds.put(R.id.linearHeader, 16);
        sViewsWithIds.put(R.id.btnVector, 17);
        sViewsWithIds.put(R.id.imageHome, 18);
        sViewsWithIds.put(R.id.frameStackdescription, 19);
        sViewsWithIds.put(R.id.linearColumnrectangle243, 20);
        sViewsWithIds.put(R.id.frameStackrectangle243, 21);
        sViewsWithIds.put(R.id.linearBlack, 22);
        sViewsWithIds.put(R.id.imageImageFour, 23);
        sViewsWithIds.put(R.id.linearRowrectangle246, 24);
        sViewsWithIds.put(R.id.linearRowrectangle246One, 25);
        sViewsWithIds.put(R.id.linearRowrectangle246Two, 26);
        sViewsWithIds.put(R.id.linearPopup, 27);
        sViewsWithIds.put(R.id.frameUp, 28);
        sViewsWithIds.put(R.id.linearColumnhhhbnn, 29);
        sViewsWithIds.put(R.id.btnBtu, 30);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityListArtifactStartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private ActivityListArtifactStartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[30]
            , (android.widget.ImageButton) bindings[17]
            , (android.widget.FrameLayout) bindings[19]
            , (android.widget.FrameLayout) bindings[21]
            , (android.widget.FrameLayout) bindings[28]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[3]
            );
        this.imageRectangle243.setTag(null);
        this.imageRectangle246.setTag(null);
        this.imageRectangle246One.setTag(null);
        this.imageRectangle246Two.setTag(null);
        this.imageRunOne.setTag(null);
        this.linearColumnmusic.setTag(null);
        this.txtBiatinsVn.setTag(null);
        this.txtDescription.setTag(null);
        this.txtHhhbnn.setTag(null);
        this.txtKhuVnCc.setTag(null);
        this.txtThngtin.setTag(null);
        this.txtVnMiuMn.setTag(null);
        this.txtVnmiuQucT.setTag(null);
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
        if (BR.listArtifactStartVM == variableId) {
            setListArtifactStartVM((com.foo.app.modules.listartifactstart.data.viewmodel.ListArtifactStartVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListArtifactStartVM(@Nullable com.foo.app.modules.listartifactstart.data.viewmodel.ListArtifactStartVM ListArtifactStartVM) {
        this.mListArtifactStartVM = ListArtifactStartVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listArtifactStartVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeListArtifactStartVMListArtifactStartModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.listartifactstart.data.model.ListArtifactStartModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeListArtifactStartVMListArtifactStartModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.listartifactstart.data.model.ListArtifactStartModel> ListArtifactStartVMListArtifactStartModel, int fieldId) {
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
        com.foo.app.modules.listartifactstart.data.viewmodel.ListArtifactStartVM listArtifactStartVM = mListArtifactStartVM;
        java.lang.String listArtifactStartVMListArtifactStartModelTxtBiatinsVn = null;
        java.lang.String listArtifactStartVMListArtifactStartModelTxtVnMiuMn = null;
        java.lang.String listArtifactStartVMListArtifactStartModelTxtKhuVnCc = null;
        com.foo.app.modules.listartifactstart.data.model.ListArtifactStartModel listArtifactStartVMListArtifactStartModelGetValue = null;
        java.lang.String listArtifactStartVMListArtifactStartModelTxtVnmiuQucT = null;
        java.lang.String listArtifactStartVMListArtifactStartModelTxtThngtin = null;
        java.lang.String listArtifactStartVMListArtifactStartModelTxtHhhbnn = null;
        java.lang.String listArtifactStartVMListArtifactStartModelTxtDescription = null;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.listartifactstart.data.model.ListArtifactStartModel> listArtifactStartVMListArtifactStartModel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (listArtifactStartVM != null) {
                    // read listArtifactStartVM.listArtifactStartModel
                    listArtifactStartVMListArtifactStartModel = listArtifactStartVM.getListArtifactStartModel();
                }
                updateLiveDataRegistration(0, listArtifactStartVMListArtifactStartModel);


                if (listArtifactStartVMListArtifactStartModel != null) {
                    // read listArtifactStartVM.listArtifactStartModel.getValue()
                    listArtifactStartVMListArtifactStartModelGetValue = listArtifactStartVMListArtifactStartModel.getValue();
                }


                if (listArtifactStartVMListArtifactStartModelGetValue != null) {
                    // read listArtifactStartVM.listArtifactStartModel.getValue().txtBiatinsVn
                    listArtifactStartVMListArtifactStartModelTxtBiatinsVn = listArtifactStartVMListArtifactStartModelGetValue.getTxtBiatinsVn();
                    // read listArtifactStartVM.listArtifactStartModel.getValue().txtVnMiuMn
                    listArtifactStartVMListArtifactStartModelTxtVnMiuMn = listArtifactStartVMListArtifactStartModelGetValue.getTxtVnMiuMn();
                    // read listArtifactStartVM.listArtifactStartModel.getValue().txtKhuVnCc
                    listArtifactStartVMListArtifactStartModelTxtKhuVnCc = listArtifactStartVMListArtifactStartModelGetValue.getTxtKhuVnCc();
                    // read listArtifactStartVM.listArtifactStartModel.getValue().txtVnmiuQucT
                    listArtifactStartVMListArtifactStartModelTxtVnmiuQucT = listArtifactStartVMListArtifactStartModelGetValue.getTxtVnmiuQucT();
                    // read listArtifactStartVM.listArtifactStartModel.getValue().txtThngtin
                    listArtifactStartVMListArtifactStartModelTxtThngtin = listArtifactStartVMListArtifactStartModelGetValue.getTxtThngtin();
                    // read listArtifactStartVM.listArtifactStartModel.getValue().txtHhhbnn
                    listArtifactStartVMListArtifactStartModelTxtHhhbnn = listArtifactStartVMListArtifactStartModelGetValue.getTxtHhhbnn();
                    // read listArtifactStartVM.listArtifactStartModel.getValue().txtDescription
                    listArtifactStartVMListArtifactStartModelTxtDescription = listArtifactStartVMListArtifactStartModelGetValue.getTxtDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle243, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle243.getContext(), R.drawable.img_rectangle243), imageRectangle243.getResources().getDimension(R.dimen._10pxh), (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle246, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle246.getContext(), R.drawable.img_rectangle246), imageRectangle246.getResources().getDimension(R.dimen._10pxh), (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle246One, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle246One.getContext(), R.drawable.img_rectangle246_80x80), imageRectangle246One.getResources().getDimension(R.dimen._10pxh), (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle246Two, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle246Two.getContext(), R.drawable.img_rectangle246_1), imageRectangle246Two.getResources().getDimension(R.dimen._10pxh), (boolean)false);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRunOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRunOne.getContext(), R.drawable.img_run1), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBiatinsVn, listArtifactStartVMListArtifactStartModelTxtBiatinsVn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescription, listArtifactStartVMListArtifactStartModelTxtDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtHhhbnn, listArtifactStartVMListArtifactStartModelTxtHhhbnn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKhuVnCc, listArtifactStartVMListArtifactStartModelTxtKhuVnCc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtThngtin, listArtifactStartVMListArtifactStartModelTxtThngtin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtVnMiuMn, listArtifactStartVMListArtifactStartModelTxtVnMiuMn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtVnmiuQucT, listArtifactStartVMListArtifactStartModelTxtVnmiuQucT);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): listArtifactStartVM.listArtifactStartModel
        flag 1 (0x2L): listArtifactStartVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}