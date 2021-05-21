package com.example.curso03semana03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;
import java.util.Objects;

public class FavoritesActivity extends AppCompatActivity {

    private RecyclerView recyclerPetsFavorites;
    private ArrayList<Pets> petsFavorites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        recyclerPetsFavorites = findViewById(R.id.recycler_petsFavorites);
        MaterialToolbar topAppBar = (MaterialToolbar) findViewById(R.id.topAppBar_favorites);
        setSupportActionBar(topAppBar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        createData();
        createAdapter();

    }

    public void createAdapter() {
        PetsAdapter adapter = new PetsAdapter(petsFavorites);
        recyclerPetsFavorites.setAdapter(adapter);
        recyclerPetsFavorites.setLayoutManager(new LinearLayoutManager(this));
    }

    public void createData() {

        petsFavorites = new ArrayList<>();
        petsFavorites.add(new Pets("Perro06", "3", getString(R.string.cardview_description),
                R.drawable.dog06,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone, R.drawable.ic_bone));
        petsFavorites.add(new Pets("Perro07", "1", getString(R.string.cardview_description),
                R.drawable.dog07,
                R.drawable.ic_bone_rate, R.drawable.ic_bone, R.drawable.ic_bone,
                R.drawable.ic_bone, R.drawable.ic_bone));
        petsFavorites.add(new Pets("Perro08", "5", getString(R.string.cardview_description),
                R.drawable.dog08,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate));
        petsFavorites.add(new Pets("Perro09", "4", getString(R.string.cardview_description),
                R.drawable.dog09,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone));
        petsFavorites.add(new Pets("Perro10", "0", getString(R.string.cardview_description),
                R.drawable.dog10,
                R.drawable.ic_bone, R.drawable.ic_bone, R.drawable.ic_bone,
                R.drawable.ic_bone, R.drawable.ic_bone));

    }

}