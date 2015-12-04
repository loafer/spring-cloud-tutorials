package com.github.loafer.demo.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhaojh.
 */
@SpringBootApplication
@RestController
public class Application implements CommandLineRunner{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private Environment env;

    @Override
    public void run(String... strings) throws Exception {
        logger.info("====> server.port: {}", env.getProperty("server.port"));
        logger.info("====> info.component: {}", env.getProperty("info.component"));
    }

    @RequestMapping("/")
    @ResponseBody
    public String Hello(@RequestParam(value = "name", defaultValue = "Spring Cloud") String name){
        return "Hello, " + name + '!';
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
