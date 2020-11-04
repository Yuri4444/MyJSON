package com.webanimal.myjson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UsersAdapter(private val users: List<User>) : RecyclerView.Adapter<UsersAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name1: TextView = itemView.findViewById(R.id.tvName)
        val info1: TextView = itemView.findViewById(R.id.tvInfo)
        val id1: TextView = itemView.findViewById(R.id.tvID)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var user = users[position]
        holder.name1.text = user.name
        holder.info1.text = user.email
        holder.id1.text = user.id.toString()
    }

    override fun getItemCount() = users.size

}
