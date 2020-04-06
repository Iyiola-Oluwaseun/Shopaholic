package com.example.shopaholic

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.hostel_view.view.*

class HallAdapter (var items: ArrayList<Halls>, var clickListner: OnHallItemClickListener) : RecyclerView.Adapter<HallViewHolder>() {
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HallViewHolder {
        lateinit var hallViewHolder : HallViewHolder
        hallViewHolder = HallViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.hostel_view,parent,false)

        )
        return hallViewHolder

    }

    override fun onBindViewHolder(holder: HallViewHolder, position: Int) {
       /*older.hallName?.text = items.get(position).name
        holder.hallDescription?.text = items.get(position).description
        holder.halllogo.setImageResource(items.get(position).logo)*/
        holder.initialize(items.get(position),clickListner)
    }
}



class HallViewHolder (itemView:View) :RecyclerView.ViewHolder(itemView){
    var hallName = itemView.hallname
    var hallDescription = itemView.halldescription
    var halllogo = itemView.halllogo

    fun initialize(item: Halls, action:OnHallItemClickListener){
        hallName.text = item.name
        hallDescription.text = item.name
        halllogo.setImageResource(item.logo)

        itemView.setOnClickListener{
         action.onItemClick(item, adapterPosition)
        }
    }
}

interface OnHallItemClickListener {
    fun onItemClick(item: Halls, position: Int)
}