package com.example.leonardo.eva_2_5_for_result;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    TextView tvMostrar;
    Intent inSecu;
    final int DATOS_SECUN=100;
    Button btnLanzar;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
   if (requestCode==DATOS_SECUN);
    if (resultCode== Activity.RESULT_OK){
        //Aquí se ejecuta la acción
        String sCade=data.getStringExtra("DATOS");
        tvMostrar.setText(sCade);
    }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        tvMostrar=findViewById(R.id.tvMostrar);
        inSecu=new Intent(this,Secundaria.class);
        btnLanzar=findViewById(R.id.btnLanzar);
        btnLanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivityForResult(inSecu,DATOS_SECUN);
            }
        });
    }
}





