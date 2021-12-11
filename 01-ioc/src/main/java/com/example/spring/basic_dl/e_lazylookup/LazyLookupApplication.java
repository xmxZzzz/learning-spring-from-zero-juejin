package com.example.spring.basic_dl.e_lazylookup;

import com.example.spring.basic_dl.e_lazylookup.bean.Cat;
import com.example.spring.basic_dl.e_lazylookup.bean.Dog;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Package: com.example.spring.basic_dl.e_lazylookup
 * @ClassName: LazyLookupApplication
 * @Author: guoyy
 * @Description: 延迟查找：延后Bean的获取时机，即延后了异常可能出现的时机
 * 当IOC容器中无指定实例时，先获取包装类（不报错）-> 获取实例
 * @Date: 2021/12/11 下午11:00
 * @Version: 1.0
 */
public class LazyLookupApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazylookup.xml");
        Cat cat = (Cat) context.getBean("cat");
        System.out.println(cat);

        //获取一个Dog的Provider包装类，使用前不报错
        ObjectProvider<Dog> dogProvider = context.getBeanProvider(Dog.class);

        //getIfAvailable()：当找不到Dog时，返回null，不报错
        Dog dog = dogProvider.getIfAvailable();
        if (dog == null) {
            dog = new Dog();
        }
        //简化
//        Dog dog = dogProvider.getIfAvailable(() -> new Dog());
//        Dog dog = dogProvider.getIfAvailable(Dog::new);

        //ifAvailable()：及时使用
        dogProvider.ifAvailable(dog1 -> {
            System.out.println(dog1);
        });

    }
}
