package org.techtown.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

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
    }
}
