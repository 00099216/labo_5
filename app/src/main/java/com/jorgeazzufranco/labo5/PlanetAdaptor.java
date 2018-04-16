package com.jorgeazzufranco.labo5;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by uca on 04-16-18.
 */

public class PlanetAdaptor extends RecyclerView.Adapter<PlanetAdaptor.PlanetViewHolder> {
    Context mCtx;
    List<Planetas> planetasList;

    public PlanetAdaptor(Context mCtx, List<Planetas> planetasList) {
        this.mCtx = mCtx;
        this.planetasList = planetasList;
    }

    @Override
    public PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View v = inflater.inflate(R.layout.activity_cardview, null);
        return new PlanetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlanetViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    protected class PlanetViewHolder extends  RecyclerView.ViewHolder{
        TextView titleTextView, descrTextView;
        ImageView imageViewPhoto;

        public PlanetViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titulo);
            descrTextView= itemView.findViewById(R.id.description);
            imageViewPhoto= itemView.findViewById(R.id.imagen);
        }
    }

}