package com.jc.hm.oop.abstraction;

public abstract class AlanBank {
    abstract void openAccount();

    abstract void closeAccount();

    public static void message() {
        System.out.println("Welcome to Alan Bank");
    }
}
