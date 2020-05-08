package net.togogo;

import net.togogo.dynamicproxy.JDKDynaproxyFactory;
import net.togogo.impl.HelloImpl;
import net.togogo.proxy.IHello;
import org.junit.Test;

public class JdkProxyTest {

    @Test
    public void jdkProxyTest(){
        IHello iHello = new HelloImpl();
//        Object proxy = new JDKDynaproxyFactory().createProxy(iHello);
//        if(proxy instanceof IHello i1Hello){  //jdk14新特性
//
//        }
        IHello proxy = (IHello) new JDKDynaproxyFactory().createProxy(iHello);
        proxy.sayHello("你很棒");
    }
}
