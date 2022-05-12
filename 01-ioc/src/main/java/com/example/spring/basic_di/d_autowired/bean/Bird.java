package com.example.spring.basic_di.d_autowired.bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: 10195
 * @Date 2022/4/18 15:47
 */
@Component
public class Bird {

    private String name;

    private Integer order;

    @Resource(name = "master")
    private Person person;

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", order=" + order +
                ", person=" + person +
                '}';
    }
}
