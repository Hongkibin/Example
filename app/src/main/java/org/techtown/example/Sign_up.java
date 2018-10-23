package org.techtown.example;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Sign_up extends AppCompatActivity {

    private EditText etPasswordConfirm;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        final EditText idText = (EditText) findViewById(R.id.idText);
        final EditText passwordText = (EditText) findViewById(R.id.passwordText);
        final EditText nameText = (EditText) findViewById(R.id.nameText);
        final EditText ageText = (EditText) findViewById(R.id.ageText);

        ImageButton registerButton = (ImageButton) findViewById(R.id.registerButton);

        etPasswordConfirm = (EditText) findViewById(R.id.etPasswordConfirm);
        // 비밀번호 일치 검사
       etPasswordConfirm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String password = passwordText.getText().toString();
                String confirm = etPasswordConfirm.getText().toString();

                if( password.equals(confirm) ) {
                    passwordText.setBackgroundColor(Color.GREEN);
                    etPasswordConfirm.setBackgroundColor(Color.GREEN);
                } else {
                    passwordText.setBackgroundColor(Color.RED);
                    etPasswordConfirm.setBackgroundColor(Color.RED);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 아이디 입력 확인
                if( idText.getText().toString().length() == 0 ) {
                    Toast.makeText(Sign_up.this, "아이디를 입력하세요!", Toast.LENGTH_SHORT).show();
                    idText.requestFocus();
                    return;
                }

                // 비밀번호 입력 확인
                if( passwordText.getText().toString().length() == 0 ) {
                    Toast.makeText(Sign_up.this, "비밀번호를 입력하세요!", Toast.LENGTH_SHORT).show();
                    passwordText.requestFocus();
                    return;
                }

                // 비밀번호 확인 입력 확인
                if( etPasswordConfirm.getText().toString().length() == 0 ) {
                    Toast.makeText(Sign_up.this, "비밀번호 확인을 입력하세요!", Toast.LENGTH_SHORT).show();
                    etPasswordConfirm.requestFocus();
                    return;
                }

                // 비밀번호 일치 확인
                if( !passwordText.getText().toString().equals(etPasswordConfirm.getText().toString()) ) {
                    Toast.makeText(Sign_up.this, "비밀번호가 일치하지 않습니다!", Toast.LENGTH_SHORT).show();
                    passwordText.setText("");
                    etPasswordConfirm.setText("");
                    passwordText.requestFocus();
                    return;
                }

                Intent result = new Intent();
                result.putExtra("id", idText.getText().toString());

                // 자신을 호출한 Activity로 데이터를 보낸다.
               // setResult(RESULT_OK, result);//이게 아닌듯. 이건 그냥 돌아오는 느낌 . 클릭하면 클릭이벤트안에서
                //aquery추가해줘야 된다고 함...
                //finish(); //이거 필요할라나. 불필요해 보이면 빼기


                String userID = idText.getText().toString();
                String userPassword = passwordText.getText().toString();
                String userName = nameText.getText().toString();
                int userAge = Integer.parseInt(ageText.getText().toString());

                Response.Listener<String> responseListener = new Response.Listener<String>(){

                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if(success){
                                AlertDialog.Builder builder = new AlertDialog.Builder(Sign_up.this);
                                builder.setMessage("회원 등록에 성공했습니다.")
                                        .setPositiveButton("확인", null)
                                        .create()
                                        .show();
                                Intent intent = new Intent(Sign_up.this, MainActivity.class);
                                Sign_up.this.startActivity(intent);
                            }else
                            {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Sign_up.this);
                                builder.setMessage("회원 등록에 실패했습니다.")
                                        .setNegativeButton("다시 시도", null)
                                        .create()
                                        .show();
                            }
                        }
                        catch(JSONException e)
                        {
                            e.printStackTrace();
                        }

                    }
                };
                Sign_up_Request sign_up_Request = new Sign_up_Request(userID, userPassword, userName,userAge, responseListener);
                RequestQueue queue = Volley.newRequestQueue(Sign_up.this);
                queue.add(sign_up_Request);
                // 저거 사인업 리퀘스트 에러나는건 저 파일이 없어서 그럼. 씨파일 맞게 만든뒤 다시 하면 잘될 것임!. ㅗ하잍ㅇ팅
            }
        });
    }
}
