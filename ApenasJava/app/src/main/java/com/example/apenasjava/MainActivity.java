
//arrumar intent do E-mail

package com.example.apenasjava;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


/**
 * Esse app mostra um pedido para pedir cafe
 */
public class MainActivity extends AppCompatActivity {
    int quantidade = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Esse metodo eh chamado quando o botao de pedido eh chamado
     */
    public void encomendarPedido(View view) {
        display(quantidade);

        CheckBox whippedCheckBox =  findViewById(R.id.whipped_cream_checkbox);
        CheckBox chocolateCheckBox = findViewById(R.id.chocolate_checkbox);

        boolean temChantilly = whippedCheckBox.isChecked();
        boolean temChocolate = chocolateCheckBox.isChecked();

        EditText nomeEditText = findViewById(R.id.nome_editText);
        String nome = nomeEditText.getText().toString();

        int price = calcularPreco(temChantilly, temChocolate);
//        displayMessage(resumoDoPedido(price, temChantilly, temChocolate, nome));

        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto",
                "pedroestouaqui@gmail.com",
                null));

//        emailIntent.setData(Uri.parse("mailto"));
//        emailIntent.setType("text/plain");
//        emailIntent.setType("text/html");


        //Não estão funcionando
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.assunto_email, nome));
        emailIntent.putExtra(Intent.EXTRA_TEXT, resumoDoPedido(price, temChantilly, temChocolate, nome));

        if (emailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailIntent);
        }
//        // Verify it resolves
//        PackageManager packageManager = getPackageManager();
//        List<ResolveInfo> activities = packageManager.queryIntentActivities(emailIntent, 0);
//        boolean isIntentSafe = activities.size() > 0;
//
//        // Start an activity if it's safe
//        if (isIntentSafe) {
//            startActivity(emailIntent);
//        }


    }

    private int calcularPreco(boolean temChantilly, boolean temChocolate) {
        int precoBase = 5;

        if (temChantilly)
            precoBase += 1;
        if (temChocolate)
            precoBase += 2;

        return quantidade * precoBase;
    }

    private String resumoDoPedido(int total, boolean temChantily, boolean temChocolate, String nome) {

        String msgResumo = getString(R.string.resumoDoPedido_nome, nome);
        msgResumo = msgResumo + "\n" + getString(R.string.resumoDoPedido_addChantily, temChantily);
        msgResumo = msgResumo + "\n" + getString(R.string.resumoDoPedido_addChocolate, temChocolate);
        msgResumo = msgResumo + "\n" + getString(R.string.resumoDoPedido_quantidade, quantidade);
        msgResumo = msgResumo + "\n" + getString(R.string.resumoDoPedido_total, total);
        msgResumo = msgResumo + "\n" + getString(R.string.obrigado);

        Log.v("MainActivity", msgResumo);
        return msgResumo;

    }

    /**
     * Esse metodo mostra uma certa quantidade na tela
     */
    private void display(int numero) {
        TextView quantidadeTextView = findViewById(R.id.quantidade_text_view);
        quantidadeTextView.setText("" + numero); /*REsolver isso*/
    }


    public void aumentar(View view) {
        if (quantidade >= 100) {
            quantidade = 100;
            CharSequence text = getString(R.string.msg_limite_maximo);
            Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        quantidade = quantidade + 1;
        display(quantidade);
    }

    public void diminuir(View view) {
        if (quantidade <= 1) {
            quantidade = 1;
            CharSequence text = getString(R.string.msg_limite_minimo);
            Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        quantidade = quantidade - 1;
        display(quantidade);
    }

    /**
     * This method displays the given text on the screen.
     */
//    private void displayMessage(String message) {
//        TextView resumoDoPedidoTextView =  findViewById(R.id.resumo_do_pedido_text_view);
//        resumoDoPedidoTextView.setText(message);
//    }

}
