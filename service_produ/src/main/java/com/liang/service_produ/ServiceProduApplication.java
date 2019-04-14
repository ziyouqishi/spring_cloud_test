package com.liang.service_produ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProduApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProduApplication.class, args);
    }

}
