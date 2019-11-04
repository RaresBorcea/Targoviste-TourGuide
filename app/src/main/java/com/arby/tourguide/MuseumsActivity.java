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

        // Create an WordAdapter whose data source is a list of Words
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_museums);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
