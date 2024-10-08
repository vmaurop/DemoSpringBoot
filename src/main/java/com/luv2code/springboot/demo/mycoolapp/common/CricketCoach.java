package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy // lazy initialization means when needed for dependency injection or required explicity
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
