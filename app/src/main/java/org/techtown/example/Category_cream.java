package org.techtown.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.androidquery.AQuery;

public class Category_cream extends AppCompatActivity {
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
        setContentView(R.layout.activity_category_cream);

        Button button82 = (Button) findViewById(R.id.button82);
        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent25 = new Intent(getApplicationContext(), Category_cream.class);
                startActivityForResult(intent25, 101);
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
        aq60.id(R.id.imageView79).image("https://usercontents-c.styleshare.kr/images/i5b95fbccbb386/700x700");

        aq61 = new AQuery(this);
        aq61.id(R.id.imageView80).image("https://jdcdutyfree.com/files/product/a4b606d0-d341-4f90-88ba-b60401430756.jpg");

        aq62 = new AQuery(this);
        aq62.id(R.id.imageView81).image("http://mblogthumb1.phinf.naver.net/20160602_256/hong-zzi_1464800042217aBgGW_JPEG/IMG_0213%A4%BB.jpg?type=w2");

        aq63 = new AQuery(this);
        aq63.id(R.id.imageView82).image("http://img.danawa.com/prod_img/500000/935/164/img/3164935_1.jpg?shrink=500:500&_v=20180611094056");

        aq64 = new AQuery(this);
        aq64.id(R.id.imageView83).image("http://gdimg.gmarket.co.kr/910294139/still/280?ver=1524114008");

        aq65 = new AQuery(this);
        aq65.id(R.id.imageView84).image("http://cdn-cosme.net/media/product/2926/skuimg_633293_xl.jpg");

        aq66 = new AQuery(this);
        aq66.id(R.id.imageView85).image("https://t1.daumcdn.net/thumb/R1280x0/?fname=http://t1.daumcdn.net/brunch/service/user/5hk/image/7AQkNFSogX_4feipGw1S5YZDob0.jpg");

        aq67 = new AQuery(this);
        aq67.id(R.id.imageView86).image("http://img.danawa.com/prod_img/500000/085/913/img/4913085_1.jpg?shrink=500:500&_v=20180530092219");

        aq68 = new AQuery(this);
        aq68.id(R.id.imageView87).image("https://usercontents-c.styleshare.kr/images/i5798191de5c0f/700x700");
    }
}
