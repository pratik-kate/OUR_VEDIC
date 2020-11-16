package com.binni.ourvedic.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.binni.ourvedic.Adapters.PanditAdapter;
import com.binni.ourvedic.Adapters.RecyclerAdapter;
import com.binni.ourvedic.Models.PanditModel;
import com.binni.ourvedic.Models.RecyclerModel;
import com.binni.ourvedic.R;

import java.util.ArrayList;


public class PanditFragment extends Fragment {

    RecyclerView list;
    public PanditFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pandit, container, false);

        list = view.findViewById(R.id.list_pandit);

        ArrayList<PanditModel> items = new ArrayList<>();

        //adding items
        items.add(new PanditModel(R.drawable.ic_baseline_person_outline_24,"Ram Joshi","Hindu","Pune","8687588566"));
        items.add(new PanditModel(R.drawable.ic_baseline_person_outline_24,"Mohamed Shafi","Islam","Hydrabad","8423655977"));
        items.add(new PanditModel(R.drawable.ic_baseline_person_outline_24,"Father Gregor","Christan","Banglore","9523577155"));
        items.add(new PanditModel(R.drawable.ic_baseline_person_outline_24,"Guru Tej","Sikh","Panjab","9753566011"));
        items.add(new PanditModel(R.drawable.ic_baseline_person_outline_24,"Arjun","Buddh","Mumbai","8560144977"));
        items.add(new PanditModel(R.drawable.ic_baseline_person_outline_24,"Nathuram Premi","Jain","Rajastan","9531466822"));


        PanditAdapter adapter = new PanditAdapter(items,getContext());
        list.setAdapter(adapter);

        LinearLayoutManager layout = new LinearLayoutManager(getContext());
        list.setLayoutManager(layout);


        return view;
    }
}