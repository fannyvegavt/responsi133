package com.example.responsi133

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reg.setOnClickListener(){
            intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

        btn_log.setOnClickListener() {
            val username = user.text.toString()
            val password = paswrd.text.toString()

            if (username.equals("fanny") && password.equals("rapunzel")) {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Salah", Toast.LENGTH_LONG).show()
            }
        }
    }
}
