package com.example.leonardo.eva_2_2_intentos_implicitos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {
    Button btnAbrir;
    Intent inLanzarSecun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    btnAbrir=findViewById(R.id.btnAbrir);
        inLanzarSecun=new Intent(this,Secundaria.class);
    btnAbrir.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
        startActivity(inLanzarSecun);

        }
    });


    }
}
