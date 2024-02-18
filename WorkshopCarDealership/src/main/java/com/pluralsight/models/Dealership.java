package com.pluralsight.models;

import java.util.ArrayList;

public class Dealership
{
    private String name;
    private String address;
    private String phone;
    ArrayList<Vehicle> vehicles;

    public Dealership(String name, String address, String phone, ArrayList<Vehicle> vehicles) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehicles; {
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getVehiclesByMakeModel(String make, String model) {
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                matchingVehicles.add(vehicle);
            }
        }
        StringBuilder matchingVehicle = new StringBuilder();
        for (Vehicle vehicle : matchingVehicles) {
            matchingVehicle.append(vehicle.toString()).append(" ");
        }
        return matchingVehicle.toString();
    }

    public  ArrayList<Vehicle> getVehiclesByYear(int year) {
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getYear() == year) {
                matchingVehicles.add(vehicle);
            }
        }
        return matchingVehicles;
    }

    public  ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                matchingVehicles.add(vehicle);
            }
        }
        return matchingVehicles;
    }

    //public  ArrayList<Vehicle> getVehiclesByMileage(int maxMileage) {
        //ArrayList<Vehicle> matchingVehicles = new ArrayList<>();
        //for (Vehicle vehicle : vehicles) {
            //if (vehicle.getMiles() <= maxMileage) {
                //matchingVehicles.add(vehicle);
            //}
        //}
        //return matchingVehicles;
    //}

    public  ArrayList<Vehicle> getVehiclesByType(String type) {
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equalsIgnoreCase(type)) {
                matchingVehicles.add(vehicle);
            }
        }
        return matchingVehicles;
    }

    public  String getAllVehicles() {
        return null;
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    public void removeVehicles(){
    }



}



