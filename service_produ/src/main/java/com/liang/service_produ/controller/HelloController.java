package com.liang.service_produ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloController {
    private final Logger logger=Logger.getLogger("liang");
    @Autowired
    private DiscoveryClient client;
    @RequestMapping("/hello")
    public String index(){
        ServiceInstance instance=client.getLocalServiceInstance();
        logger.info("helloHost:"+instance.getHost()+",service_id:"+instance.getServiceId());
        return "Hello world";
    }
}
