package com.Ov2App.Web.Data;

import org.json.simple.JSONArray;

public class Traject {


    private static JSONArray getTrajectenjso() throws Exception{
        JSONArray response = ApiConsumer.Consume("Trajecten");
        return response;
    }
}
