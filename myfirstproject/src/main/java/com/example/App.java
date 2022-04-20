package com.example;

import com.Person.Student;
import com.Person.Teacher;
import com.Vehicle.Bike;
import com.Vehicle.Car;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Student student = new Student("John", "Doe", 19, 3);
        Teacher teacher = new Teacher("Jane", "Doe", 30, "Bachelor's"); 
    
        Car car = new Car(4, "V6", 500);
        Bike bike = new Bike(2, "Single-cylinder", 32);

        System.out.println("[Person Information]");
        System.out.println(student.getFirst_name() + " " + student.getLast_name() + ", " + student.getAge() + ", and year " + student.getYear() + " student");
        System.out.println(teacher.getFirst_name() + " " + teacher.getLast_name() + ", " + teacher.getAge() + ", and has a " + teacher.getDegree_level() + " degree");
        System.out.println("[Vehicle Information");
        System.out.println("Car with " + car.getNo_wheels() + " wheels, " + car.getEngine() + " engine, and has " + car.getStorage_capacity() + " kg storage capacity");
        System.out.println("Bike with " + bike.getNo_wheels() + " wheels, " + bike.getEngine() + " engine, and has " + bike.getWheelie_power() + " wheelie power");
    }
}