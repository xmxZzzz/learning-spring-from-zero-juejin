package com.example.spring.basic_dl.c_oftype;

import com.example.spring.basic_dl.c_oftype.dao.DemoDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @Package: com.example.spring.basic_dl.c_oftype
 * @ClassName: OfTypeApplication
 * @Author: guoyy
 * @Description: 利用ApplicationContext代替BeanFactory，获得一个接口的所有实现类
 * @Date: 2021/12/11 下午10:15
 * @Version: 1.0
 */
public class OfTypeApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_dl/quickstart-oftype.xml");
        Map<String, DemoDao> beans = context.getBeansOfType(DemoDao.class);
        beans.forEach((beanName, bean) -> {
            System.out.println(beanName + ": " + bean.toString());
        });
    }
}
