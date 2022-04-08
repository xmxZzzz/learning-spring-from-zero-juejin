package com.example.spring.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName Blue
 * @Description SpEL注入
 * @author 10195
 * @date 2022/4/8 10:09
 *
 */
@Component
public class Blue {

    @Value("#{'blue-value-byspel'}")
    private String name;

    @Value("#{2}")
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
        return "Blue{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }

}