package com.example.implementations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.types.Tyres;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {

    @Override
    public String makeRotate() {
        return "Bridge stone tyres rotate";
    }
}
