package com.b12game.recyclerviewnecoru.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.b12game.recyclerviewnecoru.R
import com.b12game.recyclerviewnecoru.databinding.PlantItemBinding
import com.b12game.recyclerviewnecoru.model.Planf

class PlantAdapter(var context: Context, var items: ArrayList<Planf>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.plant_item,parent,false)
        return PlantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if(holder is PlantViewHolder){
            val image = holder.image
            val title = holder.title

            image.setImageResource(item.image)
            title.text = item.title
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addToList(plantList: Planf){
        items.add(plantList)
        notifyDataSetChanged()
    }

    inner class PlantViewHolder(view : View):RecyclerView.ViewHolder(view){
        val binding = PlantItemBinding.bind(view)
        var image: ImageView
        var title: TextView

        init {
            image = binding.ivImage
            title = binding.tvTitle
        }

    }



}