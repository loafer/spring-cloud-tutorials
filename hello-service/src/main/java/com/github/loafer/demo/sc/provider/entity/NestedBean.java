package com.github.loafer.demo.sc.provider.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaojh.
 */
public class NestedBean {
    private Integer primitive;
    private Date date;
    private List<Integer> list;
    private List<Date> formattedList;
    private Map<Integer, String> map;

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
}
