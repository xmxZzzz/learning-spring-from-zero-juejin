package com.example.spring.basic_di.d_autowired.config;

import com.example.spring.basic_di.d_autowired.bean.Cat;
import com.example.spring.basic_di.d_autowired.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Description:@Autowired在配置类的使用
 * @Author: 10195
 * @Date 2022/4/8 14:59
 */

@Configuration
@ComponentScan(basePackages = "com.example.spring.basic_di.d_autowired.bean")
public class AutowiredConfiguration {

    // @Bean
    // @Autowired  // 高版本可不标注
    // public Cat cat(Person person){
    //     Cat cat = new Cat();
    //     cat.setName("cat");
    //     cat.setPerson(person);
    //     return cat;
    // }

    // @Primary
    @Bean
    public Person master(){
        Person master = new Person();
        master.setName("master");
        return master;
    }

}
