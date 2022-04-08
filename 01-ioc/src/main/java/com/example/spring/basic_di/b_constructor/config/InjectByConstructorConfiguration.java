package com.example.spring.basic_di.b_constructor.config;

import com.example.spring.basic_di.b_constructor.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: 10195
 * @Date 2022/3/18 11:08
 */
@Configuration
public class InjectByConstructorConfiguration {

    @Bean
    public Person person(){
        return new Person("jerry","男");
    }
}
