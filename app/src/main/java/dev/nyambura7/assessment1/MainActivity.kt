package dev.nyambura7.assessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.nyambura7.assessment1.databinding.ActivityMainBinding
import dev.nyambura7.assessment1.databinding.LoginpageBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignup.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

}

