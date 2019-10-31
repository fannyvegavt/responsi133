package com.example.responsi133

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var user: EditText = findViewById(R.id.un)
        var nama: EditText = findViewById(R.id.nm)
        var email: EditText = findViewById(R.id.email)


        btn_msk.setOnClickListener() {
            intent = Intent(this, DaftarPengguna::class.java)
            intent.putExtra("Username",user.getText())
            intent.putExtra("Nama",nama.getText())
            intent.putExtra("Email",email.getText())
            startActivity(intent)
        }
    }
}
