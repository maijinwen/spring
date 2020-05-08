package net.togogo.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynaproxyFactory implements InvocationHandler {

    // 接口类对象
    private Object target;

    /**
     * 用来创建代理对象
     *
     * @param target，被代理的对象，目标对象
     * @return
     */
    public Object createProxy(Object target) {
        this.target = target;
        /**
         * Object newProxyInstance(ClassLoader loader,Class<?>[]
         * interfaces,InvocationHandler h) 参数： loader：被代理对象的类加载器(被代理对象的类元对象)，
         * interfaces:被代理对象所实现的接口对应的元对象 h：动态代理处理器 返回值：返回代理对象
         */
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                this);
        return proxy;
    }

    /**
     * 当用户调用目被代理对象目标方法时，该方法被调用，相当于spring aop切面 参数： proxy：代理对象
     * method：被代理对象目标方法元对象 args：被代理对象目标方法的参数值
     */

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 写日志、权限处理、事务处理...
        System.out.println(target.getClass().getName() + " 的 " + method.getName() + " 将被调用...");
        // 调用目标对象对应的方法，返回值是目标方法的返回值
        Object result = method.invoke(target, args);
        System.out.println(target.getClass().getName() + " 的 " + method.getName() + " 调用完毕，目标方法返回值是：" + result);
        return result;
    }

}
