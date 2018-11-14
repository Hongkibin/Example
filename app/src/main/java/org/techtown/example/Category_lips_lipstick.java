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



public class Category_lips_lipstick extends AppCompatActivity {

    AQuery aq9;
    AQuery aq10;
    AQuery aq11;
    AQuery aq12;
    AQuery aq13;
    AQuery aq14;
    AQuery aq15;
    AQuery aq16;
    AQuery aq17;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_lips_lipstick);



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

        aq9 = new AQuery(this);
        aq9.id(R.id.imageView29).image("http://image.lotte.com/goods/81/51/55/31/2/231555181_1_550.jpg");

        aq10=new AQuery(this);
        aq10.id(R.id.imageView30).image("http://image.lotte.com/goods/00/90/73/66/4/466739000_1_550.jpg");

        aq11 = new AQuery(this);
        aq11.id(R.id.imageView31).image("http://images.amorepacificmall.com/UPLOAD/UPLOAD_IMAGE/C026/201712/IMG1514VzM359535363.jpg");

        aq12=new AQuery(this);
        aq12.id(R.id.imageView32).image("http://image.oliveyoung.co.kr/uploads/images/goods/10/0000/0010/A00000010506601ko.jpg?l=ko");

        aq13 = new AQuery(this);
        aq13.id(R.id.imageView33).image("http://image.lotte.com/goods/99/22/51/35/35512299_3_550.jpg");

        aq14=new AQuery(this);
        aq14.id(R.id.imageView34).image("http://www.shuuemura.co.kr/ProductImg/Untitled-2(1).jpg");

        aq15 = new AQuery(this);
        aq15.id(R.id.imageView35).image("http://image.lotte.com/goods/97/62/69/60/3/360696297_1_550.jpg");

        aq16=new AQuery(this);
        aq16.id(R.id.imageView36).image("http://image.oliveyoung.co.kr/uploads/images/goods/10/0000/0010/A00000010515801ko.jpg?l=ko");

        aq17 = new AQuery(this);
        aq17.id(R.id.imageView37).image("http://image.oliveyoung.co.kr/uploads/images/goods/10/0000/0011/A00000011612302ko.jpg?l=ko");
    //29-37


        final ImageView imageView29 =  (ImageView) findViewById(R.id.imageView29);
        imageView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%82%98%EC%8A%A4+%EB%B2%A8%EB%B2%B3+%EB%A7%A4%ED%8A%B8+%EB%A6%BD+%ED%8E%9C%EC%8A%AC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView30=  (ImageView) findViewById(R.id.imageView30);
        imageView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%94%94%EC%98%AC+%EC%96%B4%EB%94%95%ED%8A%B8+%EB%A6%BD+%EA%B8%80%EB%A1%9C%EC%9A%B0&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView31 =  (ImageView) findViewById(R.id.imageView31);
        imageView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%9D%BC%EB%84%A4%EC%A6%88+%ED%88%AC%ED%86%A4+%ED%8B%B4%ED%8A%B8+%EB%A6%BD+%EB%B0%94&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView32 =  (ImageView) findViewById(R.id.imageView32);
        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%A7%88%EB%AA%BD%EB%93%9C+%ED%81%AC%EB%A6%AC%EB%AF%B8%ED%8B%B4%ED%8A%B8+%EC%BB%AC%EB%9F%AC%EB%B0%A4+%EC%9D%B8%ED%85%90%EC%8A%A4&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView33 =  (ImageView) findViewById(R.id.imageView33);
        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%A7%A5+%EB%A6%BD%EC%8A%A4%ED%8B%B1&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView34 =  (ImageView) findViewById(R.id.imageView34);
        imageView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%8A%88%EC%97%90%EB%AC%B4%EB%9D%BC+%EB%A3%A8%EC%A6%88+%EC%96%B8%EB%A6%AC%EB%AF%B8%ED%8B%B0%EB%93%9C+%EC%8A%88%ED%94%84%EB%A6%BC%EB%A7%88%EB%9C%A8&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });


        final ImageView imageView35 =  (ImageView) findViewById(R.id.imageView35);
        imageView35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%9E%85%EC%83%9D%EB%A1%9C%EB%9E%91+%EB%A3%A8%EC%A5%AC+%EB%B3%BC%EB%A5%8D%EB%96%BC+%EC%83%A4%EC%9D%B8&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView36 =  (ImageView) findViewById(R.id.imageView36);
        imageView36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%81%B4%EB%A6%AC%EC%98%A4+%EB%A3%A8%EC%A6%88+%ED%9E%90&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView37 =  (ImageView) findViewById(R.id.imageView37);
        imageView37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%81%B4%EB%A6%AC%EC%98%A4+%EB%A7%A4%EB%93%9C+%EB%A7%A4%ED%8A%B8+%EB%A6%BD&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

    }
}
