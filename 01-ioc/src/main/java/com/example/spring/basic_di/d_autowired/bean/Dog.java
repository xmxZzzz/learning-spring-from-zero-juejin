package com.example.spring.basic_di.d_autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: 自动注入的三种方式：@Autowired、构造器注入、setter注入
 * @Author: 10195
 * @Date 2022/4/8 14:06
 */
@Component
public class Dog {

    @Value("dog")
    private String name;

    // 方式一：@Autowired
    // @Autowired
    // @Qualifier("administrator")
    private Person person;

    private Person1 person1;

    public Dog(){
    }

    // 方式二：构造器注入
    // @Autowired
    // public Dog(Person person){
    //     this.person=person;
    // }

    // @Autowired(required = false)
    // public Dog(Person person,Person1 person1){
    //     this.person=person;
    //     this.person1=person1;
    // }

    //方式三：setter注入
    // @Autowired
    // public void setPerson(Person person) {
    //     this.person = person;
    // }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person1 getPerson1() {
        return person1;
    }

    public void setPerson1(Person1 person1) {
        this.person1 = person1;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", person=" + person +
                ", person1=" + person1 +
                '}';
    }
}
