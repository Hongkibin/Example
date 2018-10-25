package org.techtown.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

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

        }
}
