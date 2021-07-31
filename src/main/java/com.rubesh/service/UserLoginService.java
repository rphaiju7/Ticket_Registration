package com.rubesh.service;

import com.rubesh.beans.Userinfo;
import com.rubesh.dao.Logindao;

import java.util.List;

public class UserLoginService {
    Logindao logindao=new Logindao();

    public Userinfo getUserNames(String username) {
        List<Userinfo> allUsers = logindao.getUser();
        for (Userinfo usr :
                allUsers) {
            if (usr.getUserName().equalsIgnoreCase(username))
                return usr;
        }
        return null;
    }

    public boolean checkUser(Userinfo u, String username, String pass) {
        if (u != null) {
            if (u.getUserName().equalsIgnoreCase(username) && u.getPassword().equals(pass))
                return true;
            }
            return false;
        }
}