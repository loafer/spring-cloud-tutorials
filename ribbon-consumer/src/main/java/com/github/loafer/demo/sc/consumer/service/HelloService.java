package com.github.loafer.demo.sc.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhaojh.
 */
@Component
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    public String hello(){
        return restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
    }
}
