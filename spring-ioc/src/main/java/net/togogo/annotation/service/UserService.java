package net.togogo.annotation.service;

import net.togogo.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 麦锦文
 */
@Repository("userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    public void save(){
        userDao.saveUser();
    }

    @PostConstruct
    public void UserInit(){
        System.out.println("service对象初始化");
    }

    @PreDestroy
    public void UserDestroy(){
        System.out.println("service对象销毁了");
    }

}
