package com.fz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {





    @ResponseBody
    @RequestMapping("test")
    public String test(){
        System.out.println("'test,进来俩了");
        return "test,ok";
    }

}
