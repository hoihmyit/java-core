package com.jc.hm.operator;

/**
 * Arithmetic operators: Toán tử số học
 */
public class ArithmeticOperatorsExample {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 20;

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus(Remainder): " + (num1 % num2));
        //Addition: 120
        //Subtraction: 80
        //Multiplication: 2000
        //Division: 5
        //Modulus(Remainder): 0

        System.out.println("Post Increment: " + (num1++));
        System.out.println("Pre Increment: " + (++num1));
        //Post Increment: 100
        //Post Increment: 102
        System.out.println("Post Decrement: " + (num1--));
        System.out.println("Pre Decrement: " + (--num1));
        //Post Decrement: 102
        //Pre Decrement: 100
    }
}
