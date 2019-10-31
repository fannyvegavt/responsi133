package com.example.responsi133

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_daftar_pengguna.*

class DaftarPengguna : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_pengguna)

        val bundle: Bundle? = intent.extras
        val user = bundle?.get("Username")
        val nama = bundle?.get("Nama")
        val email = bundle?.get("Email")

        tv_user.setText("" + user)
        tv_nama.setText("" + nama)
        tv_email.setText("" + email)

        btn_bck.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
