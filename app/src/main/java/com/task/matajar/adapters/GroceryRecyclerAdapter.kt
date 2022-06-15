//package com.task.matajar.adapters
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.AsyncListDiffer
//import androidx.recyclerview.widget.DiffUtil
//import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//import com.task.matajar.`interface`.OnItemClickListeners
//import com.task.matajar.databinding.ProductCardBinding
//import com.task.matajar.model.Data
//
////val list:List<String>
//class GroceryRecyclerAdapter(private val listener: OnItemClickListeners) :
//    RecyclerView.Adapter<GroceryRecyclerAdapter.ItemHolder>() {
//
//
//    private val diffCallBack = object : DiffUtil.ItemCallback<Data>() {
//        override fun areItemsTheSame(oldItem: Data, newItem: Data): Boolean {
//            return oldItem == newItem
//        }
//
//        override fun areContentsTheSame(oldItem: Data, newItem: Data): Boolean {
//            return oldItem.pkProductId == newItem.pkProductId
//        }
//
//    }
//    val differ = AsyncListDiffer(this, diffCallBack)
//
//
//    inner class ItemHolder(val binding: ProductCardBinding) : RecyclerView.ViewHolder(binding.root),
//        View.OnClickListener {
//
//        init {
//            binding.singleItem.setOnClickListener(this)
//        }
//
//
//        override fun onClick(v: View?) {
//          //  val position =
////            if (position != RecyclerView.NO_POSITION) {
////                listener.onItemClick(position)
////            }
//        }
//
//    }
//
//
//    override fun onCreateViewHolder(
//        parent: ViewGroup, viewType: Int
//    ): GroceryRecyclerAdapter.ItemHolder {
//        return ItemHolder(
//            ProductCardBinding.inflate(
//                LayoutInflater.from(parent.context),
//                parent,
//                false
//            )
//        )
//    }
//
//
//    override fun onBindViewHolder(holder: GroceryRecyclerAdapter.ItemHolder, position: Int) {
//        val item = differ.currentList[position]
//
//       // val price = "${item.intMRP}/${item.intMaxQuantity}"
//        holder.binding.apply {
//            mainHead.text = item.strProductName
//            subHead.text = item.strBrandName
//        }
//
//        Glide
//            .with(holder.itemView.context)
//            .load(item.arrayThumbnail)
//            .centerCrop()
//            // .placeholder(R.drawable.loading_spinner)
//            .into(holder.binding.productImage)
//    }
//
//    override fun getItemCount() = differ.currentList.size
//}