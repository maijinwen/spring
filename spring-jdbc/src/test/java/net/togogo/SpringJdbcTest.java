package net.togogo;


import net.togogo.bean.User;
import net.togogo.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-jdbc.xml"})
public class SpringJdbcTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void saveUser(){
        User user = new User();
        user.setName("大卫田来");
        user.setSex("男");
        userDao.save(user);
    }

}
