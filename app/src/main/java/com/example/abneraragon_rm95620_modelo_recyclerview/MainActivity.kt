package com.example.abneraragon_rm95620_modelo_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var editTextNomePraia: EditText
    private lateinit var editTextCidade: EditText
    private lateinit var editTextEstado: EditText
    private lateinit var buttonIncluir: Button
    private lateinit var recyclerView: RecyclerView

    val praia: PraiaView = PraiaView()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editTextNomePraia = findViewById(R.id.editTextNomePraia)
        editTextCidade = findViewById(R.id.editTextCidade)
        editTextEstado = findViewById(R.id.editTextEstado)
        buttonIncluir = findViewById(R.id.buttonIncluir)
        recyclerView = findViewById(R.id.recyclerView)

        var nomePraia = editTextNomePraia.text.toString()
        var cidade = editTextCidade.text.toString()
        var estado = editTextEstado.text.toString()


        buttonIncluir.setOnClickListener {


            if(editTextNomePraia.text.isEmpty() ||
                editTextCidade.text.isEmpty() ||
                editTextEstado.text.isEmpty()) {
                Toast.makeText(this, "Informe todos os dados", Toast.LENGTH_SHORT).show()
            } else {
                praia.addItem(nomePraia, cidade, estado)
                Toast.makeText(this, "Novo item adicionado!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}