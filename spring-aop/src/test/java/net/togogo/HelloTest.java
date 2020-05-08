package net.togogo;

import net.togogo.impl.HelloImpl;
import org.junit.Test;

public class HelloTest {

    @Test
    public void setHelloTest(){
        HelloImpl hello = new HelloImpl();
        hello.sayHello("麦锦文");
    }

}
