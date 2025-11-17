//package com.example.heritagelens
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//
//class MonumentsAdapter(private val items: List<Monument>) :
//    RecyclerView.Adapter<MonumentsAdapter.ViewHolder>() {
//
//    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        val imageView: ImageView = view.findViewById(R.id.imageView)
//        val titleText: TextView = view.findViewById(R.id.titleText)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view = LayoutInflater.from(parent.context)
//            .inflate(R.layout.item_monument, parent, false)
//        return ViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val monument = items[position]
//        holder.imageView.setImageResource(monument.imageResId)
//        holder.titleText.text = monument.name
//    }
//
//    override fun getItemCount() = items.size
//}
package com.example.heritagelens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MonumentsAdapter(
    private val items: List<Monument>,
    private val onItemClick: (Monument) -> Unit
) : RecyclerView.Adapter<MonumentsAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val titleText: TextView = view.findViewById(R.id.titleText)

        fun bind(monument: Monument) {
            imageView.setImageResource(monument.imageResId)
            titleText.text = monument.name

            itemView.setOnClickListener {
                onItemClick(monument)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_monument, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size
}
//fun bind(monument: Monument) {
//    imageView.setImageResource(monument.imageResId)
//    titleText.text = monument.name
//    itemView.setOnClickListener {
//        onItemClick(monument)
//    }
//}
