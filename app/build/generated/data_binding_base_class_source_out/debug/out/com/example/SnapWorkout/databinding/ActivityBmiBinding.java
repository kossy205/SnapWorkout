// Generated by view binder compiler. Do not edit!
package com.example.SnapWorkout.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.SnapWorkout.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBmiBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnCalculateUnits;

  @NonNull
  public final AppCompatEditText etMetricUnitHeight;

  @NonNull
  public final AppCompatEditText etMetricUnitWeight;

  @NonNull
  public final AppCompatEditText etUsMetricUnitHeightFeet;

  @NonNull
  public final AppCompatEditText etUsMetricUnitHeightInch;

  @NonNull
  public final AppCompatEditText etUsMetricUnitWeight;

  @NonNull
  public final LinearLayout llDiplayBMIResult;

  @NonNull
  public final RadioButton rbMetricUnits;

  @NonNull
  public final RadioButton rbUsUnits;

  @NonNull
  public final RadioGroup rgUnits;

  @NonNull
  public final TextInputLayout tilMetricUnitHeight;

  @NonNull
  public final TextInputLayout tilMetricUnitWeight;

  @NonNull
  public final TextInputLayout tilMetricUsUnitHeightFeet;

  @NonNull
  public final TextInputLayout tilMetricUsUnitHeightInch;

  @NonNull
  public final TextInputLayout tilUsMetricUnitWeight;

  @NonNull
  public final Toolbar toolbarBmiActivity;

  @NonNull
  public final TextView tvBMIDescription;

  @NonNull
  public final TextView tvBMIType;

  @NonNull
  public final TextView tvBMIValue;

  @NonNull
  public final TextView tvYourBMI;

  @NonNull
  public final View view;

  private ActivityBmiBinding(@NonNull RelativeLayout rootView, @NonNull Button btnCalculateUnits,
      @NonNull AppCompatEditText etMetricUnitHeight, @NonNull AppCompatEditText etMetricUnitWeight,
      @NonNull AppCompatEditText etUsMetricUnitHeightFeet,
      @NonNull AppCompatEditText etUsMetricUnitHeightInch,
      @NonNull AppCompatEditText etUsMetricUnitWeight, @NonNull LinearLayout llDiplayBMIResult,
      @NonNull RadioButton rbMetricUnits, @NonNull RadioButton rbUsUnits,
      @NonNull RadioGroup rgUnits, @NonNull TextInputLayout tilMetricUnitHeight,
      @NonNull TextInputLayout tilMetricUnitWeight,
      @NonNull TextInputLayout tilMetricUsUnitHeightFeet,
      @NonNull TextInputLayout tilMetricUsUnitHeightInch,
      @NonNull TextInputLayout tilUsMetricUnitWeight, @NonNull Toolbar toolbarBmiActivity,
      @NonNull TextView tvBMIDescription, @NonNull TextView tvBMIType, @NonNull TextView tvBMIValue,
      @NonNull TextView tvYourBMI, @NonNull View view) {
    this.rootView = rootView;
    this.btnCalculateUnits = btnCalculateUnits;
    this.etMetricUnitHeight = etMetricUnitHeight;
    this.etMetricUnitWeight = etMetricUnitWeight;
    this.etUsMetricUnitHeightFeet = etUsMetricUnitHeightFeet;
    this.etUsMetricUnitHeightInch = etUsMetricUnitHeightInch;
    this.etUsMetricUnitWeight = etUsMetricUnitWeight;
    this.llDiplayBMIResult = llDiplayBMIResult;
    this.rbMetricUnits = rbMetricUnits;
    this.rbUsUnits = rbUsUnits;
    this.rgUnits = rgUnits;
    this.tilMetricUnitHeight = tilMetricUnitHeight;
    this.tilMetricUnitWeight = tilMetricUnitWeight;
    this.tilMetricUsUnitHeightFeet = tilMetricUsUnitHeightFeet;
    this.tilMetricUsUnitHeightInch = tilMetricUsUnitHeightInch;
    this.tilUsMetricUnitWeight = tilUsMetricUnitWeight;
    this.toolbarBmiActivity = toolbarBmiActivity;
    this.tvBMIDescription = tvBMIDescription;
    this.tvBMIType = tvBMIType;
    this.tvBMIValue = tvBMIValue;
    this.tvYourBMI = tvYourBMI;
    this.view = view;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBmiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBmiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_bmi, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBmiBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCalculateUnits;
      Button btnCalculateUnits = ViewBindings.findChildViewById(rootView, id);
      if (btnCalculateUnits == null) {
        break missingId;
      }

      id = R.id.etMetricUnitHeight;
      AppCompatEditText etMetricUnitHeight = ViewBindings.findChildViewById(rootView, id);
      if (etMetricUnitHeight == null) {
        break missingId;
      }

      id = R.id.etMetricUnitWeight;
      AppCompatEditText etMetricUnitWeight = ViewBindings.findChildViewById(rootView, id);
      if (etMetricUnitWeight == null) {
        break missingId;
      }

      id = R.id.etUsMetricUnitHeightFeet;
      AppCompatEditText etUsMetricUnitHeightFeet = ViewBindings.findChildViewById(rootView, id);
      if (etUsMetricUnitHeightFeet == null) {
        break missingId;
      }

      id = R.id.etUsMetricUnitHeightInch;
      AppCompatEditText etUsMetricUnitHeightInch = ViewBindings.findChildViewById(rootView, id);
      if (etUsMetricUnitHeightInch == null) {
        break missingId;
      }

      id = R.id.etUsMetricUnitWeight;
      AppCompatEditText etUsMetricUnitWeight = ViewBindings.findChildViewById(rootView, id);
      if (etUsMetricUnitWeight == null) {
        break missingId;
      }

      id = R.id.llDiplayBMIResult;
      LinearLayout llDiplayBMIResult = ViewBindings.findChildViewById(rootView, id);
      if (llDiplayBMIResult == null) {
        break missingId;
      }

      id = R.id.rbMetricUnits;
      RadioButton rbMetricUnits = ViewBindings.findChildViewById(rootView, id);
      if (rbMetricUnits == null) {
        break missingId;
      }

      id = R.id.rbUsUnits;
      RadioButton rbUsUnits = ViewBindings.findChildViewById(rootView, id);
      if (rbUsUnits == null) {
        break missingId;
      }

      id = R.id.rgUnits;
      RadioGroup rgUnits = ViewBindings.findChildViewById(rootView, id);
      if (rgUnits == null) {
        break missingId;
      }

      id = R.id.tilMetricUnitHeight;
      TextInputLayout tilMetricUnitHeight = ViewBindings.findChildViewById(rootView, id);
      if (tilMetricUnitHeight == null) {
        break missingId;
      }

      id = R.id.tilMetricUnitWeight;
      TextInputLayout tilMetricUnitWeight = ViewBindings.findChildViewById(rootView, id);
      if (tilMetricUnitWeight == null) {
        break missingId;
      }

      id = R.id.tilMetricUsUnitHeightFeet;
      TextInputLayout tilMetricUsUnitHeightFeet = ViewBindings.findChildViewById(rootView, id);
      if (tilMetricUsUnitHeightFeet == null) {
        break missingId;
      }

      id = R.id.tilMetricUsUnitHeightInch;
      TextInputLayout tilMetricUsUnitHeightInch = ViewBindings.findChildViewById(rootView, id);
      if (tilMetricUsUnitHeightInch == null) {
        break missingId;
      }

      id = R.id.tilUsMetricUnitWeight;
      TextInputLayout tilUsMetricUnitWeight = ViewBindings.findChildViewById(rootView, id);
      if (tilUsMetricUnitWeight == null) {
        break missingId;
      }

      id = R.id.toolbar_bmi_activity;
      Toolbar toolbarBmiActivity = ViewBindings.findChildViewById(rootView, id);
      if (toolbarBmiActivity == null) {
        break missingId;
      }

      id = R.id.tvBMIDescription;
      TextView tvBMIDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvBMIDescription == null) {
        break missingId;
      }

      id = R.id.tvBMIType;
      TextView tvBMIType = ViewBindings.findChildViewById(rootView, id);
      if (tvBMIType == null) {
        break missingId;
      }

      id = R.id.tvBMIValue;
      TextView tvBMIValue = ViewBindings.findChildViewById(rootView, id);
      if (tvBMIValue == null) {
        break missingId;
      }

      id = R.id.tvYourBMI;
      TextView tvYourBMI = ViewBindings.findChildViewById(rootView, id);
      if (tvYourBMI == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new ActivityBmiBinding((RelativeLayout) rootView, btnCalculateUnits,
          etMetricUnitHeight, etMetricUnitWeight, etUsMetricUnitHeightFeet,
          etUsMetricUnitHeightInch, etUsMetricUnitWeight, llDiplayBMIResult, rbMetricUnits,
          rbUsUnits, rgUnits, tilMetricUnitHeight, tilMetricUnitWeight, tilMetricUsUnitHeightFeet,
          tilMetricUsUnitHeightInch, tilUsMetricUnitWeight, toolbarBmiActivity, tvBMIDescription,
          tvBMIType, tvBMIValue, tvYourBMI, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
