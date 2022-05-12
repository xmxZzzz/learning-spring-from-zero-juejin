package com.example.spring.basic_di.e_complexfield;

import com.example.spring.basic_di.e_complexfield.bean.Cat;
import com.example.spring.basic_di.e_complexfield.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @Author: 10195
 * @Date 2022/5/12 14:34
 */
public class ComplexfieldXMLApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_di/complexfield/inject-complexfield.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person);

        Cat c = (Cat) person.getCats().toArray()[0];
        Cat c1 = (Cat) person.getEvents().get("9:00");
        Cat c2 = (Cat) person.getEvents().get("14:00");
        System.out.println(c==c1);
        System.out.println(c==c2);
    }
}
