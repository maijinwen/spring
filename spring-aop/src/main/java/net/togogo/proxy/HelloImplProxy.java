package net.togogo.proxy;

import net.togogo.impl.HelloImpl;

/**
 * 代理类
 * @author 麦锦文
 */
public class HelloImplProxy implements IHello {

    private IHello hello;

    public HelloImplProxy(IHello hello) {
        this.hello = hello;
    }

    @Override
    public void sayHello(String name) {
        System.out.println("----日志记录之前----");
        hello.sayHello(name);
        System.out.println("----日志记录之后----");
    }
}
