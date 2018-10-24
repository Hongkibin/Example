package org.techtown.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.androidquery.AQuery;

public class Category_foundation extends AppCompatActivity{
    AQuery aq51;
    AQuery aq52;
    AQuery aq53;
    AQuery aq54;
    AQuery aq55;
    AQuery aq56;
    AQuery aq57;
    AQuery aq58;
    AQuery aq59;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_foundation);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent23 = new Intent(getApplicationContext(), Category_foundation.class);
                startActivityForResult(intent23, 101);
            }
        });
        Button button45 = (Button) findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent24 = new Intent(getApplicationContext(), Category_foundation_cushion.class);
                startActivityForResult(intent24, 101);
            }
        });


        aq51 = new AQuery(this);
        aq51.id(R.id.imageView61).image("http://image.oliveyoung.co.kr/uploads/images/goods/550/10/0000/0001/A00000001515703ko.jpg?l=ko");
        aq52 = new AQuery(this);
        aq52.id(R.id.imageView62).image("http://img.wemep.co.kr/deal/2/038/3880382/9ad9d655e13155e602ced7eca937681dfdb9522c.jpg");
        aq53 = new AQuery(this);
        aq53.id(R.id.imageView63).image("http://d9vmi5fxk1gsw.cloudfront.net/home/glowmee/upload/20180424/1524558225791.png");

        aq54 = new AQuery(this);
        aq54.id(R.id.imageView64).image("http://image.auction.co.kr/itemimage/13/a7/65/13a76505d6.jpg");

        aq55 = new AQuery(this);
        aq55.id(R.id.imageView65).image("http://image.auction.co.kr/itemimage/d0/97/a6/d097a6556.jpg");

        aq56 = new AQuery(this);
        aq56.id(R.id.imageView66).image("https://www.koreadepart.com/data/item/1423551610_l1");

        aq57 = new AQuery(this);
        aq57.id(R.id.imageView67).image("http://cdn.aritaum.com/UPLOAD/UPLOAD_IMAGE/C020/201806/IMG1529hIj459929315_356.jpg");

        aq58 = new AQuery(this);
        aq58.id(R.id.imageView68).image("https://img1.memebox.com/dl8z711m/contents/img/memeboxProduct/20180514053123_5aceb52ab658d60178df26aa90cd9f1e.jpg");

        aq59 = new AQuery(this);
        aq59.id(R.id.imageView69).image("http://www.toocoolforschool.com/shop/data/goods/153596731159s0.jpg");
    }
}