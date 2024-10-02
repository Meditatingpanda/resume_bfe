package com.example;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.configurations.ProjectConfig;

public class Main {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            var Person = context.getBean(Person.class);

           System.out.println(Person.getVehicle());
           Person.getVehicle().getVehicleService().playSound();
        } catch (BeansException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
