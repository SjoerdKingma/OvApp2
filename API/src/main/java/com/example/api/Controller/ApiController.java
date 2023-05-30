package com.example.api.Controller;

import com.example.api.GsonReader;
import com.example.api.Model.Station;
import com.example.api.Model.TrajectJson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.api.Model.TrajectJson;


import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@RestController
public class ApiController {

    @GetMapping("/Groene")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "Reizen") String name) {
        return String.format("Groene %s!", name);
    }

    @GetMapping("/Trajecten")
    public JSONArray getTrajecten() throws IOException {


        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/Trajecten.json"));
        JsonObject x = new Gson().fromJson(reader, new TypeToken<JsonObject>(){});
        //JsonObject traject = new Gson().fromJson(reader, new TypeToken<JSONObject>() {}.getType());

        JsonArray trajects = x.get("trajecten").getAsJsonArray();

        for (int i = 0; i < trajects.size(); i++){
            Object<TrajectJson> traject=new Object();

        }
        JSONArray jsonArray = new JSONArray();
        jsonArray.add("Amersfoort-Amsterdam");
        jsonArray.add("Amersfoort-Arnhem");
        return jsonArray;
    }

}

