package com.school;

public class Student {
    private int studentId;
    private String name;

    // Method to set details
    public void setDetails(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.name);
        System.out.println("-------------------------");
    }
}
