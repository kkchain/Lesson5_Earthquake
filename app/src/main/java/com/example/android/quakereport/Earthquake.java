package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;

    /** Construct a new {@Link} Earthquake Object
     * @param magnitude is the size of the earthquake
     * @param location is the city of the earthquake
     * @param date is when the earthquake happened
     */

    public Earthquake (String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    //Return magnitude of the earthquake
    public String getMagnitude() {
        return mMagnitude;
    }

    //Return location of the earthquake
    public String getLocation() {
        return mLocation;
    }

    //Return date of the earthquake
    public String getDate() {
        return mDate;
    }
}
