package com.jc.hm;

import java.util.Scanner;

public class ReadingInputFromUserExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);
        System.out.print("Enter your contact number: ");
        double contactNumber = scanner.nextDouble();

        System.out.println("User details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact Number: " + contactNumber);
    }
}
