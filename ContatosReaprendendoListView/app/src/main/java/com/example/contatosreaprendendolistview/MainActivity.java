package com.example.contatosreaprendendolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listViewPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewPrincipal = findViewById(R.id.listViewPrincipal);


        String[] filmes = { "LOR", "Interestelar",
                "Perdido em Marte", "Lady Bird", "BirdMan",
                "1945", "HP", "O dia que meus pais sairam de férias",
                "Coco - a vida é uma festa", "Mulan", "Spirit - o corcel indomável",
                "Monstros S/A"};


        ArrayAdapter<String> meuAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, filmes );
        listViewPrincipal.setAdapter(meuAdapter);


    }
}
