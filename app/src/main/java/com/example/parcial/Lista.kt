package com.example.parcial

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.parcial.databinding.ActivityListaBinding

class Lista : AppCompatActivity() {
    private lateinit var binding: ActivityListaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val numero = intent.getIntExtra("numero", 1)
        val secuencia = mutableListOf<String>()
        var factorial = 1
        for (i in 1..numero) {
            if (i == 1) {
                secuencia.add("1")
            } else {
                factorial *= i
                secuencia.add(secuencia.last() + "x$i")
            }
        }
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, secuencia)
        binding.listview.adapter = adapter
    }
}