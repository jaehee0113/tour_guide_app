package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jae Hee on 6/30/2016.
 */
public class NatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        //Preparing data
        Attraction floriade = new Attraction(getResources().getString(R.string.floriade), R.drawable.floriade);
        floriade.setAddress(getResources().getString(R.string.floriade_address));

        attractions.add(new Attraction(getResources().getString(R.string.anbg), R.drawable.anbg));
        attractions.add(floriade);

        //Setting AttractionAdapter
        AttractionAdapter attractionAdapter = new AttractionAdapter(this, attractions);

        ListView listView = (ListView) findViewById(R.id.nature_list);

        listView.setAdapter(attractionAdapter);

    }

}
