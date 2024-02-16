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
}
