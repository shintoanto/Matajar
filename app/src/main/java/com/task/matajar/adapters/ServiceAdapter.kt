package com.task.matajar.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.task.matajar.R
import com.task.matajar.model.Data

class MetajarAdapter(
    // private val ServiceResponse: List<ServiceListItem>?,
    private val context: Context?,
    //  navController: NavController
) : RecyclerView.Adapter<MetajarAdapter.Metajaradapter>() {

    inner class Metajaradapter(view: View) : RecyclerView.ViewHolder(view) {
        val headProductName = view.findViewById<TextView>(R.id.mainHead)
        val subHeadig = view.findViewById<TextView>(R.id.subHead)
        val productImage = view.findViewById<ImageView>(R.id.productImage)
    }

    private val diffcallback = object : DiffUtil.ItemCallback<Data>() {
        override fun areItemsTheSame(
            oldItem: Data,
            newItem: Data
        ): Boolean {
            return oldItem.pkProductId == newItem.pkProductId
        }

        override fun areContentsTheSame(
            oldItem: Data,
            newItem: Data
        ): Boolean {
            return oldItem == newItem
        }
    }
    val differ = AsyncListDiffer(this, diffcallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Metajaradapter {
        val view = LayoutInflater.from(context).inflate(R.layout.product_card, parent, false)
        return Metajaradapter(view)
    }

    override fun onBindViewHolder(holder: Metajaradapter, position: Int) {
        holder.headProductName.text = differ.currentList.get(position)?.strProductName
        holder.subHeadig.text = differ.currentList.get(position)?.strBrandName
        Glide.with(holder.itemView).load(differ.currentList.size).into(holder.productImage)
        val serv = differ.currentList[position]
        holder.itemView.setOnClickListener {
            onItemClickListener?.let {
                it(serv)
            }
        }
    }

    private var onItemClickListener: ((Data) -> Unit)? = null

    fun setItemClickListener(listener: (Data) -> Unit) {
        onItemClickListener = listener
    }

    override fun getItemCount(): Int = differ.currentList.size

}