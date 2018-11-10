package com.example.leonardo.eva_2_3_bundles_extras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
    Button btnAbrirP;
    TextView tvMostrar;
    Intent inLeer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        tvMostrar=findViewById(R.id.etPrinci);
        inLeer=getIntent();
        tvMostrar.setText(inLeer.getStringExtra("Mensaje"));
        btnAbrirP=findViewById(R.id.btNAbrirP);
        btnAbrirP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

    }
}
