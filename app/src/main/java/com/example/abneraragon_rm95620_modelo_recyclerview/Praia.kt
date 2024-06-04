package com.example.abneraragon_rm95620_modelo_recyclerview

data class Praia (
    val nome:String,
    val cidade:String,
    val estado:String,
    val onRemove: (Praia) -> Unit
)