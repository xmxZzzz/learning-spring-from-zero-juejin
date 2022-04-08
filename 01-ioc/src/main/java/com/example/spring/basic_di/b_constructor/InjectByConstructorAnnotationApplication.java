package com.example.spring.basic_di.b_constructor;

import com.example.spring.basic_di.b_constructor.bean.Person;
import com.example.spring.basic_di.b_constructor.config.InjectByConstructorConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: 构造器属性注入-注解方式
 * @Author: 10195
 * @Date 2022/3/18 11:09
 */
public class InjectByConstructorAnnotationApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(InjectByConstructorConfiguration.class);
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
