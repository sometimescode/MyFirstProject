package com.Person;

public class Student extends Person {
    private int year;

    public Student(String first_name, String last_name, int age, int year){
        super(first_name, last_name, age);
        this.year = year;
    }

    //act 2 - used
    public Student(String location, String first_name, String last_name, int age, int year) {
        super(location, first_name, last_name, age);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}