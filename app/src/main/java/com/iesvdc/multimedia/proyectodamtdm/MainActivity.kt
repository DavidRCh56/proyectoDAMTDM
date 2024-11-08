package com.iesvdc.multimedia.proyectodamtdm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvRecipes = findViewById<RecyclerView>(R.id.rvRecipes)
        rvRecipes.layoutManager = LinearLayoutManager(this)

        // Lista de datos de las recetas
        val recipes = listOf(
            mapOf(
                "name" to "Paella",
                "description" to "Paella con mariscos y vegetales.",
                "ingredients" to "Arroz, mariscos, vegetales",
                "calories" to "450 kcal",
                "image" to R.drawable.entrecot_de_ternera
            ),
            mapOf(
                "name" to "Gazpacho",
                "description" to "Sopa fría de tomate.",
                "ingredients" to "Tomate, pepino, pimiento",
                "calories" to "100 kcal",
                "image" to R.drawable.entrecot_de_ternera
            ),
            mapOf(
                "name" to "Tortilla de Patatas",
                "description" to "Clásica tortilla española.",
                "ingredients" to "Patatas, huevo, cebolla",
                "calories" to "250 kcal",
                "image" to R.drawable.entrecot_de_ternera
            )
        )

        // Configura el RecyclerView con el adaptador
        rvRecipes.adapter = RecipeAdapter(recipes)
    }

    // Adaptador para el RecyclerView
    inner class RecipeAdapter(private val recipes: List<Map<String, Any>>) :
        RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

        // Infla el layout de cada item del RecyclerView
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_receta, parent, false)
            return RecipeViewHolder(view)
        }

        // Enlaza los datos de la receta con cada ViewHolder
        override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
            val recipe = recipes[position]
            holder.bind(recipe)
        }

        override fun getItemCount(): Int = recipes.size

        // ViewHolder para el RecyclerView
        inner class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            private val recipeImage: ImageView = itemView.findViewById(R.id.ivRecipeImage)
            private val recipeName: TextView = itemView.findViewById(R.id.tvRecipeName)
            private val recipeDescription: TextView = itemView.findViewById(R.id.tvRecipeDescription)
            private val recipeIngredients: TextView = itemView.findViewById(R.id.tvRecipeIngredients)
            private val recipeCalories: TextView = itemView.findViewById(R.id.tvRecipeCalories)

            // Asigna los datos al layout
            fun bind(recipe: Map<String, Any>) {
                recipeName.text = recipe["name"] as String
                recipeDescription.text = recipe["description"] as String
                recipeIngredients.text = "Ingredientes: ${recipe["ingredients"] as String}"
                recipeCalories.text = "Calorías: ${recipe["calories"] as String}"
                recipeImage.setImageResource(recipe["image"] as Int)
            }
        }
    }
}
