package com.jc.hm;

import java.awt.*;
import java.util.Date;

public class VariablesAndDataTypesExample {
    public static void main(String[] args) {
        // Primitive data types include boolean, char, byte, short, int, long, float and double.
        byte b = 10; //8 bits
        short s = 20; //2 bytes
        int i = 30; //4 bytes
        long l = 3_123_456_789L; //8 bytes
        float f = 10.99F; //4 bytes
        double d = 1000.50; //8 bytes
        char c = 'M'; //2 bytes (Unicode encoding)
        boolean isBoolean = true; //1 bit (true, false)
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + isBoolean);
        //byte: 10
        //short: 20
        //int: 30
        //long: 3123456789
        //float: 10.99
        //double: 1000.5
        //char: M
        //boolean: true


        // Non-primitive data types include Classes, Interfaces, and Arrays.
        String string = "Hello, World!";
        System.out.println("String: " + string);
        Date now = new Date();
        System.out.println("Date: " + now);
        //String: Hello, World!
        //Date: Fri Sep 20 16:34:43 ICT 2024

        Point point1 = new Point(10, 20);
        Point point2 = point1;
        System.out.println(point1.x + " : " + point1.y);
        System.out.println(point2.x + " : " + point2.y);
        point1.y = 30;
        System.out.println(point1.x + " : " + point1.y);
        System.out.println(point2.x + " : " + point2.y);
        //10 : 20
        //10 : 20
        //10 : 30
        //10 : 30
    }
}
