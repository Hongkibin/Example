package org.techtown.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

    ImageButton imageButton3 =(ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View v){
        Intent intent17 = new Intent(getApplicationContext(),Category_lips.class);
        startActivity(intent17);
    }
    });

        ImageButton imageButton4 =(ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                Intent intent18 = new Intent(getApplicationContext(),Category_foundation.class);
                startActivity(intent18);
            }
        });

        ImageButton imageButton5 =(ImageButton) findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                Intent intent19 = new Intent(getApplicationContext(),Category_eyes.class);
                startActivity(intent19);
            }
        });

        ImageButton imageButton6 =(ImageButton) findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                Intent intent20 = new Intent(getApplicationContext(),Category_cream.class);
                startActivity(intent20);
            }
        });

        ImageButton imageButton7 =(ImageButton) findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                Intent intent21 = new Intent(getApplicationContext(),Category_etc.class);
                startActivity(intent21);
            }
        });

}
  }