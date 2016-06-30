package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jae Hee on 6/30/2016.
 */
public class OutdoorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoor);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        //Preparing data
        attractions.add(new Attraction(getResources().getString(R.string.anzac), R.drawable.anzac));
        attractions.add(new Attraction(getResources().getString(R.string.golf), R.drawable.golf));
        attractions.add(new Attraction(getResources().getString(R.string.skydive), R.drawable.skydive));

        //Setting AttractionAdapter
        AttractionAdapter attractionAdapter = new AttractionAdapter(this, attractions);

        ListView listView = (ListView) findViewById(R.id.outdoor_list);

        listView.setAdapter(attractionAdapter);

    }
}
