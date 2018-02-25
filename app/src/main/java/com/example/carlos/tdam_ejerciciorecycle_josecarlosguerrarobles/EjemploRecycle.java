package com.example.carlos.tdam_ejerciciorecycle_josecarlosguerrarobles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class EjemploRecycle extends AppCompatActivity {
RecyclerView rvPersona;
LinearLayoutManager llm;
private List<Persona> personas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_recycle);
        rvPersona = findViewById(R.id.rvPersona);
        //rvPersona.setHasFixedSize(true);
        llm = new LinearLayoutManager(getApplicationContext());
        rvPersona.setLayoutManager(llm);
        personas = new ArrayList<>();
        personas.add(new Persona("Jose Carlos Guerra Robles","14401032","TIC",R.drawable.usuario));
        personas.add(new Persona("Gerardo Emmanuel Tovar Barragan","14401052","TIC",R.drawable.usuario));
        personas.add(new Persona("Jorge Daniel Rubio Rodriguez","14401036","TIC",R.drawable.usuario));
        personas.add(new Persona("Ana Carolina Mondragon Rangel","14401028","TIC",R.drawable.usuario));
        personas.add(new Persona("Vicente Martinez Zavala","14401043","TIC",R.drawable.usuario));
        personas.add(new Persona("Carlos Emanuel Zambra","14401034","TIC",R.drawable.usuario));
        personas.add(new Persona("Iris Adanelli Gonzales Garcia","14401031","TIC",R.drawable.usuario));
        personas.add(new Persona("Eva liliana Osuna Luna","14401042","TIC",R.drawable.usuario));
        RVAdapter adapter = new RVAdapter(personas);
        rvPersona.setAdapter(adapter);
    }
}
