package com.zyx;

public class UserService {

    public User getUser(){
        User user = new User();
        user.setName("zyx");
        user.setAge(25);
        return user;
    }
}
