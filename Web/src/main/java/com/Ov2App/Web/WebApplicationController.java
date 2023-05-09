package com.Ov2App.Web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApplicationController {

    @GetMapping("/")
    public String getRoot() {
        return "Web Application from Spring Boot";
    }
    @RequestMapping("/goodbye")
    public String goodbye(){
        return "Goodbye from Spring Boot";
    }

}