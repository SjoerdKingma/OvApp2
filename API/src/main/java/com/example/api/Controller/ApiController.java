package com.example.api.Controller;

import com.example.api.GsonReader;
import com.example.api.Model.Station;
import com.example.api.Model.TrajectJson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
        List<TrajectJson> none= new ArrayList<>();
        ArrayList<TrajectJson>trajecten=getProducts(none);

        JSONArray jsonArray = new JSONArray();
        for(int i = 0; i<trajecten.size(); i++) {
            JSONObject traject= new JSONObject();
            traject.put("id",trajecten.get(i).getId());
            traject.put("naam",trajecten.get(i).getNaam());
            traject.put("beginstation",trajecten.get(i).getBeginstation());
            traject.put("afstand",trajecten.get(i).getAfstand());
            traject.put("reistijd",trajecten.get(i).getReistijd());
            traject.put("reismethode",trajecten.get(i).getReismethode());
            traject.put("prijs",trajecten.get(i).getPrijs());
            traject.put("eindstation",trajecten.get(i).getEindstation());
            jsonArray.add(traject);
        }
        if (jsonArray.size()<1){
            jsonArray.add("nog");
            return jsonArray;
        }
        else
            return jsonArray;
    }

    private ArrayList<TrajectJson> getProducts(List<TrajectJson> trajectJsons) throws IOException {

        //Get products
        ArrayList<TrajectJson> products = new GsonReader().GsonReader();

        return products;
    }

}

