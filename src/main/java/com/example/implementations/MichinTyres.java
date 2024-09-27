package com.example.implementations;

import org.springframework.stereotype.Component;

import com.example.types.Tyres;
@Component
public class MichinTyres implements Tyres {

    @Override
    public String makeRotate() {
        return "Michin tyres rotate";
    }
}
