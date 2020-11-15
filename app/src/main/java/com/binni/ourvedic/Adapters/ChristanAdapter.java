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


import com.binni.ourvedic.ChristianActivity;
import com.binni.ourvedic.IslamActivity;
import com.binni.ourvedic.Models.ChristanModel;

import com.binni.ourvedic.R;

import java.util.ArrayList;

public class ChristanAdapter extends RecyclerView.Adapter<ChristanAdapter.viewHolder>{


    ArrayList<ChristanModel> list;
    Context context;

    public static final String ChristianPREFERENCES = "MyPrefs" ;
    public static final String Bible = "BibleKey";
    public static final String HolyWater = "ChadarKey";
    public static final String JesusCross = "JesusCrossKey";
    public static final String Candles = "CandlesKey";

    public static int Bibleno=0,HolyWaterno=0,JesusCrossno=0,Candlesno=0;

    public ChristanAdapter(ArrayList<ChristanModel> list, Context context) {
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
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        ChristanModel model = list.get(position);

        holder.image.setImageResource(model.getImage());
        holder.text.setText(model.getText());

        holder.image.setOnClickListener(v -> {


            switch (position) {
                case 0:

                    AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                    builder.setTitle(model.getText());
                    builder.setMessage("You want to add this item in cart");
                    builder.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO

                        Bibleno++;
                        ChristianActivity.editor.putString(Bible, Bibleno+"");
                        ChristianActivity.editor.apply();
                        Toast.makeText(context, model.getText() + " added", Toast.LENGTH_SHORT).show();
                    });
                    builder.setNegativeButton("No", (dialog, which) -> builder.setOnCancelListener(dialog14 -> {
                        //by clicking no the alert box will disappear
                        //done
                    }));
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                    break;

                case 1:

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(v.getContext());
                    builder1.setTitle(model.getText());
                    builder1.setMessage("you want to add this item in cart");
                    builder1.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        HolyWaterno++;
                        ChristianActivity.editor.putString(HolyWater, HolyWaterno+"");
                        ChristianActivity.editor.apply();
                        Toast.makeText(context, model.getText() + " added", Toast.LENGTH_SHORT).show();
                    });
                    builder1.setNegativeButton("No", (dialog, which) -> builder1.setOnCancelListener(dialog13 -> {
                        //by clicking no the alert box will disappear
                        //done
                    }));
                    AlertDialog alertDialog1 = builder1.create();
                    alertDialog1.show();
                    break;

                case 2:

                    AlertDialog.Builder builder2 = new AlertDialog.Builder(v.getContext());
                    builder2.setTitle(model.getText());
                    builder2.setMessage("you want to add this item in your cart");
                    builder2.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        JesusCrossno++;
                        ChristianActivity.editor.putString(JesusCross, JesusCrossno+"");
                        ChristianActivity.editor.apply();
                        Toast.makeText(context, model.getText() + " added", Toast.LENGTH_SHORT).show();
                    });
                    builder2.setNegativeButton("No", (dialog, which) -> builder2.setOnCancelListener(dialog12 -> {
                        //by clicking no the alert box will disappear
                        //done
                    }));
                    AlertDialog alertDialog2 = builder2.create();
                    alertDialog2.show();
                    break;

                case 3:
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(v.getContext());
                    builder3.setTitle(model.getText());
                    builder3.setMessage("You want to add this item in cart");
                    builder3.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        Candlesno++;
                        ChristianActivity.editor.putString(Candles, Candlesno+"");
                        ChristianActivity.editor.apply();
                        Toast.makeText(context, model.getText() + " added", Toast.LENGTH_SHORT).show();
                    });
                    builder3.setNegativeButton("no", (dialog, which) -> builder3.setOnCancelListener(dialog1 -> {
                        //by clicking no the alert box will disappear
                        //done
                    }));
                    AlertDialog alertDialog3 = builder3.create();
                    alertDialog3.show();

                    break;

                default:
                    break;

            }
        });
    }

                @Override
                public int getItemCount () {
                    return list.size();
                }


                public static class viewHolder extends RecyclerView.ViewHolder {
                    ImageView image;
                    TextView text;


                    public viewHolder(@NonNull View itemView) {
                        super(itemView);


                        image = itemView.findViewById(R.id.image);
                        text = itemView.findViewById(R.id.text);

                    }
                }
            }