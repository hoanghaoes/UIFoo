package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLocationOneBindingImpl extends FragmentLocationOneBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frameStackmusic, 3);
        sViewsWithIds.put(R.id.linearColumnupload, 4);
        sViewsWithIds.put(R.id.linearColumnmusic, 5);
        sViewsWithIds.put(R.id.linearIOSStatusBar, 6);
        sViewsWithIds.put(R.id.imageMusic, 7);
        sViewsWithIds.put(R.id.imageRightSide, 8);
        sViewsWithIds.put(R.id.imageStar, 9);
        sViewsWithIds.put(R.id.imageIcon, 10);
        sViewsWithIds.put(R.id.floatingBtnFloatingactionbutton, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etTmkimandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of locationOneVM.locationOneModel.getValue().etTmkimValue
            //         is locationOneVM.locationOneModel.getValue().setEtTmkimValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etTmkim);
            // localize variables for thread safety
            // locationOneVM
            com.foo.app.modules.locationone.data.viewmodel.LocationOneVM locationOneVM = mLocationOneVM;
            // locationOneVM.locationOneModel.getValue().etTmkimValue
            java.lang.String locationOneVMLocationOneModelEtTmkimValue = null;
            // locationOneVM != null
            boolean locationOneVMJavaLangObjectNull = false;
            // locationOneVM.locationOneModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.locationone.data.model.LocationOneModel> locationOneVMLocationOneModel = null;
            // locationOneVM.locationOneModel.getValue() != null
            boolean locationOneVMLocationOneModelGetValueJavaLangObjectNull = false;
            // locationOneVM.locationOneModel != null
            boolean locationOneVMLocationOneModelJavaLangObjectNull = false;
            // locationOneVM.locationOneModel.getValue()
            com.foo.app.modules.locationone.data.model.LocationOneModel locationOneVMLocationOneModelGetValue = null;



            locationOneVMJavaLangObjectNull = (locationOneVM) != (null);
            if (locationOneVMJavaLangObjectNull) {


                locationOneVMLocationOneModel = locationOneVM.getLocationOneModel();

                locationOneVMLocationOneModelJavaLangObjectNull = (locationOneVMLocationOneModel) != (null);
                if (locationOneVMLocationOneModelJavaLangObjectNull) {


                    locationOneVMLocationOneModelGetValue = locationOneVMLocationOneModel.getValue();

                    locationOneVMLocationOneModelGetValueJavaLangObjectNull = (locationOneVMLocationOneModelGetValue) != (null);
                    if (locationOneVMLocationOneModelGetValueJavaLangObjectNull) {




                        locationOneVMLocationOneModelGetValue.setEtTmkimValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public FragmentLocationOneBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentLocationOneBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[1]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[11]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.FrameLayout) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[6]
            );
        this.etTmkim.setTag(null);
        this.frameStack.setTag(null);
        this.imageBasemapimage.setTag(null);
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
        if (BR.locationOneVM == variableId) {
            setLocationOneVM((com.foo.app.modules.locationone.data.viewmodel.LocationOneVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLocationOneVM(@Nullable com.foo.app.modules.locationone.data.viewmodel.LocationOneVM LocationOneVM) {
        this.mLocationOneVM = LocationOneVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.locationOneVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLocationOneVMLocationOneModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.locationone.data.model.LocationOneModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLocationOneVMLocationOneModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.locationone.data.model.LocationOneModel> LocationOneVMLocationOneModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.locationone.data.model.LocationOneModel> locationOneVMLocationOneModel = null;
        com.foo.app.modules.locationone.data.model.LocationOneModel locationOneVMLocationOneModelGetValue = null;
        com.foo.app.modules.locationone.data.viewmodel.LocationOneVM locationOneVM = mLocationOneVM;
        java.lang.String locationOneVMLocationOneModelEtTmkimValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (locationOneVM != null) {
                    // read locationOneVM.locationOneModel
                    locationOneVMLocationOneModel = locationOneVM.getLocationOneModel();
                }
                updateLiveDataRegistration(0, locationOneVMLocationOneModel);


                if (locationOneVMLocationOneModel != null) {
                    // read locationOneVM.locationOneModel.getValue()
                    locationOneVMLocationOneModelGetValue = locationOneVMLocationOneModel.getValue();
                }


                if (locationOneVMLocationOneModelGetValue != null) {
                    // read locationOneVM.locationOneModel.getValue().etTmkimValue
                    locationOneVMLocationOneModelEtTmkimValue = locationOneVMLocationOneModelGetValue.getEtTmkimValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etTmkim, locationOneVMLocationOneModelEtTmkimValue);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etTmkim, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etTmkimandroidTextAttrChanged);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBasemapimage, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBasemapimage.getContext(), R.drawable.img_basemapimage), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): locationOneVM.locationOneModel
        flag 1 (0x2L): locationOneVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}