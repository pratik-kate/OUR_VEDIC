package com.binni.ourvedic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.binni.ourvedic.Adapters.HinduAdapter;
import com.binni.ourvedic.Adapters.JainAdapter;
import com.binni.ourvedic.Adapters.SikhAdapter;
import com.binni.ourvedic.Models.HinduModel;
import com.binni.ourvedic.Models.JainModel;
import com.binni.ourvedic.Models.SikhModel;

import java.util.ArrayList;

import static com.binni.ourvedic.Adapters.BuddhAdapter.BuddhPREFERENCES;

public class JainActivity extends AppCompatActivity {
    public static SharedPreferences.Editor editor;
    RecyclerView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jain);


        list = findViewById(R.id.list);

        ArrayList<JainModel> items = new ArrayList<>();


        SharedPreferences sharedPrefJain;

        sharedPrefJain =getSharedPreferences(JainPREFERENCES, MODE_PRIVATE);

        editor = sharedPrefJain.edit();




        items.add(new JainModel(R.drawable.fruits,"Fruits"));

        items.add(new JainModel(R.drawable.gangajal,"Gangajal"));
        items.add(new JainModel(R.drawable.scandalwood,"Scandal Wood"));
        items.add(new JainModel(R.drawable.gulabjal,"GulabJal"));
        items.add(new JainModel(R.drawable.kumkum,"Kumkum"));
        items.add(new JainModel(R.drawable.nariyal,"Nariyal"));
        items.add(new JainModel(R.drawable.diya,"Diya"));
        items.add(new JainModel(R.drawable.akshat,"Akshat"));







        JainAdapter adapter = new JainAdapter(items,JainActivity.this);
        list.setAdapter(adapter);


        GridLayoutManager layout = new GridLayoutManager(JainActivity.this,2);
        list.setLayoutManager(layout);



    }
}