package net.togogo.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Component    最普通的组件，可以被注入到spring容器进行管理
//@Repository	作用于持久层
//@Service	作用于业务逻辑层
//@Controller	作用于表现层（spring-mvc的注解）
@Component
@Aspect
public class AnnotaionAspect {

    @Before(value = "execution(* net.togogo.dao.UserDao.*(..))")
    public void beforeMethod(){
        System.out.println("-------日志记录开始-----");
    }

}
