package com.example.spring.basic_dl.d_withanno;

import com.example.spring.basic_dl.d_withanno.anno.Color;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @Package: com.example.spring.basic_dl.d_withanno
 * @ClassName: WithAnnoApplication
 * @Author: guoyy
 * @Description: 根据类上的注解@Color获取相应的实例
 * @Date: 2021/12/11 下午10:46
 * @Version: 1.0
 */
public class WithAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_dl/quickstart-withanno.xml");
        Map<String, Object> beans = context.getBeansWithAnnotation(Color.class);
        beans.forEach((beanName, bean) -> {
            System.out.println(beanName + ": " + bean.toString());
        });
    }
}
