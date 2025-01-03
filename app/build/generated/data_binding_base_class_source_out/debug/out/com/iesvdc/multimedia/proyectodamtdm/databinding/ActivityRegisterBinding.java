// Generated by view binder compiler. Do not edit!
package com.iesvdc.multimedia.proyectodamtdm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.iesvdc.multimedia.proyectodamtdm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnLastRegister;

  @NonNull
  public final Button btnRegisterInRegister;

  @NonNull
  public final EditText editPassRegister;

  @NonNull
  public final EditText editUserRegister;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final EditText passRegisterRepeatInRegister;

  @NonNull
  public final TextView textView4;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnLastRegister, @NonNull Button btnRegisterInRegister,
      @NonNull EditText editPassRegister, @NonNull EditText editUserRegister,
      @NonNull ConstraintLayout main, @NonNull EditText passRegisterRepeatInRegister,
      @NonNull TextView textView4) {
    this.rootView = rootView;
    this.btnLastRegister = btnLastRegister;
    this.btnRegisterInRegister = btnRegisterInRegister;
    this.editPassRegister = editPassRegister;
    this.editUserRegister = editUserRegister;
    this.main = main;
    this.passRegisterRepeatInRegister = passRegisterRepeatInRegister;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_last_register;
      Button btnLastRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnLastRegister == null) {
        break missingId;
      }

      id = R.id.btn_register_in_register;
      Button btnRegisterInRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegisterInRegister == null) {
        break missingId;
      }

      id = R.id.edit_pass_register;
      EditText editPassRegister = ViewBindings.findChildViewById(rootView, id);
      if (editPassRegister == null) {
        break missingId;
      }

      id = R.id.edit_user_register;
      EditText editUserRegister = ViewBindings.findChildViewById(rootView, id);
      if (editUserRegister == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.pass_register_repeat_in_register;
      EditText passRegisterRepeatInRegister = ViewBindings.findChildViewById(rootView, id);
      if (passRegisterRepeatInRegister == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, btnLastRegister,
          btnRegisterInRegister, editPassRegister, editUserRegister, main,
          passRegisterRepeatInRegister, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
