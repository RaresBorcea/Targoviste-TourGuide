package com.arby.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by rares on 26.07.2017.
 */

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.history), getString(R.string.madd1), getString(R.string.mhour1)));
        words.add(new Word(getString(R.string.arts), getString(R.string.madd2), getString(R.string.mhour2)));
        words.add(new Word(getString(R.string.royal), getString(R.string.madd3), getString(R.string.mhour3)));
        words.add(new Word(getString(R.string.chindia), getString(R.string.madd4), getString(R.string.mhour4)));
        words.add(new Word(getString(R.string.police), getString(R.string.madd5), getString(R.string.mhour5)));
        words.add(new Word(getString(R.string.stelea), getString(R.string.madd6), getString(R.string.mhour6)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_museums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}