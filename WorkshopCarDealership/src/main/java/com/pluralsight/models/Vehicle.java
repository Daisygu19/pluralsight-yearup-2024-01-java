package com.pluralsight.models;

import java.util.ArrayList;

public class Vehicle
{
    private int vin;
    private int dealerId;
    private int year;
    private String make;
    private String model;
    private String type;
    private String color;
    private ArrayList<String> vehicle;

    public Vehicle()
    {
        make = "Ford";
        model = "Explorer";
        type = "SUV";
        color = "Red";
        vehicle = new ArrayList<>();

    }
    public Vehicle(int vin, int dealerId, int year, String make, String model, String type, String color, ArrayList<String> vehicle) {
        this.vin = vin;
        this.dealerId = dealerId;
        this.year = year;
        this.make = make;
        this.model = model;
        this.type = type;
        this.color = color;
        Vehicle = vehicle;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getDealerId() {
        return dealerId;
    }

    public void setDealerId(int dealerId) {
        this.dealerId = dealerId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type)
    {
        if (type.equalsIgnoreCase("s")) this.type = "SUV";
        else if (type.equalsIgnoreCase("t")) this.type = "Truck";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
