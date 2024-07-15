package com.Telusko.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ApplicationController {
    @RequestMapping("/")
    public String HelloController() {
        System.out.println("Container Called in server....");
        return "index.jsp";
    }

}
