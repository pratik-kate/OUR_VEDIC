package com.binni.ourvedic.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.binni.ourvedic.Models.RecyclerModel;
import com.binni.ourvedic.R;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.viewHolder>{

    ArrayList<RecyclerModel> list;
    Context context;


    public RecyclerAdapter(ArrayList<RecyclerModel> list, Context context) {
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
            //we sets the data here
          RecyclerModel model = list.get(position);

          holder.image.setImageResource(model.getImage());
          holder.text.setText(model.getText());



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
