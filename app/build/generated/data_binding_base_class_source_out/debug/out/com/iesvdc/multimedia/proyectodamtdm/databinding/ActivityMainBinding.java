// Generated by view binder compiler. Do not edit!
package com.iesvdc.multimedia.proyectodamtdm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.iesvdc.multimedia.proyectodamtdm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnLogout;

  @NonNull
  public final FloatingActionButton fabAddRecipe;

  @NonNull
  public final RecyclerView rvRecipes;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull Button btnLogout,
      @NonNull FloatingActionButton fabAddRecipe, @NonNull RecyclerView rvRecipes) {
    this.rootView = rootView;
    this.btnLogout = btnLogout;
    this.fabAddRecipe = fabAddRecipe;
    this.rvRecipes = rvRecipes;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnLogout;
      Button btnLogout = ViewBindings.findChildViewById(rootView, id);
      if (btnLogout == null) {
        break missingId;
      }

      id = R.id.fabAddRecipe;
      FloatingActionButton fabAddRecipe = ViewBindings.findChildViewById(rootView, id);
      if (fabAddRecipe == null) {
        break missingId;
      }

      id = R.id.rvRecipes;
      RecyclerView rvRecipes = ViewBindings.findChildViewById(rootView, id);
      if (rvRecipes == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, btnLogout, fabAddRecipe, rvRecipes);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
