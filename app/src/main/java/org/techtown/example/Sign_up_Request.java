package org.techtown.example;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Sign_up_Request extends StringRequest {
    final static private String URL = "http://gmldnjs0805.cafe24.com/Register.php";
    private Map<String, String> parameters;

    public Sign_up_Request(String userID, String userPassword, String userName, int userAge, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);
        parameters.put("userName", userName);
        parameters.put("userAge", userAge + "");

    }
    @Override
    public Map<String, String> getParams() {
        return parameters;
    }
}