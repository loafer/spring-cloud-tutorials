package com.github.loafer.demo.sc.consumer.formatter;

import org.springframework.cloud.netflix.feign.FeignFormatterRegistrar;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Component;

/**
 * Created by zhaojh.
 */
@Component
public class FeignFormatterRegistrarImpl implements FeignFormatterRegistrar {
    @Override
    public void registerFormatters(FormatterRegistry registry) {
        registry.addFormatter(new DateFormatter());
    }
}
