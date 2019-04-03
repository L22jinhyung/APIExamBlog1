package com.example.apiexamblog;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {
    final static private String URL = "http://rladbsgus94.cafe24.com/UserLogin.php";
    private Map<String,String > parameters;

    public LoginRequest(String userID, String userPassword,Response.Listener<String>listener) {
        super(Method.POST,URL,listener,null);
        parameters = new HashMap<>();
        parameters.put("userID",userID);
        parameters.put("userPassword",userPassword);
    }

    public Map<String, String> getParameters() {
        return parameters;
    }
}
