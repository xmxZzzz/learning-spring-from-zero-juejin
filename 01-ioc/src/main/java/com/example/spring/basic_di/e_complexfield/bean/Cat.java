package com.example.spring.basic_di.e_complexfield.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: 10195
 * @Date 2022/5/12 14:27
 */

public class Cat {
    private String name="cat";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
