package com.example.simplevent;

import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CateringActivity extends AppCompatActivity {

    private RecyclerView rvCatering;
    private ArrayList<Catering> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catering);

        rvCatering = findViewById(R.id.rv_catering);
        rvCatering.setHasFixedSize(true);

        list.addAll(CateringData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvCatering.setLayoutManager(new LinearLayoutManager(this));
        CardViewCateringAdapter cardViewCateringAdapter = new CardViewCateringAdapter(list);
        rvCatering.setAdapter(cardViewCateringAdapter);
    }
}
