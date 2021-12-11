package com.example.spring.basic_di.a_quickstart_set;

import com.example.spring.basic_di.a_quickstart_set.bean.Cat;
import com.example.spring.basic_di.a_quickstart_set.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartInjectBySetXmlApplication {
    public static void main(String[] args) {
        BeanFactory context = new ClassPathXmlApplicationContext("basic_di/inject-set.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);

        Cat cat = (Cat) context.getBean("cat");
        System.out.println(cat);

    }
}
