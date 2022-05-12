package com.example.spring.basic_di.e_complexfield.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @Description:
 * @Author: 10195
 * @Date 2022/5/12 14:22
 */
@Component
public class Person1 {

    @Value("#{new String[]{'王五','赵六'}}")
    private String[] names;

    @Value("#{{'111','222','333'}}")
    private List<String> tels;

    @Value("#{{@mimi,new com.example.spring.basic_di.e_complexfield.bean.Cat1()}}")
    private Set<Cat1> cats;

    @Value("#{{'咪咪':@mimi,'喵喵':new com.example.spring.basic_di.e_complexfield.bean.Cat1()}}")
    private Map<String,Object> events;

    @Value("#{{'sex':'女','age':'18'}}")
    private Properties props;

    public String[] getNames() {
        return names;
    }

    public List<String> getTels() {
        return tels;
    }

    public Set<Cat1> getCats() {
        return cats;
    }

    public Map<String, Object> getEvents() {
        return events;
    }

    public Properties getProps() {
        return props;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "names=" + Arrays.toString(names) +
                ", tels=" + tels +
                ", cats=" + cats +
                ", events=" + events +
                ", props=" + props +
                '}';
    }
}
