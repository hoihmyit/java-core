package com.jc.hm.OCP.example;

public class UserService {

    private Validator validator;

    public UserService(Validator validator) {
        this.validator = validator;
    }

    public void saveUser() {
        if (this.validator.isValid()) {
            // Do save
        } else {
            // Show error
        }
    }
}
