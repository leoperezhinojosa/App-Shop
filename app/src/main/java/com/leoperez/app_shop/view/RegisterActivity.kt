package com.leoperez.app_shop.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.viewModels
import com.leoperez.app_shop.LoginActivity
import com.leoperez.app_shop.R
import com.leoperez.app_shop.databinding.ActivityRegisterBinding
import com.leoperez.app_shop.viewmodel.RegisterViewModel

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    // Declaración de la variable registerViewModel con el delegado by viewModels
    private val registerViewModel: RegisterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // REGISTRO:
        // Conexión a la interfaz de cliente:
        val buttonRegister = binding.buttonRegister
        val insertEmail = binding.insertEmailRegister
        val insertPass = binding.insertPassRegister
        val insertName = binding.insertNameRegister
        val insertPhone = binding.insertPhoneRegister
        val insertAddress = binding.insertAddressRegister

        // Configuración del botón de Registro:
        buttonRegister.setOnClickListener {

            // Obtener datos de Email/Clave:
            val email = insertEmail.text.toString()
            val pass = insertPass.text.toString()
            val name = insertName.text.toString()
            val phone = insertPhone.text.toString()
            val address = insertAddress.text.toString()

            // Registro de Usuario:
            if (registerViewModel.register(email, pass, 0, false) == null) {
                // Si el registro es correcto:
                Toast.makeText(
                    this@RegisterActivity,
                    "¡Bienvenido: Registro completado!",
                    Toast.LENGTH_SHORT
                ).show()
                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                startActivity(intent)
            } else {
                // Si el email ya está registrado:
                Toast.makeText(
                    this@RegisterActivity,
                    "Email ya registrado",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        // Pasar a la pantalla de Login:
        val buttonGoToLogin: Button = binding.buttonAccessLogin
        buttonGoToLogin.setOnClickListener {
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}