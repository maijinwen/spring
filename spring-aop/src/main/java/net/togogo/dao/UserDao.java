package net.togogo.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

    public void saveUser(String user){
        System.out.println("user = " + user);
    }

}
