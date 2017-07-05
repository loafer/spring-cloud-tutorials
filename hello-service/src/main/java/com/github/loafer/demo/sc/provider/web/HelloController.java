package com.github.loafer.demo.sc.provider.web;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhaojh.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Resource
    private DiscoveryClient client;

    @GetMapping
    public String hello(){
        ServiceInstance instance = client.getLocalServiceInstance();
        return String.format("Hello, %s:%s:%s", instance.getHost(),instance.getServiceId(),instance.getPort());
    }

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name){
        return String.format("Hello, %s!", name);
    }
}
