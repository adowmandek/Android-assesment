package com.example.assessment_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso


class PicturesDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pictures_detail)

        var name=intent.getStringExtra("Name")
        var nameintent=intent.getStringExtra("name")
        var imageintent=intent.getStringExtra("image").toString()

        var tvName=findViewById<TextView>(R.id.tvList)

        var tvimage=findViewById<ImageView>(R.id.IvPictures)
        Toast.makeText(baseContext,name, Toast.LENGTH_LONG).show()


        tvName.text=nameintent
        Picasso.get()
            .load(imageintent)
            .into(tvimage)
    }
}