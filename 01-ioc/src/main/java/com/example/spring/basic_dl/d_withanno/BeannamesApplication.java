package com.example.spring.basic_dl.d_withanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

/**
 * @Package: com.example.spring.basic_dl.d_withanno
 * @ClassName: BeannamesApplication
 * @Author: guoyy
 * @Description: 获取当前IOC容器中的所有Bean
 * @Date: 2021/12/11 下午10:49
 * @Version: 1.0
 */
public class BeannamesApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_dl/quickstart-withanno.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }
}
