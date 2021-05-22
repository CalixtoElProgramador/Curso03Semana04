package com.example.curso03semana03;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {

    private RecyclerView recyclerViewProfile;
    private ArrayList<Pets> petsProfile;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerViewProfile = view.findViewById(R.id.recycler_profile);
        setupData();
        setupRecycler();

    }

    private void setupRecycler() {
        PetsAdapter adapter = new PetsAdapter(petsProfile);
        recyclerViewProfile.setAdapter(adapter);
        recyclerViewProfile.setLayoutManager(new GridLayoutManager(getActivity(), 3));
    }

    private void setupData(){
        petsProfile = new ArrayList<>();
        petsProfile.add(new Pets("Perro01", "5", getString(R.string.cardview_description),
                R.drawable.dog10,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate));
        petsProfile.add(new Pets("Perro02", "3", getString(R.string.cardview_description),
                R.drawable.dog10,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone, R.drawable.ic_bone));
        petsProfile.add(new Pets("Perro03", "4", getString(R.string.cardview_description),
                R.drawable.dog10,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone));
        petsProfile.add(new Pets("Perro04", "5", getString(R.string.cardview_description),
                R.drawable.dog10,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate));
        petsProfile.add(new Pets("Perro05", "2", getString(R.string.cardview_description),
                R.drawable.dog10,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone,
                R.drawable.ic_bone, R.drawable.ic_bone));
        petsProfile.add(new Pets("Perro06", "3", getString(R.string.cardview_description),
                R.drawable.dog10,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone, R.drawable.ic_bone));
        petsProfile.add(new Pets("Perro07", "1", getString(R.string.cardview_description),
                R.drawable.dog10,
                R.drawable.ic_bone_rate, R.drawable.ic_bone, R.drawable.ic_bone,
                R.drawable.ic_bone, R.drawable.ic_bone));
        petsProfile.add(new Pets("Perro08", "5", getString(R.string.cardview_description),
                R.drawable.dog10,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate, R.drawable.ic_bone_rate,
                R.drawable.ic_bone_rate, R.drawable.ic_bone_rate));
    }

}