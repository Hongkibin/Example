package org.techtown.example;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pre_mypage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_mypage);

        ImageButton imageButton11 = (ImageButton) findViewById(R.id.imageButton11);
        imageButton11.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Intent intent17 = new Intent(getApplicationContext(),Mypage.class);
                startActivity(intent17);

            }
        });
    }
}
