package com.leoperez.app_shop

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.viewModels
import com.leoperez.app_shop.databinding.ActivityRegisterBinding
import com.leoperez.app_shop.retrofit.RequestRegisterUser
import com.leoperez.app_shop.retrofit.RetrofitModule
import com.leoperez.app_shop.viewmodel.RegisterViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

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
        val insertPassword = binding.insertPasswordRegister
        val insertName = binding.insertNameRegister

//        val insertPhone = binding.insertPhoneRegister
//        val insertAddress = binding.insertAddressRegister

        // Configuración del botón de Registro:
        buttonRegister.setOnClickListener {

            // Obtener datos de Email/Clave:
            val email = insertEmail.text.toString()
            val password = insertPassword.text.toString()
            val name = insertName.text.toString()
            // val phone = insertPhone.text.toString()
            // val address = insertAddress.text.toString()

            // Verificación de registro con Retrofit:

            GlobalScope.launch(Dispatchers.IO) {
                val response = withContext(Dispatchers.IO) {
                    RetrofitModule.registerService.registro(
                        RequestRegisterUser(
                            email,
                            password,
                            name,
                            0,
                            1
                        )
                    )
                }

                if (response.isSuccessful) {
                    val sharedPreferences = getSharedPreferences("MyApp", Context.MODE_PRIVATE)
                    // Guardar la sesión del usuario con SharedPreferences:
                    with(sharedPreferences.edit()) {
                        putString("email", email)
                        putString("pass", password)
                        apply()
                    }

                    val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                    startActivity(intent)
                } else {
                    // Si el email ya está registrado:
                    Toast.makeText(
                        this@RegisterActivity,
                        "Email ya registrado",
                        Toast.LENGTH_SHORT
                    ).show()
//            }

                    // Registro de Usuario:
//            if (registerViewModel.register(email, password, name,0, false) == null) {
//                // Si el registro es correcto:
//                Toast.makeText(
//                    this@RegisterActivity,
//                    "¡Bienvenido: Registro completado!",
//                    Toast.LENGTH_SHORT
//                ).show()
//                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
//                startActivity(intent)
//            } else {
//                // Si el email ya está registrado:
//                Toast.makeText(
//                    this@RegisterActivity,
//                    "Email ya registrado",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
                }

                // Pasar a la pantalla de Login:
                val buttonGoToLogin: Button = binding.buttonAccessLogin
                buttonGoToLogin.setOnClickListener {
                    val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}