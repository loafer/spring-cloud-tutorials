package com.github.loafer.demo.sc.consumer.web;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhaojh.
 */
@RestController
@RequestMapping("/ribbon/hello")
public class HelloController {
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private LoadBalancerClient client;

    private RestTemplate template;

    public HelloController() {
        this.template = new RestTemplate();
    }

    @RequestMapping(path = "resttemplate",method = RequestMethod.GET)
    public String hello(){
        return restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
    }

    @RequestMapping(path = "client", method = RequestMethod.GET)
    public String hello2(){
        return template.getForEntity(serviceUrl() + "/hello", String.class).getBody();
    }

    private String serviceUrl(){
        ServiceInstance instance = client.choose("hello-service");
        return String.format("http://%s:%s", instance.getHost(), instance.getPort());
    }
}
