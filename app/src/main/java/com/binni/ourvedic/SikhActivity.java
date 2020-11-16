package com.binni.ourvedic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.binni.ourvedic.Adapters.HinduAdapter;
import com.binni.ourvedic.Adapters.SikhAdapter;
import com.binni.ourvedic.Models.HinduModel;
import com.binni.ourvedic.Models.SikhModel;

import java.util.ArrayList;

import static com.binni.ourvedic.Adapters.ChristanAdapter.ChristianPREFERENCES;
import static com.binni.ourvedic.Adapters.SikhAdapter.ShikhPREFERENCES;

public class SikhActivity extends AppCompatActivity {
    public static SharedPreferences.Editor editor;
    RecyclerView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikh);


        list = findViewById(R.id.list);

        ArrayList<SikhModel> items = new ArrayList<>();

        SharedPreferences sharedPrefShikh;

        sharedPrefShikh =getSharedPreferences(ShikhPREFERENCES, MODE_PRIVATE);

        editor = sharedPrefShikh.edit();



        items.add(new SikhModel(R.drawable.bhojpatra,"Bhojpatra\t\tRs.70"));
        items.add(new SikhModel(R.drawable.janeu,"Janeu\t\tRs.50"));
        items.add(new SikhModel(R.drawable.kalash,"Kalsh\t\tRs.100"));
        items.add(new SikhModel(R.drawable.supari,"Supari\t\tRs.20"));








        SikhAdapter adapter = new SikhAdapter(items,SikhActivity.this);
        list.setAdapter(adapter);


        GridLayoutManager layout = new GridLayoutManager(SikhActivity.this,2);
        list.setLayoutManager(layout);
    }
}