package com.example.spring.basic_di.c_value_spel;

import com.example.spring.basic_di.c_value_spel.bean.Blue;
import com.example.spring.basic_di.c_value_spel.bean.Green;
import com.example.spring.basic_di.c_value_spel.bean.Red;
import com.example.spring.basic_di.c_value_spel.bean.White;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: 验证@Value的使用
 * @Author: 10195
 * @Date 2022/4/2 14:50
 */
public class InjectValueXMLApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_di/value/inject-value.xml");
        Red red = context.getBean(Red.class);
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
