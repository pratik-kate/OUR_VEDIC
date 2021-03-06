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
import static com.binni.ourvedic.Adapters.JainAdapter.JainPREFERENCES;

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




        items.add(new JainModel(R.drawable.fruits,"Fruits\t\tRs.70"));

        items.add(new JainModel(R.drawable.gangajal,"Gangajal\t\tRs.50"));
        items.add(new JainModel(R.drawable.scandalwood,"Scandal Wood\t\tRs.150"));
        items.add(new JainModel(R.drawable.gulabjal,"GulabJal\t\tRs.60"));
        items.add(new JainModel(R.drawable.kumkum,"Kumkum\t\tRs.30"));
        items.add(new JainModel(R.drawable.nariyal,"Nariyal\t\tRs.25"));
        items.add(new JainModel(R.drawable.diya,"Diya\t\tRs.40"));
        items.add(new JainModel(R.drawable.akshat,"Akshat\t\tRs.50"));







        JainAdapter adapter = new JainAdapter(items,JainActivity.this);
        list.setAdapter(adapter);


        GridLayoutManager layout = new GridLayoutManager(JainActivity.this,2);
        list.setLayoutManager(layout);



    }
}