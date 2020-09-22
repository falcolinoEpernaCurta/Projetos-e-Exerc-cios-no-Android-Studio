/*Feito por: Pedro Vinicius */
/*Data: 07/01/2020*/
/*App que simula um gerenciador de uma partida de ping pong*/

package com.example.gerenciadordepontos;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int pontosJogadorA = 0;
    int pontosJogadorB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void JogadoraAcertou(View v) {
        pontosJogadorA = pontosJogadorA + 1;
        displayJogadorA(pontosJogadorA);
    }

    public void JogadoraErrou(View v) {
        JogadorbAcertou(v);
    }

    public void displayJogadorA(int ponto) {
        TextView placarJogadorA = findViewById(R.id.placarJogadorA);
        placarJogadorA.setText(ponto + " ");
    }

    public void JogadorbAcertou(View v) {
        pontosJogadorB = pontosJogadorB + 1;
        displayJogadorB(pontosJogadorB);
    }


    public void JogadorbErrou(View v) {
        JogadoraAcertou(v);
    }

    public void displayJogadorB(int ponto) {
        TextView placarJogadorB = findViewById(R.id.placarJogadorB);
        placarJogadorB.setText(ponto + " ");
    }

    public void Reset(View v) {
        pontosJogadorA = pontosJogadorB = 0;
        displayJogadorA(pontosJogadorA);
        displayJogadorB(pontosJogadorB);
    }

}
