package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 *
 * Further implementation of the class ArrayAdapter to cater for Attraction data type (i.e. object).
 * Created by Jae Hee on 6/30/2016.
 */
public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions){
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View attractItemView = convertView;

        if(attractItemView == null)
            attractItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        //The index of the attraction arraylist supplied
        Attraction currentAttraction = getItem(position);

        //Setting text for name text view
        TextView nameTextView = (TextView) attractItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentAttraction.getName());

        //Setting text for address text view
        TextView addressTextView = (TextView) attractItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentAttraction.getAddress());

        //Setting image resource for attract image view
        ImageView imageView = (ImageView) attractItemView.findViewById(R.id.attraction_image);

        //Only set if attraction has an image!
        if(currentAttraction.hasImage()){
            imageView.setImageResource(currentAttraction.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        return attractItemView;

    }


}
