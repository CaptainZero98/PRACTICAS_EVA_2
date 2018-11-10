package com.example.leonardo.eva_1_examen_practica_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
Button btnCerrar,btnCalcular;
    TextView tvPotencia,tvPi,tvResu;
    EditText etRadio,etGrados;
    RadioGroup rgOperaciones;
    RadioButton rbArea,rbVolumen,rbCuna;
int iSelec=0, iRadio=0,iGrados=0;
String sRadio,sGrados;
double iOp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


    tvPotencia=findViewById(R.id.tvPotencia);
    tvPi=findViewById(R.id.txtPi);
    etRadio=findViewById(R.id.etRadio);


    tvResu=findViewById(R.id.tvResu);

    etGrados=findViewById(R.id.etGrados);
    etGrados.setEnabled(false);

    rgOperaciones=findViewById(R.id.rgOperacion);
    rgOperaciones.setOnCheckedChangeListener(this);
    rbArea=findViewById(R.id.rbArea);
    rbVolumen=findViewById(R.id.rbVolumen);
    rbCuna=findViewById(R.id.rbCuna);

    btnCerrar=findViewById(R.id.btnCerrar);
    btnCerrar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

finish();
System.exit(0);

        }
    });
    btnCalcular=findViewById(R.id.btnCalcular);
    btnCalcular.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        sRadio=etRadio.getText().toString();
        sGrados=etGrados.getText().toString();
            iRadio=Integer.parseInt(sRadio);
           iGrados=Integer.parseInt(sGrados);

            if (iSelec==1){

                iOp=4*Math.PI*iRadio;

            }else if(iSelec==2){

                iOp=(4* Math.PI*Math.pow(iRadio,2))/3;

            }else if(iSelec==3){

               iOp=1.25*((Math.PI*Math.pow(iRadio,3))/360)*iGrados;

            }

            tvResu.setText(iOp+"");
        }
    });
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
 if(i==R.id.rbArea){
     iSelec=1;
     etGrados.setEnabled(false);
     tvPotencia.setText("m2");
 }else if(i==R.id.rbVolumen){
     iSelec=2;
     etGrados.setEnabled(false);
     tvPotencia.setText("m3");
 }else if(i==R.id.rbCuna){
     tvPotencia.setText("m3");

     etGrados.setEnabled(true);


     iSelec=3;

        }


    }
}
