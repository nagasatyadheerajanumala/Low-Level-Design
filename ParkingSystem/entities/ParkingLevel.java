package com.ParkingSystem.entities;

import com.ParkingSystem.Vehicle.Vehicle;
import com.ParkingSystem.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLevel {
    private final int levelNumber;
    private final List<ParkingSpot> spots;

    public ParkingLevel(int levelNumber) {
        this.levelNumber = levelNumber;
        spots = new ArrayList<>();
    }

    public void addSpot(ParkingSpot spot) {
        spots.add(spot);
    }

    public ParkingSpot getAvailableSpot(Vehicle vehicle){
        for(ParkingSpot spot: spots){
            if(spot.canFitVehicle(vehicle)){
                return spot;
            }
        }
        return null;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = getAvailableSpot(vehicle);
        return spot!=null && spot.parkVehicle(vehicle);
    }

    public int getAvailableSpotCount(VehicleType type){
        int count = 0;
        for(ParkingSpot spot : spots) {
            if(spot.getType() == type) {
                if(!spot.isOccupied()){
                    count++;
                }
            }
        }
        return count;
    }

    public int getLevel(){
        return levelNumber;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }

}
