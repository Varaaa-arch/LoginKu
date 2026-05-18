package com.example.loginku

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvError = findViewById<TextView>(R.id.tvError)
        val tvLogoutMessage = findViewById<TextView>(R.id.tvLogoutMessage)

        // Cek apakah baru saja logout
        val showLogoutMessage = intent.getBooleanExtra("show_logout_message", false)
        if (showLogoutMessage) {
            tvLogoutMessage.visibility = View.VISIBLE
        }

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            // Validasi sederhana
            if (username == "bizar" && password == "123456789") {
                tvError.visibility = View.GONE
                tvLogoutMessage.visibility = View.GONE
                
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                tvError.visibility = View.VISIBLE
                tvLogoutMessage.visibility = View.GONE
            }
        }
    }
}