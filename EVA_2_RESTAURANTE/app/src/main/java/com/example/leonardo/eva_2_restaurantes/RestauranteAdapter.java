package com.example.leonardo.eva_2_restaurantes;

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

public class RestauranteAdapter extends ArrayAdapter <Restaurante> {
Context cContexto;
int iLayout;
Restaurante [] rRestaurante;

    public RestauranteAdapter(@NonNull Context context, int resource, @NonNull Restaurante[] objects) {
        super(context, resource, objects);

        cContexto=context;
        iLayout=resource;
        rRestaurante=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView iImagen;
        TextView tvNombreR,tvDescripcion,tvTelefono;
        View vFila=convertView;

        if(vFila==null){
            //PARA CFREAR VISTA USAMOS LAYOUTINFLATER
            LayoutInflater liVista=((Activity) cContexto).getLayoutInflater();
            vFila=liVista.inflate(iLayout,parent,false);

        }
        //VINCULAR WIDGETS
        iImagen=vFila.findViewById(R.id.iImagen);
        tvNombreR=vFila.findViewById(R.id.tvTitulo);
        tvDescripcion=vFila.findViewById(R.id.tvDescripcion);
        tvTelefono=vFila.findViewById(R.id.tvTelefono);

        Restaurante rActual=rRestaurante[position];
        iImagen.setImageResource(rActual.iIma);
        tvNombreR.setText(rActual.sNombreR);
        tvDescripcion.setText(rActual.sDescripcion);
        tvTelefono.setText(rActual.sTelefono);
        return vFila;

    }
    }

