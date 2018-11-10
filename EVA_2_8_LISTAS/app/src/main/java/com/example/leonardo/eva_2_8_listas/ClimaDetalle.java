package com.example.leonardo.eva_2_8_listas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClimaDetalle extends AppCompatActivity {
Intent inDatos;
ImageView imgClima;
TextView txtCiudad,txtTemp,txtDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clima_detalle);

        imgClima=findViewById(R.id.imgClimaDetalla);
         txtCiudad=findViewById(R.id.txtCiudadDetalle);
        txtTemp=findViewById(R.id.txtTempDeta);
        txtDesc=findViewById(R.id.txtDescripcionDeta);

        inDatos=getIntent();
        imgClima.setImageResource(inDatos.getIntExtra("IMAGEN",0));
        txtCiudad.setText(inDatos.getStringExtra("CIUDAD"));
        txtTemp.setText(inDatos.getIntExtra("TEMPERATURA",0)+"°");
        txtDesc.setText(inDatos.getStringExtra("DESCRIPCION"));


    }
}
