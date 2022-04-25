package com.Vehicle;

public class Car extends Vehicle {
    private double storage_capacity;

    public Car(int no_wheels, String engine, double storage_capacity) {
        super(no_wheels, engine);
        this.storage_capacity = storage_capacity;
    }

    //act 2
    public Car(String vehicle_name, int no_wheels, String engine, double storage_capacity, double gas, double gas_consumption) {
        super(vehicle_name, no_wheels, engine, gas, gas_consumption);
        this.storage_capacity = storage_capacity;
    }

    public double getStorage_capacity() {
        return storage_capacity;
    }

    public void setStorage_capacity(double storage_capacity) {
        this.storage_capacity = storage_capacity;
    }
}