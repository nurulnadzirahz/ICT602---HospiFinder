package com.example.hospitalfinder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage); // Ensure this matches your homepage layout file name

        Button aboutButton = findViewById(R.id.about_button); // ID of your ABOUT button
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this, About.class); // Ensure About is the correct Activity class name
                startActivity(intent);
            }
        });

        Button teamButton = findViewById(R.id.team_button); // ID of your ABOUT button
        teamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this, Developer.class); // Ensure About is the correct Activity class name
                startActivity(intent);
            }
        });

        Button fuelButton = findViewById(R.id.hospital_button); // ID of your ABOUT button
        fuelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this, MapsActivity.class); // Ensure About is the correct Activity class name
                startActivity(intent);
            }
        });

        Button logoutButton = findViewById(R.id.logout_button); // ID of your ABOUT button
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this, Login.class); // Ensure About is the correct Activity class name
                startActivity(intent);
            }
        });
    }
}