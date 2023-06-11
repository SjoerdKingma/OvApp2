package com.Ov2App.Web.Controllers;


import com.Ov2App.Web.Data.ApiConsumer;
import com.Ov2App.Web.Data.DummyData;
import com.Ov2App.Web.Model.Info;
import org.json.simple.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model, @RequestParam(required = false) String lang){
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