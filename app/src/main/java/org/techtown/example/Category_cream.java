package org.techtown.example;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.androidquery.AQuery;

public class Category_cream extends AppCompatActivity {
    AQuery aq60;
    AQuery aq61;
    AQuery aq62;
    AQuery aq63;
    AQuery aq64;
    AQuery aq65;
    AQuery aq66;
    AQuery aq67;
    AQuery aq68;

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_cream);

        Button button82 = (Button) findViewById(R.id.button82);
        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent25 = new Intent(getApplicationContext(), Category_cream.class);
                startActivityForResult(intent25, 101);
            }
        });

        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent intent15 = new Intent(getApplicationContext(), Category.class);
                startActivity(intent15);
            }
        });


        aq60 = new AQuery(this);
        aq60.id(R.id.imageView79).image("https://usercontents-c.styleshare.kr/images/i5b95fbccbb386/700x700");

        aq61 = new AQuery(this);
        aq61.id(R.id.imageView80).image("https://jdcdutyfree.com/files/product/a4b606d0-d341-4f90-88ba-b60401430756.jpg");

        aq62 = new AQuery(this);
        aq62.id(R.id.imageView81).image("http://mblogthumb1.phinf.naver.net/20160602_256/hong-zzi_1464800042217aBgGW_JPEG/IMG_0213%A4%BB.jpg?type=w2");

        aq63 = new AQuery(this);
        aq63.id(R.id.imageView82).image("http://img.danawa.com/prod_img/500000/935/164/img/3164935_1.jpg?shrink=500:500&_v=20180611094056");

        aq64 = new AQuery(this);
        aq64.id(R.id.imageView83).image("http://gdimg.gmarket.co.kr/910294139/still/280?ver=1524114008");

        aq65 = new AQuery(this);
        aq65.id(R.id.imageView84).image("http://cdn-cosme.net/media/product/2926/skuimg_633293_xl.jpg");

        aq66 = new AQuery(this);
        aq66.id(R.id.imageView85).image("https://t1.daumcdn.net/thumb/R1280x0/?fname=http://t1.daumcdn.net/brunch/service/user/5hk/image/7AQkNFSogX_4feipGw1S5YZDob0.jpg");

        aq67 = new AQuery(this);
        aq67.id(R.id.imageView86).image("http://img.danawa.com/prod_img/500000/085/913/img/4913085_1.jpg?shrink=500:500&_v=20180530092219");

        aq68 = new AQuery(this);
        aq68.id(R.id.imageView87).image("https://usercontents-c.styleshare.kr/images/i5798191de5c0f/700x700");
/////////////////////////////////
        final Button button84 = (Button) findViewById(R.id.button84);
        button84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*  Mypage mypage =(Mypage) findViewById(R.id.name);*/

               /* String[] array={"라네즈","뻐큐"};


                intent.putExtra("name1","라네즈");
              */
               Intent intent = new Intent(getApplicationContext(), Mypage.class);
                LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = inflater.inflate(R.layout.activity_mypage, null);
                View view1 = inflater.inflate(R.layout.activity_category_cream, null);
                EditText name = (EditText)view.findViewById(R.id.name);
                Button button84 = (Button)view1.findViewById(R.id.button84);
                name.setText(button84.getText().toString());
                button84.setText(name.getText().toString());
                startActivity(intent);
            }
        });
//////////////////////////////////
        final ImageView imageView79 =  (ImageView) findViewById(R.id.imageView79);
        imageView79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%8B%A5%ED%84%B0%EC%A7%80+%EB%B8%8C%EB%9D%BC%EC%9D%B4%ED%8A%B8%EB%8B%9D%EC%97%85%EC%84%A0%ED%81%AC%EB%A6%BC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView80 =  (ImageView) findViewById(R.id.imageView80);
        imageView80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%B9%8C%EB%A6%AC%ED%94%84+%EB%8D%94+%ED%8A%B8%EB%A3%A8+%ED%81%AC%EB%A6%BC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView81 =  (ImageView) findViewById(R.id.imageView81);
        imageView81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%8B%9D%EB%AC%BC%EB%82%98%EB%9D%BC+%EC%84%A0%ED%81%AC%EB%A6%BC&frm=NVSCPRO"));
                startActivity(intent);

            }
        });

        final ImageView imageView82 =  (ImageView) findViewById(R.id.imageView82);
        imageView82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%96%B4%ED%93%A8+%ED%93%A8%EC%96%B4+%EB%B8%94%EB%A1%9D+%EB%82%B4%EC%B6%94%EB%9F%B4+%EB%8D%B0%EC%9D%BC%EB%A6%AC+%EC%84%A0%ED%81%AC%EB%A6%BC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView83 =  (ImageView) findViewById(R.id.imageView83);
        imageView83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%9D%B4%EB%8B%88%EC%8A%A4%ED%94%84%EB%A6%AC+%ED%8D%BC%ED%8E%99%ED%8A%B8+UV+&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView84 =  (ImageView) findViewById(R.id.imageView84);
        imageView84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%81%AC%EB%A6%AC%EB%8B%88%ED%81%AC+%EB%AA%A8%EC%9D%B4%EC%8A%A4%EC%B6%B0+%EB%A6%B4%EB%A6%AC%ED%94%84&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView85 =  (ImageView) findViewById(R.id.imageView85);
        imageView85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%82%A4%EC%97%98+%EC%9A%B8%ED%8A%B8%EB%9D%BC+%ED%9B%BC%EC%9D%B4%EC%85%9C+%ED%81%AC%EB%A6%BC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView86 =  (ImageView) findViewById(R.id.imageView86);
        imageView86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%86%A0%EB%8B%88%EB%AA%A8%EB%A6%AC+%EB%8D%94+%EC%B4%89%EC%B4%89+%EA%B7%B8%EB%A6%B0%ED%8B%B0+%EC%88%98%EB%B6%84+%ED%81%AC%EB%A6%BC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView87 =  (ImageView) findViewById(R.id.imageView87);
        imageView87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%94%BC%EC%A7%80%EC%98%A4%EA%B2%94+%EB%8D%B0%EC%9D%BC%EB%A6%AC+%EB%AA%A8%EC%9D%B4%EC%8A%A4%EC%B3%90+%ED%85%8C%EB%9D%BC%ED%94%BC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });


    }
}
