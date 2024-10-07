package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // lazy initialization means when needed for dependency injection or required explicity
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println(getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice fats bowling for 15 minutes!!!";
    }

    @Override
    public String isolation() {
        return "pop up and dunk!!";
    }

}
