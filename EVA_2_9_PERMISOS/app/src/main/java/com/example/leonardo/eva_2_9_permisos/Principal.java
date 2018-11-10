package com.example.leonardo.eva_2_9_permisos;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    Button btnLlamar;
    EditText etNumero;
    Intent inLlamar;
    final int PERMISO_LLAMADA = 100;
    Boolean bBande=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE,}, PERMISO_LLAMADA);


        }else{

            bBande=true;
        }

        etNumero = findViewById(R.id.etNumero);
        btnLlamar = findViewById(R.id.btnLlamar);
        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
if(bBande) {
    String sTel = "tel: " + etNumero.getText().toString();
    inLlamar = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
    startActivity(inLlamar);
}else{

   // Toast.makeText(this,"No se puede llamar",Toast.LENGTH_LONG).show();
    Toast.makeText(Principal.this, "No se puede llamar, no hay permiso", Toast.LENGTH_SHORT).show();
}

            }
        });



    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode==PERMISO_LLAMADA){

            if((grantResults.length>0) && (grantResults[0]==PackageManager.PERMISSION_GRANTED)){
                bBande=true;
            }


        }

    }

}
