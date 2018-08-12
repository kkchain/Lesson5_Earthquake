package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeinMilliseconds;

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

    /**
     * Construct a  new {@link Earthquake} object
     *
     * @param magnitude is the suze of the earthquake
     * @param location is the city of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch)
     *                           when the earthquake happen
     */

    public Earthquake(String magnitude, String location, long timeinMilliseconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeinMilliseconds = timeinMilliseconds;
    }

    /**
     * Return the time of the earthquake
     */

    public long getTimeinMilliseconds(){
        return mTimeinMilliseconds;
    }

}
