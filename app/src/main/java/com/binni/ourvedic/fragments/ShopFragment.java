package com.binni.ourvedic.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.binni.ourvedic.Adapters.RecyclerAdapter;
import com.binni.ourvedic.Models.RecyclerModel;
import com.binni.ourvedic.R;

import java.util.ArrayList;


public class ShopFragment extends Fragment {

    RecyclerView list;
    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shop, container, false);
        list = view.findViewById(R.id.list);

        ArrayList<RecyclerModel> items = new ArrayList<>();

        //adding items
        items.add(new RecyclerModel(R.drawable.hindu,"Hindu"));
        items.add(new RecyclerModel(R.drawable.islam,"Islam"));
        items.add(new RecyclerModel(R.drawable.christian,"Christian"));
        items.add(new RecyclerModel(R.drawable.sikh,"Sikh"));
        items.add(new RecyclerModel(R.drawable.baudh,"Buddh"));
        items.add(new RecyclerModel(R.drawable.jain,"Jain"));

        RecyclerAdapter adapter = new RecyclerAdapter(items,getContext());
        list.setAdapter(adapter);

        GridLayoutManager layout = new GridLayoutManager(getContext(),2);
        list.setLayoutManager(layout);

        return view;
    }
}