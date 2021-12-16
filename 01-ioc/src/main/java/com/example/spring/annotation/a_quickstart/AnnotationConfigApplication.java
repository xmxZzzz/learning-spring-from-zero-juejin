package com.example.spring.annotation.a_quickstart;

import com.example.spring.annotation.a_quickstart.bean.Cat;
import com.example.spring.annotation.a_quickstart.bean.Person;
import com.example.spring.annotation.a_quickstart.config.QuickStartConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 10195
 * @create 2021/12/16 10:31
 */
public class AnnotationConfigApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(QuickStartConfiguration.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);

        Cat cat = context.getBean(Cat.class);
        System.out.println(cat);
    }
}
