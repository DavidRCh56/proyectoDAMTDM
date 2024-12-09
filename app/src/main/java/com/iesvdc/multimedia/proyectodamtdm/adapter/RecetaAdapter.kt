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
    private val recipes: MutableList<Receta>,
    private val onDelete: (Receta) -> Unit,
    private val onEdit: (Receta) -> Unit
) : RecyclerView.Adapter<RecetaAdapter.RecetaViewHolder>() {

    inner class RecetaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val recipeName: TextView = view.findViewById(R.id.tvRecipeName)
        val recipeDescription: TextView = view.findViewById(R.id.tvRecipeDescription)
        val recipeIngredients: TextView = view.findViewById(R.id.tvRecipeIngredients)
        val recipeCalories: TextView = view.findViewById(R.id.tvRecipeCalories)
        val recipeImage: ImageView = view.findViewById(R.id.ivRecipeImage)
        val deleteIcon: ImageView = view.findViewById(R.id.ivBorrarReceta)
        val editIcon: ImageView = view.findViewById(R.id.ivEditarReceta)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecetaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_receta, parent, false)
        return RecetaViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecetaViewHolder, position: Int) {
        val recipe = recipes[position]
        holder.recipeName.text = recipe.name
        holder.recipeDescription.text = recipe.description
        holder.recipeIngredients.text = "Ingredientes: ${recipe.ingredients}"
        holder.recipeCalories.text = "Calorías: ${recipe.calories}"
        holder.recipeImage.setImageResource(recipe.image)

        // Configurar botón de borrar
        holder.deleteIcon.setOnClickListener {
            // Eliminar el ítem correctamente usando un identificador único (id)
            deleteItem(recipe)
        }

        // Configurar botón de editar
        holder.editIcon.setOnClickListener {
            onEdit(recipe)
        }
    }

    override fun getItemCount(): Int = recipes.size

    // Método para eliminar un ítem correctamente usando un identificador único
    private fun deleteItem(recipe: Receta) {
        val indexToRemove = recipes.indexOf(recipe)
        if (indexToRemove != -1) {
            recipes.removeAt(indexToRemove) // Eliminamos el ítem
            notifyItemRemoved(indexToRemove) // Notificamos al RecyclerView

            // Llamamos a la función onDelete para cualquier acción adicional
            onDelete(recipe)
        }
    }
}
