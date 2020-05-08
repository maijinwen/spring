package net.togogo.controller;

import net.togogo.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//@Controller
public class JsonController {

//    @RequestBody接收json串自动转为user对象，@ResponseBody将user转为json数据响应给客户端
    @RequestMapping(value = "json",method = RequestMethod.GET)
//    @ResponseBody
    public User getJson(){
        User user = new User();
        user.setId(2);
        user.setName("撒烦烦");
        return user;
    }

    @GetMapping("jsons")
//    @ResponseBody
    public List<User> getJsons(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setId(2);
        user1.setName("撒烦烦");
        users.add(user1);
        User user2 = new User();
        user2.setId(3);
        user2.setPassword("12345");
        users.add(user2);
        return users;
    }

}
