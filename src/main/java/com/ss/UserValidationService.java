package com.ss;

public class UserValidationService {

    public boolean isUserValid(String username, String password){
        if ("ss".equals(username) && "pass".equals(password)){
            return true;
        }
        return false;
    }
}
