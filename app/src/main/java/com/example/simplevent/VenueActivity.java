package com.example.simplevent;

import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class VenueActivity extends AppCompatActivity {

    private RecyclerView rvVenue;
    private ArrayList<Venue> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue);

        rvVenue = findViewById(R.id.rv_venue);
        rvVenue.setHasFixedSize(true);

        list.addAll(VenueData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvVenue.setLayoutManager(new LinearLayoutManager(this));
        CardViewVenueAdapter cardViewVenueAdapter = new CardViewVenueAdapter(list);
        rvVenue.setAdapter(cardViewVenueAdapter);
    }
}
