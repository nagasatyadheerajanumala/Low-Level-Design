package com.ParkingSystem.Vehicle;

public abstract class Vehicle {
    private final String licenceNumber;
    private final VehicleType type;

    public Vehicle(String licenceNumber, VehicleType type) {
        this.licenceNumber = licenceNumber;
        this.type = type;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public VehicleType getType() {
        return type;
    }
}
