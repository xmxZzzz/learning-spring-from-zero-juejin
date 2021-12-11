package com.example.spring.basic_dl.a_quickstart_byname;

import com.example.spring.basic_dl.a_quickstart_byname.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartByNameApplication {
    public static void main(String[] args) {
        BeanFactory context = new ClassPathXmlApplicationContext("basic_dl/quickstart-byname.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
