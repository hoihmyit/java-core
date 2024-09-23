package com.jc.hm.oop.abstraction;

public class CurrentAccount extends BankAccount {
    @Override
    void deposit() {
        System.out.println("Deposit in Current Account");
    }

    @Override
    void withdraw() {
        System.out.println("Withdraw from Current Account");
    }

    @Override
    void balance() {
        System.out.println("Balance in Current Account");
    }

    @Override
    void openAccount() {
        System.out.println("Open Current Account");
    }

    @Override
    void closeAccount() {
        System.out.println("Close Current Account");
    }
}
