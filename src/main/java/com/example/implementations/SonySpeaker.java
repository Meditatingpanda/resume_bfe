package com.example.implementations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.types.Speakers;
@Component
@Primary
public class SonySpeaker implements Speakers {

    @Override
    public String makeSound() {
        return "Sony speakers make sound";
    }
}
