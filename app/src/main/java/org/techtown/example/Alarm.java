package org.techtown.example;
import java.util.Calendar;
import java.util.GregorianCalendar;
import android.app.*;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.TimePicker.OnTimeChangedListener;
import android.widget.Toast;

public class Alarm extends Activity
        implements OnDateChangedListener, OnTimeChangedListener {
    /*
     * 알람관련 맴버 변수
     */
    // 알람 메니저
    private AlarmManager mManager;
    // 설정 일시
    private GregorianCalendar mCalendar;
    //일자 설정 클래스
    private DatePicker mDate;
    //시작 설정 클래스
    private TimePicker mTime;

    private long nowTime;
    /*
     * 통지 관련 맴버 변수
     */
    private NotificationManager mNotification;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //통지 매니저를 취득

        mNotification = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

        //알람 매니저를 취득
        mManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        //현재 시각을 취득
        mCalendar = new GregorianCalendar();
        //셋 버튼, 리셋버튼의 리스너를 등록
        nowTime = mCalendar.getTimeInMillis();

        setContentView(R.layout.activity_alarm);
        Button b = (Button)findViewById(R.id.set);
        b.setOnClickListener (new View.OnClickListener() {
            public void onClick (View v) {
                Toast.makeText(Alarm.this, "알람이 설정 되었습니다.", Toast.LENGTH_SHORT).show();
                setAlarm();
            }
        });
        b = (Button)findViewById(R.id.reset);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Alarm.this, "알람이 수정 되었습니다.", Toast.LENGTH_SHORT).show();
                resetAlarm();
            }
        });
        //일시 설정 클래스로 현재 시각을 설정
        mDate = (DatePicker)findViewById(R.id.date_picker);
        mDate.init (mCalendar.get(Calendar.YEAR), mCalendar.get(Calendar.MONTH), mCalendar.get(Calendar.DAY_OF_MONTH), this);
        mTime = (TimePicker)findViewById(R.id.time_picker);
        mTime.setCurrentHour(mCalendar.get(Calendar.HOUR_OF_DAY));
        mTime.setCurrentMinute(mCalendar.get(Calendar.MINUTE));
        mTime.setOnTimeChangedListener(this);
    }

    //알람의 설정
    private void setAlarm() {
        if(CONTEXT_IGNORE_SECURITY >= mCalendar.getTimeInMillis()){
            Toast.makeText(Alarm.this, "입력한 날짜는 현재 날짜보다 이전입니다.", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(getApplicationContext(), AlarmReceiver.class);
        PendingIntent sender = PendingIntent.getBroadcast(Alarm.this, 0, intent, 0);

        AlarmManager am = (AlarmManager) getSystemService(ALARM_SERVICE);
        am.setRepeating(AlarmManager.RTC_WAKEUP, mCalendar.getTimeInMillis(), 0, sender);

    }

    //알람의 해제
    private void resetAlarm() {
        mManager.cancel(pendingIntent());
    }
    //알람의 설정 시각에 발생하는 인텐트 작성
    private PendingIntent pendingIntent() {
        Intent i = new Intent(getApplicationContext(), Alarm.class);
        PendingIntent pi = PendingIntent.getActivity(this, 0, i, 0);
        return pi;
    }
    //일자 설정 클래스의 상태변화 리스너
    public void onDateChanged (DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        mCalendar.set (year, monthOfYear, dayOfMonth, mTime.getCurrentHour(), mTime.getCurrentMinute());

    }
    //시각 설정 클래스의 상태변화 리스너
    public void onTimeChanged (TimePicker view, int hourOfDay, int minute) {
        mCalendar.set (mDate.getYear(), mDate.getMonth(), mDate.getDayOfMonth(), hourOfDay, minute);
    }
}