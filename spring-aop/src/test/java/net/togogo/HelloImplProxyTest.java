package net.togogo;

import net.togogo.impl.HelloImpl;
import net.togogo.proxy.HelloImplProxy;
import net.togogo.proxy.IHello;
import org.junit.Test;

public class HelloImplProxyTest {

    @Test
    public void sayHelloTest(){
        IHello hello = new HelloImpl();
        IHello iHello = new HelloImplProxy(hello);
        iHello.sayHello("上了飞机");
    }

}
