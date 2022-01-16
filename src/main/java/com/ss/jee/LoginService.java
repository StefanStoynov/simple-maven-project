package com.ss.jee;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean isUserValid(String username, String password){
        if ("ss".equals(username) && "pass".equals(password)){
            return true;
        }
        return false;
    }
}
