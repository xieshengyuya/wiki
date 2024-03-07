package com.xie.wiki.controller;

import com.xie.wiki.domain.People;
import com.xie.wiki.service.PeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PeopleController {
    @Resource
    private PeopleService peopleService;

//    @RequestMapping("/myhello")
//    public String hello(){
//        return "Hello SpringBoot";
//    }

    @GetMapping("/people/list")
    public List<People> list(){
        return peopleService.list();
    }
}
