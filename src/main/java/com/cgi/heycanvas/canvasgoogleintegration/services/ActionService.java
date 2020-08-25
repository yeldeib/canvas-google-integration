package com.cgi.heycanvas.canvasgoogleintegration.services;

import org.springframework.stereotype.Service;
import org.json.JSONObject;

@Service
public class ActionService {

    public String getIntentName(String body)throws Exception{
        //Converting body to JSONObject
        JSONObject bodyJson = new JSONObject(body);

        //Get queryResult object
        JSONObject queryResult = bodyJson.getJSONObject("queryResult");

        //Get intent object
        JSONObject intent = queryResult.getJSONObject("intent");

        //Extract name of intent
        return intent.get("displayName").toString();
    }
}
