package com.binni.ourvedic.fragments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.binni.ourvedic.CheckoutActivity;
import com.binni.ourvedic.R;

import java.util.ArrayList;

import static android.content.Context.MODE_PRIVATE;
import static com.binni.ourvedic.Adapters.BuddhAdapter.*;
import static com.binni.ourvedic.Adapters.ChristanAdapter.*;
import static com.binni.ourvedic.Adapters.HinduAdapter.*;
import static com.binni.ourvedic.Adapters.IslamAdapter.*;
import static com.binni.ourvedic.Adapters.SikhAdapter.*;
import static com.binni.ourvedic.Adapters.JainAdapter.*;


public class CartFragment extends Fragment {

        ListView listView,listView1,listView2,listView3,listView4,listView5;
        Button btn;

    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        listView = view.findViewById(R.id.listview);
        listView1 = view.findViewById(R.id.listview1);
        listView2= view.findViewById(R.id.listview2);
        listView3 = view.findViewById(R.id.listview3);
        listView4 = view.findViewById(R.id.listview4);
        listView5 = view.findViewById(R.id.listview5);
        btn = view.findViewById(R.id.orderbtn);
        ArrayList<String> hindu = new ArrayList<>();
        ArrayList<String> islam = new ArrayList<>();
        ArrayList<String> christan = new ArrayList<>();
        ArrayList<String> sikh = new ArrayList<>();
        ArrayList<String> buddh = new ArrayList<>();
        ArrayList<String> jain = new ArrayList<>();
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences(HinduPREFERENCES, MODE_PRIVATE);

        //it is getting the value from activties how many are selected, if not selected then default value =0;
        String Fruitvalue = sharedPreferences.getString(Fruits,"0");
        String Dhupvalue = sharedPreferences.getString(Dhup,"0");
        String AgarBattivalue = sharedPreferences.getString(AgarBatti,"0");
        String GulabJalvalue = sharedPreferences.getString(GulabJal,"0");
        String KumKumvalue = sharedPreferences.getString(KumKum,"0");
        String Nariyalvalue = sharedPreferences.getString(Nariyal,"0");
        String Camphorvalue = sharedPreferences.getString(Camphor,"0");
        String Flowersvalue = sharedPreferences.getString(Flowers,"0");



        if(!Fruitvalue.contains("0")) {
            hindu.add("Fruit : " + Fruitvalue);
        }

        if(!Dhupvalue.contains("0")) {
            hindu.add( "Dhup : " + Dhupvalue);
        }

        if(!AgarBattivalue.contains("0")) {
            hindu.add( "AgarBatti : " + AgarBattivalue);
        }

        if(!GulabJalvalue.contains("0")) {
            hindu.add("Gulabjal : " + GulabJalvalue);
        }

        if(!KumKumvalue.contains("0")) {
            hindu.add("Kumkum : " + KumKumvalue);
        }

        if(!Nariyalvalue.contains("0")) {
            hindu.add("Nariyal : " + Nariyalvalue);
        }

        if(!Camphorvalue.contains("0")) {
            hindu.add("Camphor : " + Camphorvalue);
        }

        if(!Flowersvalue.contains("0")) {
            hindu.add("Flowers : " + Flowersvalue);
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(), R.layout.support_simple_spinner_dropdown_item, hindu);

        listView.setAdapter(arrayAdapter);


        //GETTING VALUE FROM ISLAM
        SharedPreferences sharedPreferencesIslam = this.getActivity().getSharedPreferences(IslamPREFERENCES, MODE_PRIVATE);

        //it is getting the value from activties how many are selected, if not selected then default value =0;
        String AllahFramevalue = sharedPreferencesIslam.getString(AllahFrame,"0");
        String  Chadarvalue = sharedPreferencesIslam.getString(Chadar,"0");
        String Quranvalue = sharedPreferencesIslam.getString(Quran,"0");

        if(!AllahFramevalue.contains("0")) {
            islam.add("Allah Frame : " + AllahFramevalue);
        }

        if(!Chadarvalue.contains("0")) {
            islam.add( "Chadar : " + Chadarvalue);
        }

        if(!Quranvalue.contains("0")) {
            islam.add( "Quran : " + Quranvalue);
        }

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(getContext(), R.layout.support_simple_spinner_dropdown_item, islam);

        listView1.setAdapter(arrayAdapter1);


        //GETTING VALUE FROM Christian
        SharedPreferences sharedPreferencesChristian = this.getActivity().getSharedPreferences(ChristianPREFERENCES, MODE_PRIVATE);

        //it is getting the value from activties how many are selected, if not selected then default value =0;
        String Biblevalue = sharedPreferencesChristian.getString(Bible,"0");
        String  HolyWatervalue = sharedPreferencesChristian.getString(HolyWater,"0");
        String JesusCrossvalue = sharedPreferencesChristian.getString(JesusCross,"0");
        String Candlesvalue = sharedPreferencesChristian.getString(Candles,"0");

        if(!Biblevalue.contains("0")) {
            christan.add("Bible : " + Biblevalue);
        }

        if(!HolyWatervalue.contains("0")) {
            christan.add( "Holly Water : " + HolyWatervalue);
        }

        if(!JesusCrossvalue.contains("0")) {
            christan.add( "Jesus Cross : " + JesusCrossvalue);
        }
        if(!Candlesvalue.contains("0")) {
            christan.add( "Candels : " + Candlesvalue);
        }

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(getContext(), R.layout.support_simple_spinner_dropdown_item, christan);

