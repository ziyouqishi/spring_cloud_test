package com.liang.ribbonconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping(value = "ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        //HELLO-SERVICE
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();

    }
}
