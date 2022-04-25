package com.Person;
/**
 * Comment!
 */
public class Teacher extends Person {
    /**
 * Comment!
 */
    public String degreeLVL;
    public Teacher(String firstName, String lastName, int age, String location, String travelVehicle, String degreeLVL) {
        super(firstName, lastName, age,location,travelVehicle );
        this.degreeLVL = degreeLVL;
    }
}

