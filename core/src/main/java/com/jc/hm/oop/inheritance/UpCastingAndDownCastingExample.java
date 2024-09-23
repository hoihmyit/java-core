package com.jc.hm.oop.inheritance;

/**
 * Upcasting and downcasting are techniques used to convert objects from one type to another in Java.
 * They are primarily used in the context of inheritance.
 * Upcasting is the process of converting an object of a subclass to a superclass.
 * Downcasting is the process of converting an object of a superclass to a subclass.
 * To avoid ClassCastException, it's often recommended to use the instanceof operator to check if an object is an instance of a particular class before downcasting.
 */
public class UpCastingAndDownCastingExample {
    public static void main(String[] args) {
        System.out.println("Upcasting");
        Vehicle vehicle1 = new Bike();
        vehicle1.drive();
        //Upcasting
        //Driving a bike...

        System.out.println("Downcasting");
        Vehicle vehicle = new Bike();
        Bike bike = (Bike) vehicle;
        bike.drive();
        bike.speedUp();
        //Downcasting
        //Driving a bike...
        //Speeding up...
    }
}

class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle...");
    }
}

class Bike extends Vehicle {
    void drive() {
        System.out.println("Driving a bike...");
    }

    void speedUp() {
        System.out.println("Speeding up...");
    }
}
