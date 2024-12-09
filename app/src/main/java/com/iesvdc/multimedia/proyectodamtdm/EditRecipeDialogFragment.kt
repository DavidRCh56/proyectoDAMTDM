package com.iesvdc.multimedia.proyectodamtdm

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment
import com.iesvdc.multimedia.proyectodamtdm.model.Receta

class EditRecipeDialogFragment(
    private val receta: Receta,
    private val onRecipeEdited: (Receta) -> Unit
) : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return super.onCreateDialog(savedInstanceState).apply {
            setCancelable(false) // Evita que el diálogo se cierre tocando fuera
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.dialog_edit_recipe, container, false)

        // Referencias a los campos de edición
        val etName = view.findViewById<EditText>(R.id.etEditName)
        val etDescription = view.findViewById<EditText>(R.id.etEditDescription)
        val etIngredients = view.findViewById<EditText>(R.id.etEditIngredients)
        val etCalories = view.findViewById<EditText>(R.id.etEditCalories)
        val btnSave = view.findViewById<Button>(R.id.btnSave)
        val btnCancel = view.findViewById<Button>(R.id.btnCancel)

        // Rellenar los campos con la información de la receta
        etName.setText(receta.name)
        etDescription.setText(receta.description)
        etIngredients.setText(receta.ingredients)
        etCalories.setText(receta.calories)

        // Botón Guardar: Actualiza la receta y llama al callback
        btnSave.setOnClickListener {
            val updatedRecipe = receta.copy(
                name = etName.text.toString(),
                description = etDescription.text.toString(),
                ingredients = etIngredients.text.toString(),
                calories = etCalories.text.toString()
            )
            onRecipeEdited(updatedRecipe)
            dismiss() // Cierra el diálogo
        }

        // Botón Cancelar: Cierra el diálogo sin cambios
        btnCancel.setOnClickListener {
            dismiss()
        }

        return view
    }
}
