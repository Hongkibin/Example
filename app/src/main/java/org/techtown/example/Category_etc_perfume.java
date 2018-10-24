package org.techtown.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.androidquery.AQuery;

public class Category_etc_perfume extends AppCompatActivity {
    AQuery aq78;
    AQuery aq79;
    AQuery aq80;
    AQuery aq81;
    AQuery aq82;
    AQuery aq83;
    AQuery aq84;
    AQuery aq85;
    AQuery aq86;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_etc_perpume);

        Button button92 = (Button) findViewById(R.id.button92);
        button92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent26 = new Intent(getApplicationContext(), Category_etc_nail.class);
                startActivityForResult(intent26, 101);
            }
        });

        Button button93 = (Button) findViewById(R.id.button93);
        button93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent27 = new Intent(getApplicationContext(), Category_etc_perfume.class);
                startActivityForResult(intent27, 101);
            }
        });


        aq78 = new AQuery(this);
        aq78.id(R.id.imageView97).image("https://seoul-p-studio.bunjang.net/product/65993482_1_1521352722_w640.jpg");

        aq79 = new AQuery(this);
        aq79.id(R.id.imageView98).image("https://cdn-cosme.net/media/product/10066/163743_xl.jpg");

        aq80 = new AQuery(this);
        aq80.id(R.id.imageView99).image("http://img.danawa.com/prod_img/500000/449/150/img/4150449_1.jpg?shrink=500:500&_v=20180412175204");

        aq81 = new AQuery(this);
        aq81.id(R.id.imageView100).image("http://d9vmi5fxk1gsw.cloudfront.net/home/glowmee/upload/20151216/1450237826126.jpg");

        aq82 = new AQuery(this);
        aq82.id(R.id.imageView101).image("http://img.danawa.com/prod_img/500000/318/715/img/715318_1.jpg?shrink=500:500&_v=20180416103619");

        aq83 = new AQuery(this);
        aq83.id(R.id.imageView102).image("https://usercontents-c.styleshare.kr/images/i592f7eefa2c57/700x700");

        aq84 = new AQuery(this);
        aq84.id(R.id.imageView103).image("https://img1.memebox.com/z2agi3oa/contents/img/memeboxProductItem/20170926060621_5cdacfa1cefa89dd27c4210946786736.jpg");

        aq85 = new AQuery(this);
        aq85.id(R.id.imageView104).image("https://etherland.co.kr/wp-content/uploads/2018/01/jo-malone-perfume-6");

        aq86 = new AQuery(this);
        aq86.id(R.id.imageView105).image("http://gdimg.gmarket.co.kr/616357622/still/600?ver=0");
    }
}
