package com.example.mykotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val intent = intent
        val nim_o = intent.getStringExtra("Nim")
        val nama_o = intent.getStringExtra("Nama")
        val nilai_o = intent.getIntExtra("Nilai",0)

        val ket:String

        if (nilai_o>=80){
            ket="A"
        }
        else if(nilai_o>=60){
            ket="B"
        }
        else if(nilai_o>=40){
            ket="C"
        }
        else if(nilai_o>=20){
            ket="D"
        }
        else{
            ket="E"
        }

        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = "Nim : "+nim_o+"\nNama: "+nama_o+"\nNilai: "+nilai_o+"\nKeterangan : "+ket
    }
}