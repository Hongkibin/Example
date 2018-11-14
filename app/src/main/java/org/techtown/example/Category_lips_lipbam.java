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
        setContentView(R.layout.activity_category_lipbam);

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

        ImageButton imageButton2 =(ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Intent intent15 = new Intent(getApplicationContext(),Category.class);
                startActivity(intent15);
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
        aq22.id(R.id.imageView42).image("http://info.pipa.co.kr/files/attach/images/160/885/116/1bb7fe9dc01bfddcb177f15aa9a7e6a7.jpg");

        aq23 = new AQuery(this);
        aq23.id(R.id.imageView43).image("http://image.lotte.com/goods/22/60/69/60/3/360696022_1_280.jpg");

        aq24=new AQuery(this);
        aq24.id(R.id.imageView44).image("https://shopping-phinf.pstatic.net/main_4143495/4143495608.20170801093445.jpg?type=f300");


        //38-44

        final ImageView imageView38 =  (ImageView) findViewById(R.id.imageView38);
        imageView38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%8B%88%EB%B2%A0%EC%95%84+%EB%AA%A8%EC%9D%B4%EC%8A%A4%EC%B2%98+%EC%BC%80%EC%96%B4&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView39 =  (ImageView) findViewById(R.id.imageView39);
        imageView39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%8B%88%EB%B2%A0%EC%95%84+%EC%97%90%EC%84%BC%EC%85%9C+&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView40 =  (ImageView) findViewById(R.id.imageView40);
        imageView40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%B0%94%EC%84%B8%EB%A6%B0+%EB%A6%BD%EB%B0%A4&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView41 =  (ImageView) findViewById(R.id.imageView41);
        imageView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%B0%94%EC%9D%B4%EC%98%A4%EB%8D%94%EB%A7%88+%EC%95%84%ED%86%A0%EB%8D%A4+%EB%A6%BD%EB%B0%A4&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView42 =  (ImageView) findViewById(R.id.imageView42);
        imageView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%9C%A0%EB%A6%AC%EC%95%84%EC%A5%AC+%EB%A6%BD%EB%B0%A4&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView43 =  (ImageView) findViewById(R.id.imageView43);
        imageView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%82%A4%EC%97%98+%EB%A6%BD%EB%B0%A4&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView44 =  (ImageView) findViewById(R.id.imageView44);
        imageView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%9E%88%EB%A7%90%EB%9D%BC%EC%95%BC+%EB%A6%BD%EB%B0%A4&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
    }
}
