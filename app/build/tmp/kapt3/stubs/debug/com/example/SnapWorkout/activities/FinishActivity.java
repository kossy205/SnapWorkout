package com.example.SnapWorkout.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/SnapWorkout/activities/FinishActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/SnapWorkout/databinding/ActivityFinishBinding;", "addDateToDatabase", "", "historyDao", "Lcom/example/SnapWorkout/database/HistoryDao;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class FinishActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.SnapWorkout.databinding.ActivityFinishBinding binding;
    
    public FinishActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Function is used to insert the current system date in the sqlite eu.tutorials.a7_minutesworkoutapp.database.
     */
    private final void addDateToDatabase(com.example.SnapWorkout.database.HistoryDao historyDao) {
    }
}