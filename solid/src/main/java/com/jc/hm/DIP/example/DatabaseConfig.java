package com.jc.hm.DIP.example;

public class DatabaseConfig {

    private DBConnection dbConnection;

    public DatabaseConfig(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
        this.dbConnection.connect();
    }

    public DBConnection getConnection() {
        return this.dbConnection;
    }
}
