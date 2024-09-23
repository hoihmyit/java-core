package com.jc.hm.oop.polymorphism;

/**
 * Method Overloading:
 * - This allows to declare multiple methods with the same name but different parameters in same class.
 * - If two or more methods have same name and same parameter list but different in return type can not be overloaded.
 * - Functions can be overloaded by changes in the number of arguments or/and a change in the type of arguments.
 */
public class MethodOverloadingExample {
    public static void main(String[] args) {
        System.out.println(Calculation.addition(10, 20));
        System.out.println(Calculation.addition(10, 20, 30));
        System.out.println(Calculation.addition(10.5, 20.5));
        System.out.println(Calculation.addition(10.5, 20.5, 30.5));
        //30
        //60
        //31.0
        //61.5
    }
}

class Calculation {
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int addition(int a, int b, int c) {
        return a + b + c;
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double addition(double a, double b, double c) {
        return a + b + c;
    }
}
