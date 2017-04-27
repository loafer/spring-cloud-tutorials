package com.github.loafer.demo.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaojh.
 */
@SpringBootApplication
@EnableConfigServer
@RestController
public class ConfigServerApplication {

    @RequestMapping("/")
    public String home(){
        return "Hello Spring Cloud Config Server!";
    }

    public static void main(String[] args){
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
