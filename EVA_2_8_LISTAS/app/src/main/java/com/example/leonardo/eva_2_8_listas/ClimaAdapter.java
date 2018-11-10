package com.example.leonardo.eva_2_8_listas;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.leonardo.eva_2_8_listas.Clima;

public class ClimaAdapter extends ArrayAdapter <Clima>  {

    Context cContexto;
    int iLayout;
    Clima[] aCiudad;


    public ClimaAdapter(@NonNull Context context, int resource, @NonNull Clima[] objects) {
        super(context, resource, objects);
        cContexto=context;
        iLayout=resource;
        aCiudad=objects;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView iImagen;
        TextView txtCiudad,txtDesc,txtTemp;
        View vFila= convertView;

        if(vFila==null){
           //PARA CFREAR VISTA USAMOS LAYOUTINFLATER
           LayoutInflater liVista=((Activity) cContexto).getLayoutInflater();
           vFila=liVista.inflate(iLayout,parent,false);

        }
        //VINCULAR WIDGETS
        iImagen=vFila.findViewById(R.id.imgClima);
        txtCiudad=vFila.findViewById(R.id.txtCiudad);
        txtDesc=vFila.findViewById(R.id.txtClima);
        txtTemp=vFila.findViewById(R.id.txtTemp);

        Clima cActual=aCiudad[position];
        iImagen.setImageResource(cActual.iIma);
        txtCiudad.setText(cActual.nombreCiudad);
        txtTemp.setText(cActual.iTemperatura+" ");
        txtDesc.setText(cActual.sDescripcion);
         return vFila;

    }
}
