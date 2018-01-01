package com.cssweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jcz on 2017/12/31.
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    public String welcome(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT-WELCOME/hello?name=" + name, String.class);
    }


}
