package com.example.leonardo.eva_2_1_intentos;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    Button btnLlamar,btnMarca,btnBusqueda;
    EditText etNumero;
    Intent inMarcar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

    btnLlamar=findViewById(R.id.btnLlamar);
    etNumero=findViewById(R.id.etNumero);
    btnLlamar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String sTel=etNumero.getText().toString();
            sTel="tel:"+sTel;
                                    //ACCION        DATOS REQUERIDOS
            inMarcar=new Intent(Intent.ACTION_DIAL, Uri.parse(sTel));
            //EJECUTAR INTENTO
            //QUIEREN UNA RESPUESTA SI O NO
            startActivity(inMarcar);
            //startActivityForResult(inMarcar);
        }
    });

btnMarca=findViewById(R.id.btnMarcacion);

btnMarca.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String sTel=etNumero.getText().toString();
        sTel="tel:"+sTel;
        //ACCION        DATOS REQUERIDOS
        inMarcar=new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
        //EJECUTAR INTENTO
        //QUIEREN UNA RESPUESTA SI O NO
        startActivity(inMarcar);
        //startActivityForResult(inMarcar);
    }
});

btnBusqueda=findViewById(R.id.btnBusqueda);
btnBusqueda.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        inMarcar=new Intent(Intent.ACTION_WEB_SEARCH);
        inMarcar.putExtra(SearchManager.QUERY,"Tacos");
        startActivity(inMarcar);

    }
});

    }
}
