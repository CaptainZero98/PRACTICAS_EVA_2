package com.example.leonardo.eva_2_7_intentos_resultados;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch(requestCode) {
            case BUSCAR_CONTACTOS:
              if(resultCode== Activity.RESULT_OK){
                  String sResu=data.getDataString();
                  txtContacto.setText(sResu);
              }
            break;
            case BUSCAR_IMAGENES:
                if(resultCode== Activity.RESULT_OK){
                    String sResu=data.getDataString();
                    txtContacto.setText(sResu);
                }
                break;


        }
    }

    TextView txtContacto;
Button btnContacto,btnImagen;
Intent inContacto;
Intent iImagen;
Uri uContactos;
Uri uImagenes;
final int BUSCAR_CONTACTOS=1000;
final int BUSCAR_IMAGENES=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    txtContacto=findViewById(R.id.txtContacto);//VINCULAMOS EL TEXTVIEW DE LOS CONTACTOS
    uContactos= ContactsContract.Contacts.CONTENT_URI;//TOMAMOS LOS CONTACTOS CON EL URI
        inContacto=new Intent(Intent.ACTION_PICK,uContactos);
        uImagenes=Uri.parse("content://media/external/images/media");
        iImagen= new Intent(Intent.ACTION_PICK,uImagenes);
    btnContacto=findViewById(R.id.btnContacto);
    btnContacto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            startActivityForResult(inContacto,BUSCAR_CONTACTOS);
        }
    });
    btnImagen=findViewById(R.id.btnImagen);
    btnImagen.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivityForResult(iImagen,BUSCAR_IMAGENES);
        }
    });
    }
}
