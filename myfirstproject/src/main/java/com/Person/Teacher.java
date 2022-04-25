package com.Person;

public class Teacher extends Person {
    private String degree_level;

    public Teacher(String first_name, String last_name, int age, String degree_level) {
        super(first_name, last_name, age);
        this.degree_level = degree_level;
    }

    //act 2
    public Teacher(String location, String first_name, String last_name, int age, String degree_level) {
        super(location, first_name, last_name, age);
        this.degree_level = degree_level;
    }

    public String getDegree_level() {
        return degree_level;
    }

    public void setDegree_level(String degree_level) {
        this.degree_level = degree_level;
    }
}