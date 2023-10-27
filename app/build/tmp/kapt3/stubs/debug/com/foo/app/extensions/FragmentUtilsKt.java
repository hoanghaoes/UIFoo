package com.foo.app.extensions;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001ae\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0012\u001a\n\u0010\u0013\u001a\u00020\b*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\b*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u0012\u0010\u0015\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u0016"}, d2 = {"getFragmentByTag", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/FragmentActivity;", "tag", "", "isFragmentInStack", "", "loadFragment", "", "containerId", "", "fragment", "bundle", "Landroid/os/Bundle;", "addToBackStack", "add", "enter", "exit", "(Landroidx/fragment/app/FragmentActivity;ILandroidx/fragment/app/Fragment;Landroid/os/Bundle;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/Integer;)V", "removeAllFragmentsFromBackStack", "removeFragmentByTag", "removeFragmentFromContainer", "app_debug"})
public final class FragmentUtilsKt {
    
    /**
     * FragmentActivity extension method to Add/Replace fragment into container
     * @param containerId    id of container where fragment will be added
     * @param fragment       fragment to add
     * @param bundle         data for fragment
     * @param tag            name of fragment to add
     * @param addToBackStack true if you want to add in back stack
     * @param add        Decide whether we need to add or replace fragment in Container.
     */
    public static final void loadFragment(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentActivity $this$loadFragment, int containerId, @org.jetbrains.annotations.Nullable
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable
    android.os.Bundle bundle, @org.jetbrains.annotations.Nullable
    java.lang.String tag, boolean addToBackStack, boolean add, @org.jetbrains.annotations.Nullable
    java.lang.Integer enter, @org.jetbrains.annotations.Nullable
    java.lang.Integer exit) {
    }
    
    /**
     * FragmentActivity extension method to Remove added fragment from specific container id
     * @param containerId of frame layout
     */
    public static final void removeFragmentFromContainer(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentActivity $this$removeFragmentFromContainer, int containerId) {
    }
    
    /**
     * FragmentActivity extension method to Removes all fragments from backstack
     */
    public static final void removeAllFragmentsFromBackStack(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentActivity $this$removeAllFragmentsFromBackStack) {
    }
    
    /**
     * FragmentActivity extension method to checks if specific fragment is in back stack
     * @param tag of fragment to find
     * @return boolean true/false value
     */
    public static final boolean isFragmentInStack(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentActivity $this$isFragmentInStack, @org.jetbrains.annotations.Nullable
    java.lang.String tag) {
        return false;
    }
    
    /**
     * FragmentActivity extension method which returns the fragment object if found in passed tag value
     * @param tag the string value to find fragment
     * @return [Fragment] if found
     */
    @org.jetbrains.annotations.Nullable
    public static final androidx.fragment.app.Fragment getFragmentByTag(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentActivity $this$getFragmentByTag, @org.jetbrains.annotations.Nullable
    java.lang.String tag) {
        return null;
    }
    
    /**
     * FragmentActivity extension method which remove the fragment object if found in passed tag value
     * @param tag the string value to find fragment
     */
    public static final void removeFragmentByTag(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentActivity $this$removeFragmentByTag, @org.jetbrains.annotations.Nullable
    java.lang.String tag) {
    }
}