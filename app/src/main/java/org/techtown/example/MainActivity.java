package org.techtown.example;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {}
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getApplicationContext(), MenuActivity.class);
                startActivityForResult(intent, 101);
                //여기서부터 회원가입
                @SuppressLint("WrongViewCast") Button button = (Button) findViewById(R.id.imageButton10);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), RegistActivity.class);
                        startActivityForResult(intent, 1000);

            }
        }); /* ImageButton imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
                imageButton9.setOnClickListener(new View.OnClickListener()

                {
                    @Override
                    public void onClick (View v){
                        Intent intent14 = new Intent(getApplicationContext(),Paper.class);
                        startActivity(intent14);

                    }
                });}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 101){
            String name = data.getStringExtra("name");
            Toast.makeText(getApplicationContext(),"메뉴화면으로부터 응답 : "+name,Toast.LENGTH_LONG).show();
        }
    }*/