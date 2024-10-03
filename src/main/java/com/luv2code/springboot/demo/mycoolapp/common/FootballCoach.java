package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "2-2";
    }

    @Override
    public String isolation() {
        return "Hello World!!";
    }
}
