package net.togogo.xmlaspect;

import org.aspectj.lang.JoinPoint;

public class XmlAspect {

    public void beforeMethod(JoinPoint joinPoint){
        System.out.println("被切面时的业务类方法/结合点" +joinPoint.getSignature().getName());
        System.out.println("---------日志记录开始--------");
    }

    public void afterMethod(JoinPoint joinPoint){
        System.out.println("被切面时的业务类方法/结合点" +joinPoint.getSignature().getName());
        System.out.println("---------日志记录结束--------");
    }

}
