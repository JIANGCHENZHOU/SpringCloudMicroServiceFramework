package com.cssweb.controller;

import com.cssweb.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jcz on 2017/12/31.
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value="/hello")
    public String home(@RequestParam String name){
        return helloService.welcome(name);
    }
}
