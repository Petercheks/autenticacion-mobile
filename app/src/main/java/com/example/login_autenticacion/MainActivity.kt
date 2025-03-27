package com.example.login_autenticacion

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var inputUser: EditText
    private lateinit var inputPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        inputUser = findViewById<EditText>(R.id.inputUser)
        inputPassword = findViewById<EditText>(R.id.inputPassword)
        buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            redirectToBienvenida()
        }
    }

    private fun redirectToBienvenida() {
        var user = inputUser.text.toString()
        var password = inputPassword.text.toString()

        // validamos que no esten vacios los campos usuario y contrasenia
        if (user.trim().isEmpty() || password.isEmpty()) {
            Log.w("tag", "campos incompletos")
        } else {
            val intent: Intent = Intent(this, BienvenidaActivity::class.java)
            intent.putExtra("user", user)

            startActivity(intent)
        }
    }
}
