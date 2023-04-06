package com.example.praktikumm_modul2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UniversitasAdapter(private val context: Context, private val universitas: List<Universitas>, val listener: (Universitas) -> Unit)
    : RecyclerView.Adapter<UniversitasAdapter.UniversitasViewHolder>(){

    class UniversitasViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgUniversitas = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameUniversitas = view.findViewById<TextView>(R.id.tv_item_name)
        val descUniversitas = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(universitas: Universitas, listener: (Universitas) -> Unit){
            imgUniversitas.setImageResource(universitas.imgUniversitas)
            nameUniversitas.text = universitas.nameUniversitas
            descUniversitas.text = universitas.descUniversitas
            itemView.setOnClickListener {
                listener(universitas)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UniversitasViewHolder {
        return UniversitasViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_universitas, parent, false)
        )
    }

    override fun onBindViewHolder(holder: UniversitasViewHolder, position: Int) {
        holder.bindView(universitas[position], listener)
    }

    override fun getItemCount(): Int = universitas.size
    }

