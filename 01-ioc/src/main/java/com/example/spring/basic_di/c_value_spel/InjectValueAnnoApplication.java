package com.example.spring.basic_di.c_value_spel;

import com.example.spring.basic_di.c_value_spel.bean.*;
import com.example.spring.basic_di.c_value_spel.config.InjectValueConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: 验证@Value的使用
 * @Author: 10195
 * @Date 2022/4/2 14:50
 */
public class InjectValueAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.spring.basic_di.c_value_spel.bean");
        // 基本字面量的属性注入
        Black black = context.getBean(Black.class);
        System.out.println(black);

        //外部引入red.properties文件
        ApplicationContext context1 = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
        Red red = context1.getBean(Red.class);
        System.out.println(red);


        // SpEL属性注入
        //1.字面量
        Blue blue = context.getBean(Blue.class);
        System.out.println(blue);

        //2.Bean
        Green green = context.getBean(Green.class);
        System.out.println(green);

        //3.方法调用和常量引入
        White white = context.getBean(White.class);
        System.out.println(white);
    }
}
