package com.github.loafer.demo.springcloud.feign.service;

import com.github.loafer.demo.springcloud.feign.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author zhaojh.
 */
@FeignClient(name = "hello-service")
public interface HelloService {

    /**
     * 使用GET方式调用服务时，必须在参数列表中使用@RequestParam注解指定传递的参数名
     *
     * @param name
     * @return
     */
    @RequestMapping(path = "api/hello/en")
    String english(@RequestParam("name") String name);


    /**
     * 使用GET方式调用服务传递pojo时，使用Map传递参数
     *
     * @param params
     * @return
     */
    @RequestMapping(path = "api/hello/en/bean")
    String english(@RequestParam Map<String,Object> params);

    /**
     * 1、参数列表中没有使用@RequestParam注解的参数都被放入到request body中，同时Http method为POST
     * 2、服务提供方的参数列表应使用@RequestBody注解指定对应参数
     *
     * @param name
     * @return
     */
    @RequestMapping(path = "api/hello/cn")
    String chinese(String name);

    /**
     * 当使用POST方式传递pojo时，服务提供方的参数列表应使用@RequestBody注解
     *
     * @param user
     * @return
     */
    @RequestMapping(path = "api/hello/cn/bean")
    String chinese(User user);
}
