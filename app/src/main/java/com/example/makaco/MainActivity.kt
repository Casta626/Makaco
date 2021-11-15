package com.example.makaco

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tmovil = findViewById<EditText>(R.id.tmovil)
        val tinternet = findViewById<EditText>(R.id.tinternet)
        val bbono = findViewById<Button>(R.id.bbono)
        val bpago = findViewById<Button>(R.id.bpago)

        //Cambiar metodos de pago
        val tntarjeta = findViewById<EditText>(R.id.tntarjeta)
        val tccv = findViewById<EditText>(R.id.tccv)
        val tfcaducidad = findViewById<EditText>(R.id.tfcaducidad)
        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val cbaceptar = findViewById<CheckBox>(R.id.cbaceptar)
        val r1 = findViewById<RadioButton>(R.id.r1)
        val r2 = findViewById<RadioButton>(R.id.r2)
        val rg1 = findViewById<RadioGroup>(R.id.rg1)
        val rg2 = findViewById<RadioGroup>(R.id.rg2)
        val ntarjeta = findViewById<TextView>(R.id.ntarjeta)
        val ccv = findViewById<TextView>(R.id.ccv)
        val usuariop = findViewById<TextView>(R.id.usuariop)
        val clave = findViewById<TextView>(R.id.clave)
        val fcaducidad = findViewById<TextView>(R.id.fcaducidad)

        //Bonos extras
        val sw1 = findViewById<Switch>(R.id.sw1)
        val sw2 = findViewById<Switch>(R.id.sw2)
        val sw3 = findViewById<Switch>(R.id.sw3)
        val sw4 = findViewById<Switch>(R.id.sw4)
        val sw5 = findViewById<Switch>(R.id.sw5)


        ntarjeta.setVisibility(View.INVISIBLE)
        ccv.setVisibility(View.INVISIBLE)
        usuariop.setVisibility(View.INVISIBLE)
        clave.setVisibility(View.INVISIBLE)
        fcaducidad.setVisibility(View.INVISIBLE)
        et2.setVisibility(View.INVISIBLE)
        tfcaducidad.setVisibility(View.INVISIBLE)
        et1.setVisibility(View.INVISIBLE)
        tntarjeta.setVisibility(View.INVISIBLE)
        tccv.setVisibility(View.INVISIBLE)




        r1.setOnClickListener {
            if (r1.isPressed) {
                ntarjeta.setVisibility(View.VISIBLE)
                fcaducidad.setVisibility(View.VISIBLE)
                ccv.setVisibility(View.VISIBLE)
                tfcaducidad.setVisibility(View.VISIBLE)
                tntarjeta.setVisibility(View.VISIBLE)
                tccv.setVisibility(View.VISIBLE)

                ntarjeta.setVisibility(View.INVISIBLE)
                fcaducidad.setVisibility(View.INVISIBLE)
                ccv.setVisibility(View.INVISIBLE)
                tfcaducidad.setVisibility(View.INVISIBLE)
                tntarjeta.setVisibility(View.INVISIBLE)
                tccv.setVisibility(View.INVISIBLE)

            }
        }
        r2.setOnClickListener {
            if (r2.isPressed) {
                usuariop.setVisibility(View.VISIBLE)
                clave.setVisibility(View.VISIBLE)
                et1.setVisibility(View.VISIBLE)
                et2.setVisibility(View.VISIBLE)


                usuariop.setVisibility(View.INVISIBLE)
                clave.setVisibility(View.INVISIBLE)
                et1.setVisibility(View.INVISIBLE)
                et2.setVisibility(View.INVISIBLE)


            }
        }
    }
}