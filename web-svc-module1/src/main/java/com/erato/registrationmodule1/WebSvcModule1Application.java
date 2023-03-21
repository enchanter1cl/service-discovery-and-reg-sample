package com.erato.registrationmodule1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WebSvcModule1Application {
    
    public static void main(String[] args) {
        SpringApplication.run(WebSvcModule1Application.class, args);
    }
    
}
