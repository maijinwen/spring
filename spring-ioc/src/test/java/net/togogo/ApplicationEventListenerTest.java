package net.togogo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationEventListenerTest {

    private ClassPathXmlApplicationContext context;

    @Test
    public void init(){
        context = new ClassPathXmlApplicationContext("spring-ioc-listener.xml");
    }

    @Test
    public void listenerTest(){
        //初始化时触发ContextRefreshedEvent事件
        context = new ClassPathXmlApplicationContext("spring-ioc-listener.xml");
        context.start();
        context.refresh();
        context.stop();
        context.close();
    }

}
