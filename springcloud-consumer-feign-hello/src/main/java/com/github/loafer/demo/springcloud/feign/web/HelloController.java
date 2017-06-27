package com.github.loafer.demo.springcloud.feign.web;

import com.github.loafer.demo.springcloud.feign.entity.User;
import com.github.loafer.demo.springcloud.feign.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhaojh.
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Resource
    private HelloService helloService;

    @RequestMapping(path = "en", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String english(String name){
        return helloService.english(name);
    }

    @RequestMapping(path = "en/bean")
    public String english(User user){
        BeanMap beanMap = BeanMap.create(user);
        return helloService.english(beanMap);
    }

    @RequestMapping(path = "cn", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String chinese(String name){
        return helloService.chinese(name);
    }

    @RequestMapping(path = "cn/bean", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String chinese(User user){
        logger.info("user: {}", user);
        return helloService.chinese(user);
    }
}
