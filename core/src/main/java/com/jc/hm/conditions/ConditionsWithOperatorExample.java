package com.jc.hm.conditions;

public class ConditionsWithOperatorExample {
    public static void main(String[] args) {
        boolean isAuthenticated = true;
        boolean isAuthorized = true;
        boolean isOwner = false;

        if (isAuthenticated && isAuthorized && isOwner) {
            System.out.println("User is authenticated, authorized and owner");
        } else {
            System.out.println("User is not authenticated, authorized or owner");
        }
        //User is not authenticated, authorized or owner

        if (isAuthenticated) {
            if (isAuthorized) {
                if (isOwner) {
                    System.out.println("User is authenticated, authorized and owner");
                } else {
                    System.out.println("User is authenticated and authorized but not owner");
                }
            } else {
                System.out.println("User is authenticated but not authorized");
            }
        } else {
            System.out.println("User is not authenticated");
        }
    }
}
