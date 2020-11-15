package com.binni.ourvedic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.binni.ourvedic.Adapters.HinduAdapter;
import com.binni.ourvedic.Adapters.SikhAdapter;
import com.binni.ourvedic.Models.HinduModel;
import com.binni.ourvedic.Models.SikhModel;

import java.util.ArrayList;

public class SikhActivity extends AppCompatActivity {
    RecyclerView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikh);


        list = findViewById(R.id.list);

        ArrayList<SikhModel> items = new ArrayList<>();



        items.add(new SikhModel(R.drawable.bhojpatra,"Bhojpatra"));
        items.add(new SikhModel(R.drawable.janeu,"Janeu"));
        items.add(new SikhModel(R.drawable.kalash,"Kalsh"));
        items.add(new SikhModel(R.drawable.supari,"Supari"));








        SikhAdapter adapter = new SikhAdapter(items,SikhActivity.this);
        list.setAdapter(adapter);


        GridLayoutManager layout = new GridLayoutManager(SikhActivity.this,2);
        list.setLayoutManager(layout);
    }
}