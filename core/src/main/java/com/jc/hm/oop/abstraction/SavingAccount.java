package com.jc.hm.oop.abstraction;

public class SavingAccount extends BankAccount {
    @Override
    void deposit() {
        System.out.println("Deposit in Saving Account");
    }

    @Override
    void withdraw() {
        System.out.println("Withdraw from Saving Account");
    }

    @Override
    void balance() {
        System.out.println("Balance in Saving Account");
    }

    @Override
    void openAccount() {
        System.out.println("Open Saving Account");
    }

    @Override
    void closeAccount() {
        System.out.println("Close Saving Account");
    }
}
