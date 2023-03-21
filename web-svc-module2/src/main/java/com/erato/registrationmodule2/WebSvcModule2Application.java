package com.erato.registrationmodule2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WebSvcModule2Application {
    
    public static void main(String[] args) {
        SpringApplication.run(WebSvcModule2Application.class, args);
    }
    
}
