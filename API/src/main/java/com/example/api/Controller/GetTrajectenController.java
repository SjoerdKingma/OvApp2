package com.example.api.Controller;

import com.example.api.GsonReader;
import com.example.api.Model.Accommodaties;
import com.example.api.Model.Station;
import com.example.api.Model.TrajectJson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GetTrajectenController {

    @RequestMapping("/trajecten")
    public JSONArray returnJSONData() throws IOException {
        JSONObject traject = new JSONObject();
        JSONArray trajectjsonlist = new JSONArray();

        TrajectJson.SortValue sortValue = TrajectJson.SortValue.NAME;
        ArrayList<TrajectJson> trajecten = getTrajecten(sortValue);

        for (int i = 0; i < trajecten.size(); i++) {
            traject = new JSONObject();
            traject.put("id", trajecten.get(i).getId());
            traject.put("naam", trajecten.get(i).getNaam());
            traject.put("beginstation", trajecten.get(i).getBeginstation());
            traject.put("afstand", trajecten.get(i).getAfstand());
            traject.put("reistijd", trajecten.get(i).getReistijd());
            traject.put("prijs", trajecten.get(i).getPrijs());
            traject.put("eindstation", trajecten.get(i).getEindstation());
            traject.put("accommodaties", trajecten.get(i).getAccommodaties());
            traject.put("stations", trajecten.get(i).getStations());
            traject.put("kaart", trajecten.get(i).getKaart());
            trajectjsonlist.add(traject);
        }
        return trajectjsonlist;
    }

    private ArrayList<TrajectJson> getTrajecten(TrajectJson.SortValue sortValue) throws IOException {

        //Get products
        ArrayList<TrajectJson> trajecten = new GsonReader().GsonReader();

        //Apply filter

        //Return products
        return trajecten;
    }

}
