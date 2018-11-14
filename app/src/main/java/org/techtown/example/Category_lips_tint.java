package org.techtown.example;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
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
    //20-28


        final ImageView imageView20 =  (ImageView) findViewById(R.id.imageView20);
        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%97%90%EB%9B%B0%EB%93%9C+%EB%94%94%EC%96%B4+%EB%8B%AC%EB%A7%81+%EC%9B%8C%ED%84%B0+%EC%A0%A4+%ED%8B%B4%ED%8A%B8%5C&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView21 =  (ImageView) findViewById(R.id.imageView21);
        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%97%90%EB%9B%B0%EB%93%9C+%EB%A7%A4%ED%8A%B8+%EC%8B%9C%ED%81%AC+%EB%A6%BD%EB%9D%BC%EC%BB%A4&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView22 =  (ImageView) findViewById(R.id.imageView22);
        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%9E%85%EC%83%9D%EB%A1%9C%EB%9E%91+%EB%B2%A0%EB%A5%B4%EB%8B%88+%EC%95%84+%EB%A0%88%EB%B8%8C%EB%A5%B4&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView23 =  (ImageView) findViewById(R.id.imageView23);
        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%A1%B0%EB%A5%B4%EC%A7%80%EC%98%A4%EC%95%84%EB%A5%B4%EB%A7%88%EB%8B%88+%EB%A6%BD+%EB%A7%88%EC%97%90%EC%8A%A4%ED%8A%B8%EB%A1%9C&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView24 =  (ImageView) findViewById(R.id.imageView24);
        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%86%A0%EB%8B%88%EB%AA%A8%EB%A6%AC+%ED%8D%BC%ED%8E%99%ED%8A%B8+%EB%A6%BD%EC%8A%A4+%EC%87%BC%ED%82%B9+%EB%A6%BD&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView25 =  (ImageView) findViewById(R.id.imageView25);
        imageView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%88%AC%EC%BF%A8%ED%8F%AC%EC%8A%A4%EC%BF%A8+%EA%B8%80%EB%A1%9C%EC%8B%9C%ED%8B%B4%ED%8A%B8&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
        final ImageView imageView26 =  (ImageView) findViewById(R.id.imageView26);
        imageView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%82%90%EC%95%84+%EB%9D%BC%EC%8A%A4%ED%8A%B8+%EB%B2%A8%EB%B2%B3+%EB%A6%BD+%ED%8B%B4%ED%8A%B8&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView27 =  (ImageView) findViewById(R.id.imageView27);
        imageView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%8E%98%EB%A6%AC%ED%8E%98%EB%9D%BC+%EC%9E%89%ED%81%AC%EB%8D%94%EC%97%90%EC%96%B4%EB%A6%AC%EB%B2%A8%EB%B2%B3&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView28 =  (ImageView) findViewById(R.id.imageView28);
        imageView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%8E%98%EB%A6%AC%ED%8E%98%EB%9D%BC+%EC%8A%88%EA%B0%80+%EA%B8%80%EB%A1%9C%EC%9A%B0+%ED%8B%B4%ED%8A%B8&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
    }
}
