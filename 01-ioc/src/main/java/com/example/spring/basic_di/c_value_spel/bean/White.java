package com.example.spring.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName White
 * @Description SpEL 方法调用和常量引入
 * @author 10195
 * @date 2022/4/8 10:31
 *
 */
@Component
public class White {

    @Value("#{blue.name.substring(0,3)}")
    private String name;

    @Value("#{T(java.lang.Integer).MAX_VALUE}")
    private Integer order;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "White{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }

}