package com.ParkingSystem.Vehicle;

public enum VehicleType {
    CAR(1),
    TRUCK(2),
    BIKE(3);
    private final double hourlyRate;

    VehicleType(int value){
        this.hourlyRate = value;
    }
    public double getRate() {
        return hourlyRate;
    }
}
