package org.techtown.example;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class Mypage_Request extends StringRequest {
   // final static private String URL = "http://gmldnjs0805.cafe24.com/MypageUP.php";
   //final static private String URL = "http://gmldnjs0805.cafe24.com/d-day.php";
   // private Map<String, String> parameters;

    public Mypage_Request(int mypage_id, int cosmetic_id, int open_info_Y, int open_info_M, int open_info_D,
                            String cosmetic_name, String userID, int fcm_id,int exp_data_Y,
                            int exp_data_M,int exp_data_D, String image, int made_date_Y,int made_date_M,
                            int made_date_D,int alarm_date_Y,int alarm_date_M,int alarm_date_D, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("mypage_id", mypage_id+"");
        parameters.put("cosmetic_id", cosmetic_id+"");
        parameters.put("open_info_Y", open_info_Y+"");
        parameters.put("open_info_M", open_info_M+"");
        parameters.put("open_info_D", open_info_D+"");
        parameters.put("cometic_name", cosmetic_name);
        parameters.put("userID", userID);
        parameters.put("fcm_id", fcm_id+"");
        parameters.put("exp_data_Y", exp_data_Y+"");
        parameters.put("exp_data_M", exp_data_M+"");
        parameters.put("exp_data_D", exp_data_D+"");
        parameters.put("image", image);
        parameters.put("made_date_Y", made_date_Y+"");
        parameters.put("made_date_M", made_date_M+"");
        parameters.put("made_date_D", made_date_D+"");
        parameters.put("alarm_date_Y", alarm_date_Y+"");
        parameters.put("alarm_date_M", alarm_date_M+"");
        parameters.put("alarm_date_D", alarm_date_D+"");

    }
    final static private String URL = "http://gmldnjs0805.cafe24.com/d-day.php";
    private Map<String, String> parameters;
    public Mypage_Request(int date1,Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("date1", date1+"");
      //  parameters.put("exp_data_Y", exp_data_Y+"");
        //parameters.put("exp_data_M", exp_data_M+"");
        //parameters.put("exp_data_D", exp_data_D+"");
    }
    @Override
    public Map<String, String> getParams() {
        return parameters;
    }
}