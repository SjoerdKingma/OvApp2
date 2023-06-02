package com.Ov2App.Web.Controllers;


import com.Ov2App.Web.Data.ApiConsumer;
import com.Ov2App.Web.Data.Traject;
import com.Ov2App.Web.Model.Info;
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

    @RequestMapping("/info")
    public ModelAndView infofrom(Model model){
        ArrayList<TrajectJson> trajectJsons = null;
        try{
            trajectJsons = Traject.gettrajecten();
        }catch(Exception ex){
            System.out.println(ex);
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", trajectJsons);
        model.addAttribute("info", new Info());


        return modelAndView;

    }

    @PostMapping("/info")
    public String infoSubmit(@ModelAttribute Info info, Model model) {
        if(info.getInputA().equals(info.getInputB())){
            info.setTest("hetzelfde");
        }
        else{
            info.setTest("niet hetzelfde");
        }
        model.addAttribute("info", info);
        return "info";
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