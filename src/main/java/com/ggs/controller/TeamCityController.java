package com.ggs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamCityController {

    @GetMapping("saySomething")
    public String saySomething() {
        return "hello teamcity~!!!!!!!!!!";
    }

}
