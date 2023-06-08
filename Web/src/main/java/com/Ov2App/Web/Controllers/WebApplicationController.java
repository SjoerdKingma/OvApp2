package com.Ov2App.Web.Controllers;


import com.Ov2App.Web.Data.ApiConsumer;
import com.Ov2App.Web.Data.Traject;
import com.Ov2App.Web.Model.Info;
import com.Ov2App.Web.Model.Station;
import com.Ov2App.Web.Model.TrajectJson;
import org.json.simple.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class WebApplicationController {

    @GetMapping("/index")
    public ModelAndView index(@RequestParam(required = false) String lang) {
        ModelAndView model = new ModelAndView();

//


        System.out.println(lang);

        return model;

    }

    @GetMapping("/info")
    public String infofrom(Model model){
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

    private ArrayList<String> getUniqueStations(ArrayList<TrajectJson> trajectJsons){
        ArrayList<String> uniqueStations = new ArrayList<>();
        for (var i = 0; i < trajectJsons.size(); i++) {
            Station[] stations=trajectJsons.get(i).getStations();
            for (var j = 0; j < stations.length; j++) {
                if (!uniqueStations.contains(stations[j].naam)){
                    uniqueStations.add(String.valueOf(stations[j].naam));
                }
            }
        }
        return uniqueStations;
    }



    @PostMapping("/info")
    public String infoSubmit(@ModelAttribute Info info, Model model) {
        model.addAttribute("info", info);
        return "info";
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
                uniqueStations.add(stations[j].naam);
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
                uniqueStations.add(stations[j].naam);
                if(uniqueStations.contains(van)&&uniqueStations.contains(naar)){
                    beschikbaretrajecten.add(trajectJsons.get(i));
                }
            }
        }
        return beschikbaretrajecten;
    }
    @RequestMapping("/goodbye")
    public String goodbye(){
        return "Goodbye from Spring Boot";
    }

    @RequestMapping("apiCall")
    public ModelAndView ApiCall(){

        //Initialize result
        JSONArray result = null;

        //Get data
        try{
           result = ApiConsumer.Consume("Trajecten");
        }catch(Exception ex){
            System.out.println("Error fetching data.");
        }

        return new ModelAndView("index");
    }

}