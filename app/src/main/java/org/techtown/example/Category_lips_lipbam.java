package org.techtown.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.androidquery.AQuery;


public class Category_lips_lipbam extends AppCompatActivity {

    AQuery aq18;
    AQuery aq19;
    AQuery aq20;
    AQuery aq21;
    AQuery aq22;
    AQuery aq23;
    AQuery aq24;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_lips);

        Button button30 = (Button) findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent17 =  new Intent(getApplicationContext(), Category_lips_tint.class);
                startActivityForResult(intent17, 101);
            }
        });
        Button button31 = (Button) findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent18 =  new Intent(getApplicationContext(), Category_lips_lipstick.class);
                startActivityForResult(intent18, 101);
            }
        });
        Button button32 = (Button) findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent19 =  new Intent(getApplicationContext(), Category_lips_lipbam.class);
                startActivityForResult(intent19, 101);
            }
        });

        aq18 = new AQuery(this);
        aq18.id(R.id.imageView38).image("https://view01.wemep.co.kr/wmp-product/9/593/104205939/pm_7bqw8iqatt2h.jpg?1533640728");

        aq19=new AQuery(this);
        aq19.id(R.id.imageView39).image("https://view01.wemep.co.kr/wmp-product/5/786/120757865/pm_rcrn8dciek1s.jpg?1539168278");

        aq20 = new AQuery(this);
        aq20.id(R.id.imageView40).image("http://mblogthumb4.phinf.naver.net/20131108_139/byherbcokr_1383893930943li9IB_JPEG/%B9%D9%BC%BC%B8%B02.jpg?type=w2");

        aq21=new AQuery(this);
        aq21.id(R.id.imageView41).image("http://img.wemep.co.kr/deal/1/054/3920541/13db3c5e4583ba02a2cb1942105c194ee97e5ecd.jpg");

        aq22 = new AQuery(this);
        aq22.id(R.id.imageView42).image("https://shopping-phinf.pstatic.net/main_4148732/4148732724.2017112810143");


        aq23 = new AQuery(this);
        aq23.id(R.id.imageView43).image("http://image.lotte.com/goods/22/60/69/60/3/360696022_1_280.jpg");

        aq24=new AQuery(this);
        aq24.id(R.id.imageView44).image("https://shopping-phinf.pstatic.net/main_4143495/4143495608.20170801093445.jpg?type=f300");


        }
}