        listView2.setAdapter(arrayAdapter2);


        //GETTING VALUE FROM Shikh
        SharedPreferences sharedPreferencesShikh = this.getActivity().getSharedPreferences(ShikhPREFERENCES, MODE_PRIVATE);

        //it is getting the value from activties how many are selected, if not selected then default value =0;
        String Bhojpatravalue = sharedPreferencesShikh.getString(Bhojpatra,"0");
        String  Janeuvalue = sharedPreferencesShikh.getString(Janeu,"0");
        String Kalshvalue = sharedPreferencesShikh.getString(Kalsh,"0");
        String Suparivalue = sharedPreferencesShikh.getString(Supari,"0");


        if(!Bhojpatravalue.contains("0")) {
            sikh.add("Bhoj Patra : " + Bhojpatravalue);
        }

        if(!Janeuvalue.contains("0")) {
            sikh.add( "Janeu : " + Janeuvalue);
        }

        if(!Kalshvalue.contains("0")) {
            sikh.add( "Kalash : " + Kalshvalue);
        }
        if(!Suparivalue.contains("0")) {
            sikh.add( "Supari : " + Suparivalue);
        }

        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<>(getContext(), R.layout.support_simple_spinner_dropdown_item, sikh);

        listView3.setAdapter(arrayAdapter3);

        //Getting Value from Buddh
        SharedPreferences sharedPreferencesBuddh = this.getActivity().getSharedPreferences(BuddhPREFERENCES, MODE_PRIVATE);

        //it is getting the value from activties how many are selected, if not selected then default value =0;
        String BuddhaStatuevalue = sharedPreferencesBuddh.getString(BuddhaStatue,"0");
        String Diyavalue = sharedPreferencesBuddh.getString(Diya,"0");
        String Kundikavalue = sharedPreferencesBuddh.getString(Kundika,"0");
        String Patravalue = sharedPreferencesBuddh.getString(Patra,"0");
        String Shankhvalue = sharedPreferencesBuddh.getString(Shankh,"0");
        String Vajravalue = sharedPreferencesBuddh.getString(Vajra,"0");



        if(!BuddhaStatuevalue.contains("0")) {
            buddh.add("Buddh Statue : " + BuddhaStatuevalue);
        }

        if(!Diyavalue.contains("0")) {
            buddh.add( "Diya : " + Diyavalue);
        }

        if(!Kundikavalue.contains("0")) {
            buddh.add( "Kundika : " + Kundikavalue);
        }
        if(!Patravalue.contains("0")) {
            buddh.add( "Patra : " + Patravalue);
        }
        if(!Shankhvalue.contains("0")) {
            buddh.add( "Shankh : " + Shankhvalue);
        }
        if(!Vajravalue.contains("0")) {
            buddh.add( "Vajra : " + Vajravalue);
        }

        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<>(getContext(), R.layout.support_simple_spinner_dropdown_item, buddh);

        listView4.setAdapter(arrayAdapter4);

        //Getting VAlue from JAIN
        SharedPreferences sharedPreferencesJain = this.getActivity().getSharedPreferences(JainPREFERENCES, MODE_PRIVATE);

        //it is getting the value from activties how many are selected, if not selected then default value =0;
        String FruitsJainvalue = sharedPreferencesJain.getString(FruitsJain,"0");
        String Gangajalvalue = sharedPreferencesJain.getString(Gangajal,"0");
        String ScandalWoodvalue = sharedPreferencesJain.getString(ScandalWood,"0");
        String GulabJalJainvalue = sharedPreferencesJain.getString(GulabJalJain,"0");
        String KumkumJainvalue = sharedPreferencesJain.getString(KumkumJain,"0");
        String NariyalJainvalue = sharedPreferencesJain.getString(NariyalJain,"0");
        String DiyaJainvalue = sharedPreferencesJain.getString(DiyaJain,"0");
        String Akshatvalue = sharedPreferencesJain.getString(Akshat,"0");


        if(!FruitsJainvalue.contains("0")) {
            jain.add("Fruits : " + FruitsJainvalue);
        }

        if(!Gangajalvalue.contains("0")) {
            jain.add( "Gangajal : " +Gangajalvalue);
        }

        if(!ScandalWoodvalue.contains("0")) {
            jain.add( "Scadal Wood : " + ScandalWoodvalue);
        }
        if(!GulabJalJainvalue.contains("0")) {
            jain.add( "Gulabjal : " + GulabJalJainvalue);
        }
        if(!KumkumJainvalue.contains("0")) {
            jain.add( "Kumkum : " + KumkumJainvalue);
        }
        if(!NariyalJainvalue.contains("0")) {
            jain.add( "Nariyal : " + NariyalJainvalue);
        }
        if(!DiyaJainvalue.contains("0")) {
            jain.add( "Diya : " + DiyaJainvalue);
        }
        if(!Akshatvalue.contains("0")) {
            jain.add( "Akshat : " + Akshatvalue);
        }

        ArrayAdapter<String> arrayAdapter5= new ArrayAdapter<String>(getContext(),R.layout.support_simple_spinner_dropdown_item,jain);

        listView5.setAdapter(arrayAdapter5);



        //listner for button (order)

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(getContext(), CheckoutActivity.class);
                    getContext().startActivity(intent);
            }
        });


        return view;
    }
}