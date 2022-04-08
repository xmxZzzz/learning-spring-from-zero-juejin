package com.example.spring.basic_di.c_value_spel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description:
 * @Author: 10195
 * @Date 2022/3/18 14:53
 */
@Configuration
@ComponentScan(basePackages = {"com.example.spring.basic_di.c_value_spel.bean"})
@PropertySource("classpath:basic_di/value/red.properties")
public class InjectValueConfiguration {
}
