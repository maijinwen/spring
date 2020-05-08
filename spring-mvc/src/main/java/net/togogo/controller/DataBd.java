package net.togogo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DataBd {

//    Model利用其addAttribute()方法即可将服务器的值传递到jsp页面中；
//    在jsp页面利${books}即可取出其中的值
//    {×××}占位符，请求的URL可以是“/useredit/001”或“/useredit/abc”，通过在方法中使用@PathVariable获取{×××}中的×××变量。
    @RequestMapping(value = "info/{id}",method = RequestMethod.GET)
    public String sayInfo(@PathVariable int id, Model model){
//        System.out.println("id = " + id);
        model.addAttribute("username","钱多多");
        return "info";
    }

    @RequestMapping(value = "info/{id}/{groupid}",method = RequestMethod.GET)
    public String sayInfoTwo(@PathVariable int id,@PathVariable int groupid, Model model){
        model.addAttribute("username","钱多多");
        return "info";
    }

//    提交方式错误警告
    @RequestMapping(value = "info1/{id}",method = RequestMethod.POST)
    public String sayInfoThree(@PathVariable int id, Model model){
        model.addAttribute("username","钱多多");
        return "info";
    }
}
