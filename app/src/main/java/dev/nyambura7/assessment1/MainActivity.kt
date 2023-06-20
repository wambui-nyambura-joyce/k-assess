package dev.nyambura7.assessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.nyambura7.assessment1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        binding.btnSignup.setOnClickListener {

            startActivity(Intent(this, Login::class.java))
        }
        binding.btnLogin2.setOnClickListener {
            startActivity(Intent(this,Login::class.java))
        }
        validateLogin()

    }


    fun validateLogin(){
        val name = binding.etUserName.text.toString()
        val email = binding.etEmail.text.toString()
        val phone = binding.etPhoneNumber.text.toString()
        val password = binding.etPassword.text.toString()
        val passwordconf = binding.etPasswordconf.text.toString()
        var error = false

        if (name.isBlank()){
            binding.tilUserName.error = "Name field cannot be empty"
            error = true
        }else{
            binding.tilUserName.error=null
        }
        if (email.isBlank()){
            binding.tilEmail.error = "Email field cannot be empty"
            error = true
        }else{
            binding.tilEmail.error=null
        }
        if (password.isBlank()){
            binding.tilPassword.error = "Password field cannot be empty"
            error = true
        }else{
            binding.tilPassword.error=null
        }
        if (password!=passwordconf){
            binding.etPasswordconf.error = "Passwords do not match"
            error = true
        }else{
            binding.tilPasswordconf.error = null
        }

        if (phone.isBlank()){
            binding.tilPhoneNumber.error = "Phone number field cannot be empty"
            error = true
        } else{
            binding.tilPhoneNumber.error = null
        }

        if (!error){
            Toast.makeText(this, "Contact Successfully added", Toast.LENGTH_LONG).show()
        }
    }

}

