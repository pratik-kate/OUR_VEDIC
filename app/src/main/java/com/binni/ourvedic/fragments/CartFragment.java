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
import static com.binni.ourvedic.Adapters.BuddhAdapter.*;
import static com.binni.ourvedic.Adapters.ChristanAdapter.*;
import static com.binni.ourvedic.Adapters.HinduAdapter.*;
import static com.binni.ourvedic.Adapters.IslamAdapter.*;
import static com.binni.ourvedic.Adapters.SikhAdapter.*;


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
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences(HinduPREFERENCES, MODE_PRIVATE);

        //it is getting the value from activties how many are selected, if not selected then default value =0;
        String Fruitvalue = sharedPreferences.getString(Fruits,"");
        String Dhupvalue = sharedPreferences.getString(Dhup,"");
        String AgarBattivalue = sharedPreferences.getString(AgarBatti,"");
        String GulabJalvalue = sharedPreferences.getString(GulabJal,"");
        String KumKumvalue = sharedPreferences.getString(KumKum,"");
        String Nariyalvalue = sharedPreferences.getString(Nariyal,"");
        String Camphorvalue = sharedPreferences.getString(Camphor,"");
        String Flowersvalue = sharedPreferences.getString(Flowers,"");


        //GETTING VALUE FROM ISLAM
        SharedPreferences sharedPreferencesIslam = this.getActivity().getSharedPreferences(IslamPREFERENCES, MODE_PRIVATE);

        //it is getting the value from activties how many are selected, if not selected then default value =0;
        String AllahFramevalue = sharedPreferencesIslam.getString(AllahFrame,"");
        String  Chadarvalue = sharedPreferencesIslam.getString(Chadar,"");
        String Quranvalue = sharedPreferencesIslam.getString(Quran,"");

        //GETTING VALUE FROM Christian
        SharedPreferences sharedPreferencesChristian = this.getActivity().getSharedPreferences(ChristianPREFERENCES, MODE_PRIVATE);

        //it is getting the value from activties how many are selected, if not selected then default value =0;
        String Biblevalue = sharedPreferencesChristian.getString(Bible,"");
        String  HolyWatervalue = sharedPreferencesChristian.getString(HolyWater,"");
        String JesusCrossvalue = sharedPreferencesChristian.getString(JesusCross,"");
        String Candlesvalue = sharedPreferencesChristian.getString(Candles,"");

 //GETTING VALUE FROM Shikh
        SharedPreferences sharedPreferencesShikh = this.getActivity().getSharedPreferences(ShikhPREFERENCES, MODE_PRIVATE);

        //it is getting the value from activties how many are selected, if not selected then default value =0;
        String Bhojpatravalue = sharedPreferencesShikh.getString(Bhojpatra,"");
        String  Janeuvalue = sharedPreferencesShikh.getString(Janeu,"");
        String Kalshvalue = sharedPreferencesShikh.getString(Kalsh,"");
        String Suparivalue = sharedPreferencesShikh.getString(Supari,"");

        //Getting VAlue from Buddh
        SharedPreferences sharedPreferencesBuddh = this.getActivity().getSharedPreferences(BuddhPREFERENCES, MODE_PRIVATE);

        //it is getting the value from activties how many are selected, if not selected then default value =0;
        String BuddhaStatuevalue = sharedPreferencesBuddh.getString(BuddhaStatue,"");
        String Diyavalue = sharedPreferencesBuddh.getString(Diya,"");
        String Kundikavalue = sharedPreferencesBuddh.getString(Kundika,"");
        String Patravalue = sharedPreferencesBuddh.getString(Patra,"");
        String Shankhvalue = sharedPreferencesBuddh.getString(Shankh,"");
        String Vajravalue = sharedPreferencesBuddh.getString(Vajra,"");



        demo.setText("Fruits: "+ Fruitvalue+ "\nDhup: "+Dhupvalue);
        return view;
    }
}