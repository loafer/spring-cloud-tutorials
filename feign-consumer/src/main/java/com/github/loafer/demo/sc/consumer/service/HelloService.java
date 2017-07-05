package com.github.loafer.demo.sc.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhaojh.
 */
@FeignClient(name = "hello-service")
public interface HelloService {
    @RequestMapping(path = "hello")
    String hello();

    @RequestMapping(path = "/hello/{name}")
    String hello(@PathVariable("name") String name);
}
