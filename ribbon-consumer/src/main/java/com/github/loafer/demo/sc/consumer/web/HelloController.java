package com.github.loafer.demo.sc.consumer.web;

import com.github.loafer.demo.sc.consumer.service.HelloService;
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
    private HelloService helloService;
    @Resource
    private LoadBalancerClient client;

    private RestTemplate template;

    public HelloController() {
        this.template = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return helloService.hello();
    }

    @RequestMapping(path = "client", method = RequestMethod.GET)
    public String handleWithLoadBalancerClient(){
        return template.getForEntity(serviceUrl() + "/hello", String.class).getBody();
    }

    private String serviceUrl(){
        ServiceInstance instance = client.choose("hello-service");
        return String.format("http://%s:%s", instance.getHost(), instance.getPort());
    }
}
