package com.example.spring.basic_dl.e_lazylookup;

import com.example.spring.basic_dl.e_lazylookup.bean.Cat;
import com.example.spring.basic_dl.e_lazylookup.bean.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Package: com.example.spring.basic_dl.e_lazylookup
 * @ClassName: ImmediatlyLookupApplication
 * @Author: guoyy
 * @Description: 解决当前IOC容器中无指定id的实例问题
 * @Date: 2021/12/11 下午11:01
 * @Version: 1.0
 */
public class ImmediatlyLookupApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazylookup.xml");
        Cat cat = (Cat) context.getBean("cat");
        System.out.println(cat);

        //方法一：try{}catch(){}
//        Dog dog;
//        try {
//            dog = context.getBean(Dog.class);
//        }catch (Exception e){
//            dog = new Dog();
//        }

        //方法二: containsBean(beanId)
        Dog dog = context.containsBean("dog") ? (Dog) context.getBean("dog") : new Dog();
        System.out.println(dog);
    }
}
