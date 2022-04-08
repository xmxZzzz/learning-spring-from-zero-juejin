package com.example.spring.annotation.c_importxml.config;

import com.example.spring.annotation.a_quickstart.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AnnotationConfigConfiguration
 * @Description    xml引入注解
 * @author 10195
 * @date 2022/3/4 15:28
 *
 */
@Configuration
public class AnnotationConfigConfiguration {

    /**
     * @Description 未用@Component标识
     * @param
     * @return: com.example.spring.annotation.a_quickstart.bean.Person
     * @author 10195
     * @date 2022/3/4 15:55
     *
     */
    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("p");
        person.setAge(20);
        return person;
    }
}
