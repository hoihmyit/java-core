package com.jc.hm.operator;

/**
 * Arithmetic assignment operators: Toán tử gán số học
 */
public class ArithmeticAssignmentOperatorsExample {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 20;
        int num3;

        num3 = num1;
        System.out.println("num3 = num1: " + num3);
        num1 += num2;
        System.out.println("num1 += num2: " + num1);
        num1 -= num2;
        System.out.println("num1 -= num2: " + num1);
        num1 *= num2;
        System.out.println("num1 *= num2: " + num1);
        num1 /= num2;
        System.out.println("num1 /= num2: " + num1);
        num1 %= num2;
        System.out.println("num1 %= num2: " + num1);
        //num3 = num1: 100
        //num1 += num2: 120
        //num1 -= num2: 100
        //num1 *= num2: 2000
        //num1 /= num2: 100
        //num1 %= num2: 0
    }
}
