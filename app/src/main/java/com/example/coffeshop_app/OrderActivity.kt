package com.example.coffeshop_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = ContextCompat.getColor(this, android.R.color.white)
        WindowCompat.getInsetsController(window, window.decorView).apply {
            isAppearanceLightStatusBars = true
        }

        setContentView(R.layout.activity_order)

        val btnSomeButton = findViewById<Button>(R.id.btnOerder)
        if (btnSomeButton != null) {
            btnSomeButton.setOnClickListener {

                val intent = Intent(this, DeliveryActivity::class.java)
                startActivity(intent)
            }
        } else {
            Toast.makeText(this, "Button not found in layout", Toast.LENGTH_SHORT).show()
        }
    }
}