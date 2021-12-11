package com.example.spring.basic_di.a_quickstart_set.bean;

public class Cat {
    private String name;
    private String type;
    private Person master;

    public Cat() {
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", master=" + master +
                '}';
    }
}
