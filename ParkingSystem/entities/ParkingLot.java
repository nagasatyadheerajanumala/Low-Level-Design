package com.ParkingSystem.entities;

import com.ParkingSystem.Vehicle.Vehicle;
import com.ParkingSystem.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final List<ParkingLevel> levels;
    public ParkingLot(){
        this.levels = new ArrayList<>();
    }

    public void addLevel(ParkingLevel level) {
        levels.add(level);
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for(ParkingLevel level: levels){
            if(level.parkVehicle(vehicle)){
                System.out.println("Vehicle parked at level " + level.getLevel());
                return true;
            }
        }
        System.out.println("No available spots for vehicle type: " + vehicle.getType());
        return false;
    }

    public int getTotalAvailableSpots(VehicleType type) {
        int count = 0;
        for(ParkingLevel level : levels) {
            count += level.getAvailableSpotCount(type);
        }
        return count;
    }
}
