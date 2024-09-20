package com.jc.hm;

/**
 * Final keyword in Java:
 * <p>
 * final keyword is used in different contexts.
 * First of all, final is a non-access modifier applicable only to a variable, a method, or a class.
 * Final variable -> To create constant variables.
 * Final method -> To prevent method overriding.
 * Final class -> To prevent inheritance.
 */
public class FinalKeyword {
    public static void main(String[] args) {
        //Define a constant variable PI
        final double PI = 3.14159;
        System.out.println("Value of PI: " + PI);
        //Value of PI: 3.14159
        //PI = 3.14; => A final variable cannot be re-assign, doing it will throw compile-time error.
    }
}
