package com.arby.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by rares on 26.07.2017.
 */

public class RestaurantsActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.rname1), getString(R.string.radd1), getString(R.string.rhour1)));
        words.add(new Word(getString(R.string.rname2), getString(R.string.radd2), getString(R.string.rhour2)));
        words.add(new Word(getString(R.string.rname3), getString(R.string.radd3), getString(R.string.rhour3)));
        words.add(new Word(getString(R.string.rname4), getString(R.string.radd4), getString(R.string.rhour4)));
        words.add(new Word(getString(R.string.rname5), getString(R.string.radd5), getString(R.string.rhour5)));
        words.add(new Word(getString(R.string.rname6), getString(R.string.radd6), getString(R.string.rhour6)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}