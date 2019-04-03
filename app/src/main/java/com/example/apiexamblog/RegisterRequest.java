package com.example.apiexamblog;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    final static private String URL = "http://rladbsgus94.cafe24.com/UserRegister.php";
    private Map <String,String > parameters;

    public RegisterRequest(String userID, String userPassword, String userGender, String userEmail, Response.Listener<String>listener) {
        super(Method.POST,URL,listener,null);
        parameters = new HashMap<>();
        parameters.put("userID",userID);
        parameters.put("userPassword",userPassword);
        parameters.put("userGender",userGender);
        parameters.put("userEmail",userEmail);
    }

    public Map<String, String> getParameters() {
        return parameters;
    }
}
