package org.techtown.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

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

        }
        }