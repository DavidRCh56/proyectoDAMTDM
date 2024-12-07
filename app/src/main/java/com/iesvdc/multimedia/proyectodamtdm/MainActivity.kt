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

        // Lista de recetas mutable
        val recipes = mutableListOf(
            Receta(
                id = 1,
                name = "Paella",
                description = "Paella con mariscos y vegetales.",
                ingredients = "Arroz, mariscos, vegetales",
                calories = "450 kcal",
                image = R.drawable.entrecot_de_ternera
            ),
            Receta(
                id = 2,
                name = "Gazpacho",
                description = "Sopa fría de tomate.",
                ingredients = "Tomate, pepino, pimiento",
                calories = "100 kcal",
                image = R.drawable.entrecot_de_ternera
            ),
            Receta(
                id = 3,
                name = "Tortilla de Patatas",
                description = "Clásica tortilla española.",
                ingredients = "Patatas, huevo, cebolla",
                calories = "250 kcal",
                image = R.drawable.entrecot_de_ternera
            ),
            Receta(
                id = 4,
                name = "Ensalada César",
                description = "Clásica ensalada con lechuga, pollo y aderezo César.",
                ingredients = "Lechuga, pollo, aderezo César, crutones",
                calories = "300 kcal",
                image = R.drawable.entrecot_de_ternera
            ),
            Receta(
                id = 5,
                name = "Pizza Margarita",
                description = "Pizza con base de tomate, queso mozzarella y albahaca.",
                ingredients = "Masa, tomate, mozzarella, albahaca",
                calories = "500 kcal",
                image = R.drawable.entrecot_de_ternera
            ),
            Receta(
                id = 6,
                name = "Crema de Calabaza",
                description = "Sopa cremosa hecha de calabaza asada.",
                ingredients = "Calabaza, nata, cebolla, caldo de pollo",
                calories = "200 kcal",
                image = R.drawable.entrecot_de_ternera
            ),
            Receta(
                id = 7,
                name = "Pollo al Curry",
                description = "Pollo cocinado en una rica salsa de curry.",
                ingredients = "Pollo, curry, leche de coco, arroz",
                calories = "450 kcal",
                image = R.drawable.entrecot_de_ternera
            ),
            Receta(
                id = 8,
                name = "Lasaña Boloñesa",
                description = "Lasaña al horno con salsa boloñesa y bechamel.",
                ingredients = "Pasta, carne picada, tomate, bechamel, queso",
                calories = "600 kcal",
                image = R.drawable.entrecot_de_ternera
            ),
            Receta(
                id = 9,
                name = "Hamburguesa Clásica",
                description = "Hamburguesa con queso, lechuga, tomate y cebolla.",
                ingredients = "Pan, carne de res, queso, lechuga, tomate, cebolla",
                calories = "700 kcal",
                image = R.drawable.entrecot_de_ternera
            ),
            Receta(
                id = 10,
                name = "Sushi Variado",
                description = "Rollos de sushi con pescado, arroz y alga nori.",
                ingredients = "Arroz, salmón, atún, alga nori, aguacate",
                calories = "350 kcal",
                image = R.drawable.entrecot_de_ternera
            ),
            Receta(
                id = 11,
                name = "Ceviche de Pescado",
                description = "Plato refrescante de pescado marinado en cítricos.",
                ingredients = "Pescado blanco, limón, cebolla, cilantro",
                calories = "250 kcal",
                image = R.drawable.entrecot_de_ternera
            ),
            Receta(
                id = 12,
                name = "Brownie de Chocolate",
                description = "Postre de chocolate con una textura densa y húmeda.",
                ingredients = "Chocolate, mantequilla, harina, huevos, azúcar",
                calories = "400 kcal",
                image = R.drawable.entrecot_de_ternera
            ),
            Receta(
                id = 13,
                name = "Risotto de Setas",
                description = "Arroz cremoso cocinado con setas y queso parmesano.",
                ingredients = "Arroz, setas, caldo, parmesano, vino blanco",
                calories = "500 kcal",
                image = R.drawable.entrecot_de_ternera
            )
        )

        // Configurar RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rvRecipes)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecetaAdapter(
            recipes,
            onDelete = { recipe ->
                // Aquí puedes agregar una notificación de eliminación si lo deseas
                Toast.makeText(this, "${recipe.name} ha sido eliminado", Toast.LENGTH_SHORT).show()
            },
            onEdit = { recipe ->
                Toast.makeText(this, "Editar: ${recipe.name}", Toast.LENGTH_SHORT).show()
            }
        )
    }
}