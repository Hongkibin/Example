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

        final ImageView imageView54 =  (ImageView) findViewById(R.id.imageView54);
        imageView54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%8D%B0%EC%9E%90%EB%B7%B0+%ED%8C%8C%EC%9D%B4%EB%B2%84%EC%9C%85%EC%9A%B8%ED%8A%B8%EB%9D%BC%EB%A1%B1&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView55 =  (ImageView) findViewById(R.id.imageView55);
        imageView55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%A7%88%EC%A3%A0%EB%A6%AC%EC%B9%B4+%EB%A7%88%EC%A3%A0%EB%A5%B4%EC%B9%B4+%EB%9E%98%EC%89%AC%ED%82%B9+%ED%95%84%EB%A6%84&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView56=  (ImageView) findViewById(R.id.imageView56);
        imageView56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%A9%94%EC%9D%B4%EB%B8%94%EB%A6%B0+%ED%8F%B4%EC%8B%9C+%EB%B3%BC%EB%A5%A8+%EC%9D%B5%EC%8A%A4%ED%94%84%EB%A0%88%EC%8A%A4&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView57 =  (ImageView) findViewById(R.id.imageView57);
        imageView57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%97%90%EB%9B%B0%EB%93%9C%ED%95%98%EC%9A%B0%EC%8A%A4+%EB%9E%98%EC%89%AC%ED%8E%8C+%EC%BB%AC+%ED%94%BD%EC%8A%A4+%EB%A7%88%EC%8A%A4%EC%B9%B4%EB%9D%BC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView58 =  (ImageView) findViewById(R.id.imageView58);
        imageView58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%82%A4%EC%8A%A4%EB%AF%B8+%ED%9E%88%EB%A1%9C%EC%9D%B8+%EB%B3%BC%EB%A5%A8%EC%95%A4%EC%BB%AC+%EB%A7%88%EC%8A%A4%EC%B9%B4%EB%9D%BCEX&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView59 =  (ImageView) findViewById(R.id.imageView59);
        imageView59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%8E%98%EB%A6%AC%ED%8E%98%EB%9D%BC+%EC%9E%89%ED%81%AC+%EB%B8%94%EB%9E%99%EC%B9%B4%EB%9D%BC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

}
}
