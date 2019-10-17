package com.example.mykotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nim = findViewById<EditText>(R.id.nim)
        val nama = findViewById<EditText>(R.id.nama)
        val nilai = findViewById<EditText>(R.id.nilai)
        val proses = findViewById<Button>(R.id.proses)




        proses.setOnClickListener(){
            val nim_o =nim.text.toString()
            val nama_o=nama.text.toString()
            val nilai_o=nilai.text.toString().toInt()


            intent=Intent(this,Activity2::class.java)
            intent.putExtra("Nim",nim_o)
            intent.putExtra("Nama",nama_o)
            intent.putExtra("Nilai",nilai_o)
            startActivity(intent)
        }
    }
}
