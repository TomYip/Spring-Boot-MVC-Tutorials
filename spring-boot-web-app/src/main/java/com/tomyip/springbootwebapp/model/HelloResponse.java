package com.tomyip.springbootwebapp.model;

public class HelloResponse {
    //NOT THREAD SAFE - JUST ADDING A SIMPLE COUNTER TO DIFFERENTIATE REQUESTS
    private static int counter = 0;

    private final String responseTemplate = "Hello, %s! You are the #%d visitor.";
    private int serialNumber;
    private String name;

    public HelloResponse(String name){
        this.name = name;
        this.serialNumber = counter++;
    }

    public String getResponse(){
        return String.format(responseTemplate, this.name, this.serialNumber);
    }
}
