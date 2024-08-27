package com.luv2code.springboot.demo.mycollapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that retunr hello world

    @GetMapping("/")
    public String sayHello() {
        return "Hello World:";
    }

}
