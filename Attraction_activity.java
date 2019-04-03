package com.example.recyclerview_newversion10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Attraction_activity extends AppCompatActivity {
    private TextView attitle, atdiscription;
    private ImageView attractionimg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_);

        attitle = (TextView) findViewById(R.id.txttitle);
        atdiscription = (TextView) findViewById(R.id.txtAbout);
        //tvcategory = (TextView) findViewById(R.id.txtCat);
        //img = (ImageView) findViewById(R.id.thumbnail);
        attractionimg = (ImageView) findViewById(R.id.atimage_id);


        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int Thumbnail = intent.getExtras().getInt("Thumbnail") ;
        int Imageabout = intent.getExtras().getInt("Imageabout") ;


        attitle.setText(Title);
        atdiscription.setText(Description);
        attractionimg.setImageResource(Thumbnail);
        //atimg.setImageResource(Imageabout);

    }
}
