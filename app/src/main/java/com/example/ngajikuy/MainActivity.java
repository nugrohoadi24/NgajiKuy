package com.example.ngajikuy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMasjid;
    private ArrayList<Masjid> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMasjid = findViewById(R.id.rv_ngaji);
        rvMasjid.setHasFixedSize(true);

        list.addAll(DataMasjid.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMasjid.setLayoutManager(new LinearLayoutManager(this));
        ListMasjidAdapter listMasjidAdapter = new ListMasjidAdapter(this, list);
        rvMasjid.setAdapter(listMasjidAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // untuk inflate(isi) menu
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // cek id yg diklik
        switch (item.getItemId()) {
            case R.id.about:
                // mulai activity
                Intent about = new Intent(this, AboutActivity.class);
                startActivity(about);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
