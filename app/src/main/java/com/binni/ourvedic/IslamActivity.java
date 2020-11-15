package com.binni.ourvedic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.binni.ourvedic.Adapters.HinduAdapter;
import com.binni.ourvedic.Adapters.IslamAdapter;
import com.binni.ourvedic.Models.HinduModel;
import com.binni.ourvedic.Models.IslamModel;

import java.util.ArrayList;

public class IslamActivity extends AppCompatActivity {

    RecyclerView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islam);

        list = findViewById(R.id.list);

        ArrayList<IslamModel> items = new ArrayList<>();



        items.add(new IslamModel(R.drawable.allahframe,"Allah Frame"));
        items.add(new IslamModel(R.drawable.chadar,"Chadar"));
        items.add(new IslamModel(R.drawable.quran,"Quran"));








        IslamAdapter adapter = new IslamAdapter(items,IslamActivity.this);
        list.setAdapter(adapter);

//
//        LinearLayoutManager layout = new LinearLayoutManager(HinduActivity.this);
//        list.setLayoutManager(layout);


        GridLayoutManager layout = new GridLayoutManager(IslamActivity.this,2);
        list.setLayoutManager(layout);

    }
}