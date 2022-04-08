package com.example.spring.annotation.b_scan;

import com.example.spring.annotation.b_scan.bean.Cat;
import com.example.spring.annotation.b_scan.bean.Person;
import com.example.spring.annotation.b_scan.config.QuickStartConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;


public class ComponentScanApplication {
    public static void main(String[] args) {

        // 使用@ComponentScan标识配置类QuickStartConfiguration，那么使用byType的方式在配置类中进行扫描
        ApplicationContext context = new AnnotationConfigApplicationContext(QuickStartConfiguration.class);

        // 若不使用@ComponentScan标识配置类，那么在AnnotationConfigApplicationContext中传递参数
       // ApplicationContext context = new AnnotationConfigApplicationContext("com.example.spring.annotation.b_scan");

        Person person = context.getBean(Person.class);
        System.out.println(person);

        Cat cat = context.getBean(Cat.class);
        System.out.println(cat);

        // 获取所有已注册的Bean的id
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }
}
