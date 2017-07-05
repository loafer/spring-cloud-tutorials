package com.github.loafer.demo.sc.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * Created by zhaojh.
 */
@FeignClient(name = "hello-service")
public interface ConvertService {
    @RequestMapping(path = "/convert/primitive")
    String primitive(@RequestParam("value") Integer value);

    @RequestMapping("/convert/date/{value}")
    String date(@PathVariable("value") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date value);
}
