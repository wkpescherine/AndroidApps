package com.example.wkpescherine.celebpage;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wkpescherine on 6/10/2016.
 */
public class RegisterRequest extends StringRequest {

    private static String REGISTER_REQUEST_URL ="http://";
    private Map<String,String> params;

    public RegisterRequest(String username, String email, String password, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL , listener, null);
        params = new HashMap<>();
        params.put("email", email);
        params.put("password", password);
        params.put("full_name", username);
    }

    public Map<String,String> getParams(){
        return params;
    }
}
