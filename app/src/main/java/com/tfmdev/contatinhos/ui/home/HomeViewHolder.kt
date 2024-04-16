package com.tfmdev.contatinhos.ui.home

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.tfmdev.contatinhos.data.local.Contact
import com.tfmdev.contatinhos.databinding.HomeItemBinding

class HomeViewHolder(itemView: View, val listener: ((view: View, position: Int) -> Unit)?) :
    ViewHolder(itemView) {
        
    private val binding = HomeItemBinding.bind(itemView)

    fun bind(item: Contact) {
        binding.tvName.text = item.name
        binding.smStatus.isChecked = item.isActive
        binding.smStatus.setOnClickListener {
            listener?.invoke(itemView, adapterPosition)
        }
    }
}
