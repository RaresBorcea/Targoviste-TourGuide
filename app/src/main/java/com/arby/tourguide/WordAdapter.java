package com.arby.tourguide;

/**
 * Created by rares on 26.07.2017.
 */

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColor;


    public WordAdapter(Activity context, ArrayList<Word> adapter, int color) {
        super(context, 0, adapter);
        mColor = color;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the AndroidFlavor object located at this position in the list
        final Word currentWord = getItem(position);

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentWord.getName());

        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(currentWord.getLocation());

        TextView open = (TextView) listItemView.findViewById(R.id.open);
        open.setText(currentWord.getOpen());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        // Check if an image is provided for this word or not
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            iconView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            iconView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            iconView.setVisibility(View.GONE);
        }


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int background = ContextCompat.getColor(getContext(), mColor);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(background);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
