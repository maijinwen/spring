package net.togogo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

    @RequestMapping(value = "first.do",method = RequestMethod.GET)
    public String firstTest(){
        System.out.println("第一个springmvc测试例子");
        return "success";
    }

    @RequestMapping(value = "first1",method = RequestMethod.GET)
    public String first1Test(){
        System.out.println("第一11111个springmvc测试例子");
        return "success1";
    }

    @RequestMapping(value = "say",method = RequestMethod.GET)
    public String sayName(String name){
        System.out.println("name = " + name);
        return "success";
    }

    @RequestMapping(value = "age",method = RequestMethod.GET)
    public String sayAge(int age){
        if (age != 18){
            return "no18";
        }
        return "18";
    }

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String logIn(@RequestParam("name") String username, @RequestParam("pwd") String userpwd){
        System.out.println("name = " + username);
        System.out.println("pwd = " + userpwd);
        return "success";
    }


}
