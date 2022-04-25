package com.Person;

import java.util.Scanner;

import com.Vehicle.Vehicle;

public class Person {
    private String first_name;
    private String last_name;
    private int age;
    //act 2
    private String location;
    private String travel_vehicle;

    public Person(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    //act 2
    public Person(String first_name, String last_name, int age, String location) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.location = location;
        this.travel_vehicle = "";
    }

    public void travel(Vehicle vehicle) {
        Scanner inputScanner = new Scanner(System.in);
        String newLocation;
        double distance;

        System.out.println(first_name + " " + last_name +
            " is currently in " + location);

        System.out.println("Enter travel location: ");
        newLocation = inputScanner.nextLine();
        System.out.println("Enter distance in km: ");
        distance = inputScanner.nextDouble();

        double gasToUse =  (distance / vehicle.getGas_consumption());
        if(gasToUse < vehicle.getGas()) {
            location = newLocation;
            travel_vehicle = vehicle.getVehicle_name();
            vehicle.setGas(vehicle.getGas() - gasToUse);
        } else {
            System.out.println("You do not have enough gas to cover the distance.");
        }

        inputScanner.close();
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTravel_vehicle() {
        return travel_vehicle;
    }

    public void setTravel_vehicle(String travel_vehicle) {
        this.travel_vehicle = travel_vehicle;
    }

    
}