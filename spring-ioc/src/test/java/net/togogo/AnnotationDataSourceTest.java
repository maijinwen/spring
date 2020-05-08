package net.togogo;

import net.togogo.annotation.dao.UserDao;
import net.togogo.annotation.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDataSourceTest {

    private ClassPathXmlApplicationContext context;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
    }

    @Test
    public void save(){
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.saveUser();
        context.close();
    }

    @Test
    public void serviceTest(){
        UserService userService = (UserService) context.getBean("userService");
        userService.save();
        context.close();
    }

}
