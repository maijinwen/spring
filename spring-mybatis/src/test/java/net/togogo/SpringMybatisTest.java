package net.togogo;

import net.togogo.bean.User;
import net.togogo.dao1.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:spring-mybatis.xml"})
public class SpringMybatisTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void addUserTest(){
        User user = new User();
        user.setName("sffl");
        user.setSex("女");
//        spring容器中已生成代理，我们只需专注于自己的业务逻辑即可
//        代理帮我们完成连接数据库，提交等操作
        userDao.add(user);
    }

}
