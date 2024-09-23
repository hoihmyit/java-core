package com.jc.hm.oop.abstraction;

public interface IAlanBank {
    void openAccount();
    void closeAccount();

    default void welcome() {
        System.out.println("Welcome to Alan Bank!");
    }
}
