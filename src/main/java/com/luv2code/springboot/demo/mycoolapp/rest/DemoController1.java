package com.luv2code.springboot.demo.mycoolapp.rest;


import com.luv2code.springboot.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController1 {

    // define a private filed for the dependency
    @Autowired
    @Qualifier("nCCACoach")
    private Coach nccaCoach;



    @GetMapping("/check1")   // default singleton instance
    public String getCheckBeansScope() {
        return "RIk Pitino: "+ nccaCoach.isolation();
    }




}
