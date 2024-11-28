package com.iesvdc.multimedia.proyectodamtdm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.iesvdc.multimedia.proyectodamtdm.R
import com.iesvdc.multimedia.proyectodamtdm.model.Receta

class RecetaAdapter(
    private val recipes: List<Receta>, // Lista de recetas
    private val onDelete: (Receta) -> Unit, // Acción para eliminar
    private val onEdit: (Receta) -> Unit   // Acción para editar
) : RecyclerView.Adapter<RecetaAdapter.RecipeViewHolder>() {

    // Clase interna para el ViewHolder
    class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recipeImage: ImageView = itemView.findViewById(R.id.ivRecipeImage)
        val recipeName: TextView = itemView.findViewById(R.id.tvRecipeName)
        val recipeDescription: TextView = itemView.findViewById(R.id.tvRecipeDescription)
        val recipeIngredients: TextView = itemView.findViewById(R.id.tvRecipeIngredients)
        val recipeCalories: TextView = itemView.findViewById(R.id.tvRecipeCalories)
        val editButton: ImageView = itemView.findViewById(R.id.ivEditarReceta)
        val deleteButton: ImageView = itemView.findViewById(R.id.ivBorrarReceta)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_receta, parent, false)
        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = recipes[position]
        holder.recipeImage.setImageResource(recipe.image)
        holder.recipeName.text = recipe.name
        holder.recipeDescription.text = recipe.description
        holder.recipeIngredients.text = recipe.ingredients
        holder.recipeCalories.text = recipe.calories

        // Asignar eventos a los botones
        holder.editButton.setOnClickListener { onEdit(recipe) }
        holder.deleteButton.setOnClickListener { onDelete(recipe) }
    }

    override fun getItemCount(): Int = recipes.size
}
