package com.example.spring.annotation.c_importxml;

import com.example.spring.annotation.a_quickstart.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

/**
 * @Description:
 * @Author: 10195
 * @Date 2022/3/4 15:37
 */
public class ImportXmlAnnotationApplication {
    public static void main(String[] args) {
        System.out.println("xml引入注解");
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/import-anno.xml");
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println("注解引入xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportXmlAnnotationApplication.class);
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(applicationContext.getBean(Person.class).toString());
    }

}
