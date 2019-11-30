package com.example.simplevent;

import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ConvectionActivity extends AppCompatActivity {

    private RecyclerView rvConvection;
    private ArrayList<Convection> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convection);

        rvConvection = findViewById(R.id.rv_convection);
        rvConvection.setHasFixedSize(true);

        list.addAll(ConvectionData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvConvection.setLayoutManager(new LinearLayoutManager(this));
        CardViewConvectionAdapter cardViewConvectionAdapter = new CardViewConvectionAdapter(list);
        rvConvection.setAdapter(cardViewConvectionAdapter);
    }
}
