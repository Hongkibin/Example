package org.techtown.example;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;


public class Mypage  extends Activity implements View.OnClickListener {

    ///카메라 관련
    private static final int PICK_FROM_CAMERA = 0;
    private static final int PICK_FROM_ALBUM = 1;
    private static final int CROP_FROM_iMAGE = 2;
    private Uri mImageCaptureUri;
    private ImageView iv_UserPhoto;
    private int id_view;
    private String absoultePath;
    private DB_Manger dbmanger;

    ///디데이 관련
    private TextView dateText;
    private TextView todayText;
    // private TextView resultText;
    private Button dateButton;

    private int tYear;           //오늘 연월일 변수
    private int tMonth;
    private int tDay;

    private int dYear = 1;        //디데이 연월일 변수
    private int dMonth = 1;
    private int dDay = 1;


    private long d;
    private long t;
    private long r;

    private int resultNumber = 0;

    static final int DATE_DIALOG_ID = 0;

    ///디데이 ///
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        //////php 연동 위한 mypage
        final TextView today = (TextView) findViewById(R.id.today); //개봉 버튼 누르는 거
        final EditText editText = (EditText) findViewById(R.id.editText); //제품명
        final TextView date = (TextView) findViewById(R.id.date); // 제조일자
        final ImageView imageView5 = (ImageView) findViewById(R.id.imageView5); // 이미지
        final Spinner spinner_category = (Spinner) findViewById(R.id.spinner_category); //카테고리 선택

        /*카테고리 가는 버튼*/
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent29 = new Intent(getApplicationContext(), Category.class);
                startActivity(intent29);
            }
        });
        ////디데이///
        final CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox);

        dateText = (TextView) findViewById(R.id.date);
        todayText = (TextView) findViewById(R.id.today);
        // resultText=(TextView)findViewById(R.id.result);
        dateButton = (Button) findViewById(R.id.dateButton);
        Calendar calendar = Calendar.getInstance();              //현재 날짜 불러옴
        tYear = calendar.get(Calendar.YEAR);
        tMonth = calendar.get(Calendar.MONTH);
        tDay = calendar.get(Calendar.DAY_OF_MONTH);

        //  t = calendar.getTimeInMillis();

        todayText.setText("제조일자를 입력 해 주세요");

        dateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Auto-generated method stub
                showDialog(0);//----------------
            }
        });
/////////////////////////////////////////////////////////
        dbmanger = new DB_Manger();
        iv_UserPhoto = (ImageView) this.findViewById(R.id.imageView5);
        Button btn_agreeJoin = (Button) this.findViewById(R.id.button6);
        btn_agreeJoin.setOnClickListener(this);
       /*
        제조일자
        Spinner yearSpinner = (Spinner)findViewById(R.id.spinner_year);
        ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(this,
                R.array.date_year, android.R.layout.simple_spinner_item);
        yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearSpinner.setAdapter(yearAdapter);

        Spinner monthSpinner = (Spinner)findViewById(R.id.spinner_month);
        ArrayAdapter monthAdapter = ArrayAdapter.createFromResource(this,
                R.array.date_month, android.R.layout.simple_spinner_item);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        monthSpinner.setAdapter(monthAdapter);

        Spinner daySpinner = (Spinner)findViewById(R.id.spinner_day);
        ArrayAdapter dayAdapter = ArrayAdapter.createFromResource(this,
                R.array.date_day, android.R.layout.simple_spinner_item);
        dayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        daySpinner.setAdapter(dayAdapter);
       */
////////카테고리
        Spinner categorySpinner = (Spinner) findViewById(R.id.spinner_category);

        ArrayAdapter categoryAdapter = ArrayAdapter.createFromResource(this,

                R.array.category, android.R.layout.simple_spinner_item);

        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        categorySpinner.setAdapter(categoryAdapter);

        /////알람으로 가기

        Button alarm = (Button) findViewById(R.id.alarm);
        alarm.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent intent30 = new Intent(getApplicationContext(), Alarm.class);
                startActivity(intent30);
            }
        });

//////체크박스
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "";
                if (cb1.isChecked()) {
                    result += cb1.getText().toString();
                    if (result.equals("YES"))
                        updateDisplay();

                } else {
                    todayText.setText("제조일자를 입력 해 주세요");
                }
            }
        });

