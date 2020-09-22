package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewNumbers = findViewById(R.id.numbers);
        textViewNumbers.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intentNumbers = new Intent(MainActivity.this, Numbers.class );
                startActivity(intentNumbers);

            }
        });

        TextView familyTextView = findViewById(R.id.family);
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(MainActivity.this, Family.class );
                startActivity(familyIntent);
            }
        });

        TextView phrasesTextView = findViewById(R.id.phrases);
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntent = new Intent(MainActivity.this, Phrases.class );
                startActivity(phrasesIntent);
            }
        });

        TextView colorsTextView = findViewById(R.id.colors);
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsIntent = new Intent(MainActivity.this, Colors.class );
                startActivity(colorsIntent);
            }
        });
    }

}
