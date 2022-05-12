package com.example.spring.basic_di.e_complexfield.bean;

import java.util.*;

/**
 * @Description:
 * @Author: 10195
 * @Date 2022/5/12 14:22
 */
public class Person {
    private String[] names;
    private List<String> tels;
    private Set<Cat> cats;
    private Map<String,Object> events;
    private Properties props;

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public List<String> getTels() {
        return tels;
    }

    public void setTels(List<String> tels) {
        this.tels = tels;
    }

    public Set<Cat> getCats() {
        return cats;
    }

    public void setCats(Set<Cat> cats) {
        this.cats = cats;
    }

    public Map<String, Object> getEvents() {
        return events;
    }

    public void setEvents(Map<String, Object> events) {
        this.events = events;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", tels=" + tels +
                ", cats=" + cats +
                ", events=" + events +
                ", props=" + props +
                '}';
    }
}
