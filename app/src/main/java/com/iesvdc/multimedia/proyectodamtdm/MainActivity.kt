package com.iesvdc.multimedia.proyectodamtdm

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iesvdc.multimedia.proyectodamtdm.adapter.RecetaAdapter
import com.iesvdc.multimedia.proyectodamtdm.model.Receta

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lista de recetas
        val recipes = listOf(
            Receta(
                name = "Paella",
                description = "Paella con mariscos y vegetales.",
                ingredients = "Arroz, mariscos, vegetales",
                calories = "450 kcal",
                image = R.drawable.entrecot_de_ternera
            ),
            Receta(
                name = "Gazpacho",
                description = "Sopa fría de tomate.",
                ingredients = "Tomate, pepino, pimiento",
                calories = "100 kcal",
                image = R.drawable.entrecot_de_ternera
            ),
            Receta(
                name = "Tortilla de Patatas",
                description = "Clásica tortilla española.",
                ingredients = "Patatas, huevo, cebolla",
                calories = "250 kcal",
                image = R.drawable.entrecot_de_ternera
            )
        )

        // Configurar RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rvRecipes)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecetaAdapter(
            recipes,
            onDelete = { recipe ->
                Toast.makeText(this, "Eliminar: ${recipe.name}", Toast.LENGTH_SHORT).show()
            },
            onEdit = { recipe ->
                Toast.makeText(this, "Editar: ${recipe.name}", Toast.LENGTH_SHORT).show()
            }
        )
    }
}
