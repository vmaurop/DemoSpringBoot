package com.luv2code.springboot.demo.mycoolapp.rest;


import com.luv2code.springboot.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private filed for the dependency
    private Coach myCoach;

    //field injection
//    @Autowired @Qualifier("basketballCoach")
//    private Coach obrandovic;
//
//    // this annotation is optional constructor injection
//    @Autowired
//    public DemoController(@Qualifier("cricketCoach") Coach myCoach) {
//        this.myCoach = myCoach;
//    }

    //setter injection
    @Autowired
    public void setCoach(@Qualifier("footballCoach") Coach theCoach) {
        this.myCoach = theCoach;
    }



    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

//    @GetMapping("/pickandroll")
//    public String getPickAndRoll() {
//        return obrandovic.isolation();
//    }
}
