package com.example.responsi133

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.responsi133.R

class ListProdukAdapter(
    private val context: Activity,
    private val namaproduk: Array<String>,
    private val keterangan: Array<String>,
    private val logo: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.nexthome, namaproduk) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.nexthome, null, true)
        val titleText = rowView.findViewById(R.id.namapro) as TextView
        val imageView = rowView.findViewById(R.id.logo) as ImageView

        titleText.text = namaproduk[position]
        imageView.setImageResource(logo[position])

        return rowView
    }
}