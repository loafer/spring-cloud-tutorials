package com.github.loafer.demo.sc.provider.web;

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
}
