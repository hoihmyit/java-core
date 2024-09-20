package com.jc.hm;

public class TypeCastingExample {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue = intValue; // Implicit type casting from int to long
        double doubleValue = longValue; // Implicit type casting from long to double

        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("double: " + doubleValue);
        //int: 10
        //long: 10
        //double: 10.0


        double doubleValue2 = 200.5;
        int intValue2 = (int) doubleValue2; // Explicit type casting from double to int
        byte byteValue = (byte) intValue2; // Explicit type casting from int to byte

        System.out.println("double: " + doubleValue2);
        System.out.println("int: " + intValue2);
        System.out.println("byte: " + byteValue);
        //double: 200.5
        //int: 200
        //byte: -56
    }
}
