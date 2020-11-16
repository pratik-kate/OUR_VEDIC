package com.binni.ourvedic.Adapters;

import android.app.AlertDialog;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;


import com.binni.ourvedic.HinduActivity;
import com.binni.ourvedic.IslamActivity;
import com.binni.ourvedic.Models.IslamModel;
import com.binni.ourvedic.R;

import java.util.ArrayList;

public class IslamAdapter extends RecyclerView.Adapter<IslamAdapter.viewHolder>{


    public static final String IslamPREFERENCES = "MyPrefs" ;
    public static final String AllahFrame = "AllahFrameKey";
    public static final String Chadar = "ChadarKey";
    public static final String Quran = "QuranKey";

    public static int AllahFrameno=0,Chadarno=0,Quranno=0;
    ArrayList<IslamModel> list;
    Context context;


    public IslamAdapter(ArrayList<IslamModel> list, Context context) {
        this.list = list;
        this.context = context;

    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.design,
                parent,
                false
        );



        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IslamAdapter.viewHolder holder, int position) {
        IslamModel model = list.get(position);

        holder.image.setImageResource(model.getImage());
        holder.text.setText(model.getText());

        holder.image.setOnClickListener(v -> {


            switch (position){
                case 0:

                    AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                    builder.setTitle("AllahFrame");
                    builder.setMessage("You want to add this item in cart");
                    builder.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        AllahFrameno++;
                        IslamActivity.editor.putString(AllahFrame, AllahFrameno+"");
                        IslamActivity.editor.apply();

                        Toast.makeText(context, "AllahFrame added", Toast.LENGTH_SHORT).show();
                    });
                    builder.setNegativeButton("No", (dialog, which) -> builder.setOnCancelListener(dialog15 -> {
                        //by clicking no the alert box will disappear
                        //done
                    }));
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                    break;

                case 1:

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(v.getContext());
                    builder1.setTitle("Chadar");
                    builder1.setMessage("you want to add this item in cart");
                    builder1.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        Chadarno++;
                        IslamActivity.editor.putString(Chadar, Chadarno+"");
                        IslamActivity.editor.apply();
                        Toast.makeText(context, "Chadar added", Toast.LENGTH_SHORT).show();
                    });
                    builder1.setNegativeButton("No", (dialog, which) -> builder1.setOnCancelListener(dialog14 -> {
                        //by clicking no the alert box will disappear
                        //done
                    }));
                    AlertDialog alertDialog1 = builder1.create();
                    alertDialog1.show();
                    break;

                case 2:

                    AlertDialog.Builder builder2 = new AlertDialog.Builder(v.getContext());
                    builder2.setTitle("Quran");
                    builder2.setMessage("you want to add this item in your cart");
                    builder2.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO

                        Quranno++;
                        IslamActivity.editor.putString(Quran, Quranno+"");
                        IslamActivity.editor.apply();
                        Toast.makeText(context, "Quran added", Toast.LENGTH_SHORT).show();
                    });
                    builder2.setNegativeButton("No", (dialog, which) -> builder2.setOnCancelListener(dialog13 -> {
                        //by clicking no the alert box will disappear
                        //done
                    }));
                    AlertDialog alertDialog2 = builder2.create();
                    alertDialog2.show();
                    break;


                default:

                    break;
            }

        });


    }




    @Override
    public int getItemCount() {
        return list.size();
    }


public static class viewHolder extends ViewHolder {
    ImageView image;
    TextView text;


    public viewHolder(@NonNull View itemView) {
        super(itemView);


        image = itemView.findViewById(R.id.image);
        text = itemView.findViewById(R.id.text);

    }
}}



