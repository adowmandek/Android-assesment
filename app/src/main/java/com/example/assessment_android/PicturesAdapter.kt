package com.example.assessment_android

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class PicturesAdapter(var picturesDetail: List<Pictures>, var context: Context):RecyclerView.Adapter<PicturesHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PicturesHolder{
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_pictures, parent, false)
        return PicturesHolder(itemView)
    }

    override fun onBindViewHolder(holder: PicturesHolder, position: Int) {
        var currentPictures = picturesDetail.get(position)
        holder.listFood.text = currentPictures.lIST

        var intent = Intent(context, PicturesDetail::class.java)
        intent.putExtra("Name", currentPictures.lIST)
        intent.putExtra("imageUrl", currentPictures.imageUrl)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        context.startActivity(intent)


        Picasso.get()
            .load(currentPictures.imageUrl)
            .resize(80, 80)
            .centerCrop()

    }

    override fun getItemCount(): Int {
        return picturesDetail.size
    }
}

class PicturesHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var listFood = itemView.findViewById<TextView>(R.id.tvList)
    var ivPictures = itemView.findViewById<TextView>(R.id.IvPictures)



}