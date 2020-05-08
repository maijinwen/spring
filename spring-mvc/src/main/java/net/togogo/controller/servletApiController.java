package net.togogo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class servletApiController {

    @RequestMapping(value = "api",method = RequestMethod.GET)
    public String getApi(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        System.out.println("request = " + request);
        System.out.println("response = " + response);
        System.out.println("session = " + session);
        return "success";
    }

    @RequestMapping(value = "api1",method = RequestMethod.GET)
    public String getApi1(HttpServletRequest request, HttpServletResponse response){
        System.out.println("request = " + request);
        HttpSession session = request.getSession();
        System.out.println("session = " + session);
        ServletContext servletContext = session.getServletContext();
        System.out.println("servletContext = " + servletContext);
        System.out.println("response = " + response);
        return "success";
    }
}
