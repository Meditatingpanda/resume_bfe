package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public String getName() {
        return name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }

    public void setName(String name) {
        this.name = name;
    }

}
