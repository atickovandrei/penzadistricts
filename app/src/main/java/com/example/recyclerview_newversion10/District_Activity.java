package com.example.recyclerview_newversion10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class District_Activity extends AppCompatActivity {

    private TextView tvtitle,tvdescription;
    private ImageView img, atimg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district_);

        tvtitle = (TextView) findViewById(R.id.txttitle);
        tvdescription = (TextView) findViewById(R.id.txtAbout);
        img = (ImageView) findViewById(R.id.thumbnail);
        atimg = (ImageView) findViewById(R.id.atimage_id);


        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int Thumbnail = intent.getExtras().getInt("Thumbnail") ;
        int Imageabout = intent.getExtras().getInt("Imageabout") ;


        tvtitle.setText(Title);
        tvdescription.setText(Description);
        img.setImageResource(Thumbnail);
        atimg.setImageResource(Imageabout);

    }


}
