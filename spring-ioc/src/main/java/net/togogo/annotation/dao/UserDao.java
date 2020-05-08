package net.togogo.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

/**
 * @author 麦锦文
 */
@Repository("userDao")
public class UserDao {

    @Autowired
    private DataSource dataSource;

    @Value("钱多多")
    private String name;

    @Value("18")
    private Integer age;

    @PostConstruct
    public void UserInit(){
        System.out.println("对象初始化");
    }

    @PreDestroy
    public void UserDestroy(){
        System.out.println("对象销毁了");
    }

    public void saveUser(){
        System.out.println("用户姓名：" + name);
        System.out.println("用户姓名：" + age);
        System.out.println("数据源：" + dataSource);
    }
}
