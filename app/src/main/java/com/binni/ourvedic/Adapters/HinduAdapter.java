package com.binni.ourvedic.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.binni.ourvedic.Models.HinduModel;
import com.binni.ourvedic.Models.RecyclerModel;
import com.binni.ourvedic.R;

import java.util.ArrayList;

public class HinduAdapter extends RecyclerView.Adapter<HinduAdapter.viewHolder>{


    ArrayList<HinduModel> list;
    Context context;


    public HinduAdapter(ArrayList<HinduModel> list, Context context) {
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
        HinduModel model = list.get(position);

        holder.image.setImageResource(model.getImage());
        holder.text.setText(model.getText());

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Intent intent;
                switch (position){
                    case 0:


                        break;

                    case 1:


                        break;

                    case 2:


                        break;

                    case 3:


                        break;

                    case 4:


                        break;

                    case 5:

                        break;


                    default:

                        break;
                }

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
        //View mView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);


            image = itemView.findViewById(R.id.image);
            text = itemView.findViewById(R.id.text);
           // mView = itemView;
        }
    }
}
