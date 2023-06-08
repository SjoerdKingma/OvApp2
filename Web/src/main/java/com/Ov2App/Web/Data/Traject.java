package com.Ov2App.Web.Data;

import com.Ov2App.Web.Model.Accommodaties;
import com.Ov2App.Web.Model.Facilities;
import com.Ov2App.Web.Model.Station;
import com.Ov2App.Web.Model.TrajectJson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Traject {

    public static ArrayList<TrajectJson> gettrajecten() throws Exception {
        //Example: "http://localhost:8008/getshoppingcart?ids=1&amount=1"
        JSONArray jsonArray = getTrajectenjso();
        {
            //Fill array with models from the jsonArray
            ArrayList<TrajectJson> trajectJsons = new ArrayList<>();
            for (var x = 0; x < jsonArray.size(); x++) {
                //loop over json array
                var json = (JSONObject) jsonArray.get(x);
                try {
                    Long id= (Long) json.get("id");
                    String naam =  json.get("naam").toString();
                    String beginstation =  json.get("beginstation").toString();
                    double afstand = (double) json.get("afstand");
                    double reistijd = (double) json.get("reistijd");
                    String reismethode =  json.get("reismethode").toString();
                    double prijs = (double) json.get("prijs");
                    String eindstation =  json.get("eindstation").toString();
                    Accommodaties accommodaties = (Accommodaties) json.get("accommodaties");

                    JSONArray  stations = (JSONArray) json.get("stations");
                    Station[] stations2 = new Station[stations.size()];
                    for (var y = 0; y < stations.size(); y++) {
                        var currentStation = (JSONObject) stations.get(y);
                        Long stationId = (Long) currentStation.get("id");
                        String stationsnaam = currentStation.get("naam").toString();
                        Float stationsafstand= (Float) currentStation.get("afstand");
                        Float stationsreistijd= (Float) currentStation.get("reistijd");
                        Float stationsprijs= (Float) currentStation.get("prijs");
                        Facilities facilities= (Facilities) currentStation.get("facilities");
                        Station station=new Station(Math.toIntExact(stationId),stationsnaam,stationsafstand,stationsreistijd,stationsprijs,facilities);
                        stations2[y]=  station;
                    }


                    String kaart = json.get("kaart").toString();
                    // convert to ProductModel
                    //ProductModel product = new ProductModel(id, name, price, count, total);
                    TrajectJson trajectJson=new TrajectJson(Math.toIntExact(id),naam,beginstation,afstand,reistijd,reismethode,prijs,eindstation,accommodaties,stations2,kaart);
                    trajectJsons.add(trajectJson);
                } catch (Exception e) {
                    System.out.println(e);
                    break;
                }
            }
            return trajectJsons;
        }}


    private static JSONArray getTrajectenjso() throws Exception{
        JSONArray response = ApiConsumer.Consume("Trajecten");
        return response;
    }
}