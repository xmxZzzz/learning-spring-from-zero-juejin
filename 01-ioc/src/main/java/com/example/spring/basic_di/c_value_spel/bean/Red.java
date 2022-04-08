package com.example.spring.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName Red
 * @Description 引入properties外部文件
 * @author 10195
 * @date 2022/4/2 15:03
 *
 */
@Component
public class Red {

    @Value("${red.name}")
    private String name;

   @Value("${red.order:1}")
    private Integer order;

    @Override
    public String toString() {
        return "Black{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }

    // getter、setter用于xml
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
}