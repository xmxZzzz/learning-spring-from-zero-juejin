package com.example.spring.annotation.c_importxml.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description: 注解引入xml
 * @Author: 10195
 * @Date 2022/3/4 16:03
 */
@Configuration
@ImportResource("classpath:annotation/beans.xml")
public class ImportXmlAnnotaionConfiguration {
}
