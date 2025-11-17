package com.example.heritagelens
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NearbyMonumentsAdapter(private val monuments: List<NearbyMonument>) :
    RecyclerView.Adapter<NearbyMonumentsAdapter.MonumentViewHolder>() {

    class MonumentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val monumentName: TextView = itemView.findViewById(R.id.monumentName)
        val monumentImage: ImageView = itemView.findViewById(R.id.monumentImage)
        val monumentDistance: TextView = itemView.findViewById(R.id.monumentDistance)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonumentViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_nearby_monument, parent, false)
        return MonumentViewHolder(view)
    }

    override fun onBindViewHolder(holder: MonumentViewHolder, position: Int) {
        val monument = monuments[position]
        holder.monumentName.text = monument.name
        holder.monumentImage.setImageResource(monument.imageResId)
    }

    override fun getItemCount(): Int = monuments.size
}
