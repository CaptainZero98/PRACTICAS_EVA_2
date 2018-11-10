package com.example.leonardo.eva_2_4_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
TextView tvMostrar;
Intent inDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
tvMostrar=findViewById(R.id.tvMostrar);
inDatos=getIntent();
Bundle bDatos=inDatos.getExtras();
tvMostrar.append("Nombre:"+ bDatos.getString("Nombre"));
        tvMostrar.append("Apellido:"+ bDatos.getString("Apellido"));
        tvMostrar.append("Edad:"+ bDatos.getInt("Edad"));
        if (bDatos.getBoolean("Empleado")){
            tvMostrar.append("Si trabaja");
            tvMostrar.append("Salario: $"+bDatos.getInt("Salario"));

        }else{

            tvMostrar.append("No trabaha");
        }
       switch(bDatos.getInt("Genero")){
           case 1:tvMostrar.append("Masculino");
               break;
           case 2:tvMostrar.append("Femenino");
               break;
           case 3: tvMostrar.append("Otro");
               break;


       }

    }
}
