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


import com.binni.ourvedic.Models.SikhModel;
import com.binni.ourvedic.R;
import com.binni.ourvedic.SikhActivity;

import java.util.ArrayList;

public class SikhAdapter extends RecyclerView.Adapter<SikhAdapter.viewHolder>{


    ArrayList<SikhModel> list;
    Context context;

    public static final String ShikhPREFERENCES = "MyPrefs" ;
    public static final String Bhojpatra = "BhojpatraKey";
    public static final String Janeu = "JaneuKey";
    public static final String Kalsh = "JKalshKey";
    public static final String Supari = "SupariKey";

    public static int Bhojpatrano=0,Janeuno=0,Kalshno=0,Suparino=0;

    public SikhAdapter(ArrayList<SikhModel> list, Context context) {
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
        SikhModel model = list.get(position);

        holder.image.setImageResource(model.getImage());
        holder.text.setText(model.getText());

        holder.image.setOnClickListener(v -> {

            switch (position){
                case 0:

                    AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                    builder.setTitle("Bhojpatra");
                    builder.setMessage("You want to add this item in cart");
                    builder.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        Bhojpatrano++;
                        SikhActivity.editor.putString(Bhojpatra, Bhojpatrano+"");
                        SikhActivity.editor.apply();
                        Toast.makeText(context,  "Bhoj Patra added", Toast.LENGTH_SHORT).show();

                    });
                    builder.setNegativeButton("No", (dialog, which) -> builder.setOnCancelListener(dialog1 -> {
                        //by clicking no the alert box will disappear
                        //done
                    }));
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                    break;

                case 1:

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(v.getContext());
                    builder1.setTitle("Janeu");
                    builder1.setMessage("you want to add this item in cart");
                    builder1.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        Janeuno++;
                        SikhActivity.editor.putString(Janeu, Janeuno+"");
                        SikhActivity.editor.apply();
                        Toast.makeText(context, "Janeu added", Toast.LENGTH_SHORT).show();
                    });
                    builder1.setNegativeButton("No", (dialog, which) -> builder1.setOnCancelListener(dialog12 -> {
                        //by clicking no the alert box will disappear
                        //done
                    }));
                    AlertDialog alertDialog1 = builder1.create();
                    alertDialog1.show();
                    break;

                case 2:

                    AlertDialog.Builder builder2 = new AlertDialog.Builder(v.getContext());
                    builder2.setTitle("Kalash");
                    builder2.setMessage("you want to add this item in your cart");
                    builder2.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        Kalshno++;
                        SikhActivity.editor.putString(Kalsh, Kalshno+"");
                        SikhActivity.editor.apply();
                        Toast.makeText(context, "Kalsh added", Toast.LENGTH_SHORT).show();
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
                    builder3.setTitle("Supari");
                    builder3.setMessage("You want to add this item in cart");
                    builder3.setPositiveButton("yes", (dialog, which) -> {
                        //by clicking on yes button the selected item should be added to cart
                        //TO-DO
                        Suparino++;
                        SikhActivity.editor.putString(Supari, Suparino+"");
                        SikhActivity.editor.apply();
                        Toast.makeText(context, "Supari added", Toast.LENGTH_SHORT).show();
                    });
                    builder3.setNegativeButton("no", (dialog, which) -> builder3.setOnCancelListener(dialog14 -> {
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
    public int getItemCount() {
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
