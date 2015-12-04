package com.github.loafer.demo.cloud.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaojh.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClient {
    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "Eureka Client";
    }

    public static void main(String[] args){
        SpringApplication.run(EurekaClient.class, args);
    }
}
