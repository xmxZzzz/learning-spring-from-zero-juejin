package com.example.spring.basic_dl.b_bytype;

import com.example.spring.basic_dl.b_bytype.bean.Person;
import com.example.spring.basic_dl.b_bytype.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartByTypeApplication {
    public static void main(String[] args) {
        BeanFactory context = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person);

        DemoDao demoDao = (DemoDao) context.getBean("demoDao");
        System.out.println(demoDao.findAll().toString());
    }
}
