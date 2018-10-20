package com.example.atriox.guia5_moviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    Button btnEjemplos,btnEjercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnEjemplos     = (Button) findViewById(R.id.btnEjemplos);
        btnEjercicios   = (Button) findViewById(R.id.btnEjercicios);


        btnEjemplos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(
                        Principal.this,
                        EjemploActivity.class
                ));
            }
        });
        btnEjercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(
                        Principal.this,
                        EjercicioActivity.class
                ));
            }
        });

    }
}