package com.foo.app.modules.historyone.data.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/foo/app/modules/historyone/data/viewmodel/HistoryOneVM;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/KoinComponent;", "()V", "historyOneList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/foo/app/modules/historyone/data/model/HistoryOneRowModel;", "getHistoryOneList", "()Landroidx/lifecycle/MutableLiveData;", "historyOneModel", "Lcom/foo/app/modules/historyone/data/model/HistoryOneModel;", "getHistoryOneModel", "navArguments", "Landroid/os/Bundle;", "getNavArguments", "()Landroid/os/Bundle;", "setNavArguments", "(Landroid/os/Bundle;)V", "app_debug"})
public final class HistoryOneVM extends androidx.lifecycle.ViewModel implements org.koin.core.KoinComponent {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.foo.app.modules.historyone.data.model.HistoryOneModel> historyOneModel = null;
    @org.jetbrains.annotations.Nullable
    private android.os.Bundle navArguments;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.foo.app.modules.historyone.data.model.HistoryOneRowModel>> historyOneList = null;
    
    public HistoryOneVM() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.foo.app.modules.historyone.data.model.HistoryOneModel> getHistoryOneModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.os.Bundle getNavArguments() {
        return null;
    }
    
    public final void setNavArguments(@org.jetbrains.annotations.Nullable
    android.os.Bundle p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.foo.app.modules.historyone.data.model.HistoryOneRowModel>> getHistoryOneList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.koin.core.Koin getKoin() {
        return null;
    }
}