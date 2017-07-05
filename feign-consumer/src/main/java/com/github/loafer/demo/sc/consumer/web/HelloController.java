package com.github.loafer.demo.sc.consumer.web;

import com.github.loafer.demo.sc.consumer.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhaojh.
 */
@RestController
@RequestMapping("feign/hello")
public class HelloController {
    @Resource
    private HelloService helloService;

    @GetMapping
    public String hello(){
        return helloService.hello();
    }

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name){
        return helloService.hello(name);
    }
}
