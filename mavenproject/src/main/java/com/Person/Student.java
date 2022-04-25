package com.Person;
/**
 * Comment!
 */
public class Student extends Person {
    /**
 * Comment!
 */
    public String year;
    public Student(String firstName, String lastName, int age, String location, String travelVehicle, String year) {
        super(firstName, lastName, age,location,travelVehicle );
        this.year = year;
    }
   
}