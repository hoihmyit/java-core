package com.jc.hm.oop.polymorphism;

/**
 * Method Overriding:
 * - In this subclass has the same method as declared in the parent class.
 * - If a subclass provides the specific implementation of a method that has been declared by one of its parent class, it is known as method overriding.
 * - Both superclass and subclass must have the same method name, arguments, and return type.
 * - We cannot override a static and final method.
 * - We should always override abstract methods of the superclass.
 * - The main purpose of the "super' keyword in Java? -> To invoke the superclass's constructor.
 */
public class MethodOverridingExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Alan", 26, "Software Engineer");
        employee.print();
        //Name: Alan
        //Age: 26
        //Tile: Software Engineer
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    String tile;

    public Employee(String name, int age, String title) {
        super(name, age);
        this.tile = title;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Tile: " + tile);
    }
}