package com.example.test_x1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEnviar : Button = findViewById(R.id.btn_comenzar)
        val txtName : EditText = findViewById(R.id.txt_name)

        val txtAp : EditText = findViewById(R.id.txtAp)
        val txtCd : EditText = findViewById(R.id.txtCd)
        val txtNum : EditText = findViewById(R.id.txtNum)

        btnEnviar.setOnClickListener (){
            val name = txtName.text.toString()
            val ape = txtAp.text.toString()
            val cid = txtCd.text.toString()
            val num = txtNum.text.toString()


            val intent = Intent(this,Activity2::class.java).apply{
                putExtra("name", name)
                putExtra("ape", ape)
                putExtra("cid", cid)
                putExtra("num", num)


            }
            startActivity(intent)
            //funcionando
        }

    }


}