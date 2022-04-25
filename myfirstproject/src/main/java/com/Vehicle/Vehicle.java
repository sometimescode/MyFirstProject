package com.Vehicle;

public class Vehicle {
    private int no_wheels;
    private String engine;
    private double gas;
    private double gas_consumption;
    private String vehicle_name;

    public Vehicle(int no_wheels, String engine) {
        this.no_wheels = no_wheels;
        this.engine = engine;
    }

    //act 2
    public Vehicle(String vehicle_name, int no_wheels, String engine, double gas, double gas_consumption) {
        this.no_wheels = no_wheels;
        this.engine = engine;
        this.gas = gas;
        this.gas_consumption = gas_consumption;
        this.vehicle_name = vehicle_name;
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

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getGas_consumption() {
        return gas_consumption;
    }

    public void setGas_consumption(double gas_consumption) {
        this.gas_consumption = gas_consumption;
    }

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }
}