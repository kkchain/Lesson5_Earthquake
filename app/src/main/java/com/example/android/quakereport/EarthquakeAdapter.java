package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @{Link Earthquakeadapter} know how to create a list item layout for each earthquake
 * in the data source (a list of {@link Earthquake} objects
 *
 * the list item layout will be provided to an adapter view like ListView
 * to be displayed to the user
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /** Construct a new {@link Earthquakeadapter}
     *
     * @param context of the app
     * @param earthquake is the list of earthquakes, which is the data source of the adapter
     */

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes){
        super(context, 0, earthquakes);
    }

    /**Return a list view item that display information about the earthquake
     * at given position in the list of earthquake
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //Check if there is existing list item view (call convertView) that we can reuse
        //otherwise, if convertView is null, then inflate a new list item layout
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);

        }

        //Find the earthquake in the given position in the list of the earthquake
        Earthquake currentEarthquake = getItem(position);

        //Find the TextView with ID magnitude
        TextView magnitudeVeiw = (TextView) listItemView.findViewById(R.id.magnitude);
        //Display the magnitude of the earthquake on the TextView
        magnitudeVeiw.setText(currentEarthquake.getMagnitude());

        //Find the TextView with ID location
        TextView locationVeiw = (TextView) listItemView.findViewById(R.id.location);
        //Display the location of the earthquake on the TextView
        locationVeiw.setText(currentEarthquake.getLocation());


        // Create a new Data object from the time in milliseconds of the earthquake
        Date dateOject = new Date(currentEarthquake.getTimeinMilliseconds());
        //Find the TextView with ID date
        TextView dateVeiw = (TextView) listItemView.findViewById(R.id.date);
        //Display the location of the earthquake on the TextView
        dateVeiw.setText(currentEarthquake.getDate());

        //Format the date String(i.e. "Mar 3, 1984)
        String formattedDate = formatDate(dateOject);
        dateVeiw.setText(formattedDate);

        //Find the TextView ID time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);

        //Format the Time String (i.e. "4:30 PM"
        String formattedTime = formatTime(dateOject);
        timeView.setText(formattedTime);

        //Return the list item view the showing the right data
        return listItemView;
    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984) from a Date Object
     */

    private String formatDate(Date dateObject){
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return  dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date String (i.e. "4:30 PM") from the Date Object
     */

    private String formatTime(Date dateObject){
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

}
