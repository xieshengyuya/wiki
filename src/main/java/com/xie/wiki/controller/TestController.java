package com.xie.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/myhello")
    public String hello(){
        return "Hello SpringBoot";
    }
}
