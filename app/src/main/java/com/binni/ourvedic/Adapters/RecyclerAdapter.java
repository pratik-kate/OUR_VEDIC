package com.binni.ourvedic.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.binni.ourvedic.BuddhActivity;
import com.binni.ourvedic.ChristianActivity;
import com.binni.ourvedic.HinduActivity;
import com.binni.ourvedic.IslamActivity;
import com.binni.ourvedic.JainActivity;
import com.binni.ourvedic.Models.RecyclerModel;
import com.binni.ourvedic.R;
import com.binni.ourvedic.SikhActivity;

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

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Intent intent;
                switch (position){
                    case 0:

                        intent =  new Intent(context, HinduActivity.class);
                        Toast.makeText(context, "Hindu Toast ", Toast.LENGTH_LONG).show();
                        break;

                    case 1:

                        intent =  new Intent(context, IslamActivity.class);
                        Toast.makeText(context, "Islam Toast ", Toast.LENGTH_LONG).show();
                        break;

                    case 2:

                        intent =  new Intent(context, ChristianActivity.class);
                        Toast.makeText(context, "Christian Toast ", Toast.LENGTH_LONG).show();
                        break;

                    case 3:

                        intent =  new Intent(context, SikhActivity.class);
                        Toast.makeText(context, "Sikh Toast ", Toast.LENGTH_LONG).show();
                        break;

                    case 4:

                        intent =  new Intent(context, BuddhActivity.class);
                        Toast.makeText(context, "Buddh Toast ", Toast.LENGTH_LONG).show();
                        break;

                    case 5:
                        intent =  new Intent(context, JainActivity.class);
                        Toast.makeText(context, "Jain Toast ", Toast.LENGTH_LONG).show();
                        break;


                    default:
                        intent =  new Intent(context, HinduActivity.class);
                        Toast.makeText(context, "Hindu Toast ", Toast.LENGTH_LONG).show();
                        break;
                }
                context.startActivity(intent);
                // Here You Do Your Click Magic
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
        View mView;
        private final Context context;
           public viewHolder(@NonNull View itemView) {
               super(itemView);
               context = itemView.getContext();

               image = itemView.findViewById(R.id.image);
               text = itemView.findViewById(R.id.text);
               mView = itemView;
           }
       }
}