//마이페이지 넘어가는 거
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent intent18 = new Intent(getApplicationContext(), pre_mypage.class);
                startActivity(intent18);

            }
        });




/*php연동
        String Mypage_today = todayText.getText().toString();
        String Mypage_date = dateText.getText().toString();
        //String Mypage_name = editText.getText().toString();
        //int userAge = Integer.parseInt(ageText.getText().toString());

        com.android.volley.Response.Listener<String> responseListener = new com.android.volley.Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    boolean success = jsonResponse.getBoolean("success");
                    if (success) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Mypage.this);
                        builder.setMessage("게시글 등록에 성공했습니다.")
                                .setPositiveButton("확인", null)
                                .create()
                                .show();
                        Intent intent = new Intent(Mypage.this, MainActivity.class);
                        Mypage.this.startActivity(intent);
                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Mypage.this);
                        builder.setMessage("게시글 등록에 실패했습니다.")
                                .setNegativeButton("다시 시도", null)
                                .create()
                                .show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        };
        Mypage_Request Mypage_up = new Mypage_Request(Mypage_date, Mypage_today,responseListener);
        RequestQueue queue = Volley.newRequestQueue(Mypage.this);
        queue.add(Mypage_Request);
*/
    }





    /*디데이*/

    private void updateDisplay() {

        todayText.setText(String.format("%d년 %d월 %d일", tYear, tMonth + 1, tDay));

    }

    private void updateDisplay1() {
        dateText.setText(String.format("%d년 %d월 %d일", dYear, dMonth + 1, dDay));
    }

    private DatePickerDialog.OnDateSetListener dDateSetListener = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            // TODO Auto-generated method stub
            dYear = year;
            dMonth = monthOfYear;
            dDay = dayOfMonth;
            final Calendar dCalendar = Calendar.getInstance();
            dCalendar.set(dYear, dMonth, dDay);

            // d=dCalendar.getTimeInMillis();
            //r=(d-t)/(24*60*60*1000);

            //resultNumber=(int)r;
            updateDisplay1();
        }
    };


    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == DATE_DIALOG_ID) {
            return new DatePickerDialog(this, dDateSetListener, tYear, tMonth, tDay);
        }
        return null;
    }

    /**
     * 카메라에서 사진 촬영
     */

    public void doTakePhotoAction() // 카메라 촬영 후 이미지 가져오기

    {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);


        // 임시로 사용할 파일의 경로를 생성

        String url = "tmp_" + String.valueOf(System.currentTimeMillis()) + ".jpg";

        mImageCaptureUri = Uri.fromFile(new File(Environment.getExternalStorageDirectory(), url));


        intent.putExtra(android.provider.MediaStore.EXTRA_OUTPUT, mImageCaptureUri);

        startActivityForResult(intent, PICK_FROM_CAMERA);

    }


    /**
     * 앨범에서 이미지 가져오기
     */

    public void doTakeAlbumAction() // 앨범에서 이미지 가져오기

    {

        // 앨범 호출

        Intent intent = new Intent(Intent.ACTION_PICK);

        intent.setType(android.provider.MediaStore.Images.Media.CONTENT_TYPE);

        startActivityForResult(intent, PICK_FROM_ALBUM);

    }


    @Override

    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);


        if (resultCode != RESULT_OK)

            return;


        switch (requestCode)

        {

            case PICK_FROM_ALBUM:

            {

                mImageCaptureUri = data.getData();

                Log.d("SmartWheel", mImageCaptureUri.getPath().toString());

            }


            case PICK_FROM_CAMERA:

            {

                // 이미지를 가져온 이후의 리사이즈할 이미지 크기를 결정합니다.

                // 이후에 이미지 크롭 어플리케이션을 호출하게 됩니다.

                Intent intent = new Intent("com.android.camera.action.CROP");

                intent.setDataAndType(mImageCaptureUri, "image/*");


                // CROP할 이미지를 200*200 크기로 저장

                intent.putExtra("outputX", 200); // CROP한 이미지의 x축 크기

                intent.putExtra("outputY", 200); // CROP한 이미지의 y축 크기

                intent.putExtra("aspectX", 1); // CROP 박스의 X축 비율

                intent.putExtra("aspectY", 1); // CROP 박스의 Y축 비율

                intent.putExtra("scale", true);

                intent.putExtra("return-data", true);

                startActivityForResult(intent, CROP_FROM_iMAGE); // CROP_FROM_CAMERA case문 이동

                break;

            }

            case CROP_FROM_iMAGE:

            {

                // 크롭이 된 이후의 이미지를 넘겨 받습니다.

                // 이미지뷰에 이미지를 보여준다거나 부가적인 작업 이후에

                // 임시 파일을 삭제합니다.

                if (resultCode != RESULT_OK) {

                    return;

                }


                final Bundle extras = data.getExtras();


                // CROP된 이미지를 저장하기 위한 FILE 경로

                String filePath = Environment.getExternalStorageDirectory().getAbsolutePath() +

                        "/SmartWheel/" + System.currentTimeMillis() + ".jpg";


                if (extras != null)

                {

                    Bitmap photo = extras.getParcelable("data"); // CROP된 BITMAP

                    iv_UserPhoto.setImageBitmap(photo); // 레이아웃의 이미지칸에 CROP된 BITMAP을 보여줌


                    storeCropImage(photo, filePath); // CROP된 이미지를 외부저장소, 앨범에 저장한다.

                    absoultePath = filePath;

                    break;


                }

                // 임시 파일 삭제

                File f = new File(mImageCaptureUri.getPath());

                if (f.exists())

                {

                    f.delete();

                }

            }

        }


    }


    @Override

    public void onClick(View v) {

        id_view = v.getId();

        if (v.getId() == R.id.button8) {

            /** SharedPreference 환경 변수 사용 **/

            SharedPreferences prefs = getSharedPreferences("login", 0);

            /** prefs.getString() return값이 null이라면 2번째 함수를 대입한다. **/

            String login = prefs.getString("USER_LOGIN", "LOGOUT");

            String facebook_login = prefs.getString("FACEBOOK_LOGIN", "LOGOUT");

            String user_id = prefs.getString("USER_ID", "");

            String user_name = prefs.getString("USER_NAME", "");

            String user_password = prefs.getString("USER_PASSWORD", "");

            String user_phone = prefs.getString("USER_PHONE", "");

            String user_email = prefs.getString("USER_EMAIL", "");

            // dbmanger.select(user_id,user_name,user_password, user_phone, user_email);

            //dbmanger.selectPhoto(user_name, mImageCaptureUri, absoultePath);


            Intent mainIntent = new Intent(Mypage.this, pre_mypage.class);

            Mypage.this.startActivity(mainIntent);

            Mypage.this.finish();

            Toast.makeText(this, "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT).show();


        } else if (v.getId() == R.id.button6) {

            DialogInterface.OnClickListener cameraListener = new DialogInterface.OnClickListener() {

                @Override

                public void onClick(DialogInterface dialog, int which) {

                    doTakePhotoAction();

                }

            };

            DialogInterface.OnClickListener albumListener = new DialogInterface.OnClickListener() {

                @Override

                public void onClick(DialogInterface dialog, int which) {

                    doTakeAlbumAction();

                }

            };


            DialogInterface.OnClickListener cancelListener = new DialogInterface.OnClickListener() {

                @Override

                public void onClick(DialogInterface dialog, int which) {

                    dialog.dismiss();

                }

            };


            new AlertDialog.Builder(this)

                    .setTitle("업로드할 이미지 선택")

                    .setPositiveButton("사진촬영", cameraListener)

                    .setNeutralButton("앨범선택", albumListener)

                    .setNegativeButton("취소", cancelListener)

                    .show();

        }


    }


    /*

     * Bitmap을 저장하는 부분

     */

    private void storeCropImage(Bitmap bitmap, String filePath) {

        // SmartWheel 폴더를 생성하여 이미지를 저장하는 방식이다.

        String dirPath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/SmartWheel";

        File directory_SmartWheel = new File(dirPath);


        if (!directory_SmartWheel.exists()) // SmartWheel 디렉터리에 폴더가 없다면 (새로 이미지를 저장할 경우에 속한다.)

            directory_SmartWheel.mkdir();


        File copyFile = new File(filePath);

        BufferedOutputStream out = null;


        try {


            copyFile.createNewFile();

            out = new BufferedOutputStream(new FileOutputStream(copyFile));

            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, out);


            // sendBroadcast를 통해 Crop된 사진을 앨범에 보이도록 갱신한다.

            sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE,

                    Uri.fromFile(copyFile)));


            out.flush();

            out.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}

