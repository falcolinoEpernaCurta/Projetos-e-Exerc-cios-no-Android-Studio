package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pontosTimeA = 0;
    int pontosTimeB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(pontosTimeA);

    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void MarcarTresPontosTimeA(View view){
        pontosTimeA = pontosTimeA + 3;
        displayForTeamA(pontosTimeA);
    }
    public void MarcarDoisPontosTimeA(View view){
        pontosTimeA = pontosTimeA + 2;
        displayForTeamA(pontosTimeA);
    }
    public void MarcarUmPontoTimeA(View view){
        pontosTimeA = pontosTimeA + 1;
        displayForTeamA(pontosTimeA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void MarcarTresPontosTimeB(View view){
        pontosTimeB = pontosTimeB + 3;
        displayForTeamB(pontosTimeB);
    }
    public void MarcarDoisPontosTimeB(View view){
        pontosTimeB = pontosTimeB + 2;
        displayForTeamB(pontosTimeB);
    }
    public void MarcarUmPontoTimeB(View view){
        pontosTimeB = pontosTimeB + 1;
        displayForTeamB(pontosTimeB);
    }
    public void reset(View view) {
        pontosTimeA=pontosTimeB=0;
        displayForTeamA(pontosTimeA);
        displayForTeamB(pontosTimeB);
    }
}
