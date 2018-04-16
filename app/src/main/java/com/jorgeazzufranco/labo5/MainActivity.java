package com.jorgeazzufranco.labo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Planetas> Planetas;
    RecyclerView recyclerView;
    PlanetAdaptor adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Planetas=new ArrayList<Planetas>();
        fillList(Planetas);

        recyclerView = findViewById(R.id.vista_reciclada);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        adapter = new PlanetAdaptor(this, Planetas);
    }

    private void fillList(List<Planetas> l){
        String desc = "hbgijoiuuxxiuoimsksmkslñxkxjmnxxmxmxlmlskmimximsimoxmsoimxoimsmxlksmxnmmximmufghjklñ{oxii  ijujdoiumxoimismioxmiodiundimxihbgijoiuuxxiuoimsksmkslñxkxjmnxxmxmxlmlskmimximsimoxmsoimxoimsmxlksmxnmmximmufghjklñ{oxii  ijujdoiumxoimismioxmiodiundimxihbgijoiuuxxiuoimsksmkslñxkxjmnxxmxmxlmlskmimximsimoxmsoimxoimsmxlksmxnmmximmufghjklñ{oxii  ijujdoiumxoimismioxmiodiundimxihbgijoiuuxxiuoimsksmkslñxkxjmnxxmxmxlmlskmimximsimoxmsoimxoimsmxlksmxnmmximmufghjklñ{oxii  ijujdoiumxoimismioxmiodiundimxivhbgijoiuuxxiuoimsksmkslñxkxjmnxxmxmxlmlskmimximsimoxmsoimxoimsmxlksmxnmmximmufghjklñ{oxii  ijujdoiumxoimismioxmiodiundimxi";

        l.add(new Planetas(1, "fila", desc));
        l.add(new Planetas(2, "fila 2 xd", desc));
        l.add(new Planetas(3, "fila 3 xdxdx", desc));

    }

}
