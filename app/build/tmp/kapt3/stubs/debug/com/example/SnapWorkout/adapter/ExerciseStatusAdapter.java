package com.example.SnapWorkout.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/example/SnapWorkout/adapter/ExerciseStatusAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/SnapWorkout/adapter/ExerciseStatusAdapter$ViewHolder;", "items", "Ljava/util/ArrayList;", "Lcom/example/SnapWorkout/model/ExerciseModel;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getItems", "()Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ExerciseStatusAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.SnapWorkout.adapter.ExerciseStatusAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.example.SnapWorkout.model.ExerciseModel> items = null;
    
    public ExerciseStatusAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.SnapWorkout.model.ExerciseModel> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.example.SnapWorkout.model.ExerciseModel> getItems() {
        return null;
    }
    
    /**
     * Inflates the item view which is designed in xml layout file
     *
     * create a new
     * {@link ViewHolder} and initializes some private fields to be used by RecyclerView.
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.SnapWorkout.adapter.ExerciseStatusAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    /**
     * Binds each item in the ArrayList to a view
     *
     * Called when RecyclerView needs a new {@link ViewHolder} of the given type to represent
     * an item.
     *
     * This new ViewHolder should be constructed with a new View that can represent the items
     * of the given type. You can either create a new View manually or inflate it from an XML
     * layout file.
     */
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.SnapWorkout.adapter.ExerciseStatusAdapter.ViewHolder holder, int position) {
    }
    
    /**
     * Gets the number of items in the list
     */
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    /**
     * A ViewHolder describes an item view and metadata about its place within the RecyclerView.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/SnapWorkout/adapter/ExerciseStatusAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/SnapWorkout/databinding/ItemExerciseStatusBinding;", "(Lcom/example/SnapWorkout/databinding/ItemExerciseStatusBinding;)V", "tvItem", "Landroid/widget/TextView;", "getTvItem", "()Landroid/widget/TextView;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView tvItem = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.example.SnapWorkout.databinding.ItemExerciseStatusBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTvItem() {
            return null;
        }
    }
}