package com.example.responsi133

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.responsi133.ListProdukAdapter
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    val namaproduk = arrayOf<String>(
        "Air Mineral",
        "Berak Maknyus",
        "Biskuit Roma",
        "Hostes",
        "Kecap Bangau",
        "Oshi",
        "Pops",
        "Roti Enak",
        "Take Ku",
        "Teh Pucuk"
    )
    val keterangan = arrayOf<String>(
        "Aqua penghilang dehidrasi",
        "Beras sehat untuk tubuh",
        "Makanan ku",
        "Entah mau bilang apa lagi, ini enak banget",
        "Buat bikin nasi goreng paling enak",
        "Oshi ku oshi mu juga",
        "Makanan enak pastinya",
        "Roti ku",
        "Makanan Lezat",
        "Syeger saat diminum"
    )

    val gambar = arrayOf<Int>(
        R.drawable.aqua,
        R.drawable.beras,
        R.drawable.biskuit,
        R.drawable.hostes,
        R.drawable.kecap,
        R.drawable.oshi,
        R.drawable.pops,
        R.drawable.roti,
        R.drawable.take,
        R.drawable.teh
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val produk = ListProdukAdapter(this, namaproduk, keterangan, gambar)
        daftarproduk.adapter = produk

        daftarproduk.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "${namaproduk[position]} Anda Memilih  ${keterangan[position]}",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
