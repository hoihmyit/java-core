package com.jc.hm.oop;

import java.util.Scanner;

public class ClassesAndObjectsExample {
    public static void main(String[] args) {
        // Create an object of Class Student
        Student student = new Student();
        student.acceptDetails();
        student.displayDetails();
        //Enter student id: 101
        //Enter student name: Alan
        //Enter student age: 26
        //Student id: 101
        //Student name: Alan
        //Student age: 26
    }
}

class Student {
    // Create a class attribute
    int studentId;
    String studentName;
    int studentAge;
    Scanner scanner = new Scanner(System.in);

    // Member methods
    public void acceptDetails() {
        System.out.print("Enter student id: ");
        studentId = scanner.nextInt();
        System.out.print("Enter student name: ");
        studentName = scanner.next();
        System.out.print("Enter student age: ");
        studentAge = scanner.nextInt();
    }

    public void displayDetails() {
        System.out.println("Student id: " + studentId);
        System.out.println("Student name: " + studentName);
        System.out.println("Student age: " + studentAge);
    }
}
