package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jae Hee on 6/30/2016.
 */
public class SightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sight);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        //Preparing data
        Attraction csiro = new Attraction(getResources().getString(R.string.csiro), R.drawable.csiro);
        csiro.setAddress(getResources().getString(R.string.csiro_address));

        Attraction hca = new Attraction(getResources().getString(R.string.hca), R.drawable.hca);
        hca.setAddress(getResources().getString(R.string.hca_address));

        Attraction carillon = new Attraction(getResources().getString(R.string.carillon), R.drawable.carillion);
        carillon.setAddress(getResources().getString(R.string.carillon_address));

        Attraction war_memorial = new Attraction(getResources().getString(R.string.war_memorial), R.drawable.war_memorial);
        war_memorial.setAddress(getResources().getString(R.string.war_memorial_address));

        Attraction parliament = new Attraction(getResources().getString(R.string.parliament), R.drawable.parliament);
        parliament.setAddress(getResources().getString(R.string.parliament_address));

        Attraction telstra = new Attraction(getResources().getString(R.string.telstra), R.drawable.telstra);
        telstra.setAddress(getResources().getString(R.string.telstra_address));

        Attraction nla = new Attraction(getResources().getString(R.string.nla), R.drawable.nla);
        nla.setAddress(getResources().getString(R.string.nla_address));

        attractions.add(csiro);
        attractions.add(hca);
        attractions.add(carillon);
        attractions.add(parliament);
        attractions.add(war_memorial);
        attractions.add(telstra);
        attractions.add(nla);
        attractions.add(new Attraction(getResources().getString(R.string.anu), R.drawable.anu));
        attractions.add(new Attraction(getResources().getString(R.string.aas), R.drawable.aas));

        //Setting AttractionAdapter
        AttractionAdapter attractionAdapter = new AttractionAdapter(this, attractions);

        ListView listView = (ListView) findViewById(R.id.sight_list);

        listView.setAdapter(attractionAdapter);


    }

}
