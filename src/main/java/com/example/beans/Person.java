package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    private String name;

    final private Vehicle vehicle;

    public String getName() {
        return name;
    }
    @Autowired
    public  Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }



}
