package com.iesvdc.multimedia.proyectodamtdm.model

data class Receta(
    val id: Int,
    val name: String,
    val description: String,
    val ingredients: String,
    val calories: String,
    val image: Int
)