package com.example.guitarlog;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private DatabaseHandler databaseHandler;
    private User usermodel;
    private RecyclerView rvGuitars;
    private ArrayList<Guitar> list = new ArrayList<>();
    private String title = "Guitar Catalog (GuitarLog)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        rvGuitars = findViewById(R.id.rv_guitars);
        rvGuitars.setHasFixedSize(true);

        list.addAll(GuitarData.getListData());
        showRecyclerCardView();
    }
    private void showRecyclerCardView(){
        rvGuitars.setLayoutManager(new LinearLayoutManager(this));
        CardViewGuitar cardViewGuitar = new CardViewGuitar(this, list);
        rvGuitars.setAdapter(cardViewGuitar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMenu) {
        if (selectedMenu == R.id.action_profile) {
            Intent intent = new Intent(this, ProfileActivity.class);
            this.startActivity(intent);
        }
    }
}
