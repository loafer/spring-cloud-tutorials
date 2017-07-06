package com.github.loafer.demo.sc.provider.web;

import com.github.loafer.demo.sc.provider.entity.JavaBean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Date;

/**
 * Created by zhaojh.
 */
@RestController
@RequestMapping("/convert")
public class ConvertController {
    @GetMapping("/primitive")
    public String primitive(Integer value){
        return "Converted primitive " + value;
    }

    @GetMapping("/date/{value}")
    public String date(@PathVariable("value") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date){
        return "Converted date " + date;
    }

    @GetMapping("collection")
    public String collection(@RequestParam Collection<Integer>  values){
        return "Converted collection " + values;
    }

    @GetMapping("formattedCollecion")
    public String formattedCollection(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Collection<Date> values){
        return "Converted formatted collection " + values;
    }

    @GetMapping("bean")
    public String bean(JavaBean bean){
        return "Converted " + bean;
    }
}
