package org.techtown.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.androidquery.AQuery;


public class Category_foundation_cushion extends AppCompatActivity {
    AQuery aq60;
    AQuery aq61;
    AQuery aq62;
    AQuery aq63;
    AQuery aq64;
    AQuery aq65;
    AQuery aq66;
    AQuery aq67;
    AQuery aq68;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_foundation_cushion);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent23 = new Intent(getApplicationContext(), Category_foundation_cushion.class);
                startActivityForResult(intent23, 101);
            }
        });
        Button button45 = (Button) findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent24 = new Intent(getApplicationContext(), Category_foundation.class);
                startActivityForResult(intent24, 101);
            }
        });

        ImageButton imageButton2 =(ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Intent intent15 = new Intent(getApplicationContext(),Category.class);
                startActivity(intent15);
            }
        });

        aq60 = new AQuery(this);
        aq60.id(R.id.imageView70).image("https://img1.memebox.com/slls9qfv/contents/img/memeboxProduct/20180516055601_b267cabf061f6649e67007b380c80325.jpg");

        aq61 = new AQuery(this);
        aq61.id(R.id.imageView71).image("http://d9vmi5fxk1gsw.cloudfront.net/home/glowmee/upload/20170801/1501557152490.png");

        aq62 = new AQuery(this);
        aq62.id(R.id.imageView72).image("http://photo3.enuri.com/data/images/service/middle/15433000/15433185.jpg");

        aq63 = new AQuery(this);
        aq63.id(R.id.imageView73).image("http://img.danawa.com/prod_img/500000/862/006/img/5006862_1.jpg?shrink=500:500&_v=20180511123051");

        aq64 = new AQuery(this);
        aq64.id(R.id.imageView74).image("http://gdimg.gmarket.co.kr/978760521/still/600?ver=0");

        aq65 = new AQuery(this);
        aq65.id(R.id.imageView75).image("http://img.danawa.com/prod_img/500000/163/672/img/3672163_1.jpg?shrink=500:500&_v=20180510180905");

        aq66 = new AQuery(this);
        aq66.id(R.id.imageView76).image("http://img.danawa.com/prod_img/500000/767/720/img/3720767_1.jpg?shrink=500:500&_v=20180129101650");

        aq67 = new AQuery(this);
        aq67.id(R.id.imageView77).image("https://img1.memebox.com/5cb2ckel/contents/img/memeboxProductItem/20170531100751_3007f6a4fe7f76e5061dfd676e388552.jpg");

        aq68 = new AQuery(this);
        aq68.id(R.id.imageView78).image("https://img1.memebox.com/5cb2ckel/contents/img/memeboxProductItem/20170531100751_3007f6a4fe7f76e5061dfd676e388552.jpg");


    }
}