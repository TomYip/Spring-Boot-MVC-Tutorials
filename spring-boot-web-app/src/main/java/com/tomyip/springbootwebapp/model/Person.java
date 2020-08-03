package com.tomyip.springbootwebapp.model;

import java.util.UUID;

public class Person {
    private UUID uuid;
    private String name;

    public Person(){}

    public Person(String name){
        this.uuid = java.util.UUID.randomUUID();
    }

    public UUID getUuid(){
        return uuid;
    }

    public String getName(){
        return name;
    }
}
