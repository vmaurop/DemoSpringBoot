package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach {


    public BasketBallCoach() {
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "1-1";
    }

    @Override
    public String isolation() {
        return "let's go";
    }
}
