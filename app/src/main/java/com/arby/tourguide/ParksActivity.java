package com.arby.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by rares on 26.07.2017.
 */

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.paname1), getString(R.string.paadd1), getString(R.string.pahour1), R.drawable.metropolitan));
        words.add(new Word(getString(R.string.paname2), getString(R.string.paadd2), getString(R.string.pahour2), R.drawable.chindia));
        words.add(new Word(getString(R.string.paname3), getString(R.string.paadd3), getString(R.string.pahour3), R.drawable.terra));
        words.add(new Word(getString(R.string.paname4), getString(R.string.paadd4), getString(R.string.pahour4), R.drawable.divertiland));
        words.add(new Word(getString(R.string.paname5), getString(R.string.paadd5), getString(R.string.pahour5), R.drawable.tineretului));
        words.add(new Word(getString(R.string.paname6), getString(R.string.paadd6), getString(R.string.pahour6), R.drawable.herastrau));
        words.add(new Word(getString(R.string.paname7), getString(R.string.paadd7), getString(R.string.pahour7), R.drawable.cismigiu));

        // Create an WordAdapter, whose data source is a list of Words
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_parks);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
