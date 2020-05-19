package com.example.submission_2_udacoding_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btnSimpan.setOnClickListener {
            val input1 = etEmail.text.toString()

            val input2 = etPassword.text.toString()

            if(input1.isEmpty() && input2.isEmpty()){
                Toast.makeText(this,"Mohon form ini diisi.",Toast.LENGTH_SHORT).show()
            } else if (input1 =="rachmanforniandi@gmail.com" && input2 =="mantul123"){
                val intentToMain = Intent(this,MainActivity::class.java)
                startActivity(intentToMain)
                finish()
            }else{
                Toast.makeText(this,"Email/Username atau password anda salah.Mohon Periksa kembali.",Toast.LENGTH_SHORT).show()
            }
        }

    }

}
