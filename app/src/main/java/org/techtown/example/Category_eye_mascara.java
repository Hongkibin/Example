package org.techtown.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.androidquery.AQuery;

public class Category_eye_mascara extends AppCompatActivity {

    AQuery aq45;
    AQuery aq46;
    AQuery aq47;
    AQuery aq48;
    AQuery aq49;
    AQuery aq50;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_mascara);

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

        aq45 = new AQuery(this);
        aq45.id(R.id.imageView54).image("https://image.powderroom.co.kr/o/be338b0d91e60b87/8b/c2/81/7a29e0cd1ebcc9e192fb72d01a7c36ed89.jpg");

        aq46 = new AQuery(this);
        aq46.id(R.id.imageView55).image("https://t1.daumcdn.net/cfile/tistory/251E894755496E0F03");

        aq47 = new AQuery(this);
        aq47.id(R.id.imageView56).image("http://img.lifestyler.co.kr/uploads/channel/program/product/2013/08/f130207628017287500(0).jpg");

        aq48 = new AQuery(this);
        aq48.id(R.id.imageView57).image("http://image.etude.co.kr//upload/prdimg/600_101002079_IM_01.png?RS=500x500&PBG=fff");

        aq49 = new AQuery(this);
        aq49.id(R.id.imageView58).image("http://img.danawa.com/prod_img/500000/049/073/img/3073049_1.jpg?shrink=500:500&_v=20180418140905");

        aq50 = new AQuery(this);
        aq50.id(R.id.imageView59).image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbLBkalYyxsc_aJ60O0HDKfwfLWxLuxKtsBYb66d9TlxucAQxE");

}
}
