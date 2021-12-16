package com.example.spring.annotation.a_quickstart.bean;

import com.example.spring.annotation.a_quickstart.bean.Person;

/**
 * @author 10195
 * @create 2021/12/16 10:39
 */
public class Cat {
    private String name;
    private Person master;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", master=" + master +
                '}';
    }
}
