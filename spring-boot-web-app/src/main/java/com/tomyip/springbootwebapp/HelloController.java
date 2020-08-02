package com.tomyip.springbootwebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam(value = "name", defaultValue = "World")String name) {
        return String.format("Hello, %s!", name);
    }
}