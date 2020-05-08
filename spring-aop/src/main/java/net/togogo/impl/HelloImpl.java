package net.togogo.impl;

import net.togogo.proxy.IHello;

/**
 * @author 麦锦文
 */
public class HelloImpl implements IHello {

    @Override
    public void sayHello(String name){
        System.out.println("你好啊：" + name);
    }

}
