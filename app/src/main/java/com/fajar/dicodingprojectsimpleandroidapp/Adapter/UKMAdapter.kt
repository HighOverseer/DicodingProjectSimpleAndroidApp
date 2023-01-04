package com.fajar.dicodingprojectsimpleandroidapp.Adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fajar.dicodingprojectsimpleandroidapp.Constant.ukm
import com.fajar.dicodingprojectsimpleandroidapp.DataModel.UKM
import com.fajar.dicodingprojectsimpleandroidapp.R
import com.fajar.dicodingprojectsimpleandroidapp.activity.MainActivity

class UKMAdapter(val items: ArrayList<UKM>):RecyclerView.Adapter<UKMAdapter.UKMViewHolder>() {

    inner class UKMViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val iv_logo = itemView.findViewById<ImageView>(R.id.iv_logo)
        val tv_nama = itemView.findViewById<TextView>(R.id.tv_nama)
        val tv_deskripsi = itemView.findViewById<TextView>(R.id.tv_deskripsi)
        val ib_favorite = itemView.findViewById<ImageButton>(R.id.ib_favorite)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UKMViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return UKMViewHolder(view)
    }

    override fun onBindViewHolder(holder: UKMViewHolder, position: Int) {


        val item = items[position]
        holder.apply {
            Glide.with(itemView.context)
                .load(item.logo)
                .apply(RequestOptions().override(120, 70))
                .into(iv_logo)

            tv_nama.text = item.nama
            tv_deskripsi.text = item.deskripsi

            if(item.favorite == 1){
                ib_favorite.setImageResource(R.drawable.ic_favorite_filled)
            }

            if(itemView.context is MainActivity){
                itemView.setOnClickListener {
                    (itemView.context as MainActivity).itemGetClicked(item)
                }
            }
            ib_favorite.setOnClickListener {
                // check di List Favorites
                if(isInListFavorite() == true){
                    //digunakan mapToNumber karena posisi saat di list Favorites berbeda dengan posisi di Beranda
                    ukm.favorite[ukm.mapToNumber[item.nama]!!] = 0

                    if(itemView.context is MainActivity){
                        Toast.makeText(itemView.context, "Kamu Telah Menghapus UKM ${item.nama} ke Daftar Favorit", Toast.LENGTH_LONG).show()
                    }
                    items.removeAt(position)
                    notifyItemRemoved(position)
                }else{
                    if(item.favorite == 0){
                        ukm.favorite[position] = 1
                        item.favorite = 1
                        if(itemView.context is MainActivity){
                            Toast.makeText(itemView.context, "Kamu Telah Menambahkan UKM ${item.nama} ke Daftar Favorit", Toast.LENGTH_LONG).show()
                        }
                        ib_favorite.setImageResource(R.drawable.ic_favorite_filled)
                    }else if(item.favorite == 1){
                        ukm.favorite[position] = 0
                        item.favorite = 0
                        if(itemView.context is MainActivity){
                            Toast.makeText(itemView.context, "Kamu Telah Menghapus UKM ${item.nama} dari Daftar Favorit", Toast.LENGTH_LONG).show()
                        }
                        ib_favorite.setImageResource(R.drawable.ic_favorite_outline)
                    }
                }


            }




        }
    }



    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int) = position

    private fun isInListFavorite():Boolean{
        items.forEach {
            if(it.favorite != 1){
                return false
            }
        }
        return true
    }


}