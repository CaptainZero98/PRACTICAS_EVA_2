package com.example.leonardo.eva_2_10_cuadros_dialogo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements View.OnClickListener {

    Button btnPerso,btnGeneral;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    btnPerso=findViewById(R.id.btnPerso);
    btnPerso.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
final Dialog dMicuadroDialogo=new Dialog(getApplicationContext());
dMicuadroDialogo.setContentView(R.layout.mi_cuadro_dialogo);
            TextView tvTitulo;
            Button btnGuardar;
            final EditText etCaptu;

            tvTitulo=dMicuadroDialogo.findViewById(R.id.tvTitulo);
            btnGuardar=dMicuadroDialogo.findViewById(R.id.btnGuardar);
            etCaptu=dMicuadroDialogo.findViewById(R.id.etCaptu);
            tvTitulo.setText("Cuadro Personalizado");
            etCaptu.setHint("Introduce tu nombre");
            btnGuardar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),etCaptu.getText().toString(),Toast.LENGTH_LONG).show();
                    dMicuadroDialogo.dismiss();
                }
            });

            dMicuadroDialogo.show();
        }


    });


    btnGeneral=findViewById(R.id.btnGeneral);
    btnGeneral.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           new AlertDialog.Builder(getApplicationContext()).setTitle("MI CUADRO DE DIALOGO").setMessage("Cuadro de dialogo general")
                   .setPositiveButton("OK", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialog, int which) {
                   Toast.makeText(getApplicationContext(),"CLICK POSITIVO",Toast.LENGTH_LONG).show();
               }
           });
        }
    });
    }

    @Override
    public void onClick(View v) {

    }
}
