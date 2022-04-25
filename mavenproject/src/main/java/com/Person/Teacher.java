package com.Person;
/**
 * Comment!
 */
public class Teacher extends Person {
    /**
 * Comment!
 */
    public String degreeLVL;
    public Teacher(String firstName, String lastName, int age, String degreeLVL) {
        super(firstName, lastName, age );
        this.degreeLVL = degreeLVL;
    }
}

