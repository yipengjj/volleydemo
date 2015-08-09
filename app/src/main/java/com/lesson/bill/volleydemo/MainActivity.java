package com.lesson.bill.volleydemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doPost();
    }

    private void doPost() {

        String url = "http://www.51vfun.com:8888/webservice/rest/cs/visitorLogin";

        RequestQueue mQueue = Volley.newRequestQueue(this);

        /*Map<String, String> params = new HashMap<>();
        params.put("clientId", "IOS001");
        params.put("channel", "IOS");
        params.put("version", "1.0");
        params.put("userIp", "fe80::c66a:b7ff:fef8:9250%wlan0");
        params.put("xqId", "20150514000000002406");*/

        RequestValue requestValue = new RequestValue();
        requestValue.setClientId("IOS001");
        requestValue.setChannel("ANDR");
        requestValue.setVersion("1.0");
        requestValue.setUserIp("sdfdsfdsfdsf");
        requestValue.setXqId("20150514000000002406");

        JsonRequest request = new JsonObjectRequest(Request.Method.POST, url, requestValue, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.i("mTag",response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i("mTag",error.toString());
            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("Content-Type", "application/json;charset=UTF-8");

                return headers;
            }
        };
        mQueue.add(request);
    }
}
