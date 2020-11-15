package com.binni.ourvedic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;


import com.binni.ourvedic.Adapters.ChristanAdapter;
import com.binni.ourvedic.Models.ChristanModel;

import java.util.ArrayList;

import static com.binni.ourvedic.Adapters.ChristanAdapter.ChristianPREFERENCES;
import static com.binni.ourvedic.Adapters.IslamAdapter.IslamPREFERENCES;

public class ChristianActivity extends AppCompatActivity {
    public static SharedPreferences.Editor editor;
    RecyclerView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christian);



            list = findViewById(R.id.list);

            ArrayList<ChristanModel> items = new ArrayList<>();


        SharedPreferences sharedPrefIChristian;

        sharedPrefIChristian =getSharedPreferences(ChristianPREFERENCES, MODE_PRIVATE);

        editor = sharedPrefIChristian.edit();


            items.add(new ChristanModel(R.drawable.bible,"Bible"));

            items.add(new ChristanModel(R.drawable.holywater,"Holy Water"));
            items.add(new ChristanModel(R.drawable.jesuscros,"Jesus Cross"));
             items.add(new ChristanModel(R.drawable.candles,"Candles"));






            ChristanAdapter adapter = new ChristanAdapter(items,ChristianActivity.this);
            list.setAdapter(adapter);




            GridLayoutManager layout = new GridLayoutManager(ChristianActivity.this,2);
            list.setLayoutManager(layout);

        }
    }
