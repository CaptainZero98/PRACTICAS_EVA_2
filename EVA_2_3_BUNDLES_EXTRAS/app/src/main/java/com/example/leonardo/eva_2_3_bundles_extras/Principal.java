package com.example.leonardo.eva_2_3_bundles_extras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
Button btnAbrirS;
Intent inIniSecu;
EditText etPrincipal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
   btnAbrirS=findViewById(R.id.btnAbrirS);
   inIniSecu=new Intent(this,Secundaria.class);
   etPrincipal=findViewById(R.id.etPrinci);
   btnAbrirS.setOnClickListener(new View.OnClickListener() {

       @Override
       public void onClick(View v) {

           String sMensaje=etPrincipal.getText().toString();
           inIniSecu.putExtra("Mensaje",sMensaje);
           startActivity(inIniSecu);
       }
   });


    }
}
