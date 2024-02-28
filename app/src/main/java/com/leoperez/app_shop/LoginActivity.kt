package com.leoperez.app_shop

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.viewModels
import com.leoperez.app_shop.databinding.ActivityLoginBinding
import com.leoperez.app_shop.retrofit.RequestLoginUser
import com.leoperez.app_shop.retrofit.RetrofitModule
import com.leoperez.app_shop.viewmodel.LoginViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    // Declaración de la variable loginViewModel con el delegado by viewModels
    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // LOGIN:
        // Conexión a la interfaz de cliente:
        val buttonLogin: Button = binding.buttonLogin
        val insertEmail: EditText = binding.insertEmail
        val insertPass: EditText = binding.insertPass

        // Configuración del botón de Login:
        buttonLogin.setOnClickListener {

            // Obtener datos de Email/Clave:
            val email = insertEmail.text.toString()
            val pass = insertPass.text.toString()

            // Verificación de Login con Retrofit:

            GlobalScope.launch(Dispatchers.IO) {
                val response = withContext(Dispatchers.IO) {
                    RetrofitModule.loginService.auth(RequestLoginUser(email, pass))
                }

                if (response.isSuccessful) {
                    val sharedPreferences = getSharedPreferences("MyApp", Context.MODE_PRIVATE)
                    // Guardar la sesión del usuario con SharedPreferences:
                    with(sharedPreferences.edit()) {
                        putString("email", email)
                        putString("pass", pass)
                        apply()
                    }

                    val intent = Intent(this@LoginActivity, MainActivity::class.java)
                    startActivity(intent)
                } else {
                    withContext(Dispatchers.Main) {
                        Toast.makeText(this@LoginActivity,
                            "Email y/o Clave incorrectos",
                            Toast.LENGTH_LONG).show()
                    }
//                    Toast.makeText(
//                        this@LoginActivity,
//                        "Email y/o Clave incorrectos",
//                        Toast.LENGTH_SHORT
//                    ).show()
                }


//            // Verificación de Login:
//
//            // Guardar el usuario para la sesión:
//            val userLogged = loginViewModel.login(email, pass)
//
//            if (userLogged != null) {
//                Toast.makeText(
//                    this@LoginActivity,
//                    "¡Sesión Iniciada!",
//                    Toast.LENGTH_SHORT
//                ).show()
//
//                // Guardar la sesión del usuario con SharedPreferences:
//                val sharedPreferences = getSharedPreferences("MyApp", Context.MODE_PRIVATE)
//                with(sharedPreferences.edit()) {
//                    putString("email", email)
//                    putString("pass", pass)
//                    apply()
//                }
//
//                val intent = Intent(this@LoginActivity, MainActivity::class.java)
//                startActivity(intent)
//            } else {
//                Toast.makeText(
//                    this@LoginActivity,
//                    "Email y/o Clave incorrectos",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
            }

            // Pasar a la pantalla de Registro:
            val buttonGoToRegister: Button = binding.buttonAccessRegister
            buttonGoToRegister.setOnClickListener {
                val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(intent)
            }
        }
    }
}