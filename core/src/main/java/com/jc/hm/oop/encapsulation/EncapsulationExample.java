package com.jc.hm.oop.encapsulation;

/**
 * Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
 * In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
 * Access modifiers are used to restrict the access of variables and methods.
 */
public class EncapsulationExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alan");
        person.setAge(26);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        //Name: Alan
        //Age: 26
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
