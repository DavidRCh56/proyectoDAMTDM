package com.iesvdc.multimedia.proyectodamtdm

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.iesvdc.multimedia.proyectodamtdm.model.Receta

class EditRecipeDialogFragment(
    private val receta: Receta? = null,
    private val onRecipeEdited: (Receta) -> Unit
) : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.dialog_edit_recipe, container, false)

        val etName = view.findViewById<EditText>(R.id.etEditName)
        val etDescription = view.findViewById<EditText>(R.id.etEditDescription)
        val etIngredients = view.findViewById<EditText>(R.id.etEditIngredients)
        val etCalories = view.findViewById<EditText>(R.id.etEditCalories)
        val btnSave = view.findViewById<Button>(R.id.btnSave)
        val btnCancel = view.findViewById<Button>(R.id.btnCancel)

        if (receta != null) {
            // Editar receta existente
            etName.setText(receta.name)
            etDescription.setText(receta.description)
            etIngredients.setText(receta.ingredients)
            etCalories.setText(receta.calories.replace("kcal", "").trim())
        } else {
            // Añadir nueva receta: Mostrar ejemplos en los campos
            etName.hint = "Ejemplo: Paella"
            etDescription.hint = "Ejemplo: Deliciosa paella de mariscos"
            etIngredients.hint = "Ejemplo: Arroz, gambas, mejillones"
            etCalories.hint = "Ejemplo: 450"
        }

        // Validar calorías para que solo sean números
        setupCaloriesValidation(etCalories)

        btnSave.setOnClickListener {
            val name = etName.text.toString().trim()
            val description = etDescription.text.toString().trim()
            val ingredients = etIngredients.text.toString().trim()
            val calories = etCalories.text.toString().trim()

            if (validateFields(name, description, ingredients, calories)) {
                val formattedCalories = "$calories kcal"
                val newReceta = receta?.copy(
                    name = name,
                    description = description,
                    ingredients = ingredients,
                    calories = formattedCalories
                ) ?: Receta(
                    id = System.currentTimeMillis().toInt(),
                    name = name,
                    description = description,
                    ingredients = ingredients,
                    calories = formattedCalories,
                    image = R.drawable.entrecot_de_ternera
                )
                onRecipeEdited(newReceta)
                dismiss()
            } else {
                Toast.makeText(context, "Por favor, completa todos los campos correctamente", Toast.LENGTH_SHORT).show()
            }
        }

        btnCancel.setOnClickListener { dismiss() }
        return view
    }

    private fun setupCaloriesValidation(etCalories: EditText) {
        etCalories.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                if (s != null) {
                    val text = s.toString()
                    if (text.isNotEmpty() && !text.matches("\\d+".toRegex())) {
                        etCalories.error = "Solo se permiten números"
                    }
                }
            }
        })
    }

    private fun validateFields(
        name: String,
        description: String,
        ingredients: String,
        calories: String
    ): Boolean {
        return name.isNotBlank() &&
                description.isNotBlank() &&
                ingredients.isNotBlank() &&
                calories.matches("\\d+".toRegex())
    }
}
