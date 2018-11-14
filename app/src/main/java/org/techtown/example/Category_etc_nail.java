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

public class Category_etc_nail extends AppCompatActivity{
    AQuery aq69;
    AQuery aq70;
    AQuery aq71;
    AQuery aq72;
    AQuery aq73;
    AQuery aq74;
    AQuery aq75;
    AQuery aq76;
    AQuery aq77;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_etc_nail);

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

        aq69 = new AQuery(this);
        aq69.id(R.id.imageView88).image("http://lfyaklyqypvr852590.gcdn.ntruss.com/data/nature_data/images/product/00/00/01/08/86/b_0000010886.gif");

        aq70 = new AQuery(this);
        aq70.id(R.id.imageView89).image("http://image.ethefaceshop.com/tfsshopWebSrc/upload/product/201703/AF006548_06_1.jpg");

        aq71 = new AQuery(this);
        aq71.id(R.id.imageView90).image("https://www.koreadepart.com/data/item/1394071548_l1");

        aq72 = new AQuery(this);
        aq72.id(R.id.imageView91).image("http://www.theskinfood.com/custom/goods/webImg/dae9ad30-7470-4939-9ae3-b5220a4a469f.jpg");

        aq73 = new AQuery(this);
        aq73.id(R.id.imageView92).image("http://www.theskinfood.com/custom/goods/webImg/381-2_1(4).jpg");

        aq74 = new AQuery(this);
        aq74.id(R.id.imageView93).image("https://thumbnail12.coupangcdn.com/thumbnails/remote/230x230ex/image/vendor_inventory/images/2018/09/07/16/7/fc714b2b-eea5-4c78-a1e5-0e38a40b4b92.jpeg");

        aq75 = new AQuery(this);
        aq75.id(R.id.imageView94).image("http://cdn.aritaum.com/UPLOAD/UPLOAD_IMAGE/C020/201805/IMG1526nMa483633316.png");
        aq76 = new AQuery(this);
        aq76.id(R.id.imageView95).image("http://img.danawa.com/prod_img/500000/702/277/img/5277702_1.jpg?shrink=500:500&_v=20180510115234");

        aq77 = new AQuery(this);
        aq77.id(R.id.imageView96).image("https://img1.memebox.com/72pb269n/contents/img/memeboxProductItem/20170523103942_e04c94572e3dc65ee58e36f7c413e4ee.jpg");
 //88-96
        final ImageView imageView88=  (ImageView) findViewById(R.id.imageView88);
        imageView88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%84%A4%EC%9D%B4%EC%B2%98+%EC%8D%A8%EB%8B%88+%EC%A0%A4+%EB%84%A4%EC%9D%BC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView89=  (ImageView) findViewById(R.id.imageView89);
        imageView89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%AF%B8%EC%83%A4+%EB%A3%A8%EC%8B%9C%EB%93%9C+%EB%84%A4%EC%9D%BC%ED%8F%B4%EB%A6%AC%EC%89%AC&cat_id=&frm=NVSHATC"));
                startActivity(intent);
            }
        });

        final ImageView imageView90=  (ImageView) findViewById(R.id.imageView90);
        imageView88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EB%8D%94%ED%8E%98%EC%9D%B4%EC%8A%A4%EC%83%B5+%EC%9D%B4%EC%A7%80%EB%84%A4%EC%9D%BC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView91=  (ImageView) findViewById(R.id.imageView91);
        imageView91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%8A%A4%ED%82%A8%ED%91%B8%EB%93%9C+%EB%84%A4%EC%9D%BC%EB%B9%84%ED%83%80%EC%95%8C%ED%8C%8C&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
        final ImageView imageView92=  (ImageView) findViewById(R.id.imageView92);
        imageView92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%8A%A4%ED%82%A8%ED%91%B8%EB%93%9C+%EB%B0%80%ED%81%AC%EC%89%90%EC%9D%B4%ED%81%AC+%ED%8F%AC%EC%9D%B8%ED%8A%B8+%EB%A9%94%EC%9D%B4%ED%81%AC%EC%97%85+%EB%A6%AC%EB%AC%B4%EB%B2%84&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView93=  (ImageView) findViewById(R.id.imageView93);
        imageView93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%95%84%EB%A6%AC%EB%94%B0%EC%9B%80+%EB%AA%A8%EB%94%94%EB%84%A4%EC%9D%BC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
        final ImageView imageView94=  (ImageView) findViewById(R.id.imageView94);
        imageView94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%95%84%EB%A6%AC%EB%94%B0%EC%9B%80+%EB%BD%80%EC%98%A4%EC%96%80+%EB%A6%AC%EB%AC%B4%EB%B2%84&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });
        final ImageView imageView95=  (ImageView) findViewById(R.id.imageView95);
        imageView95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%9D%B4%EB%8B%88%EC%8A%A4%ED%94%84%EB%A6%AC+%EB%A6%AC%EC%96%BC%EC%BB%AC%EB%9F%AC%EB%84%A4%EC%9D%BC&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

        final ImageView imageView96=  (ImageView) findViewById(R.id.imageView96);
        imageView96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%8F%B0%EC%A6%88+%EB%A6%BD%EC%95%A4%EC%95%84%EC%9D%B4%EB%A6%AC%EB%AC%B4%EB%B2%84&cat_id=&frm=NVSHATC"));
                startActivity(intent);

            }
        });

    }
}
