package com.Ov2App.Web.Model;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiHelper {

    private static final String URL = "http://localhost:8008/";
    public static JSONArray Consume(String subDomain)throws Exception{
        //Example: "http://localhost:8008/getshoppingcart?ids=1&amount=1"

        //Initialize HttpClient and HttpRequest
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(URI.create(URL + subDomain))
                .header("accept", "application/json")
                .build();

        //Perform request
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //Convert jsonString to jsonArray
        String jsonString = response.body();
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray  = (JSONArray) jsonParser.parse(jsonString);
        return jsonArray;
    }
}

