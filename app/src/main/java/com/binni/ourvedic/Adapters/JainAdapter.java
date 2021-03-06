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


import com.binni.ourvedic.BuddhActivity;
import com.binni.ourvedic.JainActivity;
import com.binni.ourvedic.Models.JainModel;

import com.binni.ourvedic.R;

import java.util.ArrayList;

public class JainAdapter extends RecyclerView.Adapter<JainAdapter.viewHolder>{


    ArrayList<JainModel> list;
    Context context;

    public static final String JainPREFERENCES = "MyPrefs" ;
    public static final String FruitsJain = "FruitsJainKey";
    public static final String Gangajal = "GangajalKey";
    public static final String ScandalWood = "ScandalWoodKey";
    public static final String GulabJalJain = "GulabJalJainKey";
    public static final String KumkumJain = "KumkumJainKey";
    public static final String NariyalJain = "NariyalJainKey";
    public static final String DiyaJain = "DiyaJainKey";
    public static final String Akshat = "AkshatKey";

    public static int FruitsJainno=0,Gangajalno=0,ScandalWoodno=0,GulabJalJainno=0,KumkumJainno=0,NariyalJainno=0,DiyaJainno=0,Akshatno=0;


    public JainAdapter(ArrayList<JainModel> list, Context context) {
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
        JainModel model = list.get(position);

        holder.image.setImageResource(model.getImage());
        holder.text.setText(model.getText());

        holder.image.setOnClickListener(v -> {


            switch (position){
                case 0:
                    AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                    builder.setTitle("Fruits");
                    builder.setMessage("You want to add this item in cart");
                    builder.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        FruitsJainno++;
                        JainActivity.editor.putString(FruitsJain, FruitsJainno+"");
                        JainActivity.editor.apply();
                        Toast.makeText(context, "Fruits added", Toast.LENGTH_SHORT).show();
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
                    builder1.setTitle("Gangajal");
                    builder1.setMessage("you want to add this item in cart");
                    builder1.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        Gangajalno++;
                        JainActivity.editor.putString(Gangajal, Gangajalno+"");
                        JainActivity.editor.apply();

                        Toast.makeText(context, "Gangajal added", Toast.LENGTH_SHORT).show();
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
                    builder2.setTitle("Scandal Wood");
                    builder2.setMessage("you want to add this item in your cart");
                    builder2.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        ScandalWoodno++;
                        JainActivity.editor.putString(ScandalWood, ScandalWoodno+"");
                        JainActivity.editor.apply();
                        Toast.makeText(context, "Scandal Wood added", Toast.LENGTH_SHORT).show();
                    });
                    builder2.setNegativeButton("No", (dialog, which) -> builder2.setOnCancelListener(dialog13 -> {
                        //by clicking no the alert box will disappear
                        //done
                    }));
                    AlertDialog alertDialog2 = builder2.create();
                    alertDialog2.show();
                    break;

                case 3:
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(v.getContext());
                    builder3.setTitle("GulabJal");
                    builder3.setMessage("You want to add this item in cart");
                    builder3.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        GulabJalJainno++;
                        JainActivity.editor.putString(GulabJalJain, GulabJalJainno+"");
                        JainActivity.editor.apply();
                        Toast.makeText(context, "GulabJal added", Toast.LENGTH_SHORT).show();
                    });
                    builder3.setNegativeButton("no", (dialog, which) -> builder3.setOnCancelListener(dialog12 -> {
                        //by clicking no the alert box will disappear
                        //done
                    }));
                    AlertDialog alertDialog3 = builder3.create();
                    alertDialog3.show();

                    break;

                case 4:
                    AlertDialog.Builder builder4 = new AlertDialog.Builder(v.getContext());
                    builder4.setTitle("Kumkum");
                    builder4.setMessage("You want to add this item in Cart");
                    builder4.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        KumkumJainno++;
                        JainActivity.editor.putString(KumkumJain, KumkumJainno+"");
                        JainActivity.editor.apply();
                        Toast.makeText(context, "Kumkum added", Toast.LENGTH_SHORT).show();
                    });
                    builder4.setNegativeButton("no", (dialog, which) -> builder4.setOnCancelListener(dialog1 -> {
                        //by clicking no the alert box will disappear

                    }));
                    AlertDialog alertDialog4 = builder4.create();
                    alertDialog4.show();


                    break;


                case 5:
                    AlertDialog.Builder builder5 = new AlertDialog.Builder(v.getContext());
                    builder5.setTitle("Nariyal");
                    builder5.setMessage("you want to add this item in Cart");
                    builder5.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        NariyalJainno++;
                        JainActivity.editor.putString(NariyalJain, NariyalJainno+"");
                        JainActivity.editor.apply();
                        Toast.makeText(context, "Nariyal added", Toast.LENGTH_SHORT).show();
                    });
                    builder5.setNegativeButton("no", (dialog, which) -> builder5.setOnCancelListener(dialog14 -> {
                        //by clicking no the alert box will disappear
                        //done
                    }));
                    AlertDialog alertDialog5 = builder5.create();
                    alertDialog5.show();

                    break;

                case 6:

                    AlertDialog.Builder builder6 = new AlertDialog.Builder(v.getContext());
                    builder6.setTitle("Diya");
                    builder6.setMessage("You want to add this item in cart");
                    builder6.setPositiveButton("Yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        DiyaJainno++;
                        JainActivity.editor.putString(DiyaJain, DiyaJainno+"");
                        JainActivity.editor.apply();
                        Toast.makeText(context, "Diya added", Toast.LENGTH_SHORT).show();
                    });
                    builder6.setNegativeButton("No", (dialog, which) -> builder6.setOnCancelListener(dialog13 -> {
                        //by clicking no the alert box will disappear
                        //done
                    }));
                    AlertDialog alertDialog6 = builder6.create();
                    alertDialog6.show();

                    break;

                case 7:

                    AlertDialog.Builder builder7 = new AlertDialog.Builder(v.getContext());
                    builder7.setTitle("Akshat");
                    builder7.setMessage("You want to add this item in Cart");
                    builder7.setPositiveButton("Yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        Akshatno++;
                        JainActivity.editor.putString(Akshat, Akshatno+"");
                        JainActivity.editor.apply();
                        Toast.makeText(context, "Akshat added", Toast.LENGTH_SHORT).show();
                    });
                    builder7.setNegativeButton("no", (dialog, which) -> builder7.setOnCancelListener(dialog12 -> {
                        //by clicking no the alert box will disappear
                        //done
                    }));
                    AlertDialog alertDialog7 = builder7.create();
                    alertDialog7.show();

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



    public static class viewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView text;


        public viewHolder(@NonNull View itemView) {
            super(itemView);


            image = itemView.findViewById(R.id.image);
            text = itemView.findViewById(R.id.text);

        }
    }
}
