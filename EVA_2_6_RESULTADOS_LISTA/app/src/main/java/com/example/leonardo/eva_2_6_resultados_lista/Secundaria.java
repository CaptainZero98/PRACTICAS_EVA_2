package com.example.leonardo.eva_2_6_resultados_lista;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity implements ListView.OnItemClickListener {

 ListView listResta;
 Intent inDatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
 listResta=findViewById(R.id.listResta);
 //CREAR ADAPTADOR
listResta.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Datos.sResta));
        //ASIGNAR ADAPTADOR

        //ASIGNAR LISTENER
listResta.setOnItemClickListener(this);
inDatos=getIntent();
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

        inDatos.putExtra("RESTAURANTE",i);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }
}
