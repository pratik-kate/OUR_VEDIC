package com.binni.ourvedic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;

import com.binni.ourvedic.Adapters.HinduAdapter;
import com.binni.ourvedic.Adapters.IslamAdapter;
import com.binni.ourvedic.Models.HinduModel;
import com.binni.ourvedic.Models.IslamModel;

import java.util.ArrayList;

import static com.binni.ourvedic.Adapters.HinduAdapter.HinduPREFERENCES;
import static com.binni.ourvedic.Adapters.IslamAdapter.IslamPREFERENCES;

public class IslamActivity extends AppCompatActivity {
    public static SharedPreferences.Editor editor;
    RecyclerView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islam);

        list = findViewById(R.id.list);

        ArrayList<IslamModel> items = new ArrayList<>();



        SharedPreferences sharedPrefIslam;

        sharedPrefIslam =getSharedPreferences(IslamPREFERENCES, MODE_PRIVATE);

        editor = sharedPrefIslam.edit();

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