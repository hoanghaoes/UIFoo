package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityProfileBindingImpl extends ActivityProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frameStackmusic, 16);
        sViewsWithIds.put(R.id.linearColumnmusic, 17);
        sViewsWithIds.put(R.id.linearIOSStatusBar, 18);
        sViewsWithIds.put(R.id.imageMusic, 19);
        sViewsWithIds.put(R.id.imageRightSide, 20);
        sViewsWithIds.put(R.id.linearHeader, 21);
        sViewsWithIds.put(R.id.btnVector, 22);
        sViewsWithIds.put(R.id.linearRowtn, 23);
        sViewsWithIds.put(R.id.linearRowtnngnhp, 24);
        sViewsWithIds.put(R.id.linearRowmtkhu, 25);
        sViewsWithIds.put(R.id.linearRowemail, 26);
        sViewsWithIds.put(R.id.linearRowimthng, 27);
        sViewsWithIds.put(R.id.linearRowhng, 28);
        sViewsWithIds.put(R.id.linearRowtext, 29);
        sViewsWithIds.put(R.id.imageImageThree, 30);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etControlsTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileVM.profileModel.getValue().etControlsTextValue
            //         is profileVM.profileModel.getValue().setEtControlsTextValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etControlsText);
            // localize variables for thread safety
            // profileVM
            com.foo.app.modules.profile.data.viewmodel.ProfileVM profileVM = mProfileVM;
            // profileVM.profileModel != null
            boolean profileVMProfileModelJavaLangObjectNull = false;
            // profileVM.profileModel.getValue().etControlsTextValue
            java.lang.String profileVMProfileModelEtControlsTextValue = null;
            // profileVM.profileModel.getValue()
            com.foo.app.modules.profile.data.model.ProfileModel profileVMProfileModelGetValue = null;
            // profileVM.profileModel.getValue() != null
            boolean profileVMProfileModelGetValueJavaLangObjectNull = false;
            // profileVM.profileModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.profile.data.model.ProfileModel> profileVMProfileModel = null;
            // profileVM != null
            boolean profileVMJavaLangObjectNull = false;



            profileVMJavaLangObjectNull = (profileVM) != (null);
            if (profileVMJavaLangObjectNull) {


                profileVMProfileModel = profileVM.getProfileModel();

                profileVMProfileModelJavaLangObjectNull = (profileVMProfileModel) != (null);
                if (profileVMProfileModelJavaLangObjectNull) {


                    profileVMProfileModelGetValue = profileVMProfileModel.getValue();

                    profileVMProfileModelGetValueJavaLangObjectNull = (profileVMProfileModelGetValue) != (null);
                    if (profileVMProfileModelGetValueJavaLangObjectNull) {




                        profileVMProfileModelGetValue.setEtControlsTextValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etControlsTextOneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileVM.profileModel.getValue().etControlsTextOneValue
            //         is profileVM.profileModel.getValue().setEtControlsTextOneValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etControlsTextOne);
            // localize variables for thread safety
            // profileVM
            com.foo.app.modules.profile.data.viewmodel.ProfileVM profileVM = mProfileVM;
            // profileVM.profileModel != null
            boolean profileVMProfileModelJavaLangObjectNull = false;
            // profileVM.profileModel.getValue()
            com.foo.app.modules.profile.data.model.ProfileModel profileVMProfileModelGetValue = null;
            // profileVM.profileModel.getValue() != null
            boolean profileVMProfileModelGetValueJavaLangObjectNull = false;
            // profileVM.profileModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.profile.data.model.ProfileModel> profileVMProfileModel = null;
            // profileVM.profileModel.getValue().etControlsTextOneValue
            java.lang.String profileVMProfileModelEtControlsTextOneValue = null;
            // profileVM != null
            boolean profileVMJavaLangObjectNull = false;



            profileVMJavaLangObjectNull = (profileVM) != (null);
            if (profileVMJavaLangObjectNull) {


                profileVMProfileModel = profileVM.getProfileModel();

                profileVMProfileModelJavaLangObjectNull = (profileVMProfileModel) != (null);
                if (profileVMProfileModelJavaLangObjectNull) {


                    profileVMProfileModelGetValue = profileVMProfileModel.getValue();

                    profileVMProfileModelGetValueJavaLangObjectNull = (profileVMProfileModelGetValue) != (null);
                    if (profileVMProfileModelGetValueJavaLangObjectNull) {




                        profileVMProfileModelGetValue.setEtControlsTextOneValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etControlsTextTwoandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileVM.profileModel.getValue().etControlsTextTwoValue
            //         is profileVM.profileModel.getValue().setEtControlsTextTwoValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etControlsTextTwo);
            // localize variables for thread safety
            // profileVM
            com.foo.app.modules.profile.data.viewmodel.ProfileVM profileVM = mProfileVM;
            // profileVM.profileModel != null
            boolean profileVMProfileModelJavaLangObjectNull = false;
            // profileVM.profileModel.getValue().etControlsTextTwoValue
            java.lang.String profileVMProfileModelEtControlsTextTwoValue = null;
            // profileVM.profileModel.getValue()
            com.foo.app.modules.profile.data.model.ProfileModel profileVMProfileModelGetValue = null;
            // profileVM.profileModel.getValue() != null
            boolean profileVMProfileModelGetValueJavaLangObjectNull = false;
            // profileVM.profileModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.profile.data.model.ProfileModel> profileVMProfileModel = null;
            // profileVM != null
            boolean profileVMJavaLangObjectNull = false;



            profileVMJavaLangObjectNull = (profileVM) != (null);
            if (profileVMJavaLangObjectNull) {


                profileVMProfileModel = profileVM.getProfileModel();

                profileVMProfileModelJavaLangObjectNull = (profileVMProfileModel) != (null);
                if (profileVMProfileModelJavaLangObjectNull) {


                    profileVMProfileModelGetValue = profileVMProfileModel.getValue();

                    profileVMProfileModelGetValueJavaLangObjectNull = (profileVMProfileModelGetValue) != (null);
                    if (profileVMProfileModelGetValueJavaLangObjectNull) {




                        profileVMProfileModelGetValue.setEtControlsTextTwoValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileVM.profileModel.getValue().etPasswordValue
            //         is profileVM.profileModel.getValue().setEtPasswordValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etPassword);
            // localize variables for thread safety
            // profileVM
            com.foo.app.modules.profile.data.viewmodel.ProfileVM profileVM = mProfileVM;
            // profileVM.profileModel != null
            boolean profileVMProfileModelJavaLangObjectNull = false;
            // profileVM.profileModel.getValue()
            com.foo.app.modules.profile.data.model.ProfileModel profileVMProfileModelGetValue = null;
            // profileVM.profileModel.getValue() != null
            boolean profileVMProfileModelGetValueJavaLangObjectNull = false;
            // profileVM.profileModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.profile.data.model.ProfileModel> profileVMProfileModel = null;
            // profileVM != null
            boolean profileVMJavaLangObjectNull = false;
            // profileVM.profileModel.getValue().etPasswordValue
            java.lang.String profileVMProfileModelEtPasswordValue = null;



            profileVMJavaLangObjectNull = (profileVM) != (null);
            if (profileVMJavaLangObjectNull) {


                profileVMProfileModel = profileVM.getProfileModel();

                profileVMProfileModelJavaLangObjectNull = (profileVMProfileModel) != (null);
                if (profileVMProfileModelJavaLangObjectNull) {


                    profileVMProfileModelGetValue = profileVMProfileModel.getValue();

                    profileVMProfileModelGetValueJavaLangObjectNull = (profileVMProfileModelGetValue) != (null);
                    if (profileVMProfileModelGetValueJavaLangObjectNull) {




                        profileVMProfileModelGetValue.setEtPasswordValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etZipcodeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileVM.profileModel.getValue().etZipcodeValue
            //         is profileVM.profileModel.getValue().setEtZipcodeValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etZipcode);
            // localize variables for thread safety
            // profileVM
            com.foo.app.modules.profile.data.viewmodel.ProfileVM profileVM = mProfileVM;
            // profileVM.profileModel != null
            boolean profileVMProfileModelJavaLangObjectNull = false;
            // profileVM.profileModel.getValue()
            com.foo.app.modules.profile.data.model.ProfileModel profileVMProfileModelGetValue = null;
            // profileVM.profileModel.getValue() != null
            boolean profileVMProfileModelGetValueJavaLangObjectNull = false;
            // profileVM.profileModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.profile.data.model.ProfileModel> profileVMProfileModel = null;
            // profileVM.profileModel.getValue().etZipcodeValue
            java.lang.String profileVMProfileModelEtZipcodeValue = null;
            // profileVM != null
            boolean profileVMJavaLangObjectNull = false;



            profileVMJavaLangObjectNull = (profileVM) != (null);
            if (profileVMJavaLangObjectNull) {


                profileVMProfileModel = profileVM.getProfileModel();

                profileVMProfileModelJavaLangObjectNull = (profileVMProfileModel) != (null);
                if (profileVMProfileModelJavaLangObjectNull) {


                    profileVMProfileModelGetValue = profileVMProfileModel.getValue();

                    profileVMProfileModelGetValueJavaLangObjectNull = (profileVMProfileModelGetValue) != (null);
                    if (profileVMProfileModelGetValueJavaLangObjectNull) {




                        profileVMProfileModelGetValue.setEtZipcodeValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private ActivityProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[22]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[11]
            , (android.widget.EditText) bindings[9]
            , (android.widget.EditText) bindings[13]
            , (android.widget.FrameLayout) bindings[16]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            );
        this.etControlsText.setTag(null);
        this.etControlsTextOne.setTag(null);
        this.etControlsTextTwo.setTag(null);
        this.etPassword.setTag(null);
        this.etZipcode.setTag(null);
        this.imageEllipseSeven.setTag(null);
        this.linearProfile.setTag(null);
        this.txtCnhn.setTag(null);
        this.txtEmail.setTag(null);
        this.txtHng.setTag(null);
        this.txtImthng.setTag(null);
        this.txtMtkhu.setTag(null);
        this.txtText.setTag(null);
        this.txtTn.setTag(null);
        this.txtTnngnhp.setTag(null);
        this.txtVKhnhHuyn.setTag(null);
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
        if (BR.profileVM == variableId) {
            setProfileVM((com.foo.app.modules.profile.data.viewmodel.ProfileVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProfileVM(@Nullable com.foo.app.modules.profile.data.viewmodel.ProfileVM ProfileVM) {
        this.mProfileVM = ProfileVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.profileVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProfileVMProfileModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.profile.data.model.ProfileModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProfileVMProfileModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.profile.data.model.ProfileModel> ProfileVMProfileModel, int fieldId) {
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
        java.lang.String profileVMProfileModelTxtMtkhu = null;
        java.lang.String profileVMProfileModelEtControlsTextValue = null;
        com.foo.app.modules.profile.data.model.ProfileModel profileVMProfileModelGetValue = null;
        java.lang.String profileVMProfileModelTxtTnngnhp = null;
        com.foo.app.modules.profile.data.viewmodel.ProfileVM profileVM = mProfileVM;
        java.lang.String profileVMProfileModelTxtImthng = null;
        java.lang.String profileVMProfileModelTxtCnhn = null;
        java.lang.String profileVMProfileModelTxtVKhnhHuyn = null;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.profile.data.model.ProfileModel> profileVMProfileModel = null;
        java.lang.String profileVMProfileModelTxtEmail = null;
        java.lang.String profileVMProfileModelEtZipcodeValue = null;
        java.lang.String profileVMProfileModelTxtHng = null;
        java.lang.String profileVMProfileModelEtPasswordValue = null;
        java.lang.String profileVMProfileModelEtControlsTextOneValue = null;
        java.lang.String profileVMProfileModelTxtText = null;
        java.lang.String profileVMProfileModelEtControlsTextTwoValue = null;
        java.lang.String profileVMProfileModelTxtTn = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (profileVM != null) {
                    // read profileVM.profileModel
                    profileVMProfileModel = profileVM.getProfileModel();
                }
                updateLiveDataRegistration(0, profileVMProfileModel);


                if (profileVMProfileModel != null) {
                    // read profileVM.profileModel.getValue()
                    profileVMProfileModelGetValue = profileVMProfileModel.getValue();
                }


                if (profileVMProfileModelGetValue != null) {
                    // read profileVM.profileModel.getValue().txtMtkhu
                    profileVMProfileModelTxtMtkhu = profileVMProfileModelGetValue.getTxtMtkhu();
                    // read profileVM.profileModel.getValue().etControlsTextValue
                    profileVMProfileModelEtControlsTextValue = profileVMProfileModelGetValue.getEtControlsTextValue();
                    // read profileVM.profileModel.getValue().txtTnngnhp
                    profileVMProfileModelTxtTnngnhp = profileVMProfileModelGetValue.getTxtTnngnhp();
                    // read profileVM.profileModel.getValue().txtImthng
                    profileVMProfileModelTxtImthng = profileVMProfileModelGetValue.getTxtImthng();
                    // read profileVM.profileModel.getValue().txtCnhn
                    profileVMProfileModelTxtCnhn = profileVMProfileModelGetValue.getTxtCnhn();
                    // read profileVM.profileModel.getValue().txtVKhnhHuyn
                    profileVMProfileModelTxtVKhnhHuyn = profileVMProfileModelGetValue.getTxtVKhnhHuyn();
                    // read profileVM.profileModel.getValue().txtEmail
                    profileVMProfileModelTxtEmail = profileVMProfileModelGetValue.getTxtEmail();
                    // read profileVM.profileModel.getValue().etZipcodeValue
                    profileVMProfileModelEtZipcodeValue = profileVMProfileModelGetValue.getEtZipcodeValue();
                    // read profileVM.profileModel.getValue().txtHng
                    profileVMProfileModelTxtHng = profileVMProfileModelGetValue.getTxtHng();
                    // read profileVM.profileModel.getValue().etPasswordValue
                    profileVMProfileModelEtPasswordValue = profileVMProfileModelGetValue.getEtPasswordValue();
                    // read profileVM.profileModel.getValue().etControlsTextOneValue
                    profileVMProfileModelEtControlsTextOneValue = profileVMProfileModelGetValue.getEtControlsTextOneValue();
                    // read profileVM.profileModel.getValue().txtText
                    profileVMProfileModelTxtText = profileVMProfileModelGetValue.getTxtText();
                    // read profileVM.profileModel.getValue().etControlsTextTwoValue
                    profileVMProfileModelEtControlsTextTwoValue = profileVMProfileModelGetValue.getEtControlsTextTwoValue();
                    // read profileVM.profileModel.getValue().txtTn
                    profileVMProfileModelTxtTn = profileVMProfileModelGetValue.getTxtTn();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etControlsText, profileVMProfileModelEtControlsTextValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etControlsTextOne, profileVMProfileModelEtControlsTextOneValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etControlsTextTwo, profileVMProfileModelEtControlsTextTwoValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPassword, profileVMProfileModelEtPasswordValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etZipcode, profileVMProfileModelEtZipcodeValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCnhn, profileVMProfileModelTxtCnhn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmail, profileVMProfileModelTxtEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtHng, profileVMProfileModelTxtHng);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtImthng, profileVMProfileModelTxtImthng);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMtkhu, profileVMProfileModelTxtMtkhu);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtText, profileVMProfileModelTxtText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTn, profileVMProfileModelTxtTn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTnngnhp, profileVMProfileModelTxtTnngnhp);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtVKhnhHuyn, profileVMProfileModelTxtVKhnhHuyn);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etControlsText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etControlsTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etControlsTextOne, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etControlsTextOneandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etControlsTextTwo, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etControlsTextTwoandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etZipcode, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etZipcodeandroidTextAttrChanged);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseSeven, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseSeven.getContext(), R.drawable.img_ellipse7_158x158), (float)0f, true);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): profileVM.profileModel
        flag 1 (0x2L): profileVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}