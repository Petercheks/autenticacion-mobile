package com.example.login_autenticacion

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BienvenidaActivity : AppCompatActivity() {

    private lateinit var textViewUser: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bienvenida)

        val bundle = intent.extras

        val user = bundle?.getString("user", "Unknow")
        textViewUser = findViewById<TextView>(R.id.textViewUser)

        textViewUser.text = user
    }
}