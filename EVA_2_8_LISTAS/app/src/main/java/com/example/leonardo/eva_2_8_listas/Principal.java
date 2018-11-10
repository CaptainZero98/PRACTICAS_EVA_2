package com.example.leonardo.eva_2_8_listas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity implements  ListView.OnItemClickListener{
ListView lstClima;

    Clima [] cCiudades={new Clima("Chihuahua",30,"Soleado",R.drawable.sunny),
            new Clima("DF",10,"Lluvioso",R.drawable.rainy),
            new Clima("Guadalajara",15,"Nublado",R.drawable.cloudy),
            new Clima("Juarez",12,"Lluvia ligera",R.drawable.light_rain),
            new Clima("Monterrey",30,"Soleado",R.drawable.sunny),
            new Clima("Tijuana",10,"Lluvioso",R.drawable.rainy),
            new Clima("La Paz",15,"Nublado",R.drawable.cloudy),
            new Clima("Mexicali",12,"Lluvia ligera",R.drawable.light_rain)
    };



    Intent inDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lstClima=findViewById(R.id.lstVwClima);
        lstClima.setAdapter(new ClimaAdapter(this,R.layout.layout_clima,cCiudades));
        inDetalle=new Intent(this,ClimaDetalle.class);
    lstClima.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



        String sVal = cCiudades[position].nombreCiudad;
        String sDesc = cCiudades[position].sDescripcion;
        int iIma = cCiudades[position].iIma;
        int iTemp= cCiudades[position].iTemperatura;

       inDetalle.putExtra("IMAGEN",iIma);
        inDetalle.putExtra("CIUDAD",sVal);
        inDetalle.putExtra("TEMPERATURA",iTemp);
        inDetalle.putExtra("DESCRIPCION",sDesc);
        startActivity(inDetalle);
    }
}

