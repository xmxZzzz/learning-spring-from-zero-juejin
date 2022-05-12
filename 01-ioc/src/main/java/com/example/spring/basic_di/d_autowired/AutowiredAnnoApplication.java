package com.example.spring.basic_di.d_autowired;

import com.example.spring.basic_di.d_autowired.bean.Bird;
import com.example.spring.basic_di.d_autowired.bean.Cat;
import com.example.spring.basic_di.d_autowired.bean.Dog;
import com.example.spring.basic_di.d_autowired.config.AutowiredConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: 10195
 * @Date 2022/4/8 14:10
 */
public class AutowiredAnnoApplication {

    public static void main(String[] args) {
        // ApplicationContext context = new AnnotationConfigApplicationContext("com.example.spring.basic_di.d_autowired.bean");
        // Dog dog = context.getBean(Dog.class);
        // System.out.println(dog);

        ApplicationContext context1 = new AnnotationConfigApplicationContext(AutowiredConfiguration.class);
        Cat cat = context1.getBean(Cat.class);
        System.out.println(cat);
        Dog dog = context1.getBean(Dog.class);
        System.out.println(dog);

        Bird bird = context1.getBean(Bird.class);
        System.out.println(bird);
    }
}
