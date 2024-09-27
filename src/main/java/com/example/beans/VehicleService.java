package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.types.Speakers;
import com.example.types.Tyres;

@Component
public class VehicleService {

    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;

    public void playSound() {
        System.out.println(speakers.makeSound());
    }

    public void rotateTyres() {
        System.out.println(tyres.makeRotate());
    }

}
