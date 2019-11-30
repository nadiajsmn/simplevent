package com.example.simplevent;



import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import com.google.firebase.auth.FirebaseAuth;
import androidx.appcompat.app.AppCompatActivity;


public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        LinearLayout cv1 = findViewById(R.id.cv1);
        cv1.setOnClickListener(v -> {
            startActivity(new Intent(DashboardActivity.this, EventProfileActivity.class));
            finish();
        });

        Button btnCatering = findViewById(R.id.btnCatering);
        btnCatering.setOnClickListener(v -> {
            startActivity(new Intent(DashboardActivity.this, CateringActivity.class));
            finish();
        });

        Button btnVenue = findViewById(R.id.btnVenue);
        btnVenue.setOnClickListener(v -> {
            startActivity(new Intent(DashboardActivity.this, VenueActivity.class));
            finish();
        });

        Button btnConvection = findViewById(R.id.btnCon);
        btnConvection.setOnClickListener(v -> {
            startActivity(new Intent(DashboardActivity.this, ConvectionActivity.class));
            finish();
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_profile) {
            Intent toProfile = new Intent(this, ProfileActivity.class);
            startActivity(toProfile);
        } else if (id == R.id.nav_about) {
            Toast.makeText(getApplicationContext(), "You Click About", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.wish) {
            Toast.makeText(getApplicationContext(), "You Click Favorite", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.cart) {
            Toast.makeText(getApplicationContext(), "You Click Cart", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_scan) {
            Intent intToScan = new Intent(this, ScanActivity.class);
            startActivity(intToScan);
        } else if (id == R.id.nav_logout) {
            FirebaseAuth.getInstance().signOut();
            Intent intToMain = new Intent(this, LoginActivity.class);
            startActivity(intToMain);
        }
        return true;
    }
}


