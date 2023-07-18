// Generated by view binder compiler. Do not edit!
package com.example.SnapWorkout.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.SnapWorkout.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ItemExerciseStatusBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  @NonNull
  public final TextView tvItem;

  private ItemExerciseStatusBinding(@NonNull TextView rootView, @NonNull TextView tvItem) {
    this.rootView = rootView;
    this.tvItem = tvItem;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemExerciseStatusBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemExerciseStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_exercise_status, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemExerciseStatusBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    TextView tvItem = (TextView) rootView;

    return new ItemExerciseStatusBinding((TextView) rootView, tvItem);
  }
}
