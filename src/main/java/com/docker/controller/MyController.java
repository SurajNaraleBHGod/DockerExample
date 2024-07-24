package com.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @ResponseBody
    @GetMapping("/")
    public String hello() {
        return  "Actually I am Doing This For Knowledge Ok Lets See" +
                "What Happense If I Do Like That Something";

    }

    @ResponseBody
    @GetMapping("/go")
    public String go() {
        return "Go To Docker Example";
    }

    @ResponseBody
    @GetMapping("/sayHello")
    public String helloAgain(){
        return "Hello !";
    }

}
