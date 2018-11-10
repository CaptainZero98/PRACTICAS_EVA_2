package com.example.leonardo.eva_2_restaurantes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity implements  ListView.OnItemClickListener{

    Restaurante[] aResta={new Restaurante("Pizzeria 'La Mejor'","Pizza al horno con sabor italiano","6141234567",R.drawable.confessional),
            new Restaurante("The place of joy","Desayunos que deleitaran a tu paladar","6141234576",R.drawable.barrafina),
            new Restaurante("Main Street Coffee","Una cafetería con un gran sentido de la elegancia","6143451234",R.drawable.bourkestreetbakery),
            new Restaurante("Cafe dead end'","Un ultimo café, antes de partir","614876563",R.drawable.cafedeadend),
            new Restaurante("Cafe loisl","Cafetería gourmet, solo para gustos exigentes","6141234567",R.drawable.cafeloisl),
            new Restaurante("Laurel Café","Un café con sabor a naturaleza","6141234567",R.drawable.cafelore),
            new Restaurante("Sword Meat","Cortes brasileños, con el sabor de la selva amazonica","6144756473",R.drawable.donostia),
            new Restaurante("Small things","Lo pequeño siempre es mejor","6148763452",R.drawable.fiveleaves),
            new Restaurante("Sandwich paradise","El sandwich que enamora a cualquiera","6141234567",R.drawable.forkeerestaurant),
            new Restaurante("Stranger Meats","Cortes gourmet de la más alta calidad","6141234567",R.drawable.grahamavenuemeats),
            new Restaurante("Chocolateria","Postres y golosinas gourmet","6142657483",R.drawable.haighschocolate),
            new Restaurante("Coffee and frappe","Café, pan, y frappes para disfrutar","613456732",R.drawable.homei),
            new Restaurante("Expresso World","Los mejores expressos de la ciudad","6142436758",R.drawable.palominoespresso),
            new Restaurante("Sea food 'Angry Captain'","Comida del mar: Camarones,pulpo,etc","6144567865",R.drawable.petiteoyster),
            new Restaurante("Gourmet French Food","La mejor comida francesa","6143453212",R.drawable.posatelier),
            new Restaurante("Cheese & potatoes","Restaurante italiano","6144563454",R.drawable.royaloak),
            new Restaurante("80's Cafeteria","Coffee and tea from 80's years","61433334455",R.drawable.teakha),
            new Restaurante("Thai brilliant food","Comida tailandesa","6142134532",R.drawable.thaicafe),
            new Restaurante("Lord Gourmet","Comida gourmet, solo para paladares exigentes","6149876543",R.drawable.traif),
            new Restaurante("The house of the emperor","Comida cantonesa ","6145123456",R.drawable.upstate),
            new Restaurante("Waffle place","Waffles, helado y diversión","6147654322",R.drawable.wafflewolf)
 };


    ListView lstRestau;
    Intent inDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lstRestau=findViewById(R.id.lstRestaurante);
        lstRestau.setAdapter(new RestauranteAdapter(this,R.layout.activity_restaurante,aResta));
        inDetalle=new Intent(this,RestauranteDetalle.class);
        lstRestau.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
String sNom=aResta[position].sNombreR;
String sDesc=aResta[position].sDescripcion;
String sTel=aResta[position].sTelefono;
int iIm=aResta[position].iIma;
        inDetalle.putExtra("NOMBRE",sNom);
        inDetalle.putExtra("DESCRIPCION",sDesc);
        inDetalle.putExtra("TELEFONO",sTel);
        inDetalle.putExtra("IMAGEN",iIm);
        startActivity(inDetalle);
    }
}
