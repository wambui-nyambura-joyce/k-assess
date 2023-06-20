package dev.nyambura7.assessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.nyambura7.assessment1.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        validateSignUp()
    }

    fun validateSignUp() {
        val name = binding.etUsername.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etpassword.text.toString()
        var error = false

        if (name.isBlank()) {
            binding.tilUserName.error = "Name field cannot be empty"
            error = true
        } else {
            binding.tilUserName.error = null
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Email field cannot be empty"
            error = true
        } else {
            binding.tilEmail.error = null
        }
        if (password.isBlank()) {
            binding.tilpassword.error = "Password field cannot be empty"
            error = true
        } else {
            binding.tilpassword.error = null
        }
        if (!error) {
            Toast.makeText(this, "Contact Successfully added", Toast.LENGTH_LONG).show()
        }


    }
}


