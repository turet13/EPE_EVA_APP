package com.example.eva1
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import android.content.Intent // Importación de Intent


class MainActivity2 : AppCompatActivity() {

    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)



        loginBtn = findViewById(R.id.back_btn)

        loginBtn.setOnClickListener {

            Toast.makeText(this, "Seccion Cerrada", Toast.LENGTH_LONG).show()

            // Crear Intent para ir a MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}
