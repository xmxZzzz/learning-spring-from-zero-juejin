package com.example.spring.annotation.b_scan.bean;

import org.springframework.stereotype.Component;

/**
 * @ClassName Person
 * @Description 使用@Component标识向IOC容器中注册的组件，并作为一个Bean
 * @author 10195
 * @date 2021/12/16 11:07
 *
 */
@Component
public class Person {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
