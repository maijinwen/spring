package net.togogo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RedirectAndForward {

//    http://localhost:8080/test/redirect?name=sf
    @RequestMapping(value = "redirect",method = RequestMethod.GET)
    public String redirect(String name){
        System.out.println("beforename = " + name);
        //重定向之后就是新的request和response，转发redirectandforward会被中央控制器拦截，找到他的映射
        //而不是当作一个jsp
//        return "redirect:WEB-INF/jsp/redirectandforward.jsp"; //新的request和response无法直接访问到,相当于从外部(浏览器)进入
//        return "redirect:welcome.jsp";  //这可以直接访问到
        return "redirect:redirectandforward";
//        return "redirect:https://wwww.baidu.com"; //http://localhost:8080/test/redirect
    }

    @RequestMapping(value = "redirectandforward",method = RequestMethod.GET)
    public String redirectAndForwardJsp(String name){
        System.out.println("aftername = " + name);
        return "redirectandforward";
    }

//    http://localhost:8080/test/forward?name=sf
    @RequestMapping(value = "forward",method = RequestMethod.GET)
    public String forward(String name){
        System.out.println("name = " + name);
        return "forward:redirectandforward";    //共用一个request和response。所以转发前请求的参数在转发后仍然可以读取到。
//        return "forward:WEB-INF/jsp/redirectandforward.jsp";  //可以直接访问到,因为是同一个request和response,相当于从内部进入
    }
}
