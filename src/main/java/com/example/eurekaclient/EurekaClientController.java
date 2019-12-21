package com.example.eurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @RequestMapping("eureka-client/sayHello")
    public String sayHello(){
        return "Eureka Client: Hello";
    }
}
