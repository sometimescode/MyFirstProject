package com.Vehicle;

public class Vehicle {
    private int no_wheels;
    private String engine;

    public Vehicle(int no_wheels, String engine) {
        this.no_wheels = no_wheels;
        this.engine = engine;
    }

    public int getNo_wheels() {
        return no_wheels;
    }

    public void setNo_wheels(int no_wheels) {
        this.no_wheels = no_wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }    
}