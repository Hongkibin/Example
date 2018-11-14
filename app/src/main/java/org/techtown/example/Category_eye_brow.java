package org.techtown.example;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.androidquery.AQuery;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;


public class Category_eye_brow extends AppCompatActivity {
    AQuery aq25;
    AQuery aq26;
    AQuery aq27;
    AQuery aq28;
    AQuery aq29;
    AQuery aq30;
    AQuery aq31;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_brow);

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

        aq25 = new AQuery(this);
        aq25.id(R.id.imageView).image("https://www.koreadepart.com/data/item/1492061922_l1");

        aq26 = new AQuery(this);
        aq26.id(R.id.imageView4).image("https://post-phinf.pstatic.net/MjAxNzA5MDdfNjQg/MDAxNTA0NzczMDQzMTYy.Rhy3yeITP_PSFfvcqthUrAglQeGYrXTn1gLgl-uPHhwg.SkyoAeX_O2lxj_khZ_lX5ZmzaWgP9G0IMKX8vXhCIScg.PNG/%EC%BA%A1%EC%B2%98.PNG?type=w1200");

        aq27 = new AQuery(this);
        aq27.id(R.id.imageView10).image("http://gdimg.gmarket.co.kr/1100179417/still/600?ver=1502109653");

        aq28 = new AQuery(this);
        aq28.id(R.id.imageView11).image("http://d9vmi5fxk1gsw.cloudfront.net/home/glowmee/upload/20151214/1450064545733.jpg");

        aq29 = new AQuery(this);
        aq29.id(R.id.imageView12).image("http://d9vmi5fxk1gsw.cloudfront.net/home/glowmee/upload/20160125/1453708769365.jpg");

        aq30 = new AQuery(this);
        aq30.id(R.id.imageView13).image("http://gdimg.gmarket.co.kr/1269329002/still/600?ver=1518697693");

        aq31 = new AQuery(this);
        aq31.id(R.id.imageView14).image("https://tse4.mm.bing.net/th?id=OIP.EWOcfqUnil7tu9955nfTIAHaHa&pid=Api");

        final ImageView imageView =  (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%82%90%EC%95%84+%EB%9D%BC%EC%8A%A4%ED%8A%B8+%ED%8E%9C%EC%8A%AC&cat_id=&frm=NVSHATC"));
                startActivity(intent);
            }
        });

        final ImageView imageView4 =  (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%8A%88%EC%97%90%EB%AC%B4%EB%9D%BC+%ED%95%98%EB%93%9C+%ED%8F%AC%EB%AE%AC%EB%9D%BC+%ED%95%98%EB%93%9C&cat_id=&frm=NVSHATC"));
                startActivity(intent);
            }
        });

        final ImageView imageView10 =  (ImageView) findViewById(R.id.imageView10);
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%8A%A4%ED%82%A8%ED%91%B8%EB%93%9C+%EC%B4%88%EC%BD%94+%EC%95%84%EC%9D%B4%EB%B8%8C%EB%A1%9C%EC%9A%B0+%ED%8C%8C%EC%9A%B0%EB%8D%94%EC%BC%80%EC%9D%B5&cat_id=&frm=NVSHATC"));
                startActivity(intent);
            }
        });

        final ImageView imageView11 =  (ImageView) findViewById(R.id.imageView11);
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%97%90%EB%9B%B0%EB%93%9C%ED%95%98%EC%9A%B0%EC%8A%A4+%EC%B2%AD%EC%88%9C+%EA%B1%B0%EC%A7%93+%EB%B8%8C%EB%9D%BC%EC%9A%B0+%EC%A0%A4+%ED%8B%B4%ED%8A%B8&cat_id=&frm=NVSHATC"));
                startActivity(intent);
            }
        });

        final ImageView imageView12 =  (ImageView) findViewById(R.id.imageView12);
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%EC%9A%B0%EB%93%9C%EB%B2%84%EB%A6%AC+%ED%95%98%EB%93%9C%ED%85%8D%EC%8A%A4%EC%B2%98+%EC%95%84%EC%9D%B4%EB%B8%8C%EB%A1%9C%EC%9A%B0+&cat_id=&frm=NVSHATC"));
                startActivity(intent);
            }
        });

        final ImageView imageView13 =  (ImageView) findViewById(R.id.imageView13);
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%81%B4%EB%A6%AC%EC%98%A4+%ED%82%AC%EB%B8%8C%EB%A1%9C%EC%9A%B0+%EC%98%A4%ED%86%A0+%ED%95%98%EB%93%9C+%EB%B8%8C%EB%A1%9C%EC%9A%B0+%ED%8E%9C%EC%8A%AC&cat_id=&frm=NVSHATC"));
                startActivity(intent);
            }
        });

        final ImageView imageView14 =  (ImageView) findViewById(R.id.imageView14);
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all.nhn?query=%ED%82%A4%EC%8A%A4%EB%AF%B8+%ED%97%A4%EB%B9%84%EB%A1%9C%ED%85%8C%EC%9D%B4%EC%85%98+%EC%BB%AC%EB%9F%AC%EB%A7%81+%EC%95%84%EC%9D%B4%EB%B8%8C%EB%A1%9C%EC%9A%B0&cat_id=&frm=NVSHATC"));
                startActivity(intent);
            }
        });

    }
}