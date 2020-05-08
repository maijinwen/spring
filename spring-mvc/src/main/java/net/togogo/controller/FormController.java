package net.togogo.controller;

import net.togogo.bean.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class FormController {

    @InitBinder
    public void initStringToDate(HttpServletRequest request, ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }

    @RequestMapping(value = "getUserInfo",method = RequestMethod.GET)
    public String getUserInfo(){
        return "userinfo";
    }

    //表单对象 自动将请求参数绑定到功能处理方法的命令/表单对象上
    @RequestMapping(value = "handleForm",method = RequestMethod.POST)
    public String saveUser(User user){
        System.out.println("user = " + user);
        return "success";
    }
}
