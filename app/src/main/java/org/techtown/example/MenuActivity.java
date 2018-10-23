package org.techtown.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    /*    EditText idText = (EditText) findViewById(R.id.idText);

        Intent intent = getIntent();
        String userID = intent.getStringExtra("userID");
        Toast.makeText(MenuActivity.this, "환영합니다. "+userID+" 님!", Toast.LENGTH_SHORT).show();


        if(userID == null){
            Toast.makeText(MenuActivity.this, "비회원으로 접속중", Toast.LENGTH_SHORT).show();
        }*/

       Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        Intent intent = new Intent();
        intent.putExtra("name", "success");

        setResult(Activity.RESULT_OK, intent);

        finish();
    }
    });

      /*  Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Intent intent1 = new Intent(getApplicationContext(),Mypage.class);
                startActivity(intent1);

            }
        });*/
        ImageButton imageButton2 =(ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Intent intent15 = new Intent(getApplicationContext(),Category.class);
                startActivity(intent15);
            }
        });

        ImageButton imageButton15 = (ImageButton) findViewById(R.id.imageButton15);
        imageButton15.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Intent intent12 = new Intent(getApplicationContext(),pre_mypage.class);
                startActivity(intent12);

            }
        });

        ImageButton imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
        imageButton9.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Intent intent14 = new Intent(getApplicationContext(),Paper.class);
                startActivity(intent14);

            }
        });
}

}
