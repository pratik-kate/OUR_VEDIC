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

import com.binni.ourvedic.Models.PanditModel;
import com.binni.ourvedic.R;

import java.util.ArrayList;

public class PanditAdapter extends RecyclerView.Adapter<PanditAdapter.viewHolder> {


    ArrayList<PanditModel> list;
    Context context;

    public PanditAdapter(ArrayList<PanditModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.design_pandit,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        PanditModel model = list.get(position);

        holder.image.setImageResource(model.getImage());
        holder.name.setText(model.getName());
        holder.religion.setText(model.getReligion());
        holder.address.setText(model.getAddress());
        holder.phone.setText(model.getPhone());


        holder.image.setOnClickListener(v -> {
            switch (position)
            {
                case 0:

                    AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                    builder.setTitle("Confirm");
                    builder.setMessage("You want To Get An Appointment of "+model.getName());
                    builder.setPositiveButton("yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder.setNegativeButton("No", (dialog, which) -> builder.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    break;

                case 1:

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(v.getContext());
                    builder1.setTitle("Confirm");
                    builder1.setMessage("You want To Get An Appointment of "+model.getName());
                    builder1.setPositiveButton("Yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder1.setNegativeButton("No", (dialog, which) -> builder1.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog1 = builder1.create();
                    alertDialog1.show();
                    break;

                case 2:

                    AlertDialog.Builder builder2 = new AlertDialog.Builder(v.getContext());
                    builder2.setTitle("Confirm");
                    builder2.setMessage("You want To Get An Appointment Of "+model.getName());
                    builder2.setPositiveButton("yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder2.setNegativeButton("No", (dialog, which) -> builder2.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog2 = builder2.create();
                    alertDialog2.show();
                    break;

                case 3:

                    AlertDialog.Builder builder3 = new AlertDialog.Builder(v.getContext());
                    builder3.setTitle("Confirm");
                    builder3.setMessage("You Want To Get An Appointment Of "+model.getName());
                    builder3.setPositiveButton("yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder3.setNegativeButton("No", (dialog, which) -> builder3.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog3 = builder3.create();
                    alertDialog3.show();
                    break;

                case 4:

                    AlertDialog.Builder builder4 = new AlertDialog.Builder(v.getContext());
                    builder4.setTitle("Confirm");
                    builder4.setMessage("you want To Get An Appointment of "+model.getName());
                    builder4.setPositiveButton("Yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder4.setNegativeButton("No", (dialog, which) -> builder4.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog4 = builder4.create();
                    alertDialog4.show();
                    break;

                case 5:

                    AlertDialog.Builder builder5 = new AlertDialog.Builder(v.getContext());
                    builder5.setTitle("Confirm");
                    builder5.setMessage("You Want To Get An Appointment Of "+model.getName());
                    builder5.setPositiveButton("Yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder5.setNegativeButton("No", (dialog, which) -> builder5.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog5 = builder5.create();
                    alertDialog5.show();
                    break;
            }
        });


        holder.religion.setOnClickListener(v -> {
            switch (position)
            {
                case 0:

                    AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                    builder.setTitle("Confirm");
                    builder.setMessage("You want To Get An Appointment of "+model.getName());
                    builder.setPositiveButton("yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder.setNegativeButton("No", (dialog, which) -> builder.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    break;

                case 1:

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(v.getContext());
                    builder1.setTitle("Confirm");
                    builder1.setMessage("You want To Get An Appointment of "+model.getName());
                    builder1.setPositiveButton("Yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder1.setNegativeButton("No", (dialog, which) -> builder1.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog1 = builder1.create();
                    alertDialog1.show();
                    break;

                case 2:

                    AlertDialog.Builder builder2 = new AlertDialog.Builder(v.getContext());
                    builder2.setTitle("Confirm");
                    builder2.setMessage("You want To Get An Appointment Of "+model.getName());
                    builder2.setPositiveButton("yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder2.setNegativeButton("No", (dialog, which) -> builder2.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog2 = builder2.create();
                    alertDialog2.show();
                    break;

                case 3:

                    AlertDialog.Builder builder3 = new AlertDialog.Builder(v.getContext());
                    builder3.setTitle("Confirm");
                    builder3.setMessage("You Want To Get An Appointment Of "+model.getName());
                    builder3.setPositiveButton("yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder3.setNegativeButton("No", (dialog, which) -> builder3.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog3 = builder3.create();
                    alertDialog3.show();
                    break;

                case 4:

                    AlertDialog.Builder builder4 = new AlertDialog.Builder(v.getContext());
                    builder4.setTitle("Confirm");
                    builder4.setMessage("you want To Get An Appointment of "+model.getName());
                    builder4.setPositiveButton("Yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder4.setNegativeButton("No", (dialog, which) -> builder4.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog4 = builder4.create();
                    alertDialog4.show();
                    break;

                case 5:

                    AlertDialog.Builder builder5 = new AlertDialog.Builder(v.getContext());
                    builder5.setTitle("Confirm");
                    builder5.setMessage("You Want To Get An Appointment Of "+model.getName());
                    builder5.setPositiveButton("Yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder5.setNegativeButton("No", (dialog, which) -> builder5.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog5 = builder5.create();
                    alertDialog5.show();
                    break;
            }
        });

        holder.address.setOnClickListener(v -> {
            switch (position)
            {
                case 0:

                    AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                    builder.setTitle("Confirm");
                    builder.setMessage("You want To Get An Appointment of "+model.getName());
                    builder.setPositiveButton("yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder.setNegativeButton("No", (dialog, which) -> builder.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    break;

                case 1:

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(v.getContext());
                    builder1.setTitle("Confirm");
                    builder1.setMessage("You want To Get An Appointment of "+model.getName());
                    builder1.setPositiveButton("Yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder1.setNegativeButton("No", (dialog, which) -> builder1.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog1 = builder1.create();
                    alertDialog1.show();
                    break;

                case 2:

                    AlertDialog.Builder builder2 = new AlertDialog.Builder(v.getContext());
                    builder2.setTitle("Confirm");
                    builder2.setMessage("You want To Get An Appointment Of "+model.getName());
                    builder2.setPositiveButton("yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder2.setNegativeButton("No", (dialog, which) -> builder2.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog2 = builder2.create();
                    alertDialog2.show();
                    break;

                case 3:

                    AlertDialog.Builder builder3 = new AlertDialog.Builder(v.getContext());
                    builder3.setTitle("Confirm");
                    builder3.setMessage("You Want To Get An Appointment Of "+model.getName());
                    builder3.setPositiveButton("yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder3.setNegativeButton("No", (dialog, which) -> builder3.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog3 = builder3.create();
                    alertDialog3.show();
                    break;

                case 4:

                    AlertDialog.Builder builder4 = new AlertDialog.Builder(v.getContext());
                    builder4.setTitle("Confirm");
                    builder4.setMessage("you want To Get An Appointment of "+model.getName());
                    builder4.setPositiveButton("Yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder4.setNegativeButton("No", (dialog, which) -> builder4.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog4 = builder4.create();
                    alertDialog4.show();
                    break;

                case 5:

                    AlertDialog.Builder builder5 = new AlertDialog.Builder(v.getContext());
                    builder5.setTitle("Confirm");
                    builder5.setMessage("You Want To Get An Appointment Of "+model.getName());
                    builder5.setPositiveButton("Yes", (dialog, which) -> Toast.makeText(context, model.getName()+" Will Contact You, Thank You!", Toast.LENGTH_LONG).show());
                    builder5.setNegativeButton("No", (dialog, which) -> builder5.setOnCancelListener(dialog19 -> {

                    }));
                    AlertDialog alertDialog5 = builder5.create();
                    alertDialog5.show();
                    break;
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name,religion,address,phone;


        public viewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image_pandit);
            name = itemView.findViewById(R.id.panditname);
            religion = itemView.findViewById(R.id.panditReligion);
            address = itemView.findViewById(R.id.panditLocation);
            phone = itemView.findViewById(R.id.panditPhone);
        }
    }
}