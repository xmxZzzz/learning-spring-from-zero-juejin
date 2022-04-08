package com.example.spring.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: 使用@value实现属性注入，代替了setter方法
 * @Author: 10195
 * @Date 2022/3/18 14:43
 */
@Component
public class Black {

    @Value("black-value-anno")
    private String name;

    @Value("0")
    private Integer order;

    @Override
    public String toString() {
        return "Black{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}