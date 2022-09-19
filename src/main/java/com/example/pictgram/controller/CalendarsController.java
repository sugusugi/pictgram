package com.example.pictgram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarsController {
    
    @GetMapping(path = "/calendars")
    private String index(Model model) {
        return "calendars/index";
    }
}
