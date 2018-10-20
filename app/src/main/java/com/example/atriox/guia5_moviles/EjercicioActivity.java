package com.example.atriox.guia5_moviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class EjercicioActivity extends AppCompatActivity {
    private ImageView Corona_Uno;
    private ImageView Corona_Dos;
    private ImageView Corona_Tres;

    private Button BtnIzquierdo;
    private Button BtnCentro;
    private Button BtnDerecho;
    private Animation animation_Coronas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);
        BtnIzquierdo = (Button) findViewById(R.id.btnIzq);
        BtnCentro = (Button) findViewById(R.id.btnCentro);
        BtnDerecho = (Button) findViewById(R.id.btnDer);

        Corona_Uno = (ImageView) findViewById(R.id.CoronaUno);
        Corona_Dos = (ImageView) findViewById(R.id.CoronaDos);
        Corona_Tres = (ImageView) findViewById(R.id.CoronaTres);

        animation_Coronas = AnimationUtils.loadAnimation(this, R.anim.bajar_aparecer);
        animation_Coronas.setDuration(1000);
        animation_Coronas.setFillAfter(false);
        animation_Coronas.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                BtnCentro.setEnabled(false);
                BtnIzquierdo.setEnabled(false);
                BtnDerecho.setEnabled(false);
            }
            @Override
            public void onAnimationEnd(Animation animation) {
                BtnCentro.setEnabled(true);
                BtnIzquierdo.setEnabled(true);
                BtnDerecho.setEnabled(true);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        BtnIzquierdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Corona_Uno.startAnimation(animation_Coronas);
            }
        });
        BtnCentro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Corona_Dos.startAnimation(animation_Coronas);
            }
        });
        BtnDerecho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Corona_Tres.startAnimation(animation_Coronas);
            }
        });
    }

}
