package com.swust.springbootquick.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello world1");
        System.out.println("hello world2");
        System.out.println("hello world3");
        return "hello world~";
    }
}
