package com.binni.ourvedic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CheckoutActivity extends AppCompatActivity {

    EditText name,address,phone;
    Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);


        name = findViewById(R.id.edtname);
        address = findViewById(R.id.edtaddress);
        phone = findViewById(R.id.editPhone);

        confirm = findViewById(R.id.btnconfirm);


        confirm.setOnClickListener(v -> {

            if(!name.getText().toString().isEmpty() && !address.getText().toString().isEmpty() && !phone.getText().toString().isEmpty()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder.setTitle("Confirm");
                builder.setMessage("You want to confirm your Order ?");
                builder.setPositiveButton("yes", (dialog, which) -> {

                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(CheckoutActivity.this, "Order Placed", Toast.LENGTH_SHORT).show();
                });
                builder.setNegativeButton("No", (dialog, which) -> builder.setOnCancelListener(dialog19 -> {

                }));
                AlertDialog alertDialog = builder.create();
                alertDialog.show();


                name.setText("");
                address.setText("");
                phone.setText("");
            }
            else
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder.setTitle("Information");
                builder.setMessage("Please Enter All Information");
                builder.setPositiveButton("OK",((dialog, which) -> {}));
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
}