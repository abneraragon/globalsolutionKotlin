package com.example.abneraragon_rm95620_modelo_recyclerview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PraiaView: ViewModel(){

    var items = mutableListOf<Praia>()
    val itemsLiveData = MutableLiveData<List<Praia>>()

    fun addItem(nome: String, cidade: String, estado: String) {
        val item = Praia(nome, cidade, estado, onRemove = ::removeItem)
        items.add(item)
        itemsLiveData.value = items
    }

    private fun removeItem(item: Praia) {
        items.remove(item)
        itemsLiveData.value = items
    }
}