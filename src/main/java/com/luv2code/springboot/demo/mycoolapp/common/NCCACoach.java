package com.luv2code.springboot.demo.mycoolapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("nCCACoach")
public class NCCACoach implements Coach {

    public NCCACoach() {
        System.out.println(getClass().getSimpleName());
    }


    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In do my doMyStartupStuff " + getClass().getSimpleName());
    }


    @PreDestroy
    public void doMyCleanUPStuff() {
        System.out.println("In do my doMycleanup " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "4";
    }

    @Override
    public String isolation() {
        return "3";
    }
}
