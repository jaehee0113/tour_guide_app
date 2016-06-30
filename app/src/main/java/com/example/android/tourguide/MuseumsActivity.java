package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jae Hee on 6/30/2016.
 */
public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        //Preparing data
        Attraction nfsa = new Attraction(getResources().getString(R.string.nfsa), R.drawable.nfsa);
        nfsa.setAddress(getResources().getString(R.string.nfsa_address));

        attractions.add(nfsa);
        attractions.add(new Attraction(getResources().getString(R.string.anzac), R.drawable.anzac));
        attractions.add(new Attraction(getResources().getString(R.string.naa), R.drawable.naa));


        //Setting AttractionAdapter
        AttractionAdapter attractionAdapter = new AttractionAdapter(this, attractions);

        ListView listView = (ListView) findViewById(R.id.museums_list);

        listView.setAdapter(attractionAdapter);

    }

}
