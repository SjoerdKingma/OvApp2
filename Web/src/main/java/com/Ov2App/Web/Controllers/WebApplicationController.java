package com.Ov2App.Web.Controllers;

import com.Ov2App.Web.Data.ApiConsumer;
import org.json.simple.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.Console;

@Controller
public class WebApplicationController {

    @GetMapping("/index")
    public ModelAndView index(@RequestParam(required = false) String lang) {
        ModelAndView model = new ModelAndView();
        System.out.println(lang);
        return model;

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