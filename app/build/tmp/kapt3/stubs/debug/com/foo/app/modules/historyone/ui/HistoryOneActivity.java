package com.foo.app.modules.historyone.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/foo/app/modules/historyone/ui/HistoryOneActivity;", "Lcom/foo/app/appcomponents/base/BaseActivity;", "Lcom/foo/app/databinding/ActivityHistoryOneBinding;", "()V", "viewModel", "Lcom/foo/app/modules/historyone/data/viewmodel/HistoryOneVM;", "getViewModel", "()Lcom/foo/app/modules/historyone/data/viewmodel/HistoryOneVM;", "viewModel$delegate", "Lkotlin/Lazy;", "onClickRecyclerHistoryOne", "", "view", "Landroid/view/View;", "position", "", "item", "Lcom/foo/app/modules/historyone/data/model/HistoryOneRowModel;", "onInitialized", "setUpClicks", "Companion", "app_debug"})
public final class HistoryOneActivity extends com.foo.app.appcomponents.base.BaseActivity<com.foo.app.databinding.ActivityHistoryOneBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.foo.app.modules.historyone.ui.HistoryOneActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "HISTORY_ONE_ACTIVITY";
    
    public HistoryOneActivity() {
        super(0);
    }
    
    private final com.foo.app.modules.historyone.data.viewmodel.HistoryOneVM getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onInitialized() {
    }
    
    @java.lang.Override
    public void setUpClicks() {
    }
    
    public final void onClickRecyclerHistoryOne(@org.jetbrains.annotations.NotNull
    android.view.View view, int position, @org.jetbrains.annotations.NotNull
    com.foo.app.modules.historyone.data.model.HistoryOneRowModel item) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/foo/app/modules/historyone/ui/HistoryOneActivity$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}