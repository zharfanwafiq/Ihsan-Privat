package com.zharfan.ihsanprivat.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zharfan.ihsanprivat.data.IhsanPrivatMenuHome
import com.zharfan.ihsanprivat.databinding.ItemGridMenuBinding

class GridMenuAdapter(private val listMenu: ArrayList<IhsanPrivatMenuHome>):
    RecyclerView.Adapter<GridMenuAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemGridMenuBinding.inflate(LayoutInflater.from(parent.context),parent,
            false)
        )

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.bind(listMenu[position])
    }

    override fun getItemCount(): Int = listMenu.size

    inner class MyViewHolder(private val binding: ItemGridMenuBinding):
            RecyclerView.ViewHolder(binding.root){

        fun bind(menu: IhsanPrivatMenuHome) {
            binding.apply {
                Glide.with(itemView.context)
                    .load(menu.menuIcons)
                    .into(imgMenus)

                tvMenus.text = menu.menuNames

                gridMenus.setOnClickListener{
                    Toast.makeText(itemView.context, "Menu Clicked", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }


}