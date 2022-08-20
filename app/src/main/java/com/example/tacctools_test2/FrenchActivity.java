package com.example.tacctools_test2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.tacctools_test2.adapters.SongListAdapter;
import com.example.tacctools_test2.models.SongModel;
import com.example.tacctools_test2.ui.AboutFragment;
import com.example.tacctools_test2.ui.AboutFragmentFR;
import com.example.tacctools_test2.ui.CreditFragment;
import com.example.tacctools_test2.ui.CreditFragmentFR;
import com.example.tacctools_test2.ui.DoctrineFragment;
import com.example.tacctools_test2.ui.DoctrineFragmentFR;
import com.example.tacctools_test2.ui.DonateFragment;
import com.example.tacctools_test2.ui.DonateFragmentFR;
import com.example.tacctools_test2.ui.FavouriteFragment;
import com.example.tacctools_test2.ui.FavouriteFragmentFR;
import com.example.tacctools_test2.ui.HistoryFragment;
import com.example.tacctools_test2.ui.HistoryFragmentFR;
import com.example.tacctools_test2.ui.HomeFragmentFR;
import com.example.tacctools_test2.ui.SettingsFragment;
import com.example.tacctools_test2.ui.SettingsFragmentFR;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class FrenchActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recycler_view);
        ArrayList<String> list = new ArrayList<>();
        list.add("God be the Glory");
        list.add("It is well");
        recyclerView.setAdapter(new SongListAdapter(this, list));
        //recyclerView.setLayoutDirection(RecycleView.);

        drawer = findViewById(R.id.drawer_layout_fr);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragmentFR()).commit();
        navigationView.setCheckedItem(R.id.menu_home);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragmentFR()).commit();
                break;
            case R.id.menu_fav:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FavouriteFragmentFR()).commit();
                break;
            case R.id.menu_history:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HistoryFragmentFR()).commit();
                break;
            case R.id.menu_doctrine:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DoctrineFragmentFR()).commit();
                break;
            case R.id.menu_credit:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CreditFragmentFR()).commit();
                break;
            case R.id.menu_donate:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DonateFragmentFR()).commit();
                break;
            case R.id.menu_about:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AboutFragmentFR()).commit();
                break;
            case R.id.menu_settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SettingsFragmentFR()).commit();
                break;
            case R.id.menu_exit:
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}