package com.jc.hm.oop.abstraction;

public class Saving implements IBankAccount, IAlanBank {
    @Override
    public void deposit() {
        System.out.println("Deposit in Saving Account");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw from Saving Account");
    }

    @Override
    public void balance() {
        System.out.println("Balance in Saving Account");
    }

    @Override
    public void openAccount() {
        System.out.println("Open Account");
    }

    @Override
    public void closeAccount() {
        System.out.println("Close Account");
    }
}
