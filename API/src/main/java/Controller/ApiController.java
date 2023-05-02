package com.example.api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/groene")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "reizen") String name) {
        return String.format("groene %s!", name);
    }
}
