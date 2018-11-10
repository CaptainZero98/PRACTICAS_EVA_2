package com.example.leonardo.eva_2_restaurantes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Restaurante  {
    String sNombreR;
    String sTelefono;
    String sDescripcion;
    int iIma;

    public Restaurante(String sNombreR,String sDescripcion,String sTelefono,int iIma){

        this.sNombreR=sNombreR;
        this.sTelefono=sTelefono;
        this.sDescripcion=sDescripcion;
        this.iIma=iIma;


    }
}
