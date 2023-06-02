package com.Ov2App.Web.Controllers;


import com.Ov2App.Web.Data.ApiConsumer;
import com.Ov2App.Web.Data.DummyData;
import com.Ov2App.Web.Model.Accommodaties;
import com.Ov2App.Web.Model.Info;
import com.Ov2App.Web.Model.TrajectJson;
import org.json.simple.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class WebApplicationController {
    @GetMapping("/info")
    public String infofrom(Model model){
        model.addAttribute("info", new Info());
        model.addAttribute("selectedTrip", DummyData.getDummyData().get(0));
        return "info";
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

        model.addAttribute("selectedTrip", DummyData.getDummyData().get(0));
        return "info";
    }

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("info", new Info());
        model.addAttribute("selectedTrip", DummyData.getDummyData().get(0));
        return "index";
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