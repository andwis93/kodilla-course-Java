package com.kodilla.matrix.patterns2.observer.homework;

public class Student extends ExerciseSubmit {
    private final String firstName;
    private final String lastname;
    public Student(String firstName, String lastName) {
        super(firstName + " " + lastName);
        this.firstName = firstName;
        this.lastname = lastName;
    }

}
