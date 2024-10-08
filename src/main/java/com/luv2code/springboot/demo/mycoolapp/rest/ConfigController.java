package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    @Qualifier("swimCoach")
    private Coach swimCoach;


    @GetMapping("/dailyworkout12")
    public String getDailyWorkout() {
        return swimCoach.getDailyWorkout();
    }


}
