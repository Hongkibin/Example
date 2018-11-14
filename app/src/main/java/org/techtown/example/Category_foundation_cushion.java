package org.techtown.example;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

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

        final ImageView imageView70 =  (ImageView) findViewById(R.id.imageView70);
        imageView70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%9D%BC%EB%84%A4%EC%A6%88+%EB%B9%84%EB%B9%84+%EC%BF%A0%EC%85%98&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView71 =  (ImageView) findViewById(R.id.imageView71);
        imageView71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%82%98%EC%8A%A4+%EC%95%84%EC%BF%A0%EC%95%84+%EA%B8%80%EB%A1%9C%EC%9A%B0+%EC%BF%A0%EC%85%98&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView72 =  (ImageView) findViewById(R.id.imageView72);
        imageView72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%8D%94%ED%8E%98%EC%9D%B4%EC%8A%A4%EB%94%94%EC%A6%88%EB%8B%88%EC%BF%A0%EC%85%98&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView73 =  (ImageView) findViewById(R.id.imageView73);
        imageView73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%A3%A8%EB%82%98+%EC%97%90%EC%84%BC%EC%8A%A4+%EC%88%98%EB%B6%84%EA%B4%91+%ED%8C%A9%ED%8A%B8+FX&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView74 =  (ImageView) findViewById(R.id.imageView74);
        imageView74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%A7%88%EB%AA%BD%EB%93%9C+%EB%B8%8C%EB%9D%BC%EC%9D%B4%ED%8A%B8%EB%8B%9D+%EC%BB%A4%EB%B2%84%ED%8C%8C%EC%9A%B0%EB%8D%94%EC%BF%A0%EC%85%98+&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView75 =  (ImageView) findViewById(R.id.imageView75);
        imageView75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%AF%B8%EC%83%A4+%EB%A7%A4%EC%A7%81%EC%BF%A0%EC%85%98&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView76 =  (ImageView) findViewById(R.id.imageView76);
        imageView76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%A0%95%EC%83%98%EB%AC%BC+%EC%97%90%EC%84%BC%EC%85%9C+%EC%8A%A4%ED%82%A8+%EB%88%84%EB%8D%94+%EC%BF%A0%EC%85%98&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView77 =  (ImageView) findViewById(R.id.imageView77);
        imageView77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%81%B4%EB%A6%AC%EC%98%A4+%ED%82%AC%EC%BB%A4%EB%B2%84+%ED%8C%8C%EC%9A%B4%EC%9B%A8%EC%96%B4+%EC%BF%A0%EC%85%98+XP&cat_id=&frm=NVSHAKW"));
                startActivity(intent);

            }
        });

        final ImageView imageView78 =  (ImageView) findViewById(R.id.imageView78);
        imageView78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%97%A4%EB%9D%BC+%EB%B8%94%EB%9E%99+%EC%BF%A0%EC%85%98&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
    }
}