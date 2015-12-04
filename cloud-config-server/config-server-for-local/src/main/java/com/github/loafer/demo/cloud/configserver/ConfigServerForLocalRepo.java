package com.github.loafer.demo.cloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author zhaojh.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerForLocalRepo {
    public static void main(String[] args){
        SpringApplication.run(ConfigServerForLocalRepo.class, args);
    }
}
