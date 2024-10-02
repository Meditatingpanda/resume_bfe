package com.example.implementations;

import com.example.annotations.LogExecutionTime;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.types.Speakers;
@Component
@Primary
public class SonySpeaker implements Speakers {

    @Override
    @LogExecutionTime
    public String makeSound() {
        return "Sony speakers make sound";
    }
}
