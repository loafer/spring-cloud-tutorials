package com.github.loafer.demo.sc.consumer.web;

import com.github.loafer.demo.sc.consumer.service.ConvertService;
import com.github.loafer.demo.sc.consumer.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhaojh.
 */
@RestController
@RequestMapping("/feign/convert")
public class CustomerConvertController {
    private static final Logger logger = LoggerFactory.getLogger(CustomerConvertController.class);
    @Autowired
    private ConvertService convertService;


    @GetMapping("/primitive")
    public String primitive(Integer value){
        logger.info("value: {}", value);
        return convertService.primitive(value);
    }

    @RequestMapping("/date/{value}")
    public String date(@PathVariable("value") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date value){
        return convertService.date(value);
    }
}
