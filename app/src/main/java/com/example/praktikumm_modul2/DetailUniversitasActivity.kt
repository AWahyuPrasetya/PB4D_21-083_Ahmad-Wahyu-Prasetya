package com.example.praktikumm_modul2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailUniversitasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_universitas)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val universitas = intent.getParcelableExtra<Universitas>(MainActivity.INTENT_PARCELABLE)

        val imgUniversitas = findViewById<ImageView>(R.id.img_item_photo)
        val nameUniversitas = findViewById<TextView>(R.id.tv_item_name)
        val descUniversitas = findViewById<TextView>(R.id.tv_item_description)

        imgUniversitas.setImageResource(universitas?.imgUniversitas!!)
        nameUniversitas.text = universitas.nameUniversitas
        descUniversitas.text = universitas.descUniversitas
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}