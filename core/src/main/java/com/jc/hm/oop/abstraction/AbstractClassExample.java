package com.jc.hm.oop.abstraction;

/**
 * Abstract classes:
 * - An abstract class is a class that cannot be instantiated directly.
 * - It serves as a blueprint for other classes and is meant to be subclassed.
 * - An abstract is declared using the "abstract" keyword in its class declaration.
 * - The purpose is to provide a common characteristics that can be shared by multiple subclasses.
 * - An abstract class can have both the regular (non-abstract) methods and abstract methods.
 * - Abstract classes can have instance variables and static variables.
 * - Abstract methods do not have a body and must be implemented by any concrete class that extends the abstract class or implements the interface.
 * - To extend an abstract class we can use the "extends" keyword.
 */
public class AbstractClassExample {
    public static void main(String[] args) {
        AlanBank.message();
        //Welcome to Alan Bank

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.openAccount();
        savingAccount.deposit();
        savingAccount.withdraw();
        savingAccount.balance();
        savingAccount.closeAccount();
        //Open Saving Account
        //Deposit in Saving Account
        //Withdraw from Saving Account
        //Balance in Saving Account
        //Close Saving Account

        System.out.println("====================================");
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.openAccount();
        currentAccount.deposit();
        currentAccount.withdraw();
        currentAccount.balance();
        currentAccount.closeAccount();
        //Open Current Account
        //Deposit in Current Account
        //Withdraw from Current Account
        //Balance in Current Account
        //Close Current Account
    }
}
