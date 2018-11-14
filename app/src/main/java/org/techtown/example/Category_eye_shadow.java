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

public class Category_eye_shadow extends AppCompatActivity{
    AQuery aq32;
    AQuery aq33;
    AQuery aq34;
    AQuery aq35;
    AQuery aq36;
    AQuery aq37;
    AQuery aq38;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_shadow);

        Button button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent20 = new Intent(getApplicationContext(), Category_eye_brow.class);
                startActivityForResult(intent20, 101);
            }
        });
        Button button22 = (Button) findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent21 = new Intent(getApplicationContext(), Category_eye_shadow.class);
                startActivityForResult(intent21, 101);
            }
        });
        Button button23 = (Button) findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent22 = new Intent(getApplicationContext(), Category_eye_line.class);
                startActivityForResult(intent22, 101);
            }
        });
        Button button24 = (Button) findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent22 = new Intent(getApplicationContext(), Category_eye_mascara.class);
                startActivityForResult(intent22, 101);
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


        aq32 = new AQuery(this);
        aq32.id(R.id.imageView18).image("https://img1.memebox.com/23g3nfu9/contents/img/memeboxProductItem/20170823061446_bf2207fefab15ea2f626398cd1c7d758.jpg");

        aq33 = new AQuery(this);
        aq33.id(R.id.imageView19).image("https://img1.memebox.com/mcbo67h2/contents/img/memeboxProductItem/20170519101615_deea239a0f774af50fe21dbd7c99b80a.jpg");

        aq34 = new AQuery(this);
        aq34.id(R.id.imageView45).image("https://img1.memebox.com/84ski03h/contents/img/memeboxProductItem/20170524055934_813e3433b76cfab2b217222da5c2a772.jpg");

        aq35 = new AQuery(this);
        aq35.id(R.id.imageView46).image("http://cdn.aritaum.com/UPLOAD/UPLOAD_IMAGE/C020/201705/IMG1493jPq701784124.jpg");

        aq36 = new AQuery(this);
        aq36.id(R.id.imageView47).image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkL0M1BICaq8YONZs2rd9bQ9HVLXb-A8yFuxB6pdXcSFQv7-M");

        aq37 = new AQuery(this);
        aq37.id(R.id.imageView48).image("https://img2.memebox.com/static/contents/img/upload/image_20150714164206_UDHH9z7T3r.jpg");

        aq38 = new AQuery(this);
        aq38.id(R.id.imageView49).image("https://img1.memebox.com/1febc85i/contents/img/memeboxProductItem/20171027122235_ff7a033af4bc84a3ff9f0de5be3d782f.jpg");

        final ImageView imageView18=  (ImageView) findViewById(R.id.imageView18);
        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%82%98%EC%8A%A4+%EC%8B%B1%EA%B8%80+%EC%95%84%EC%9D%B4%EC%84%80%EB%8F%84%EC%9A%B0&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView19 =  (ImageView) findViewById(R.id.imageView19);
        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%A7%A5+%EB%8C%80%EC%A6%90+%EC%84%80%EB%8F%84%EC%9A%B0&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView45 =  (ImageView) findViewById(R.id.imageView45);
        imageView45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%AF%B8%EC%83%A4+%EB%AA%A8%EB%8D%98+%EC%84%80%EB%8F%84%EC%9A%B0&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView46 =  (ImageView) findViewById(R.id.imageView46);
        imageView46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%95%84%EB%A6%AC%EB%94%B0%EC%9B%80+%EB%AA%A8%EB%85%B8+%EC%95%84%EC%9D%B4%EC%A6%88&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView47 =  (ImageView) findViewById(R.id.imageView47);
        imageView47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%97%90%EB%9B%B0%EB%93%9C+%EB%A3%A9+%EC%95%B3+%EB%A7%88%EC%9D%B4+%EC%95%84%EC%9D%B4%EC%A6%88&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView48 =  (ImageView) findViewById(R.id.imageView48);
        imageView48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%81%B4%EB%A6%AC%EC%98%A4+%ED%94%84%EB%A1%9C%EC%8B%B1%EA%B8%80%EC%84%80%EB%8F%84%EC%9A%B0&cat_id=&frm=NVSHATC#"));
                startActivity(intent);

            }
        });

        final ImageView imageView49 =  (ImageView) findViewById(R.id.imageView49);
        imageView49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%8E%98%EB%A6%AC%ED%8E%98%EB%9D%BC+%EC%9E%89%ED%81%AC%ED%94%BC%ED%8C%85%EC%84%80%EB%8F%84%EC%9A%B0&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
        }
        }