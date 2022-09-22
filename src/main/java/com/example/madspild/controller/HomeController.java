package com.example.madspild.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String index() {
        return "html/index";
    }

    @GetMapping("/aboutus")
    public String aboutus() {
        return "html/aboutus";
    }

    @GetMapping("/home")
    public String home() {
        return "html/index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "html/contact";
    }







}
