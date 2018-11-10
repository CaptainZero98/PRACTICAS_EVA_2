package com.example.leonardo.eva_2_5_for_result;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Secundaria extends AppCompatActivity {

    EditText etMostrar;
    Button btnCerrar;
    Intent inPrima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        etMostrar=findViewById(R.id.etMostrar);
        btnCerrar=findViewById(R.id.btnCerrar);
        inPrima=getIntent();

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sCade=etMostrar.getText().toString();
                inPrima.putExtra("DATOS",sCade);
                setResult(Activity.RESULT_OK,inPrima);
                finish();
            }
        });
    }
}
