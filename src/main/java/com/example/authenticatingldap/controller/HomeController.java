package com.example.authenticatingldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
The entire class is marked up with @RestController so that Spring MVC can autodetect the controller
(by using its built-in scanning features) and automatically configure the necessary web routes.
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "Welcome to the home page";
    }
}
