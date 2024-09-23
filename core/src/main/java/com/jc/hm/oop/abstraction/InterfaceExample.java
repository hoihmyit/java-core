package com.jc.hm.oop.abstraction;

/**
 * An interface is a blueprint of a class. It has static constants and abstract methods only.
 * An interface contains variables and methods.
 * An interface is a mechanism to achieve abstraction.
 * By interface, we can support the functionality of multiple inheritance.
 * An interface also represents the IS-A relationship.
 * To implement an interface we use the keyword “implements” with class.
 */
public class InterfaceExample {
    public static void main(String[] args) {
        Saving saving = new Saving();
        saving.welcome();
        saving.openAccount();
        saving.deposit();
        saving.withdraw();
        saving.balance();
        saving.closeAccount();
        //Welcome to Alan Bank!
        //Open Account
        //Deposit in Saving Account
        //Withdraw from Saving Account
        //Balance in Saving Account
        //Close Account
    }
}
