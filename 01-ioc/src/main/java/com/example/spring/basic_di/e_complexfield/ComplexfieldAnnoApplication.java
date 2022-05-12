package com.example.spring.basic_di.e_complexfield;

import com.example.spring.basic_di.e_complexfield.bean.Cat;
import com.example.spring.basic_di.e_complexfield.bean.Cat1;
import com.example.spring.basic_di.e_complexfield.bean.Person;
import com.example.spring.basic_di.e_complexfield.bean.Person1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName ComplexfieldAnnoApplication
 * @Description 
 * @author 10195
 * @date 2022/5/12 15:02
 *
 */
public class ComplexfieldAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.spring.basic_di.e_complexfield.bean");
        Person1 person1 = context.getBean(Person1.class);
        System.out.println(person1);

        Cat1 c = (Cat1) person1.getCats().toArray()[0];
        Cat1 c1 = (Cat1) person1.getCats().toArray()[1];
        Cat1 c2 = (Cat1) person1.getEvents().get("咪咪");
        Cat1 c3 = (Cat1) person1.getEvents().get("喵喵");
        System.out.println(c==c1);
        System.out.println(c==c2);
        System.out.println(c1==c3);

        Cat1 cat1 = new Cat1();
        System.out.println(cat1);
    }
}
