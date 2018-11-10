package com.example.leonardo.eva_2_6_resultados_lista;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
TextView tvResta,tvTotal;
Intent inResta,inOrden;
Button btnEnviar,btnPrecio;
final int LISTA_RESTA=100;
final int ORDEN=200;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==LISTA_RESTA){
            if(resultCode== Activity.RESULT_OK){
                int iResta=data.getIntExtra("RESTAURANTE",0);
                tvResta.setText(Datos.sResta[iResta]);

            }

        }else if(requestCode==ORDEN){

            if(resultCode==Activity.RESULT_OK){
                double dTotal=data.getDoubleExtra("TOTAL",0);
                tvTotal.setText("$ "+dTotal);
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    tvResta=findViewById(R.id.tvResta);
    tvTotal=findViewById(R.id.tvCalculaa);
    inResta=new Intent(this,Secundaria.class);
    inOrden=new Intent(this,Orden.class);
    btnEnviar=findViewById(R.id.btnEnviar);
    btnEnviar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            startActivityForResult(inResta,LISTA_RESTA);

        }
    });

    btnPrecio=findViewById(R.id.btnPrecio);
    btnPrecio.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivityForResult(inOrden,ORDEN);
        }
    });
    }


}
