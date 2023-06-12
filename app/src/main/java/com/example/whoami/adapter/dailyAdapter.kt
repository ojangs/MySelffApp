package com.example.whoami.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.whoami.R
import com.example.whoami.datamodel.friendslistModel
import de.hdodenhof.circleimageview.CircleImageView

class dailyAdapter(private val dataList: List<friendslistModel>) : RecyclerView.Adapter<dailyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.friendslist, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]

        holder.fotoTeman.setImageResource(data.tittleimage)
        holder.namaTeman.text = data.nama
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val fotoTeman: CircleImageView = itemView.findViewById(R.id.fototeman)
        val namaTeman: TextView = itemView.findViewById(R.id.namateman)
    }
}
