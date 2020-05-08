package net.togogo;

import net.togogo.proxy.IHello;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-aop-xmlAspect.xml"})  //单元测试时可以通过这个注解读取
public class XmlAspectTest {

    @Autowired
    IHello iHello;

    @Test
    public void sayHello(){
        iHello.sayHello("抢沙发");
    }

}
