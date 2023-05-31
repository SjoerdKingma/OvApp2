package com.example.api.Controller;

import com.example.api.GsonReader;
import com.example.api.Model.Station;
import com.example.api.Model.Stationsdetails;
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


import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
        JSONArray jsonArray = new JSONArray();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Path path = Paths.get("API/src/main/resources/static/json/Trajecten.json");
        Reader reader = Files.newBufferedReader(path);
        Path path2 = Paths.get("API/src/main/resources/static/json/Stations.json");
        Reader reader2 = Files.newBufferedReader(path);
        List<Stationsdetails> stations = new Gson().fromJson(reader2, new TypeToken<List<Stationsdetails>>() {
        }.getType());

        List<TrajectJson> trajecten = new Gson().fromJson(reader, new TypeToken<List<TrajectJson>>() {
        }.getType());

        for (int i = 0; i < trajecten.size(); i++) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", trajecten.get(i).getId());
            jsonObject.put("naam", trajecten.get(i).getNaam());
            jsonObject.put("beginstation", trajecten.get(i).getBeginstation());
            jsonObject.put("afstand", trajecten.get(i).getAfstand());
            jsonObject.put("reistijd", trajecten.get(i).getReistijd());
            jsonObject.put("reismethode", trajecten.get(i).getReismethode());
            jsonObject.put("prijs", trajecten.get(i).getPrijs());
            jsonObject.put("eindstaiond", trajecten.get(i).getEindstation());
            jsonObject.put("accomodaties", trajecten.get(i).getAccommodaties());
            jsonObject.put("stations", trajecten.get(i).getStations());
            List<Station> stations1 = List.of(trajecten.get(i).getStations());
            for (int b = 0; b < stations1.size(); b++) {
                List<Stationsdetails> stationsdetails=new ArrayList<>();
                for (int a = 0; a < stations.size(); a++) {
                    if (stations.get(a).getId().equals(stations1.get(b).getId())) {
                        stationsdetails.add(stations.get(a));
                    }
                    jsonObject.put("stationdetails", stationsdetails);
                }
            }
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }
}

