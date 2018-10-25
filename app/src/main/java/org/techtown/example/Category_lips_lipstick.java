package org.techtown.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

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
    }
}
