package com.example.abneraragon_rm95620_modelo_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(items: MutableList<Praia>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    private var items = listOf<Praia>()

    fun updateItems(newItems: List<Praia>) {
        items = newItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemlayout, parent, false)
        return ItemViewHolder(view)
    }
    override fun getItemCount(): Int = items.size
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }
    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var editTextNomePraia = view.findViewById<TextView>(R.id.editTextNomePraia)
        var editTextCidade = view.findViewById<TextView>(R.id.editTextCidade)
        var editTextEstado = view.findViewById<TextView>(R.id.editTextEstado)
        //val button = view.findViewById<ImageButton>(R.id.imageButton)
        fun bind(item: Praia) {
            editTextNomePraia.text = item.nome
            editTextCidade.text = item.cidade
            editTextEstado.text = item.estado
//            button.setOnClickListener {
//                item.onRemove(item)
//            }
        }
    }
}