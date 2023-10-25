package com.example.carrotmarket

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket.databinding.ItemHomeProductBinding

class ProductAdapter(val productList : ArrayList<Product>) : RecyclerView.Adapter<ProductAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.Holder {
        val binding = ItemHomeProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: ProductAdapter.Holder, position: Int) {
        holder.bind(productList[position])
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    inner class Holder(val binding : ItemHomeProductBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(product: Product){
//            binding.ivProductPicture.setImageResource(product.product_img)
            binding.tvProductTitle.text = product.product_title
//            binding.tvProductId.text = product.product_id
            binding.tvProductPrice.text = product.product_price
            binding.tvItemHomeComment.text = product.comment_count.toString()
            binding.tvItemHomeLike.text = product.like_count.toString()
        }

    }


}