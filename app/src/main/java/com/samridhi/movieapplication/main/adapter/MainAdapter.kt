package com.samridhi.movieapplication.main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.samridhi.movieapplication.R
import com.samridhi.movieapplication.network.model.Genre

class MainAdapter(
    private var context: Context,
) : RecyclerView.Adapter<MainAdapter.ItemViewHolder>() {

    private var list: MutableList<Genre> = mutableListOf()

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun onBind(genre: Genre) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.view_movies, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = list[position]
        holder.onBind(item)
    }

    fun submitList(newList: List<Genre>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
