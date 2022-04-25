package com.Person;
/**
 * Comment!
 */
public class Student extends Person {
    /**
 * Comment!
 */
    public String year;
    public Student(String firstName, String lastName, int age, String year) {
        super(firstName, lastName, age );
        this.year = year;
    }
   
}