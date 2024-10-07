package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
//@Primary the same logic as qualifier
public class FootballCoach implements Coach{

    public FootballCoach(){
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "2-2";
    }

    @Override
    public String isolation() {
        return "Hello World!!";
    }
}
