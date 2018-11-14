package org.techtown.example;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.androidquery.AQuery;

public class Category_foundation extends AppCompatActivity{
    AQuery aq51;
    AQuery aq52;
    AQuery aq53;
    AQuery aq54;
    AQuery aq55;
    AQuery aq56;
    AQuery aq57;
    AQuery aq58;
    AQuery aq59;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_foundation);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent23 = new Intent(getApplicationContext(), Category_foundation.class);
                startActivityForResult(intent23, 101);
            }
        });
        Button button45 = (Button) findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent24 = new Intent(getApplicationContext(), Category_foundation_cushion.class);
                startActivityForResult(intent24, 101);
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

        aq51 = new AQuery(this);
        aq51.id(R.id.imageView61).image("http://image.oliveyoung.co.kr/uploads/images/goods/550/10/0000/0001/A00000001515703ko.jpg?l=ko");
        aq52 = new AQuery(this);
        aq52.id(R.id.imageView62).image("http://img.wemep.co.kr/deal/2/038/3880382/9ad9d655e13155e602ced7eca937681dfdb9522c.jpg");
        aq53 = new AQuery(this);
        aq53.id(R.id.imageView63).image("http://d9vmi5fxk1gsw.cloudfront.net/home/glowmee/upload/20180424/1524558225791.png");

        aq54 = new AQuery(this);
        aq54.id(R.id.imageView64).image("http://image.auction.co.kr/itemimage/13/a7/65/13a76505d6.jpg");

        aq55 = new AQuery(this);
        aq55.id(R.id.imageView65).image("http://image.auction.co.kr/itemimage/d0/97/a6/d097a6556.jpg");

        aq56 = new AQuery(this);
        aq56.id(R.id.imageView66).image("https://www.koreadepart.com/data/item/1423551610_l1");

        aq57 = new AQuery(this);
        aq57.id(R.id.imageView67).image("http://cdn.aritaum.com/UPLOAD/UPLOAD_IMAGE/C020/201806/IMG1529hIj459929315_356.jpg");

        aq58 = new AQuery(this);
        aq58.id(R.id.imageView68).image("https://img1.memebox.com/dl8z711m/contents/img/memeboxProduct/20180514053123_5aceb52ab658d60178df26aa90cd9f1e.jpg");

        aq59 = new AQuery(this);
        aq59.id(R.id.imageView69).image("http://www.toocoolforschool.com/shop/data/goods/153596731159s0.jpg");
    //61-69

        final ImageView imageView61 =  (ImageView) findViewById(R.id.imageView61);
        imageView61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%A1%9C%EB%A0%88%EC%95%8C%ED%8C%8C%EB%A6%AC+%ED%8A%B8%EB%A3%A8%EB%A7%A4%EC%B9%98+%EB%A6%AC%ED%80%B4%EB%93%9C+%ED%8C%8C%EC%9A%B4%EB%8D%B0%EC%9D%B4%EC%85%98&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });


        final ImageView imageView62 =  (ImageView) findViewById(R.id.imageView62);
        imageView62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%A3%A8%EB%82%98+%EB%A1%B1%EB%9E%98%EC%8A%A4%ED%8C%85+%ED%8C%8C%EC%9A%B4%EB%8D%B0%EC%9D%B4%EC%85%98&cat_id=&frm=NVSHAKW"));
                startActivity(intent);

            }
        });

        final ImageView imageView63 =  (ImageView) findViewById(R.id.imageView63);
        imageView63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%A7%88%EB%AA%BD%EB%93%9C+%EC%98%AC+%EC%8A%A4%ED%85%8C%EC%9D%B4+%ED%8C%8C%EC%9A%B4%EB%8D%B0%EC%9D%B4%EC%85%98&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView64 =  (ImageView) findViewById(R.id.imageView64);
        imageView64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%A9%94%EC%9D%B4%EB%B8%94%EB%A6%B0%EB%89%B4%EC%9A%95+%ED%95%8F%EB%AF%B8+%ED%8C%8C%EC%9A%B4%EB%8D%B0%EC%9D%B4%EC%85%98&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView65 =  (ImageView) findViewById(R.id.imageView65);
        imageView65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%95%84%EB%A6%AC%EB%94%B0%EC%9B%80+%EC%98%AC%EB%8D%B0%EC%9D%B4+%EB%9E%98%EC%8A%A4%ED%8C%85+%ED%8C%8C%EC%9A%B4%EB%8D%B0%EC%9D%B4%EC%85%98&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView66 =  (ImageView) findViewById(R.id.imageView66);
        imageView66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%95%84%EC%9D%B4%EC%98%A4%ED%8E%98+%ED%8D%BC%ED%8E%99%ED%8A%B8+%EC%8A%A4%ED%82%A8+%ED%8C%8C%EC%9A%B4%EB%8D%B0%EC%9D%B4%EC%85%98&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView67 =  (ImageView) findViewById(R.id.imageView67);
        imageView67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%97%90%EC%8A%A4%EC%81%98%EC%95%84+%ED%94%84%EB%A1%9C%ED%85%8C%EC%9D%BC%EB%9F%AC+%ED%8C%8C%EC%9A%B4%EB%8D%B0%EC%9D%B4%EC%85%98+%EB%B9%84+%EC%8B%A4%ED%81%AC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView68 =  (ImageView) findViewById(R.id.imageView68);
        imageView68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%A7%80%EB%B2%A0%EB%A5%B4%EB%8B%88+%EB%B0%80%EC%B0%A9+%ED%8C%8C%EC%9A%B4%EB%8D%B0%EC%9D%B4%EC%85%98&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
        final ImageView imageView69 =  (ImageView) findViewById(R.id.imageView69);
        imageView69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%88%AC%EC%BF%A8%ED%8F%AC%EC%8A%A4%EC%BF%A8+%EB%93%9C%EB%95%85%EB%9C%A8+%EB%A6%AC%ED%80%B4%EB%93%9C%EC%BB%A4%EB%B2%84&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

    }
}