package com.github.loafer.demo.sc.consumer.service;

import com.github.loafer.demo.sc.consumer.entity.JavaBean;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
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

    @RequestMapping("/convert/collection")
    String collection(@RequestParam("values") Collection<Integer> values);

    @RequestMapping("/convert/formattedCollection")
    String formattedCollection(@RequestParam("values") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Collection<Date> values);

    @RequestMapping("/convert/bean")
    String bean(@RequestParam("bean") JavaBean bean);
}
