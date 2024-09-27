package com.example.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Bike {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Bike name --> " + name);
    }

    public void start() {
        System.out.println("Bike started");
    }

    @PostConstruct
    public void init() {
        System.out.println("Bike initialized");
        this.name = "Continental GT 650";
    }
}
