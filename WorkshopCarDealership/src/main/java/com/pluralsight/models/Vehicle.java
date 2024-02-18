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
    private int miles;
    private ArrayList<String> vehicle;

    public Vehicle(int vin, int dealerId, int year, String make, String model, String type, String color, ArrayList<String> vehicle) {
        this.vin = vin;
        this.dealerId = dealerId;
        this.year = year;
        this.make = make;
        this.model = model;
        this.type = type;
        this.color = color;
        this.miles = miles;
    }

    public int getVin() {
        return vin;
    }

    public int getDealerId() {
        return dealerId;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getMiles() {
        return miles;
    }
}
