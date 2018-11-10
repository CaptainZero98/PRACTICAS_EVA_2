package com.example.leonardo.eva_2_4_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements CheckBox.OnCheckedChangeListener{
EditText etNombre,etApe,etEdad,etSala;
CheckBox cbEmpleado;
Button btnEnvia,btnCerrar;
RadioGroup rgGenero;
TextView tvSala;
Intent inEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        etNombre=findViewById(R.id.etNombre);
        etApe=findViewById(R.id.etApe);
        etEdad=findViewById(R.id.etEdad);
        etSala =findViewById(R.id.etSala);
        etSala.setEnabled(false);
        cbEmpleado=findViewById(R.id.cbEmp);
        cbEmpleado.setOnCheckedChangeListener(this);
        btnEnvia=findViewById(R.id.btnEnviar);
        inEnviar=new Intent(this,Secundaria.class);
        btnEnvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sNom=etNombre.getText().toString();
                String sApe=etApe.getText().toString();
                int iEdad=Integer.parseInt(etEdad.getText().toString());
                boolean bLabora=cbEmpleado.isChecked();
                int iSala=Integer.parseInt(etSala.getText().toString());
                int iSel=rgGenero.getCheckedRadioButtonId();
                int iGen;
                if (iSel==R.id.rbMascu) {
                    iGen=1;
                }else if(iSel==R.id.rbFeme){

                    iGen=2;

                }else{
                    iGen=3;

                }

                Bundle bBundle=new Bundle();
                bBundle.putString("Nombre",sNom);
                bBundle.putString("Apellido",sApe);
                bBundle.putInt("Edad",iEdad);
                bBundle.putBoolean("Empleado",bLabora);
                bBundle.putInt("Salario",iSala);
                bBundle.putInt("Genero",iGen);
                inEnviar.putExtras(bBundle);
                startActivity(inEnviar);
            }
        });
        btnCerrar=findViewById(R.id.btnCerrar);
        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        rgGenero=findViewById(R.id.rgGenero);
        tvSala=findViewById(R.id.textView6);




    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        tvSala.setEnabled(cbEmpleado.isChecked());
        etSala.setEnabled(cbEmpleado.isChecked());


    }
}
