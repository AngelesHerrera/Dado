package com.example.ejercicio2dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var miNumerito:TextView
    lateinit var imagen:ImageView
    lateinit var par:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        miNumerito = findViewById(R.id.txtNumero)
        imagen = findViewById(R.id.dadoImg)
        par = findViewById<TextView>(R.id.parimpar)

    }

    /**
     * Es un metodo para que mande llamar el clic
     */
    fun lanzaClick(mivista : View){

        val numRandom = Random.nextInt(6)+1;
        // Random.nextInt(6) + 1
        miNumerito.setText("$numRandom")
        val miImagencita = when(numRandom){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imagen.setImageResource(miImagencita)
        if (numRandom % 2 == 0) {
            par.setText("par")
        } else {
            par.setText("impar")
        }
    }

}