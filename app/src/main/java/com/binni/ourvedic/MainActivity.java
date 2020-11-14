package com.binni.ourvedic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.binni.ourvedic.fragments.CartFragment;
import com.binni.ourvedic.fragments.ShareFragment;
import com.binni.ourvedic.fragments.ShopFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


    NavigationView nv;
    ActionBarDrawerToggle toggle;
    DrawerLayout dl;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nv = findViewById(R.id.nav);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        dl = findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this, dl, toolbar, R.string.open, R.string.close);
        dl.addDrawerListener(toggle);
        toggle.syncState();

        ShopFragment shop = new ShopFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.screen, shop);
        transaction.commit();

        nv.setNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.shop:
                    ShopFragment shop1 = new ShopFragment();
                    FragmentTransaction transaction12 = getSupportFragmentManager().beginTransaction();
                    transaction12.replace(R.id.screen, shop1);
                    transaction12.commit();


                    dl.closeDrawer(GravityCompat.START);
                    break;
                case R.id.cart:
                    CartFragment feed = new CartFragment();
                    FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                    transaction1.replace(R.id.screen, feed);
                    transaction1.commit();

                    Toast.makeText(MainActivity.this, "cart", Toast.LENGTH_SHORT).show();
                    dl.closeDrawer(GravityCompat.START);
                    break;
                case R.id.share:
                    ShareFragment settings = new ShareFragment();
                    FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                    transaction3.replace(R.id.screen, settings);
                    transaction3.commit();

                    Toast.makeText(MainActivity.this, "share", Toast.LENGTH_SHORT).show();
                    dl.closeDrawer(GravityCompat.START);
                    break;
            }


            return true;
        });


    }
}