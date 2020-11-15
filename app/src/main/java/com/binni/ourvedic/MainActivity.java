package com.binni.ourvedic;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.binni.ourvedic.fragments.CartFragment;
import com.binni.ourvedic.fragments.AboutFragment;
import com.binni.ourvedic.fragments.ContactFragment;
import com.binni.ourvedic.fragments.ShopFragment;
import com.google.android.material.navigation.NavigationView;

import static com.binni.ourvedic.Adapters.BuddhAdapter.BuddhPREFERENCES;
import static com.binni.ourvedic.Adapters.ChristanAdapter.ChristianPREFERENCES;
import static com.binni.ourvedic.Adapters.HinduAdapter.HinduPREFERENCES;
import static com.binni.ourvedic.Adapters.IslamAdapter.IslamPREFERENCES;
import static com.binni.ourvedic.Adapters.JainAdapter.JainPREFERENCES;
import static com.binni.ourvedic.Adapters.SikhAdapter.ShikhPREFERENCES;

public class MainActivity extends AppCompatActivity {


    NavigationView nv;
    ActionBarDrawerToggle toggle;
    DrawerLayout dl;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences pref = getSharedPreferences(HinduPREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.apply();
        SharedPreferences pref1 = getSharedPreferences(IslamPREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor1 = pref1.edit();
        editor1.clear();
        editor1.apply();
        SharedPreferences pref2 = getSharedPreferences(ChristianPREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor2 = pref2.edit();
        editor2.clear();
        editor2.apply();
        SharedPreferences pref3 = getSharedPreferences(ShikhPREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor3 = pref3.edit();
        editor3.clear();
        editor3.apply();
        SharedPreferences pref4 = getSharedPreferences(BuddhPREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor4 = pref4.edit();
        editor4.clear();
        editor4.apply();
        SharedPreferences pref5 = getSharedPreferences(JainPREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor5 = pref5.edit();
        editor5.clear();
        editor5.apply();

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
                    CartFragment cart = new CartFragment();
                    FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                    transaction1.replace(R.id.screen, cart);
                    transaction1.commit();

                    Toast.makeText(MainActivity.this, "cart", Toast.LENGTH_SHORT).show();
                    dl.closeDrawer(GravityCompat.START);
                    break;
                case R.id.about:
                    AboutFragment about = new AboutFragment();
                    FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                    transaction3.replace(R.id.screen, about);
                    transaction3.commit();

                    Toast.makeText(MainActivity.this, "about", Toast.LENGTH_SHORT).show();
                    dl.closeDrawer(GravityCompat.START);
                    break;

                case R.id.contact:
                    ContactFragment contact = new ContactFragment();
                    FragmentTransaction transaction4 = getSupportFragmentManager().beginTransaction();
                    transaction4.replace(R.id.screen, contact);
                    transaction4.commit();

                    Toast.makeText(MainActivity.this, "contact", Toast.LENGTH_SHORT).show();
                    dl.closeDrawer(GravityCompat.START);
                    break;
            }


            return true;
        });


    }
}