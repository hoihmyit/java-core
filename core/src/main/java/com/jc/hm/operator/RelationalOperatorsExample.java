package com.jc.hm.operator;

/**
 * Relational operators: Toán tử quan hệ
 */
public class RelationalOperatorsExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        int num3 = 8;

        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));
        System.out.println("num1 == num3: " + (num1 == num3));
        System.out.println("num1 != num3: " + (num1 != num3));
        //num1 > num2: true
        //num1 < num2: false
        //num1 >= num2: true
        //num1 <= num2: false
        //num1 == num3: false
        //num1 != num3: true
    }
}
