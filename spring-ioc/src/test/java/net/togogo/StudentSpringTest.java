package net.togogo;

import net.togogo.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentSpringTest {

    @Test
    public void init(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        Student student = (Student) context.getBean("student");
//        Student student = context.getBean(Student.class);

        //ApplicationContext实现了BeanFactory接口
        Student student = context.getBean("student3", Student.class);
        System.out.println("student = " + student);
        student.sayHello();
    }

    @Test
    public void createBean(){
        //生命周期      读取配置文件的时候对象就已经实例化了
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

    }

    @Test
    public void destroyBean(){
        //视频中说得不对，ApplicationContext是ClassPathXmlApplicationContext实现的接口
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        context.close();
    }
}
