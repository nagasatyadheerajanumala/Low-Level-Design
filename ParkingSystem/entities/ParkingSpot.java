package com.ParkingSystem.entities;

import com.ParkingSystem.Vehicle.Vehicle;
import com.ParkingSystem.Vehicle.VehicleType;

public class ParkingSpot {
    private final String spotId;
    private final VehicleType type;
    private boolean isOccupied;
    private Vehicle parkedVehicle;

    public ParkingSpot(String spotId, VehicleType supportedType) {
        this.spotId = spotId;
        this.type = supportedType;
        isOccupied = false;
        parkedVehicle = null;
    }

    public String getSpotId() {
        return spotId;
    }

    public VehicleType getType() {
        return type;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public boolean isAvailable(){
        return !isOccupied;
    }

    public boolean parkVehicle(Vehicle vehicle){
        if(canFitVehicle(vehicle)) {
            isOccupied = true;
            parkedVehicle = vehicle;
            return true;
        }
        return false;
    }

    public void removeVehicle(Vehicle vehicle ){
        isOccupied = false;
        parkedVehicle = null;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return !isOccupied && vehicle.getType()==type;
    }
}
