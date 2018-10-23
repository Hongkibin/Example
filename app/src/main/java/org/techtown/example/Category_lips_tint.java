package org.techtown.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import com.androidquery.AQuery;



public class Category_lips_tint extends AppCompatActivity {

    AQuery aq;
    AQuery aq1;
    AQuery aq2;
    AQuery aq3;
    AQuery aq4;
    AQuery aq5;
    AQuery aq6;
    AQuery aq7;
    AQuery aq8;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_lips);

        Button button30 = (Button) findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getApplicationContext(), Category_lips_tint.class);
                startActivityForResult(intent, 101);
            }
        });
        Button button31 = (Button) findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getApplicationContext(), Category_lips_lipstick.class);
                startActivityForResult(intent, 101);
            }
        });
        Button button32 = (Button) findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getApplicationContext(), Category_lips_lipbam.class);
                startActivityForResult(intent, 101);
            }
        });

        aq = new AQuery(this);
        aq.id(R.id.imageView20).image("https://shopping-phinf.pstatic.net/main_1089941/10899413799.20170928112851.jpg?type=f300");

        aq1=new AQuery(this);
        aq1.id(R.id.imageView21).image("http://www.wsobi.com/news/photo/201809/64720_46994_2352.jpg");

        aq2 = new AQuery(this);
        aq2.id(R.id.imageView22).image("https://shopping-phinf.pstatic.net/main_6860635/6860635839.20180202102240.jpg?type=f300");

        aq3=new AQuery(this);
        aq3.id(R.id.imageView23).image("https://img2.memebox.com/static/contents/img/upload/image_20151102142445_x85Vd2TN4a.jpg");

        aq4 = new AQuery(this);
        aq4.id(R.id.imageView24).image("https://img2.memebox.com/static/contents/img/upload/image_20160331180607_w4UV7umRBl.jpg");

        aq5=new AQuery(this);
        aq5.id(R.id.imageView25).image("http://image.oliveyoung.co.kr/uploads/images/goods/10/0000/0011/A00000011074408ko.jpg?l=ko");

        aq6 = new AQuery(this);
        aq6.id(R.id.imageView26).image("https://shopping-phinf.pstatic.net/main_1236048/12360486510.20170928143008.jpg");

        aq7=new AQuery(this);
        aq7.id(R.id.imageView27).image("http://image.oliveyoung.co.kr/uploads/images/goods/10/0000/0001/A00000001679501ko.jpg?l=ko");

        aq8 = new AQuery(this);
        aq8.id(R.id.imageView28).image("http://image.oliveyoung.co.kr/uploads/images/goods/10/0000/0011/A00000011230301ko.jpg?l=ko");
        }
}
