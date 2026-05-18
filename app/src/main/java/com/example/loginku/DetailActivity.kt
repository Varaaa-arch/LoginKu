package com.example.loginku

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val tvTitle = findViewById<TextView>(R.id.tvDetailTitle)
        val tvDesc = findViewById<TextView>(R.id.tvDetailDesc)
        val ivIcon = findViewById<ImageView>(R.id.ivDetailIcon)
        val btnAction = findViewById<Button>(R.id.btnAction)

        val title = intent.getStringExtra("title") ?: "Detail"
        tvTitle.text = title

        when (title) {
            "Profile" -> {
                ivIcon.setImageResource(R.drawable.ic_user)
                tvDesc.text = "Halaman ini berisi informasi lengkap mengenai profil Anda sebagai siswa Bizar Givardi. Anda dapat mengelola data pribadi dan preferensi akun di sini."
                btnAction.text = "Edit Profil"
            }
            "Materi" -> {
                ivIcon.setImageResource(R.drawable.ic_book)
                tvDesc.text = "Akses seluruh modul pembelajaran Pemrograman Perangkat Bergerak menggunakan Kotlin dan Android Studio. Belajar dari dasar hingga mahir."
                btnAction.text = "Buka Modul"
            }
            "Tugas" -> {
                ivIcon.setImageResource(R.drawable.ic_assignment)
                tvDesc.text = "Lihat daftar tugas yang perlu dikerjakan. Pastikan Anda menyelesaikan tepat waktu untuk mendapatkan hasil yang maksimal."
                btnAction.text = "Kirim Tugas"
            }
            "Tentang" -> {
                ivIcon.setImageResource(R.drawable.ic_info)
                tvDesc.text = "LoginKu v2.4 adalah aplikasi edukasi modern yang dirancang untuk memudahkan interaksi antara pengajar dan siswa dalam proses belajar mengajar."
                btnAction.text = "Cek Update"
            }
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}