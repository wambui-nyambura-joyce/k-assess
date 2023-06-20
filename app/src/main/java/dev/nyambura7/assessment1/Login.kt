package dev.nyambura7.assessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.nyambura7.assessment1.databinding.ActivityLoginBinding
import dev.nyambura7.assessment1.databinding.LoginpageBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityLoginBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.btnLogin.setOnClickListener {
                // TODO: Perform login logic here
            }

            binding.tvSignup.setOnClickListener {
                startActivity(Intent(this, LoginpageBinding::class.java))
                finish()
            }
        }
    }
}