package com.example.miwokapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private  int mColor;
    private String teste = "teste";
    private MediaPlayer mediaPlayer;

    public WordAdapter(Activity context, ArrayList<Word> array, int color){
        super(context, 0, array);
        mColor = color;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent){
        Word word = getItem(position);


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            LinearLayout linearLayout = convertView.findViewById(R.id.root_view);
            linearLayout.setBackgroundResource(mColor);
        }

//        convertView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayer = MediaPlayer.create(getContext(), getItem(position).getSoundResourceId());
//                mediaPlayer.start();
//            }
//        });

        // Lookup view for data population
        TextView defaultTextView = convertView.findViewById(R.id.default_text_view);

        TextView miwokTextView = convertView.findViewById(R.id.miwok_text_view);


        ImageView imgView = convertView.findViewById(R.id.img_list);
        imgView.setVisibility(View.GONE);
        if ( word.hasImage() ) {
            imgView.setVisibility(View.VISIBLE);
            imgView.setImageResource(word.getImageResourceId());
        }


        // Populate the data into the template view using the data object
        defaultTextView.setText(word.getDefaultTranslation());

        miwokTextView.setText(word.getMiwokTranslation());

        return convertView;


    }
}
