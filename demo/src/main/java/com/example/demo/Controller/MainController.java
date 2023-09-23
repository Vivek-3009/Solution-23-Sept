package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.TimeToWords;

@RestController
public class MainController {
    @Autowired
    TimeToWords timeToWords;
    
    @GetMapping("/convert/{time}")
    public String convertTimeToWords(@PathVariable("time") String time){
        return timeToWords.checkTime(time);
    }
    
}
