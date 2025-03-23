package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.parcial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            val inputText = binding.textInputLayout.editText?.text.toString()
            val number = inputText.toIntOrNull()

            if (number != null && number in 1..20) {
                val intent = Intent(this, Lista::class.java)
                intent.putExtra("numero", number)
                startActivity(intent)
            } else {
                Toast.makeText(this, "El número esta fuera del rango entre 1 y 20", Toast.LENGTH_SHORT).show()
            }
        }

    }
}





