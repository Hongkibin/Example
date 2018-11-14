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

public class Category_eye_line extends AppCompatActivity
    {
        AQuery aq39;
        AQuery aq40;
        AQuery aq41;
        AQuery aq42;
        AQuery aq43;
        AQuery aq44;


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_eye_line);

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

            aq39 = new AQuery(this);
            aq39.id(R.id.imageView15).image("http://image.ethefaceshop.com/tfsshopWebSrc/upload/product/201511/AF003300_06_1.jpg");

            aq40 = new AQuery(this);
            aq40.id(R.id.imageView16).image("http://surprise.azureedge.net/brand-item/default/1525591911651104.png");

            aq41 = new AQuery(this);
            aq41.id(R.id.imageView17).image("https://img1.memebox.com/5okmxf6c/contents/img/memeboxProductItem/20170221062057_819d552d64ce720120d1a861894a4354.jpg");

           aq42 = new AQuery(this);
            aq42.id(R.id.imageView50).image("https://www.koreadepart.com/data/item/1291002283_l1");

            aq43 = new AQuery(this);
            aq43.id(R.id.imageView51).image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1bFMPRoM5xiaCk_2cRsTReWKea5JCZLrIHCE2JLLZF6cgr0N-");

            aq44 = new AQuery(this);
            aq44.id(R.id.imageView53).image("http://etonymoly.com/data/img/rental/goods/big/EM02017300-1(6).jpg");



            final ImageView imageView15 =  (ImageView) findViewById(R.id.imageView15);
            imageView15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%8D%94%ED%8E%98%EC%9D%B4%EC%8A%A4%EC%83%B5+%ED%8E%98%EC%9D%B4%EC%8A%A4%EC%9E%87+%EC%9D%B5%EC%8A%A4%ED%8A%B8%EB%A6%BC+%EB%B8%8C%EB%9F%AC%EC%89%AC+%ED%8E%9C%EB%9D%BC%EC%9D%B4%EB%84%88&cat_id=&frm=NVSHATC"));
                    startActivity(intent);

                }
            });

            final ImageView imageView16 =  (ImageView) findViewById(R.id.imageView16);
            imageView16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%AF%B8%EC%83%A4+%EB%A7%A4%ED%8A%B8+%EC%9D%B4%ED%8E%99%ED%8A%B8+%ED%8E%9C+%EB%9D%BC%EC%9D%B4%EB%84%88+&cat_id=&frm=NVSHATC"));
                    startActivity(intent);

                }
            });

            final ImageView imageView17 =  (ImageView) findViewById(R.id.imageView17);
            imageView17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%82%90%EC%95%84+%EB%9D%BC%EC%8A%A4%ED%8A%B8+%ED%8E%9C+%EC%95%84%EC%9D%B4%EB%9D%BC%EC%9D%B4%EB%84%88+&cat_id=&frm=NVSHATC"));
                    startActivity(intent);

                }
            });

            final ImageView imageView50 =  (ImageView) findViewById(R.id.imageView50);
            imageView50.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%81%B4%EB%A6%AC%EC%98%A4+%EC%9B%8C%ED%84%B0%ED%94%84%EB%A3%A8%ED%94%84+%EB%B8%8C%EB%9F%AC%EC%89%AC%EB%9D%BC%EC%9D%B4%EB%84%88&cat_id=&frm=NVSHATC"));
                    startActivity(intent);

                }
            });

            final ImageView imageView51 =  (ImageView) findViewById(R.id.imageView51);
            imageView51.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%82%A4%EC%8A%A4%EB%AF%B8+%ED%9E%88%EB%A1%9C%EC%9D%B8+%EB%A9%94%EC%9D%B4%ED%81%AC+%EC%8A%A4%EB%AC%B4%EC%8A%A4+%EB%A6%AC%ED%80%B4%EB%93%9C+%EC%95%84%EC%9D%B4%EB%9D%BC%EC%9D%B4%EB%84%88&cat_id=&frm=NVSHATC"));
                    startActivity(intent);

                }
            });

            final ImageView imageView53 =  (ImageView) findViewById(R.id.imageView53);
            imageView53.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%86%A0%EB%8B%88%EB%AA%A8%EB%A6%AC+%ED%8D%BC%ED%8E%99%ED%8A%B8+%EC%95%84%EC%9D%B4%EC%A6%88+%EC%A0%A4+%ED%8E%9C%EB%9D%BC%EC%9D%B4%EB%84%88&cat_id=&frm=NVSHATC"));
                    startActivity(intent);

                }
            });
        }
}
