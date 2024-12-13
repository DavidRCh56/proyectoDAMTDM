// Generated by view binder compiler. Do not edit!
package com.iesvdc.multimedia.proyectodamtdm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.iesvdc.multimedia.proyectodamtdm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button Validar;

  @NonNull
  public final Button cambioContrasennabtn;

  @NonNull
  public final EditText etContrasenna;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final Button registerbtn;

  private ActivityLoginBinding(@NonNull LinearLayout rootView, @NonNull Button Validar,
      @NonNull Button cambioContrasennabtn, @NonNull EditText etContrasenna,
      @NonNull EditText etEmail, @NonNull Button registerbtn) {
    this.rootView = rootView;
    this.Validar = Validar;
    this.cambioContrasennabtn = cambioContrasennabtn;
    this.etContrasenna = etContrasenna;
    this.etEmail = etEmail;
    this.registerbtn = registerbtn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Validar;
      Button Validar = ViewBindings.findChildViewById(rootView, id);
      if (Validar == null) {
        break missingId;
      }

      id = R.id.cambioContrasennabtn;
      Button cambioContrasennabtn = ViewBindings.findChildViewById(rootView, id);
      if (cambioContrasennabtn == null) {
        break missingId;
      }

      id = R.id.etContrasenna;
      EditText etContrasenna = ViewBindings.findChildViewById(rootView, id);
      if (etContrasenna == null) {
        break missingId;
      }

      id = R.id.etEmail;
      EditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.registerbtn;
      Button registerbtn = ViewBindings.findChildViewById(rootView, id);
      if (registerbtn == null) {
        break missingId;
      }

      return new ActivityLoginBinding((LinearLayout) rootView, Validar, cambioContrasennabtn,
          etContrasenna, etEmail, registerbtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
