package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println(" Welcome to Attendance System!");
        System.out.println("==================================");
        System.out.println();
        // Create arrays of Students and Courses
        Student[] students = new Student[3];
        Course[] courses = new Course[2];

        // Initialize and set student details
        students[0] = new Student();
        students[0].setDetails(1, "Alice");

        students[1] = new Student();
        students[1].setDetails(2, "Bob");

        students[2] = new Student();
        students[2].setDetails(3, "Charlie");

        // Initialize and set course details
        courses[0] = new Course();
        courses[0].setDetails(101, "Mathematics");

        courses[1] = new Course();
        courses[1].setDetails(102, "Science");

        // Display Students
        System.out.println("===== Students =====");
        for (Student s : students) {
            s.displayDetails();
        }

        // Display Courses
        System.out.println("===== Courses =====");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}
