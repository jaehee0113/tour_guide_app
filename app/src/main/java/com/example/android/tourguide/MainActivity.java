package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adding Listeners for user input
        TextView sightButton = (TextView) findViewById(R.id.sight);
        sightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSightActivity = new Intent(MainActivity.this, SightActivity.class);
                startActivity(toSightActivity);
            }
        });

        TextView natureButton = (TextView) findViewById(R.id.nature);
        natureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toNatureActivity = new Intent(MainActivity.this, NatureActivity.class);
                startActivity(toNatureActivity);
            }
        });


        TextView outdoorButton = (TextView) findViewById(R.id.outdoor);
        outdoorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toOutdoorActivity = new Intent(MainActivity.this, OutdoorActivity.class);
                startActivity(toOutdoorActivity);
            }
        });


        TextView museumsButton = (TextView) findViewById(R.id.museums);
        museumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toMuseumsActivity = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(toMuseumsActivity);
            }
        });


    }
}
