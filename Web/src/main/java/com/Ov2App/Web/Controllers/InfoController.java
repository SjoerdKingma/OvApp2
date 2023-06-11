package com.Ov2App.Web.Controllers;

import com.Ov2App.Web.Data.DummyData;
import com.Ov2App.Web.Data.Traject;
import com.Ov2App.Web.Model.Info;
import com.Ov2App.Web.Model.Station;
import com.Ov2App.Web.Model.TrajectJson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class InfoController {
    @GetMapping("/info")
    public String infofrom(Model model, @RequestParam(required = false) String lang){
        model.addAttribute("info", new Info());
        model.addAttribute("recommendedTrip", DummyData.getDummyData().get(0));
        ArrayList<TrajectJson> trajectJsons = null;
        try{
            trajectJsons = Traject.gettrajecten();
        }catch(Exception ex){
            System.out.println(ex);
        }

        model.addAttribute("data", trajectJsons);
        model.addAttribute("stations", getUniqueStations(trajectJsons));
        model.addAttribute("info", new Info());
        return "info";
    }

    @PostMapping("/info")
    public String infoSubmit(@ModelAttribute Info info, Model model, @RequestParam(required = false) String lang) {
        if(info.getInputA().equals(info.getInputB())){
            info.setTest("hetzelfde");
        }
        else{
            info.setTest("niet hetzelfde");
        }
        model.addAttribute("info", info);

        model.addAttribute("trips", DummyData.getDummyData());
        model.addAttribute("recommendedTrip", DummyData.getDummyData().get(0));
        return "info";
    }
    private ArrayList<String> getUniqueStations(ArrayList<TrajectJson> trajectJsons){
        ArrayList<String> uniqueStations = new ArrayList<>();
        for (var i = 0; i < trajectJsons.size(); i++) {
            Station[] stations=trajectJsons.get(i).getStations();
            for (var j = 0; j < stations.length; j++) {
                if (!uniqueStations.contains(stations[j].getNaam())){
                    uniqueStations.add(String.valueOf(stations[j].getNaam()));
                }
            }
        }
        return uniqueStations;
    }
    public TrajectJson getinfo(){
        String van="Amersfoort";
        String naar="Utrecht";
        String reismethode="Bus";
        ArrayList<TrajectJson> trajectJsons = null;
        try{
            trajectJsons = Traject.gettrajecten();
        }catch(Exception ex){
            System.out.println(ex);
        }
        TrajectJson Trajectjson= null;
        for (var i = 0; i < trajectJsons.size(); i++) {
            Station[] stations=trajectJsons.get(i).getStations();
            for (var j = 0; j < stations.length; j++) {
                ArrayList<String> uniqueStations = new ArrayList<>();
                uniqueStations.add(stations[j].getNaam());
                if(uniqueStations.contains(van)&&uniqueStations.contains(naar) && trajectJsons.get(i).getReismethode().equals(reismethode)){
                    Trajectjson=trajectJsons.get(i);
                }
            }
        }
        return Trajectjson;
    }
    public ArrayList<TrajectJson> getbeschikbaretrajecten(){
        String van="Amersfoort";
        String naar="Utrecht";
        ArrayList<TrajectJson> trajectJsons = null;
        try{
            trajectJsons = Traject.gettrajecten();
        }catch(Exception ex){
            System.out.println(ex);
        }
        ArrayList<TrajectJson> beschikbaretrajecten = new ArrayList<>();

        for (var i = 0; i < trajectJsons.size(); i++) {
            Station[] stations=trajectJsons.get(i).getStations();
            for (var j = 0; j < stations.length; j++) {
                ArrayList<String> uniqueStations = new ArrayList<>();
                uniqueStations.add(stations[j].getNaam());
                if(uniqueStations.contains(van)&&uniqueStations.contains(naar)){
                    beschikbaretrajecten.add(trajectJsons.get(i));
                }
            }
        }
        return beschikbaretrajecten;
    }
}
