package com.example.leonardo.eva_2_6_resultados_lista;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Orden extends AppCompatActivity {
EditText etCantidad,etPrecio;
Button btnCalcular;
Intent inDatones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orden);
    etCantidad=findViewById(R.id.etCant);
    etPrecio=findViewById(R.id.etPrecio);
    inDatones=getIntent();

    btnCalcular=findViewById(R.id.btnCalcular);
    btnCalcular.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int iCant=Integer.parseInt(etCantidad.getText().toString());
            double dPrecio=Double.parseDouble(etPrecio.getText().toString());
            inDatones.putExtra("TOTAL",(iCant*dPrecio));
            setResult(Activity.RESULT_OK,inDatones);
            finish();
        }
    });


    }
}
