package com.foo.app.modules.history.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"Lcom/foo/app/modules/history/ui/HistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/foo/app/modules/history/ui/HistoryAdapter$RowHistoryVH;", "list", "", "Lcom/foo/app/modules/history/data/model/HistoryRowModel;", "(Ljava/util/List;)V", "clickListener", "Lcom/foo/app/modules/history/ui/HistoryAdapter$OnItemClickListener;", "getList", "()Ljava/util/List;", "setList", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "updateData", "newData", "OnItemClickListener", "RowHistoryVH", "app_debug"})
public final class HistoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.foo.app.modules.history.ui.HistoryAdapter.RowHistoryVH> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.foo.app.modules.history.data.model.HistoryRowModel> list;
    private com.foo.app.modules.history.ui.HistoryAdapter.OnItemClickListener clickListener;
    
    public HistoryAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.foo.app.modules.history.data.model.HistoryRowModel> list) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.foo.app.modules.history.data.model.HistoryRowModel> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.List<com.foo.app.modules.history.data.model.HistoryRowModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.foo.app.modules.history.ui.HistoryAdapter.RowHistoryVH onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.foo.app.modules.history.ui.HistoryAdapter.RowHistoryVH holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull
    java.util.List<com.foo.app.modules.history.data.model.HistoryRowModel> newData) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull
    com.foo.app.modules.history.ui.HistoryAdapter.OnItemClickListener clickListener) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/foo/app/modules/history/ui/HistoryAdapter$OnItemClickListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "item", "Lcom/foo/app/modules/history/data/model/HistoryRowModel;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull
        android.view.View view, int position, @org.jetbrains.annotations.NotNull
        com.foo.app.modules.history.data.model.HistoryRowModel item);
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
        public static final class DefaultImpls {
            
            public static void onItemClick(@org.jetbrains.annotations.NotNull
            com.foo.app.modules.history.ui.HistoryAdapter.OnItemClickListener $this, @org.jetbrains.annotations.NotNull
            android.view.View view, int position, @org.jetbrains.annotations.NotNull
            com.foo.app.modules.history.data.model.HistoryRowModel item) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/foo/app/modules/history/ui/HistoryAdapter$RowHistoryVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/foo/app/modules/history/ui/HistoryAdapter;Landroid/view/View;)V", "binding", "Lcom/foo/app/databinding/RowHistoryBinding;", "getBinding", "()Lcom/foo/app/databinding/RowHistoryBinding;", "app_debug"})
    public final class RowHistoryVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.foo.app.databinding.RowHistoryBinding binding = null;
        
        public RowHistoryVH(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.foo.app.databinding.RowHistoryBinding getBinding() {
            return null;
        }
    }
}