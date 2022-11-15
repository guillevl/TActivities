package com.example.tactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tactivities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnContinuarAdelante.setOnClickListener(){
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("textMain",binding.etMainView.text.toString())
            startActivity(intent)
        }
    }
}