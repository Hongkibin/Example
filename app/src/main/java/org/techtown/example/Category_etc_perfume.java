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

        ImageButton imageButton2 =(ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Intent intent15 = new Intent(getApplicationContext(),Category.class);
                startActivity(intent15);
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
//97-105
        final ImageView imageView97 =  (ImageView) findViewById(R.id.imageView97);
        imageView97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EA%B2%90%EC%A1%B0+%ED%94%8C%EB%9D%BC%EC%9B%8C+%EB%B0%94%EC%9D%B4+%EA%B2%90%EC%A1%B0+%EC%98%A4%EB%93%9C+%EB%9A%9C%EC%99%88%EB%A0%9B&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
        final ImageView imageView98 =  (ImageView) findViewById(R.id.imageView98);
        imageView98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%81%8C%EB%A1%9C%EC%97%90+%EB%A1%9C%EC%A6%88+%EB%93%9C+%EB%81%8C%EB%A1%9C%EC%97%90+%EC%98%A4%EB%93%9C+%EB%9A%9C%EC%99%88%EB%A0%9B&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
        final ImageView imageView99 =  (ImageView) findViewById(R.id.imageView99);
        imageView99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%8D%94%EB%B0%94%EB%94%94%EC%83%B5+%ED%99%94%EC%9D%B4%ED%8A%B8+%EB%A8%B8%EC%8A%A4%ED%81%AC+%EC%98%A4%EB%93%9C+%ED%8D%BC%ED%93%B8&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
        final ImageView imageView100 =  (ImageView) findViewById(R.id.imageView100);
        imageView100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("디올 미스 디올 블루밍 부케 오드 뚜왈렛"));
                startActivity(intent);

            }
        });
        final ImageView imageView101 =  (ImageView) findViewById(R.id.imageView101);
        imageView101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%9E%91%EB%B0%A9+%EC%97%90%EB%81%8C%EB%9D%BC+%EB%93%9C+%EC%95%84%EB%A5%B4%ED%8E%98%EC%A5%AC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
        final ImageView imageView102 =  (ImageView) findViewById(R.id.imageView102);
        imageView102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%AA%A8%EC%8A%A4%ED%82%A4%EB%85%B8+%ED%94%84%EB%A0%88%EC%89%AC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
        final ImageView imageView103 =  (ImageView) findViewById(R.id.imageView103);
        imageView103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%83%A4%EB%84%AC+%EC%83%B9%EC%8A%A4+%EC%98%A4+%EB%95%85%EB%93%9C%EB%A5%B4+%EC%98%A4%EB%93%9C+%EB%9A%9C%EC%99%88%EB%A0%9B&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView104 =  (ImageView) findViewById(R.id.imageView104);
        imageView104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%A1%B0%EB%A7%90%EB%A1%A0+%ED%96%A5%EC%88%98&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView105 =  (ImageView) findViewById(R.id.imageView105);
        imageView105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%95%84%EB%A1%9C%EC%86%8C%ED%94%BC+%EC%96%B4%EB%A9%94%EC%9D%B4%EC%A7%95+%EA%B7%B8%EB%A0%88%EC%9D%B4%EC%8A%A4&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
    }
}
