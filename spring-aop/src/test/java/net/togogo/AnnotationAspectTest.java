package net.togogo;

import net.togogo.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-aop-annotationAspect.xml")
public class AnnotationAspectTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void saveUser(){
        userDao.saveUser("媚媚吗");
    }

}
