package com.example.spring.annotation.a_quickstart.config;

import com.example.spring.annotation.a_quickstart.bean.Cat;
import com.example.spring.annotation.a_quickstart.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName QuickStartConfiguration
 * @Description 使用@Configuration标识配置类，使用@Bean注册向IOC容器中注册指定组件
 * @author 10195
 * @date 2021/12/16 10:14
 *
 */
@Configuration
public class QuickStartConfiguration {

    /**
     * @Description 在配置类中，要想替换掉 <bean> 标签，自然也能想到，它是使用 @Bean 注解。
      * @param
     * @return: com.example.spring.annotation.a_quickstart.bean.Person
     * @author 10195
     * @date 2021/12/16 10:28
     *
     */
    @Bean(name = "person")
    public Person person(){
        Person person = new Person();
        person.setName("person");
        person.setAge(27);
        return person;
    }

    @Bean
    public Cat cat(){
        Cat cat = new Cat();
        cat.setName("cat");
        cat.setMaster(person());
        return cat;
    }
}
