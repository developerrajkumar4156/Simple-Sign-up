package io.github.simplesign_up

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import io.github.password_generator.PasswordGenerator

class MainActivity : AppCompatActivity() {
    private lateinit var signUpBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signUpBtn = findViewById(R.id.sign_up_btn)

        val passwordGenerator = PasswordGenerator()

        signUpBtn.setOnClickListener {
            val generatedPassword = passwordGenerator.getPassword()
            Toast.makeText(this,generatedPassword,Toast.LENGTH_LONG).show()
        }

    }
}