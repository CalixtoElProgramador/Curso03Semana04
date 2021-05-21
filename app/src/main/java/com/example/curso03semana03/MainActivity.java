package com.example.curso03semana03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Pets> pets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_pets);
        MaterialToolbar topAppBar = (MaterialToolbar) findViewById(R.id.topAppBar_main);
        setSupportActionBar(topAppBar);

        createData();
        createAdapter();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.top_app_bar, menu);
        return true;
    }

    public void activityFavorites(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void createAdapter() {
        PetsAdapter adapter = new PetsAdapter(pets);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void createData() {

        pets = new ArrayList<>();
        pets.add(new Pets("Perro01", "5", getString(R.string.cardview_description),
                R.drawable.dog01,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate));
        pets.add(new Pets("Perro02", "3", getString(R.string.cardview_description),
                R.drawable.dog02,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone, R.drawable.ic_bone));
        pets.add(new Pets("Perro03", "4", getString(R.string.cardview_description),
                R.drawable.dog03,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone));
        pets.add(new Pets("Perro04", "5", getString(R.string.cardview_description),
                R.drawable.dog04,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate));
        pets.add(new Pets("Perro05", "2", getString(R.string.cardview_description),
                R.drawable.dog05,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone,
                R.drawable.ic_bone, R.drawable.ic_bone));
        pets.add(new Pets("Perro06", "3", getString(R.string.cardview_description),
                R.drawable.dog06,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone, R.drawable.ic_bone));
        pets.add(new Pets("Perro07", "1", getString(R.string.cardview_description),
                R.drawable.dog07,
                R.drawable.ic_bone_rate, R.drawable.ic_bone, R.drawable.ic_bone,
                R.drawable.ic_bone, R.drawable.ic_bone));
        pets.add(new Pets("Perro08", "5", getString(R.string.cardview_description),
                R.drawable.dog08,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate));
        pets.add(new Pets("Perro09", "4", getString(R.string.cardview_description),
                R.drawable.dog09,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone));
        pets.add(new Pets("Perro10", "0", getString(R.string.cardview_description),
                R.drawable.dog10,
                R.drawable.ic_bone, R.drawable.ic_bone, R.drawable.ic_bone,
                R.drawable.ic_bone, R.drawable.ic_bone));

    }

}