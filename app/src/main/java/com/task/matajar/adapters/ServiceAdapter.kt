//package com.task.matajar.adapters
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.navigation.NavController
//import androidx.recyclerview.widget.AsyncListDiffer
//import androidx.recyclerview.widget.DiffUtil
//import androidx.recyclerview.widget.RecyclerView
//import com.shinto.helpintern.Data.Get.AccomodationDataClassItem
//import com.shinto.helpintern.Data.Get.ServiceListItem
//import com.shinto.helpintern.R
//import com.task.matajar.model.Data
//import com.task.matajar.model.MetaJar
//
//class MetajarAdapter(
//    // private val ServiceResponse: List<ServiceListItem>?,
//    private val context: Context?,
//    //  navController: NavController
//) : RecyclerView.Adapter<MetajarAdapter.Metajaradapter>() {
//
//    inner class Metajaradapter(view: View) : RecyclerView.ViewHolder(view) {
//        val serviceHeading = view.findViewById<TextView>(R.id.serviceHeadingTxt)
//        val servicePlace = view.findViewById<TextView>(R.id.serviceDesignationTxt)
//        val serviceFair = view.findViewById<TextView>(R.id.minmFairTxt)
//    }
//
//    private val diffcallback = object : DiffUtil.ItemCallback<MetaJar>() {
//        override fun areItemsTheSame(
//            oldItem: MetaJar,
//            newItem: MetaJar
//        ): Boolean {
//            return oldItem.id == newItem.id
//        }
//
//        override fun areContentsTheSame(
//            oldItem: MetaJar,
//            newItem: MetaJar
//        ): Boolean {
//            return oldItem == newItem
//        }
//    }
//    val differ = AsyncListDiffer(this, diffcallback)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Metajaradapter {
//        val view = LayoutInflater.from(context).inflate(R.layout.servicecard, parent, false)
//        return Metajaradapter(view)
//    }
//
//    override fun onBindViewHolder(holder: Metajaradapter, position: Int) {
//        holder.serviceHeading.text = differ.currentList.get(position)?.city
//        holder.servicePlace.text = differ.currentList.get(position)?.country.toString()
//        holder.serviceFair.text = differ.currentList.get(position)?.province.toString()
//        val serv = differ.currentList[position]
//        holder.itemView.setOnClickListener {
//            onItemClickListener?.let {
//                it(serv)
//            }
//        }
//    }
//
//    private var onItemClickListener: ((MetaJar) -> Unit)? = null
//
//    fun setItemClickListener(listener: (MetaJar) -> Unit) {
//        onItemClickListener = listener
//    }
//
//    override fun getItemCount(): Int = differ.currentList.size
//
//}