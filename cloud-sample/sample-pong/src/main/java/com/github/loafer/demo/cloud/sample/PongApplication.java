package com.github.loafer.demo.cloud.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhaojh.
 */
@SpringBootApplication
@EnableEurekaClient
public class PongApplication {
    public static void main(String[] args){
        SpringApplication.run(PongApplication.class, args);
    }
}
