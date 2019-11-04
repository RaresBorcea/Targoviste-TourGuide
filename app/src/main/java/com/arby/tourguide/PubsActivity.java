package com.arby.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by rares on 26.07.2017.
 */

public class PubsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.pname1), getString(R.string.padd1), getString(R.string.phour1)));
        words.add(new Word(getString(R.string.pname2), getString(R.string.padd2), getString(R.string.phour2)));
        words.add(new Word(getString(R.string.pname3), getString(R.string.padd3), getString(R.string.phour3)));
        words.add(new Word(getString(R.string.pname4), getString(R.string.padd4), getString(R.string.phour4)));
        words.add(new Word(getString(R.string.pname5), getString(R.string.padd5), getString(R.string.phour5)));
        words.add(new Word(getString(R.string.pname6), getString(R.string.padd6), getString(R.string.phour6)));

        // Create an WordAdapter, whose data source is a list of Words
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_pubs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
