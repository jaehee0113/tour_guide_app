package com.example.android.tourguide;

/**
 * Attraction class: A full outline of its states and methods.
 * For the sake of the project, not every variable will be used.
 * Created by Jae Hee on 6/30/2016.
 */
public class Attraction {

    private final int NO_IMAGE_PROVIDED = -1;

    private String address; //Address
    private int phone_number; //Phone Number
    private int postal_code; // Postal Code
    private String name; // Name
    private String details; // Description
    private int ratings; // Ratings
    private int image_resource_id = NO_IMAGE_PROVIDED;

    //The required (must) variable called name should be initialized
    public Attraction(String name){
        this.name = name;
    }

    //Constructor for providing both the name and the image resource as it is necessary for some attractions.
    public Attraction(String name, int image_resource_id){
        this.name = name;
        this.image_resource_id = image_resource_id;
    }

    /*
        GETTERS
     */

    public String getAddress(){
        return this.address;
    }

    public int getPhoneNumber(){
        return this.phone_number;
    }

    public String getName(){
        return this.name;
    }

    public int getPostalCode(){
        return this.postal_code;
    }

    public String getDetails(){
        return this.details;
    }

    public int getRatings(){
        return this.ratings;
    }

    public int getImageResourceId(){
        return this.image_resource_id;
    }

    /*
        SETTERS
     */

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhoneNumber(int phone_number){
        this.phone_number = phone_number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPostalCode(int postal_code){
        this.postal_code = postal_code;
    }

    public void setDetails(String details){
        this.details = details;
    }

    public void setRatings(int ratings){
        this.ratings = ratings;
    }

    public void setImageResourceId(int image_resource_id){
        this.image_resource_id = image_resource_id;
    }

    /*
        CHECKERS
     */

    public boolean hasImage(){
        return image_resource_id != NO_IMAGE_PROVIDED;
    }

}
