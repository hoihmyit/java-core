package com.jc.hm.DIP.example;

public class DIPExample {
    public static void main(String[] args) {
        DBConnection conn = new MySQLConnection(); // MySQL connected
        DatabaseConfig config = new DatabaseConfig(conn);
    }
}
