package com.github.loafer.demo.sc.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhaojh.
 */
@SpringBootApplication
@EnableEurekaClient
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
