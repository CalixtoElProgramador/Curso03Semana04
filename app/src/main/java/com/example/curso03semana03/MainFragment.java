package com.example.curso03semana03;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    private RecyclerView recyclerViewExplore;
    private ArrayList<Pets> petsExplore;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerViewExplore = view.findViewById(R.id.recycler_petsExplore);
        setupData();
        setupRecycler();

    }

    private void setupRecycler() {
        PetsAdapter adapter = new PetsAdapter(petsExplore);
        recyclerViewExplore.setAdapter(adapter);
        recyclerViewExplore.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    private void setupData() {

        petsExplore = new ArrayList<>();
        petsExplore.add(new Pets("Perro01", "5", getString(R.string.cardview_description),
                R.drawable.dog01,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate));
        petsExplore.add(new Pets("Perro02", "3", getString(R.string.cardview_description),
                R.drawable.dog02,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone, R.drawable.ic_bone));
        petsExplore.add(new Pets("Perro03", "4", getString(R.string.cardview_description),
                R.drawable.dog03,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone));
        petsExplore.add(new Pets("Perro04", "5", getString(R.string.cardview_description),
                R.drawable.dog04,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate));
        petsExplore.add(new Pets("Perro05", "2", getString(R.string.cardview_description),
                R.drawable.dog05,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone,
                R.drawable.ic_bone, R.drawable.ic_bone));
        petsExplore.add(new Pets("Perro06", "3", getString(R.string.cardview_description),
                R.drawable.dog06,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone, R.drawable.ic_bone));
        petsExplore.add(new Pets("Perro07", "1", getString(R.string.cardview_description),
                R.drawable.dog07,
                R.drawable.ic_bone_rate, R.drawable.ic_bone, R.drawable.ic_bone,
                R.drawable.ic_bone, R.drawable.ic_bone));
        petsExplore.add(new Pets("Perro08", "5", getString(R.string.cardview_description),
                R.drawable.dog08,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate));
        petsExplore.add(new Pets("Perro09", "4", getString(R.string.cardview_description),
                R.drawable.dog09,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone));
        petsExplore.add(new Pets("Perro10", "0", getString(R.string.cardview_description),
                R.drawable.dog10,
                R.drawable.ic_bone, R.drawable.ic_bone, R.drawable.ic_bone,
                R.drawable.ic_bone, R.drawable.ic_bone));


    }

}