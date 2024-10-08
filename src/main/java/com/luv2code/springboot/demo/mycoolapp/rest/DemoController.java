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

    private Coach otherCoach;

    private Coach otherCoach1;


    @Autowired
    public void DemoController(@Qualifier("footballCoach") Coach theCoach, @Qualifier("basketBallCoach") Coach theOtherCoach
    , @Qualifier("cricketCoach") Coach theOtherCoach1) {
        myCoach = theCoach;
        otherCoach = theOtherCoach;
        otherCoach1 = theOtherCoach1;
    }


    //field injection
//    @Autowired @Qualifier("basketballCoach")
//    private Coach obrandovic;
//
//    // this annotation is optional constructor injection
//    @Autowired
//    public DemoController(@Qualifier("cricketCoach") Coach myCoach) {
//        this.myCoach = myCoach;
//    }

  //  setter injection
    @Autowired
    public void setCoach(@Qualifier("basketBallCoach") Coach theCoach) {
        myCoach = theCoach;
    }



    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.isolation();
    }


    @GetMapping("/check")   // default singleton instance
    public String getCheckBeansScope() {
        return "Comparing the default scope is Singleton of beans, " + (myCoach == otherCoach)+ " Prototype scope: "+ (myCoach == otherCoach1);
    }

//    @GetMapping("/pickandroll")
//    public String getPickAndRoll() {
//        return obrandovic.isolation();
//    }
}
