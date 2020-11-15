package com.binni.ourvedic.fragments;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.binni.ourvedic.R;

import static android.content.Context.MODE_PRIVATE;
import static com.binni.ourvedic.Adapters.HinduAdapter.AgarBatti;
import static com.binni.ourvedic.Adapters.HinduAdapter.Camphor;
import static com.binni.ourvedic.Adapters.HinduAdapter.Dhup;
import static com.binni.ourvedic.Adapters.HinduAdapter.Flowers;
import static com.binni.ourvedic.Adapters.HinduAdapter.Fruits;
import static com.binni.ourvedic.Adapters.HinduAdapter.GulabJal;
import static com.binni.ourvedic.Adapters.HinduAdapter.KumKum;
import static com.binni.ourvedic.Adapters.HinduAdapter.MyPREFERENCES;
import static com.binni.ourvedic.Adapters.HinduAdapter.Nariyal;


public class CartFragment extends Fragment {

TextView demo;
    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        demo = view.findViewById(R.id.demo);
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
        String Fruitvalue = sharedPreferences.getString(Fruits,"");
        String Dhupvalue = sharedPreferences.getString(Dhup,"");
        String AgarBattivalue = sharedPreferences.getString(AgarBatti,"");
        String GulabJalvalue = sharedPreferences.getString(GulabJal,"");
        String KumKumvalue = sharedPreferences.getString(KumKum,"");
        String Nariyalvalue = sharedPreferences.getString(Nariyal,"");
        String Camphorvalue = sharedPreferences.getString(Camphor,"");
        String Flowersvalue = sharedPreferences.getString(Flowers,"");


        demo.setText("Fruits: "+ Fruitvalue+ "\nDhup: "+Dhupvalue);
        return view;
    }
}