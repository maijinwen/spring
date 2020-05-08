package net.togogo.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @author 麦锦文
 */
public class ApplicationEventListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        if(event instanceof ContextRefreshedEvent){
            System.out.println("容器刷新了");
        }

        if(event instanceof ContextStartedEvent){
            System.out.println("容器开始了");
        }

        if (event instanceof ContextStoppedEvent){
            System.out.println("容器停止了");
        }

        if(event instanceof ContextClosedEvent){
            System.out.println("容器关闭了");
        }

    }
}
