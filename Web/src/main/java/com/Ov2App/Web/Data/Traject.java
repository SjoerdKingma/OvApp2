package com.Ov2App.Web.Data;

import com.Ov2App.Web.Model.Accommodaties;
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
                var stations = json.get("stations");
                List<Station> station1 =new ArrayList<Station>();
                station1.add((Station) stations);

                String Kaart = json.get("Kaart").toString();
                // convert to ProductModel
                //ProductModel product = new ProductModel(id, name, price, count, total);
                TrajectJson trajectJson=new TrajectJson(id,naam,beginstation,afstand,reistijd,reismethode,prijs,eindstation,accommodaties, station1,Kaart);
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
