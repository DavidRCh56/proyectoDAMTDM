package com.iesvdc.multimedia.proyectodamtdm

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private val MYUSER = "david"
    private val MYPASS = "1234"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsername = findViewById<EditText>(R.id.etUsuario)
        val etPassword = findViewById<EditText>(R.id.etContrasenna)
        val btnValidar = findViewById<Button>(R.id.Validar)

        btnValidar.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username == MYUSER && password == MYPASS) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("usuario", username)
                intent.putExtra("contrasenna", password)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}