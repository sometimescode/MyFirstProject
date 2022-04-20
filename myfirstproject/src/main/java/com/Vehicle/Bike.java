package com.Vehicle;

public class Bike extends Vehicle {
    private double wheelie_power;

    public  Bike(int no_wheels, String engine, double wheelie_power) {
        super(no_wheels, engine);
        this.wheelie_power = wheelie_power;
    }

    public double getWheelie_power() {
        return wheelie_power;
    }

    public void setWheelie_power(double wheelie_power) {
        this.wheelie_power = wheelie_power;
    }    
}