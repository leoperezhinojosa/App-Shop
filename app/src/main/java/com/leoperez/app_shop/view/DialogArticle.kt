package com.leoperez.app_shop.view

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.leoperez.app_shop.R
import com.leoperez.app_shop.databinding.ActivityMainBinding
import com.leoperez.app_shop.databinding.ArticleDialogBinding
import com.leoperez.app_shop.model.Article

class DialogArticle(val onCreateArticle: (Article) -> Unit) : DialogFragment() {

    private lateinit var binding: ArticleDialogBinding
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        return activity?.let { activity ->
            val builder = AlertDialog.Builder(activity)
            val inflater = activity.layoutInflater
            val view = inflater.inflate(R.layout.article_dialog, null)
            binding = ArticleDialogBinding.bind(view)
            builder.setView(view)
            builder.setMessage("Añadir Articulo")
            builder.setPositiveButton("Añadir Articulo") { dialog, id ->
                val name = binding.etName.text
                val trademark = binding.etTrademark.text
                val price = binding.etPrice.text

                var numeric = true
                numeric = price.matches("d+(\\.\\d+)".toRegex())

                if (numeric) {
                    val dPrice = price.toString().toDouble()
                }
                else {
                    Toast.makeText(
                        requireContext(),
                        "El campo PRECIO debe ser un número",
                        Toast.LENGTH_SHORT)
                        .show()
                }

                Toast.makeText(requireContext(), "Se va a añadir un articulo", Toast.LENGTH_SHORT)
                    .show()
            }
            builder.setNegativeButton("Cancelar") { dialog, id ->
                Toast.makeText(
                    requireContext(),
                    "Volviendo a la pantalla de artículos",
                    Toast.LENGTH_SHORT
                )
                    .show()
            }



            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")

    }
}
