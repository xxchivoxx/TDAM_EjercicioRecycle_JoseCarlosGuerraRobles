package com.example.carlos.tdam_ejerciciorecycle_josecarlosguerrarobles;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by carlos on 13/02/18.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonaViewHolder> {
    List<Persona> personas;

    RVAdapter(List<Persona> personas){
        this.personas = personas;
    }

    @Override
    public PersonaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.clon, parent, false);
        PersonaViewHolder pvh = new PersonaViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonaViewHolder holder, int position) {
        holder.personName.setText(personas.get(position).nombre);
        holder.personNumControl.setText(personas.get(position).NumControl);
        holder.personCarrera.setText(personas.get(position).carrera);
        holder.personImagen.setImageResource(personas.get(position).imagen);
    }

    @Override
    public int getItemCount() {
        return personas.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class PersonaViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView personName;
        TextView personNumControl;
        TextView personCarrera;
        ImageView personImagen;

        PersonaViewHolder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.cardView);
            personName = itemView.findViewById(R.id.txtNombre);
            personNumControl = itemView.findViewById(R.id.txtNumControl);
            personCarrera = itemView.findViewById(R.id.txtCarrera);
            personImagen = itemView.findViewById(R.id.imgImagen);

        }
    }
}
