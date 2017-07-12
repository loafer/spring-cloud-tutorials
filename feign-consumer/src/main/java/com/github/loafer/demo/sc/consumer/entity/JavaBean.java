package com.github.loafer.demo.sc.consumer.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.loafer.demo.sc.consumer.formatter.DateJsonSerializer;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaojh.
 */
public class JavaBean {
    private Integer primitive;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date date;
    private List<Integer> list;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private List<Date> formattedList;
    private Map<Integer, String> map;
    private NestedBean nested;

    public Integer getPrimitive() {
        return primitive;
    }

    public void setPrimitive(Integer primitive) {
        this.primitive = primitive;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public List<Date> getFormattedList() {
        return formattedList;
    }

    public void setFormattedList(List<Date> formattedList) {
        this.formattedList = formattedList;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public NestedBean getNested() {
        return nested;
    }

    public void setNested(NestedBean nested) {
        this.nested = nested;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("JavaBean ");
        if(primitive != null){
            builder.append(" primitive=").append(primitive);
        }

        if(date != null){
            builder.append(" date=").append(date);
        }

        if(list != null){
            builder.append(" list=").append(list);
        }

        if(formattedList != null){
            builder.append(" formattedList=").append(formattedList);
        }

        if(map != null){
            builder.append(" map=").append(map);
        }
        return builder.toString();
    }
}
