package com.example.spring.basic_di.d_autowired.bean;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: 10195
 * @Date 2022/4/8 14:05
 */
@Component
public class Person1 {

    private String name="administrator1";

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                '}';
    }
}
