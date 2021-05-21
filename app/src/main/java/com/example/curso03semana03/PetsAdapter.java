package com.example.curso03semana03;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class PetsAdapter extends RecyclerView.Adapter<PetsAdapter.PetsViewHolder> {

    private ArrayList<Pets> pets;

    public PetsAdapter(ArrayList<Pets> pets) {
        this.pets = pets;
    }

    @Override
    public PetsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_pets, parent, false);
        return new PetsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PetsAdapter.PetsViewHolder holder, int position) {
        Pets pet = pets.get(position);
        holder.title.setText(pet.getName());
        holder.rate.setText(pet.getRateNumber());
        holder.description.setText(pet.getDescription());
        holder.photo.setImageResource(pet.getPhoto());
        holder.boneRate01.setImageResource(pet.getRateBone01());
        holder.boneRate02.setImageResource(pet.getRateBone02());
        holder.boneRate03.setImageResource(pet.getRateBone03());
        holder.boneRate04.setImageResource(pet.getRateBone04());
        holder.boneRate05.setImageResource(pet.getRateBone05());
    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    public static class PetsViewHolder extends RecyclerView.ViewHolder {

        private TextView title, rate, description;
        private ImageView photo, boneRate01, boneRate02, boneRate03, boneRate04, boneRate05;
        private MaterialButton buttonAddFavorites;

        public PetsViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.text_title);
            rate = itemView.findViewById(R.id.text_rate);
            description = itemView.findViewById(R.id.text_description);
            photo = itemView.findViewById(R.id.image_photo);
            boneRate01 = itemView.findViewById(R.id.ic_boneRate01);
            boneRate02 = itemView.findViewById(R.id.ic_boneRate02);
            boneRate03 = itemView.findViewById(R.id.ic_boneRate03);
            boneRate04 = itemView.findViewById(R.id.ic_boneRate04);
            boneRate05 = itemView.findViewById(R.id.ic_boneRate05);
            buttonAddFavorites = itemView.findViewById(R.id.button_addFavorite);
        }
    }

}
