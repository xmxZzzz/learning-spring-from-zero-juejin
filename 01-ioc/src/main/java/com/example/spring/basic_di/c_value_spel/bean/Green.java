package com.example.spring.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName Green
 * @Description SpEL的Bean属性注入
 * @author 10195
 * @date 2022/4/8 10:20
 *
 */
@Component
public class Green {

    @Value("#{'copy of '+blue.name}")
    private String name;

    @Value("#{blue.order+1}")
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
        return "Green{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }

}