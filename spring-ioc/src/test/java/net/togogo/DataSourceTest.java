package net.togogo;

import net.togogo.dao.StudentDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataSourceTest {

    private ClassPathXmlApplicationContext context;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("spring-ioc-datasource.xml");
    }

    @Test
    public void saveStu(){
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
        studentDao.save("学生1");
    }

}
