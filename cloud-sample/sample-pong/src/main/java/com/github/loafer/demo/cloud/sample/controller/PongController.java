package com.github.loafer.demo.cloud.sample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaojh.
 */
@RestController
public class PongController {
    @Value("${replay.message}")
    private String message;

    @RequestMapping(value = "/message")
    @ResponseBody
    public String pongMessage(){
        return message;
    }
}
