package com.example.demo.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static{
        users.add(new User(1,"Erfan","Eft"));
        users.add(new User(2,"Somayeh","Ezt"));

    }
    public List<User> findAll(){
        return users;
    }

}
