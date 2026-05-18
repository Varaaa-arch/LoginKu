package com.example.loginku

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogout = findViewById<Button>(R.id.btnLogout)
        val cardProfile = findViewById<CardView>(R.id.cardProfile)
        val cardMateri = findViewById<CardView>(R.id.cardMateri)
        val cardTugas = findViewById<CardView>(R.id.cardTugas)
        val cardTentang = findViewById<CardView>(R.id.cardTentang)

        cardProfile.setOnClickListener { openDetail("Profile") }
        cardMateri.setOnClickListener { openDetail("Materi") }
        cardTugas.setOnClickListener { openDetail("Tugas") }
        cardTentang.setOnClickListener { openDetail("Tentang") }

        btnLogout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("show_logout_message", true)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }

    private fun openDetail(title: String) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("title", title)
        startActivity(intent)
    }
}