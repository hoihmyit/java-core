package com.jc.hm.conditions;

public class SwitchStatementExample {
    public static void main(String[] args) {
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("The number is 1.");
                break;
            case 2:
                System.out.println("The number is 2.");
                break;
            case 3:
                System.out.println("The number is 3.");
                break;
            default:
                System.out.println("The number is not 1, 2 or 3.");
        }
        //The number is 2.
    }
}
