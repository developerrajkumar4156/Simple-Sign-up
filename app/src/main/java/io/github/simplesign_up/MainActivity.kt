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
	val minPasswordLength = 10

        signUpBtn.setOnClickListener {
	    val generatedPassword = passwordGenerator.getPassword()
		if(generatedPassword.length >= minPasswordLength){
	            Toast.makeText(this,generatedPassword,Toast.LENGTH_LONG).show()
		}else{
		    Toast.makeText(this,"Password length is too short..",Toast.LENGTH_LONG).show()
		}
        }

    }
}
