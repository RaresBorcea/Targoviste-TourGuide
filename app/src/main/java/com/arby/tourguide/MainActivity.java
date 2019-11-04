package com.arby.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        TextView museums = (TextView) findViewById(R.id.museums);

        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(museumsIntent);
            }
        });

        TextView pubs = (TextView) findViewById(R.id.pubs);

        pubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pubsIntent = new Intent(MainActivity.this, PubsActivity.class);
                startActivity(pubsIntent);
            }
        });

        TextView parks = (TextView) findViewById(R.id.parks);

        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent parksIntent = new Intent(MainActivity.this, ParksActivity.class);
                startActivity(parksIntent);
            }
        });
    }
}
