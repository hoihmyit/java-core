package com.jc.hm.DIP.example;

public class MySQLConnection implements DBConnection {
    @Override
    public void connect() {
        System.out.println("MySQL connected");
    }
}
