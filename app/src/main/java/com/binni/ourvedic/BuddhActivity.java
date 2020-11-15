package com.binni.ourvedic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.binni.ourvedic.Adapters.BuddhAdapter;
import com.binni.ourvedic.Models.BuddhModel;

import java.util.ArrayList;

import static com.binni.ourvedic.Adapters.BuddhAdapter.BuddhPREFERENCES;


public class BuddhActivity extends AppCompatActivity {
    public static SharedPreferences.Editor editor;
    RecyclerView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buddh);

        list = findViewById(R.id.list);

        ArrayList<BuddhModel> items = new ArrayList<>();

        SharedPreferences sharedPrefBuddh;

        sharedPrefBuddh =getSharedPreferences(BuddhPREFERENCES, MODE_PRIVATE);

        editor = sharedPrefBuddh.edit();




        items.add(new BuddhModel(R.drawable.buddhastatue,"Buddha statue"));
        items.add(new BuddhModel(R.drawable.diya,"Diya"));
        items.add(new BuddhModel(R.drawable.kundika,"Kundika"));
        items.add(new BuddhModel(R.drawable.patra,"Patra"));
        items.add(new BuddhModel(R.drawable.shankh,"Shankh"));
        items.add(new BuddhModel(R.drawable.vajra,"Vajra"));







        BuddhAdapter adapter = new BuddhAdapter(items,BuddhActivity.this);
        list.setAdapter(adapter);

        GridLayoutManager layout = new GridLayoutManager(BuddhActivity.this,2);
        list.setLayoutManager(layout);

    }
}