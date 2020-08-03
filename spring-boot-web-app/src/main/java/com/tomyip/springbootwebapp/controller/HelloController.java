package com.tomyip.springbootwebapp.controller;

import com.tomyip.springbootwebapp.model.HelloResponse;
import com.tomyip.springbootwebapp.model.Person;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
public class HelloController {
    @GetMapping("/hello")
    public String index(@RequestParam(value = "name", defaultValue = "World")String name) {
        log.info(String.format("Received GET request with name '%s'", name));
        return new HelloResponse(name).getResponse();
    }

    @PostMapping(value = "person")
    public ResponseEntity<Person> AddPerson(@RequestBody Person person){
        log.info(String.format("Received POST request with name '%s'", person.getName()));
        return new ResponseEntity<Person>(person, HttpStatus.CREATED);
    }
}