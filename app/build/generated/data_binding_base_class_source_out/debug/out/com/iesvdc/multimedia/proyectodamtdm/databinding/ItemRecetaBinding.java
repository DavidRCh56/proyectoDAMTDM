// Generated by view binder compiler. Do not edit!
package com.iesvdc.multimedia.proyectodamtdm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.iesvdc.multimedia.proyectodamtdm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRecetaBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView ivBorrarReceta;

  @NonNull
  public final ImageView ivEditarReceta;

  @NonNull
  public final ImageView ivRecipeImage;

  @NonNull
  public final TextView tvRecipeCalories;

  @NonNull
  public final TextView tvRecipeDescription;

  @NonNull
  public final TextView tvRecipeIngredients;

  @NonNull
  public final TextView tvRecipeName;

  private ItemRecetaBinding(@NonNull CardView rootView, @NonNull ImageView ivBorrarReceta,
      @NonNull ImageView ivEditarReceta, @NonNull ImageView ivRecipeImage,
      @NonNull TextView tvRecipeCalories, @NonNull TextView tvRecipeDescription,
      @NonNull TextView tvRecipeIngredients, @NonNull TextView tvRecipeName) {
    this.rootView = rootView;
    this.ivBorrarReceta = ivBorrarReceta;
    this.ivEditarReceta = ivEditarReceta;
    this.ivRecipeImage = ivRecipeImage;
    this.tvRecipeCalories = tvRecipeCalories;
    this.tvRecipeDescription = tvRecipeDescription;
    this.tvRecipeIngredients = tvRecipeIngredients;
    this.tvRecipeName = tvRecipeName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRecetaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRecetaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_receta, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRecetaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivBorrarReceta;
      ImageView ivBorrarReceta = ViewBindings.findChildViewById(rootView, id);
      if (ivBorrarReceta == null) {
        break missingId;
      }

      id = R.id.ivEditarReceta;
      ImageView ivEditarReceta = ViewBindings.findChildViewById(rootView, id);
      if (ivEditarReceta == null) {
        break missingId;
      }

      id = R.id.ivRecipeImage;
      ImageView ivRecipeImage = ViewBindings.findChildViewById(rootView, id);
      if (ivRecipeImage == null) {
        break missingId;
      }

      id = R.id.tvRecipeCalories;
      TextView tvRecipeCalories = ViewBindings.findChildViewById(rootView, id);
      if (tvRecipeCalories == null) {
        break missingId;
      }

      id = R.id.tvRecipeDescription;
      TextView tvRecipeDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvRecipeDescription == null) {
        break missingId;
      }

      id = R.id.tvRecipeIngredients;
      TextView tvRecipeIngredients = ViewBindings.findChildViewById(rootView, id);
      if (tvRecipeIngredients == null) {
        break missingId;
      }

      id = R.id.tvRecipeName;
      TextView tvRecipeName = ViewBindings.findChildViewById(rootView, id);
      if (tvRecipeName == null) {
        break missingId;
      }

      return new ItemRecetaBinding((CardView) rootView, ivBorrarReceta, ivEditarReceta,
          ivRecipeImage, tvRecipeCalories, tvRecipeDescription, tvRecipeIngredients, tvRecipeName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
