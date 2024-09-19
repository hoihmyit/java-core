package com.jc.hm.OCP.example;

public class OCPExample {
    public static void main(String[] args) {
        UserService userService1 = new UserService(new UserValidator1());
        UserService userService2 = new UserService(new UserValidator2());
    }
}
