package com.foo.app.databinding;
import com.foo.app.R;
import com.foo.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchBindingImpl extends FragmentSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnmusic, 10);
        sViewsWithIds.put(R.id.linearIOSStatusBar, 11);
        sViewsWithIds.put(R.id.imageMusic, 12);
        sViewsWithIds.put(R.id.imageRightSide, 13);
        sViewsWithIds.put(R.id.frameStackiconOne, 14);
        sViewsWithIds.put(R.id.linearRowiconOne, 15);
        sViewsWithIds.put(R.id.imageIconOne, 16);
        sViewsWithIds.put(R.id.linearRowiconTwo, 17);
        sViewsWithIds.put(R.id.imageIconTwo, 18);
        sViewsWithIds.put(R.id.linearColumngiOne, 19);
        sViewsWithIds.put(R.id.linearRowiconThree, 20);
        sViewsWithIds.put(R.id.imageIconThree, 21);
        sViewsWithIds.put(R.id.linearRowiconFour, 22);
        sViewsWithIds.put(R.id.imageIconFour, 23);
        sViewsWithIds.put(R.id.linearColumniconFive, 24);
        sViewsWithIds.put(R.id.linearRowiconEight, 25);
        sViewsWithIds.put(R.id.imageIconEight, 26);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etFrameSevenandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchVM.searchModel.getValue().etFrameSevenValue
            //         is searchVM.searchModel.getValue().setEtFrameSevenValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etFrameSeven);
            // localize variables for thread safety
            // searchVM != null
            boolean searchVMJavaLangObjectNull = false;
            // searchVM.searchModel.getValue().etFrameSevenValue
            java.lang.String searchVMSearchModelEtFrameSevenValue = null;
            // searchVM.searchModel.getValue()
            com.foo.app.modules.search.data.model.SearchModel searchVMSearchModelGetValue = null;
            // searchVM.searchModel.getValue() != null
            boolean searchVMSearchModelGetValueJavaLangObjectNull = false;
            // searchVM.searchModel != null
            boolean searchVMSearchModelJavaLangObjectNull = false;
            // searchVM.searchModel
            androidx.lifecycle.MutableLiveData<com.foo.app.modules.search.data.model.SearchModel> searchVMSearchModel = null;
            // searchVM
            com.foo.app.modules.search.data.viewmodel.SearchVM searchVM = mSearchVM;



            searchVMJavaLangObjectNull = (searchVM) != (null);
            if (searchVMJavaLangObjectNull) {


                searchVMSearchModel = searchVM.getSearchModel();

                searchVMSearchModelJavaLangObjectNull = (searchVMSearchModel) != (null);
                if (searchVMSearchModelJavaLangObjectNull) {


                    searchVMSearchModelGetValue = searchVMSearchModel.getValue();

                    searchVMSearchModelGetValueJavaLangObjectNull = (searchVMSearchModelGetValue) != (null);
                    if (searchVMSearchModelGetValueJavaLangObjectNull) {




                        searchVMSearchModelGetValue.setEtFrameSevenValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[1]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            );
        this.etFrameSeven.setTag(null);
        this.linearSearch.setTag(null);
        this.recyclerSearch.setTag(null);
        this.txtBotngHNi.setTag(null);
        this.txtBotngHNiOne.setTag(null);
        this.txtGi.setTag(null);
        this.txtGiOne.setTag(null);
        this.txtLchs.setTag(null);
        this.txtVnmiu.setTag(null);
        this.txtVnmiuOne.setTag(null);
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
        if (BR.searchVM == variableId) {
            setSearchVM((com.foo.app.modules.search.data.viewmodel.SearchVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearchVM(@Nullable com.foo.app.modules.search.data.viewmodel.SearchVM SearchVM) {
        this.mSearchVM = SearchVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.searchVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSearchVMSearchModel((androidx.lifecycle.MutableLiveData<com.foo.app.modules.search.data.model.SearchModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSearchVMSearchModel(androidx.lifecycle.MutableLiveData<com.foo.app.modules.search.data.model.SearchModel> SearchVMSearchModel, int fieldId) {
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
        java.lang.String searchVMSearchModelEtFrameSevenValue = null;
        com.foo.app.modules.search.data.model.SearchModel searchVMSearchModelGetValue = null;
        java.lang.String searchVMSearchModelTxtGiOne = null;
        androidx.lifecycle.MutableLiveData<com.foo.app.modules.search.data.model.SearchModel> searchVMSearchModel = null;
        java.lang.String searchVMSearchModelTxtVnmiu = null;
        java.lang.String searchVMSearchModelTxtGi = null;
        java.lang.String searchVMSearchModelTxtBotngHNiOne = null;
        java.lang.String searchVMSearchModelTxtBotngHNi = null;
        java.lang.String searchVMSearchModelTxtLchs = null;
        java.lang.String searchVMSearchModelTxtVnmiuOne = null;
        com.foo.app.modules.search.data.viewmodel.SearchVM searchVM = mSearchVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (searchVM != null) {
                    // read searchVM.searchModel
                    searchVMSearchModel = searchVM.getSearchModel();
                }
                updateLiveDataRegistration(0, searchVMSearchModel);


                if (searchVMSearchModel != null) {
                    // read searchVM.searchModel.getValue()
                    searchVMSearchModelGetValue = searchVMSearchModel.getValue();
                }


                if (searchVMSearchModelGetValue != null) {
                    // read searchVM.searchModel.getValue().etFrameSevenValue
                    searchVMSearchModelEtFrameSevenValue = searchVMSearchModelGetValue.getEtFrameSevenValue();
                    // read searchVM.searchModel.getValue().txtGiOne
                    searchVMSearchModelTxtGiOne = searchVMSearchModelGetValue.getTxtGiOne();
                    // read searchVM.searchModel.getValue().txtVnmiu
                    searchVMSearchModelTxtVnmiu = searchVMSearchModelGetValue.getTxtVnmiu();
                    // read searchVM.searchModel.getValue().txtGi
                    searchVMSearchModelTxtGi = searchVMSearchModelGetValue.getTxtGi();
                    // read searchVM.searchModel.getValue().txtBotngHNiOne
                    searchVMSearchModelTxtBotngHNiOne = searchVMSearchModelGetValue.getTxtBotngHNiOne();
                    // read searchVM.searchModel.getValue().txtBotngHNi
                    searchVMSearchModelTxtBotngHNi = searchVMSearchModelGetValue.getTxtBotngHNi();
                    // read searchVM.searchModel.getValue().txtLchs
                    searchVMSearchModelTxtLchs = searchVMSearchModelGetValue.getTxtLchs();
                    // read searchVM.searchModel.getValue().txtVnmiuOne
                    searchVMSearchModelTxtVnmiuOne = searchVMSearchModelGetValue.getTxtVnmiuOne();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etFrameSeven, searchVMSearchModelEtFrameSevenValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBotngHNi, searchVMSearchModelTxtBotngHNi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBotngHNiOne, searchVMSearchModelTxtBotngHNiOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGi, searchVMSearchModelTxtGi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGiOne, searchVMSearchModelTxtGiOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLchs, searchVMSearchModelTxtLchs);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtVnmiu, searchVMSearchModelTxtVnmiu);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtVnmiuOne, searchVMSearchModelTxtVnmiuOne);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etFrameSeven, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etFrameSevenandroidTextAttrChanged);
            com.foo.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerSearch, recyclerSearch.getResources().getDimension(R.dimen._19pxh), (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): searchVM.searchModel
        flag 1 (0x2L): searchVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}