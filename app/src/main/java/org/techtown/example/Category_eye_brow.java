package org.techtown.example;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.androidquery.AQuery;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;


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

    }
}