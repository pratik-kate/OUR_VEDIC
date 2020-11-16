package com.binni.ourvedic;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.binni.ourvedic.Adapters.HinduAdapter;
import com.binni.ourvedic.Adapters.RecyclerAdapter;
import com.binni.ourvedic.Models.HinduModel;
import com.binni.ourvedic.Models.RecyclerModel;

import java.util.ArrayList;

import static com.binni.ourvedic.Adapters.HinduAdapter.HinduPREFERENCES;


public class HinduActivity extends AppCompatActivity {
    public static SharedPreferences.Editor editor;
    RecyclerView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindu);

        list = findViewById(R.id.list);

        ArrayList<HinduModel> items = new ArrayList<>();




        SharedPreferences sharedPref;
        sharedPref =getSharedPreferences(HinduPREFERENCES, MODE_PRIVATE);

        editor = sharedPref.edit();




        items.add(new HinduModel(R.drawable.fruits,"Fruits\t\tRs.70"));
        items.add(new HinduModel(R.drawable.dhoop,"Dhup\t\tRs.50"));
        items.add(new HinduModel(R.drawable.agarbatti,"AgarBatti\t\tRs.40"));
        items.add(new HinduModel(R.drawable.gulabjal,"GulabJal\t\tRs.80"));
        items.add(new HinduModel(R.drawable.kumkum,"Kumkum\t\tRs.30"));
        items.add(new HinduModel(R.drawable.nariyal,"Nariyal\t\tRs.25"));
        items.add(new HinduModel(R.drawable.camphor,"Camphor\t\tRs.20"));
       // items.add(new HinduModel(R.drawable.diya,"Diya\t\tRs30"));
        items.add(new HinduModel(R.drawable.flowers,"Flowers\t\tRs.60"));






        HinduAdapter adapter = new HinduAdapter(items,HinduActivity.this);
        list.setAdapter(adapter);



        GridLayoutManager layout = new GridLayoutManager(HinduActivity.this,2);
        list.setLayoutManager(layout);

    }
}