package com.jc.hm.DIP.example;

public class PostgreSQLConnection implements DBConnection {
    @Override
    public void connect() {
        System.out.println("PostgreSQL connected");
    }
}
