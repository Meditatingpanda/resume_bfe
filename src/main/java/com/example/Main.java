package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.configurations.ProjectConfig;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var Person = context.getBean(Person.class);

        Person.getVehicle().getVehicleService().playSound();
        Person.getVehicle().getVehicleService().rotateTyres();

    }

}
