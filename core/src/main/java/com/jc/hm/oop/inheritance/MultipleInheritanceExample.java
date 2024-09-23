package com.jc.hm.oop.inheritance;

/**
 * In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes.
 * Please note that Java does not support multiple inheritances with classes.
 * In Java, we can achieve multiple inheritances only through Interfaces.
 * <p>
 * Why multiple inheritance is not supported in java?
 * -> To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
 */
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.print();
        cc.show();
        cc.display();
        //Printing...
        //Showing...
        //Displaying...
    }
}

interface Printable {
    void print();
}

interface Showable {
    void show();
}

interface PrintableShowable extends Printable, Showable {
    void print();
    void show();
    void display();
}

class ChildClass implements PrintableShowable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void show() {
        System.out.println("Showing...");
    }

    @Override
    public void display() {
        System.out.println("Displaying...");
    }
}